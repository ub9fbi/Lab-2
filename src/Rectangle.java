import java.util.Scanner;

public class Rectangle extends Figur{
    private int x,y,length,width;

    public Rectangle() {

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
    public boolean figurExist(int newX, int newY) {
        return (newX > x && x < x + width) && (newY > y && y < y + length);
    }

    @Override
    public double square() {
        return length * width;
    }
}
