import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public final class PythagoreanTriplet {
    private final int a;
    private final int b;
    private final int c;
    
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    @Override
    public String toString() {
        return String.format("PythagoreanTriplet{a=%s, b=%s, c=%s}", a, b, c);
    }

    @Override
    public boolean equals(Object o) {
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
    }

    public static class TripletListBuilder {
        private int sum;
        private int maxFactor;
        
        public TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            this.maxFactor = this.maxFactor == 0 ? this.sum : this.maxFactor;
            return this;
        }

        public TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> result = new ArrayList<>();
            
            for (int c = this.sum / 3; c <= this.maxFactor; c++)
                for (int b = 1; b < c; b++) {
                    int a = this.sum - c - b;
                    
                    if (a > 0 && a < b)
                        if (a * a + b * b == c * c)
                            result.add(new PythagoreanTriplet(a, b, c));
                }
            return result.stream().sorted(Comparator
                .comparingInt(p -> p.a)).collect(Collectors.toList());
        }
    }
}
