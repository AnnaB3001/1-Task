public class OutTime {
    Time time = new Time(0);

    int addSec(int sec){
        time.addSec(sec);
        return 0;
    }
    int addMins(int min){
        time.addMins(min);
        return 0;
    }
    int addHours(int hour){
        time.addHours(hour);
        return 0;
    }

    String getValue(){

        return time.getStringTime();
    }
}
