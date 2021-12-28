package Classes.Practic;

public class Car {
    double speed;
    String color;
    int year;
    String mark;
}

class CarDemo{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "red";
        myCar.mark = "BMW";
        myCar.speed = 90;

        System.out.println("Скорость машины " + myCar.mark + " равна " + myCar.speed);
    }
}
