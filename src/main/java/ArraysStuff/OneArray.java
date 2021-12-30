package ArraysStuff;

public class OneArray {
    public static void main(String[] args) {
       int month_days[];
       month_days = new int[12];
       month_days[0] = 31;
       month_days[1] = 28;
       month_days[2] = 31;
       month_days[3] = 30;
       month_days[4] = 31;
       month_days[5] = 30;
       month_days[6] = 31;
       month_days[7] = 31;
       month_days[8] = 30;
       month_days[9] = 31;
       month_days[10] = 30;
       month_days[11] = 31;

        System.out.println("В апреле " + month_days[3] + " дней");

       // другой способ реализации
       int month_days2[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < month_days.length; i++) {
            System.out.println(month_days[i]);
        }
    }
}

class Average{
    public static void main(String[] args) {
        double nums[] = {10.3, 11.5, 13.3, 14.6, 15.6};
        double result = 0;

        for (int i = 0; i < 5; i++) {
            result = result + nums[i];
            System.out.println("Среднее значение равно " + result / 5);
        }
    }
}
