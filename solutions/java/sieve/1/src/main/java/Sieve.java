import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public final class Sieve {
    private int maxPrime;
    
    public Sieve(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    public List<Integer> getPrimes() {
        List<Integer> primes = new ArrayList<>();
        boolean[] primeStates = getInitialPrimeStates();

        for (int i = 2; i * i <= maxPrime; i++)
            if (primeStates[i])
                for (int j = i * i; j <= maxPrime; j += i)
                    primeStates[j] = false;
        
        for (int i = 2; i <= maxPrime; i++)
            if (primeStates[i]) 
                primes.add(i);

        return primes;
    }

    private boolean[] getInitialPrimeStates() {
        boolean[] primeStates = new boolean[maxPrime + 1];
        
        Arrays.fill(primeStates, true);
        primeStates[0] = false;
        primeStates[1] = false;
        
        return primeStates;
    }
}
