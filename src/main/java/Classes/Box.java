package Classes;

public class Box {
    double weight;
    double height;
    double depth;
}

class BoxDemo{
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        double vol;
        myBox.weight = 22;
        myBox.height = 10;
        myBox.depth = 10;
        double vol2;
        myBox2.depth = 12;
        myBox2.height = 15;
        myBox2.weight = 5;
        vol = myBox.depth * myBox.height * myBox.weight;
        System.out.println("Объем коробки равен: " + vol);
        vol2 = myBox2.depth * myBox2.height * myBox2.weight;
        System.out.println("Объем второй коробки равен: " + vol2);
    }
}
