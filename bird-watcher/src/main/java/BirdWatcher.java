
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
       return birdsPerDay.clone();
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        if (birdsPerDay.length == 0) {
            return;
        }
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    }
}
