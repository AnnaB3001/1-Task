public class Time {
    int secs;

    public Time(int secs) {
        this.secs = 0;
    }
    int addSec(int sec){
        secs += sec;
        return 0;
    }
    int addMins(int min){
        secs += min * 60;
        return 0;
    }
    int addHours(int hour){
        secs += hour * 3600;
        return 0;
    }
    int getTime(){
        return secs;
    }
    String getSecs(){
        String scs = String.valueOf(secs % 60);
        if (scs.length() == 1){
            return "0" + scs;
        }
        return scs;
    }
    String getMins(){
        String mins = String.valueOf((secs / 60) % 60);
        if (mins.length() == 1){
            return "0" + mins;
        }
        return mins;
    }
    String getHours(){
        String hrs = String.valueOf((secs / 3600) % 24);
//        if (hrs.length() == 1){
//            return "0" + hrs;
//        }
        return hrs;
    }
    String getStringTime(){
        return (getHours() + ":" + getMins() + ":" + getSecs());

    }

}
