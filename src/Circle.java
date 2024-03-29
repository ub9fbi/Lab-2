import java.util.Scanner;

public class Circle extends Figur{

    private int x, y, R;

    public Circle() {
        this.x = x;
        this.y = y;
        this.R = R;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        this.R = R;
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

    @Override
    public boolean figurExist(int newX, int newY) {
        double L = Math.sqrt(Math.pow((newX - x), 2) + Math.pow((newY - y), 2));
        return L <= R;
    }

    @Override
    public double square() {
        return Math.round(Math.PI * Math.pow(R,2));
    }
}