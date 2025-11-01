import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;

public final class React {
    public static class Cell<T> {
        protected final List<Consumer<T>> callbacks = new ArrayList<>();
        protected T value;
        
        public T getValue() {
            return value;
        }
    }

    public static class InputCell<T> extends Cell<T> {
        public void setValue(T newValue) {
            this.value = newValue;
            callbacks.forEach(notification -> notification.accept(newValue));
        }
    }

    public static class ComputeCell<T> extends Cell<T> {
        private final AtomicReference<T> previousComputation = new AtomicReference<>(null);
        private final Supplier<T> supplier;
        
        public ComputeCell(Function<List<T>, T> function, List<Cell<T>> cells) {
            this.supplier = () -> {
                List<T> list = cells.stream().map(Cell::getValue).toList();
                T result = function.apply(list);
                
                if (previousComputation.get() == null || !previousComputation.get().equals(result)) {
                    previousComputation.set(result);
                    callbacks.forEach(c -> c.accept(result));
                }
                
                return result;
            };
            supplier.get();
            for (Cell<T> cell : cells)
                cell.callbacks.add((x) -> ComputeCell.this.getValue());
        }

        public T getValue() {
            return supplier.get();
        }
        
        public void addCallback(Consumer<T> callback) {
            callbacks.add(callback);
        }

        public void removeCallback(Consumer<T> callback) {
            callbacks.remove(callback);
        }
    }

    public static <T> InputCell<T> inputCell(T initialValue) {
        InputCell<T> cell = new InputCell<>();
        cell.setValue(initialValue);
        return cell;
    }

    public static <T> ComputeCell<T> computeCell(Function<List<T>, T> function, List<Cell<T>> cells) {
        return new ComputeCell<>(function, cells);
    }
}
