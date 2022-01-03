package OOP.Shapes;

import java.util.ArrayList;

public class Box extends Shape{

    private double available;
    private ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double available){
        super(available);
        this.available = available;
    }
    public boolean add(Shape shape){
        if (available >= shape.getVolume()){
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        }else {
            return false;
        }
    }
}
