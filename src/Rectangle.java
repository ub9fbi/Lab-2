import java.util.Scanner;

public class Rectangle extends Figur{
    private int x;
    private int y;
    private int length;
    private int width;

    public Rectangle(int pointX, int pointY) {
        super(pointX, pointY);
    }

    public int getX() {
        return x;
    }

    public void setX(int abcisX) {
        if (abcisX <= 0) {
            System.out.println("Значение должно быть > 0");
        } else
            this.x = abcisX;
    }

    public int getY() {
        return y;
    }

    public void setY(int abcisY) {
        if (abcisY <= 0) {
            System.out.println("Значение должно быть > 0");
        } else
            this.y = abcisY;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int inputLength) {
        if (inputLength <= 0) {
            System.out.println("Значение должно быть > 0");
        } else
            this.length = inputLength;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int inputWidth) {
        if (inputWidth <= 0) {
            System.out.println("Значение должно быть > 0");
        } else
            this.width = inputWidth;
    }

    @Override
    public boolean figurExist(int pointX, int pointY) {
        return (pointX >= x && pointX <= (x + width)) && (pointY >= y && pointY <= (y + length));
    }

    @Override
    public double square() {
        return length * width;
    }

    @Override
    public void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату, x");
        int abcisX = scanner.nextInt();
        setX(abcisX);

        System.out.println("Введите координату, y");
        int abcisY = scanner.nextInt();
        setY(abcisY);

        System.out.println("Введите Длину");
        int inputLength = scanner.nextInt();
        setLength(inputLength);

        System.out.println("Введите Ширину");
        int inputWidth = scanner.nextInt();
        setWidth(inputWidth);
    }
}