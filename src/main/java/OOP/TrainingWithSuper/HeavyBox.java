package OOP.TrainingWithSuper;

public class HeavyBox extends Box{

    private double weight;

    public HeavyBox(double height,double width, double depth, double weight) {
        super(height, width, depth);
        this.weight = weight;
    }

    public HeavyBox(double weight) {
        this.weight = weight - 1;
    }
}
