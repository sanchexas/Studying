package Classes;

public class OverLoadDemo {

    void test(){
        System.out.println("Параметры отсутствуют");
    }
    void test(int a){
        System.out.println("Ваш параметр = " + a);
    }
    void test(int a, int b){
        System.out.println(a + b);
    }
    double test(double a){
        return a + a;
    }
}
class OverLoad{
    public static void main(String[] args) {
        OverLoadDemo overLoadDemo = new OverLoadDemo();
        overLoadDemo.test();
        overLoadDemo.test(12);
        overLoadDemo.test(12,34);
        double res = overLoadDemo.test(12.32);
        System.out.println(res);
    }
}




class JonasSaysHi{
    public static void main(String[] args) {
        String hi = "Hi!";
        String name = "Jonas";

        System.out.println(name + " says " + hi);
    }
}
