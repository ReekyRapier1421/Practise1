package block1.pract2.pract22;


public class TestBall {
    public static void main(String[] args) {
        Ball b1=new Ball();
        System.out.println(b1);

        Ball b2=new Ball(1.5, 2.5);
        System.out.println(b2);

        b1.setXY(3, 4);
        b1.move(-1, 2.5);
        System.out.println(b1);

        b2.setX(10);
        b2.setY(20);
        System.out.println("x="+b2.getX()+", y="+b2.getY());
    }
}
