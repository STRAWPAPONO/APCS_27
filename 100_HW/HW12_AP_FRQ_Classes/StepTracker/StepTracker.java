public class StepTracker{
    int minsteps = 0;
    int totalsteps = 0;
    int active = 0;
    double count = 0;
    public StepTracker(int a){
        minsteps = a;
    }
    public void addDailySteps(int a){
        totalsteps += a;
        count++;
        if(a>=minsteps){
            active++;
        }
    }
    public int activeDays(){
        return active;
    }
    public double averageSteps(){
        if(count==0){
            return 0.0;
        }
        return totalsteps/count;
    }
}