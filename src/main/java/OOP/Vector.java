package OOP;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(){

    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double calculateVectorLength(Vector vector){
        double result;
        result = Math.sqrt(x * x + y * y + z * z);
        return result;
    }

    public double calculateScalar(Vector vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
class Try{
    public static void main(String[] args) {
        Vector vector = new Vector(23.2,12.3,11.4);
        double scalar = vector.calculateScalar(vector);
        double length = vector.calculateVectorLength(vector);
        System.out.println("Скалярное произведение = " + scalar + "\n" + "Длина вектора = " + length);
    }
}
