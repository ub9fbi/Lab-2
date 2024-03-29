import java.util.Scanner;

public abstract class Figur {
    private int pointX;

    private int pointY;

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int newX) {
        pointX = newX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int newY) {
        setPointY(newY);
    }

    public Figur(int newX, int newY) {
        setPointX(newX);
        setPointY(newY);
    }
    public Figur (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату точки Х");
        int newX = scanner.nextInt();
        setPointX(newX);
        System.out.println("Введите координату точки Y");
        int newY = scanner.nextInt();
        setPointY(newY);
    }
    //проверка существования фигуры
    public abstract boolean figurExist(int newX, int newY);
    //определение площади

    public abstract double square();


}