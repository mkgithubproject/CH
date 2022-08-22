public class Time {
    // instance variable
    public int hour,minute;
   // constructor
    public Time(int h, int m) {
        if(h<0){
            hour=0;
        }else if(h>23){
            hour=23;
        }else{
            hour=h;
        }
        if(m<0){
            minute=0;
        }else if(m>59){
            minute=59;
        }else{
            minute=m;
        }
    }

  // toString method
    public String toString() {
        String time="";
        if(hour<10){// means hor is single digit add 0 before hour
            time=time+"0"+hour;
        }else{// else hour is double digit
            time=time+hour;
        }
        time=time+":";
        if(minute<10){// minute is single digit add 0 before minute
            time=time+"0"+minute;
        }else{
            time=time+minute;
        }
        return time;
    }
    // default constructor
    public Time(){

    }
    public String toStringAMPM(){
        String time="";
        String zone="";
        if(hour>12){
            hour=hour%12;// convert time 12 hors format
            if(hour<10){
                time=time+"0"+hour;
            }else{
                time=time+hour;
            }
            zone="PM";
        }else{
            if(hour<10){
                time=time+"0"+hour;
            }else{
                time=time+hour;
            }
            zone="AM";
        }
        time=time+":";
        if(minute<10){
            time=time+"0"+minute;
        }else{
            time=time+minute;
        }
        time=time+" "+zone;
        return time;
    }


}
