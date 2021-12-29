package Classes;

public class Box {
    double weight;
    double height;
    double depth;

    public double parallepipedVolume(){
        return weight * height * depth;
    }
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
class BoxDemo2{
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        //присваивание значений переменной класса box1
        box1.weight = 20;
        box1.depth = 12;
        box1.height = 10;
        //присваивание значений переменной класса box2
        box2.depth = 12;
        box2.height = 10;
        box2.weight = 12;
        //посчитать
        box1.parallepipedVolume();
        box2.parallepipedVolume();

    }
}

class BoxDemo4{
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.weight = 12;
        box1.height = 20;
        box1.depth = 16;

        box2.weight = 16;
        box2.depth = 13;
        box2.height = 21;

        System.out.println(box1.parallepipedVolume() + "\n" + box2.parallepipedVolume());
    }
}
