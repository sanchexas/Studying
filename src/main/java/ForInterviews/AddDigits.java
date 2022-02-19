package ForInterviews;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigit(29));
    }
    public static int addDigit(int num){
        while (num >= 10){
            int temp = 0;
            while (num > 0){
                temp = temp + num % 10; //right part of digit
                num = num / 10; // left part of digit
            }
            num = temp;
        }
        return num;
    }

    public static int addDigitPractice(int number){
        while (number >= 10){
            int temp = 0;
            while (number > 10){
                temp += number % 10;
                number /= 10;
            }
            temp = number;
        }
        return number;
    }
}
