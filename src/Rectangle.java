import java.util.Scanner;

public class Rectangle extends Figur{
    private int x,y,length,width;

    public Rectangle(int x,int y, int length, int width) {

        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;

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
    public boolean figurExist(int x, int y) {
        return x >= this.x && x <= (this.x + width) && y >= this.y && y <= (this.y + length);
    }

    @Override
    public double square() {
        return length * width;
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
