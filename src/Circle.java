import java.util.Scanner;

public class Circle extends Figur{

/*    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        R = r;
    }*/

    private int x, y, R;



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
        return R >= Math.sqrt(Math.pow((pointX - x), 2) + Math.pow((pointY - y), 2));
    }

    @Override
    public double square() {
        return Math.round(Math.PI * Math.pow(getR(),2));
    }

    @Override
    public void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату X центра окружности");
        x = scanner.nextInt();
        System.out.println("Введите координату Y центра окружности");
        y = scanner.nextInt();
        System.out.println("Введите радиус R окружности");
        R = scanner.nextInt();

    }
}