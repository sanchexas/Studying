package Classes.OuterAndInner;

public class Outer {
    int outer_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    class Inner{

        public void display() {
            System.out.println(outer_x + 10);
        }
    }
}
