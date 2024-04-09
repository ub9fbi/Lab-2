import java.util.Scanner;

public abstract class Figur {
    private int pointX;
    public int pointY;

    public Figur(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }
    protected abstract boolean figurExist(int pointX, int pointY);
    public abstract double square();
    public abstract void inputNumbers();
}