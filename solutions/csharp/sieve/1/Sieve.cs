public static class Sieve
{
    public static int[] Primes(int limit)
    {
        List<int> primes = [];
        bool[] primeStates = Enumerable.Repeat(true, limit + 1).ToArray();
        primeStates[0] = primeStates[1] = false;

        for (int i = 2; i * i <= limit; i++)
            if (primeStates[i])
                for (int j = i * i; j <= limit; j += i)
                    primeStates[j] = false;

        for (int i = 2; i <= limit; i++)
            if (primeStates[i])
                primes.Add(i);
        
        return primes.ToArray();
    }
}
