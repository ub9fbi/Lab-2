import java.util.Scanner;

public abstract class Figur {
    private int pointX, pointY;

    public Figur(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    //проверка существования фигуры
    protected abstract boolean figurExist(int pointX, int pointY);
    //определение площади
    public abstract double square();
    public abstract void inputNumbers();
}