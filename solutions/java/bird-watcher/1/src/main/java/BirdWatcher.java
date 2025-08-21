public final class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean dayWithoutBirds = false;

        for (int count : this.birdsPerDay) {
            if (count == 0) {
                dayWithoutBirds = true;
            }
        }

        return dayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;

        if (numberOfDays > 7) {
            numberOfDays = 7;
        }

        for (int count = 0; count < numberOfDays; count++) {
            total += this.birdsPerDay[count];
        }

        return total;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int count : this.birdsPerDay) {
            if (count >= 5) {
                busyDays += 1;
            }
        }

        return busyDays;
    }
}
