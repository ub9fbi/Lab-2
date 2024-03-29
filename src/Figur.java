import java.util.Scanner;

public abstract class Figur {
    private int pointX;

    private int pointY;

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int newPointX) {
        this.pointX = newPointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int newPointY) {
        this.pointY = newPointY;
    }
    public Figur (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату точки Х: ");
        int newPointX = scanner.nextInt();
        setPointX(newPointX);
        System.out.println("Введите координату точки Y: ");
        int newPointY = scanner.nextInt();
        setPointY(newPointY);
    }
    //проверка существования фигуры
    public abstract boolean figurExist(int pointX, int pointY);
    //определение площади
    public abstract double square();
}