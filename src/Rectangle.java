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
        this.x = abcisX;
    }

    public int getY() {
        return y;
    }

    public void setY(int abcisY) {
        this.y = abcisY;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int inputLength) {
        this.length = inputLength;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int inputWidth) {
        this.width = inputWidth;
    }

    @Override
    public boolean figurExist(int pointX, int pointY) {
        return (pointX >= getX() && pointX <= (getX() + getWidth())) && (pointY >= getY() && pointY <= (getY() + getLength()));
    }

    @Override
    public double square() {
        return getLength() * getWidth();
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