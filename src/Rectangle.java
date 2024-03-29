import java.util.Scanner;

public class Rectangle extends Figur{
    private int x,y,length,width;

    public Rectangle() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные прямоугольника");
        System.out.println("Координата X нижнего угла: ");
        x = scanner.nextInt();
        setX(x);
        System.out.println("Координата Y нижнего угла: ");
        y = scanner.nextInt();
        setY(y);
        System.out.println("Введите длину");
        length = scanner.nextInt();
        setLength(length);
        System.out.println("Введите ширину");
        width = scanner.nextInt();
        setWidth(width);
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean figurExist(int pointX, int pointY) {
        return (pointX > x && x < x + width) && (pointY > y && y < y + length);
    }

    @Override
    public double square() {
        return length * width;
    }
}
