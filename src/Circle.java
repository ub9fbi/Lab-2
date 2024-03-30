import java.util.Scanner;

public class Circle extends Figur{

    private int x, y, R;

    public Circle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату центра X");
        x = scanner.nextInt();
        setX(x);
        System.out.println("Введите координату центра Y");
        y = scanner.nextInt();
        setY(y);
        System.out.println("Введите радиус круга");
        R = scanner.nextInt();
        setR(R);
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        this.R = R;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean figurExist(int pointX, int pointY) {
        return R >= Math.sqrt(Math.pow((pointX - getX()), 2) + Math.pow((pointY - getY()), 2));
    }

    @Override
    public double square() {
        return Math.round(Math.PI * Math.pow(getR(),2));
    }
}