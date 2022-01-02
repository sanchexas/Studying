package Boolean;

/**
 * Напишите метод, который бы возвращал в консоль:
 *
 * true, если число больше 5
 * и false, если число меньше 5
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(isMoreThanFive(6));
    }
    public static boolean isMoreThanFive(int number){
        if (number > 5){
            return true;
        }
        return false;
    }
}
