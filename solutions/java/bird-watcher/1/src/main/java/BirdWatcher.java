
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek(){
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    int getLength(){
        return this.birdsPerDay.length;
    }

    public int getToday() {
        return this.birdsPerDay[getLength() - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[getLength() - 1]+=1;
    }

    public boolean hasDayWithoutBirds() {
        for(int dayOfWeek: this.birdsPerDay) {
            if(dayOfWeek == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if(numberOfDays>7){
            for(int dayOfWeekCount: this.birdsPerDay)
                count+=dayOfWeekCount;

            return count;
        }

        int dayOfWeek = 0;
        for(; dayOfWeek<numberOfDays; dayOfWeek++){
                count+=this.birdsPerDay[dayOfWeek];
            }
        return count;
    }

    public int getBusyDays() {
        int countBusyDays=0;
        for(int busyDay: this.birdsPerDay){
            if(busyDay>=5) countBusyDays++;
        }
        return countBusyDays;
    }
}
