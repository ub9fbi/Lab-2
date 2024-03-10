import java.util.Scanner;

public abstract class Figur {
    private int x, y;

    //проверка существования фигуры
    public abstract boolean breedExist(int x,int y);
    //определение площади

    public abstract double square();

    public abstract void inputNumbers();
}