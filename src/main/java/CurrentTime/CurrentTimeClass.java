package CurrentTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeClass {
    public static void main(String[] args) {
        Date currentTime = new Date();

        System.out.println("Right now its "+currentTime);

        SimpleDateFormat simpleTime = new SimpleDateFormat("hh:mm:ss");
        System.out.println(simpleTime.format(currentTime));

        SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDate.format(currentTime));

        SimpleDateFormat dayOfTheWeek = new SimpleDateFormat("EEEE");
        System.out.println(dayOfTheWeek.format(currentTime));

        if (dayOfTheWeek.format(currentTime).equals("Wednesday")){
            System.out.println("Happy Wednesday!!!");
        }
        else if (dayOfTheWeek.format(currentTime).equals("Thursday")){
            System.out.println("Happy Thursday!!!");
        }else
            System.out.println("Happy IDK!!!");
    }


}
