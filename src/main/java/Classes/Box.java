package Classes;

public class Box {
    double weight;
    double height;
    double depth;
}

class BoxDemo{
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;
        myBox.weight = 22;
        myBox.height = 10;
        myBox.depth = 10;
        vol = myBox.depth * myBox.height * myBox.weight;
        System.out.println("Объем коробки равен: " + vol);
    }
}
