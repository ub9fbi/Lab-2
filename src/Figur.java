import java.util.Scanner;

public abstract class Figur {
    private int pointX, pointY;

    public Figur(int pointX, int pointY) {
        setPointX(pointX);
        setPointY(pointY);
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
    public abstract boolean figurExist(int pointX, int pointY);
    //определение площади
    public abstract double square();
    public abstract void inputNumbers();
}