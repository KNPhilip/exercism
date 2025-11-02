public final class EliudsEggs {
    
    public int eggCount(int number) {
        Integer count = 0;
        
        while (number > 0) {
            if (number % 2 == 1) {
                count++;
            }
            number /= 2;
        }

        
        return count;
    }
}
