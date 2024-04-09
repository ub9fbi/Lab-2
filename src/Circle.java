import java.util.Scanner;

public class Circle extends Figur{

    private int x, y, R;

    public Circle(int pointX, int pointY) {
        super(pointX, pointY);
    }

    public int getR() {
        return R;
    }

    public void setR(int abcisR) {
        this.R = abcisR;
    }

    public int getX() {
        return x;
    }

    public void setX(int abscissaX) {
        this.x = abscissaX;
    }

    public int getY() {
        return y;
    }

    public void setY(int ordinateY) {
        this.y = ordinateY;
    }

    @Override
    public boolean figurExist(int pointX, int pointY) {
        return R >= Math.sqrt(Math.pow((pointX - getX()), 2) + Math.pow((pointY - getY()), 2));
    }

    @Override
    public double square() {
        return Math.round(Math.PI * Math.pow(getR(),2));
    }

    @Override
    public void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Введите координаты точки X");
        int pointX = scanner.nextInt();
        setPointX(pointX);
        System.out.println("Введите координаты точки Y");
        int pointY = scanner.nextInt();
        setPointY(pointY);*/

        System.out.println("Введите координату X центра окружности");
        int abscissaX = scanner.nextInt();
        setX(abscissaX);

        System.out.println("Введите координату Y центра окружности");
        int ordinateY = scanner.nextInt();
        setY(ordinateY);

        System.out.println("Введите радиус R окружности");
        int R = scanner.nextInt();
        setR(R);
    }
}