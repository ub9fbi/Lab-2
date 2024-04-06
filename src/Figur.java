import java.util.Scanner;

public abstract class Figur {
    private int pointX, pointY;

    public Figur(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    //проверка существования фигуры
    protected abstract boolean figurExist(int pointX, int pointY);
    //определение площади
    public abstract double square();
    public abstract void inputNumbers();
}