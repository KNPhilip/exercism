public final class EliudsEggs {
    public int eggCount(int number) {
        Integer count = 0;

        for (; number > 0; number /= 2)
            if (number % 2 == 1)
                count++;

        return count;
    }
}
