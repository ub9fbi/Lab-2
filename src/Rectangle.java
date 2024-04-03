import java.util.Scanner;

public class Rectangle extends Figur{
    private int x,y,length,width;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x != 0) {
            this.x = x;
        } else
            System.out.println("Значение равно 0");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y != 0) {
            this.y = y;
        } else
            System.out.println("Значение равно 0");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length != 0) {
            this.length = length;
        } else
            System.out.println("Значение равно 0");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width != 0) {
            this.width = width;
        } else
            System.out.println("Значение равно 0");
    }

    public Rectangle(int pointX, int pointY) {
        super(pointX, pointY);
    }

    @Override
    public boolean figurExist(int pointX, int pointY) {
        return (pointX >= x && pointX <= (x + width)) && (pointY >= y && pointY <= (y + length));
    }

    @Override
    public double square() {
        return getLength() * getLength();
    }

    @Override
    public void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату, x");
        x = scanner.nextInt();
        setX(x);
        System.out.println("Введите координату, y");
        y = scanner.nextInt();
        setY(y);
        System.out.println("Введите Длину");
        length = scanner.nextInt();
        setLength(length);
        System.out.println("Введите Ширину");
        width = scanner.nextInt();
        setWidth(width);
    }
}