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

    public Figur(int newPointX, int newPointY) {
        setPointX(newPointX);
        setPointY(newPointY);
    }
    public Figur (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату точки Х: ");
        int newPointX = scanner.nextInt();
        setPointX(pointX);
        System.out.println("Введите координату точки Y: ");
        int newPointY = scanner.nextInt();
        setPointY(pointY);
    }
    //проверка существования фигуры
    protected abstract boolean figurExist(int pointX, int pointY);
    //определение площади

    public abstract double square();


}