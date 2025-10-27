import java.util.List;
import java.util.ArrayList;

public final class PrimeFactorsCalculator {
    public List<Long> calculatePrimeFactorsOf(long number) {
        List<Long> factors = new ArrayList<>();
        
        for (Long divisor = 2L; number > 1L; divisor++)
            for (; number % divisor == 0; number /= divisor)
                factors.add(divisor);

        return factors;
    }
}
