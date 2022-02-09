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

    }


}
