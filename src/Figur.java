import java.util.Scanner;

public abstract class Figur {
    private int x, y;

    //проверка существования фигуры
    public abstract boolean breedExist(int newX, int newY);
    //определение площади

    public abstract double square();

    public abstract void inputNumbers();
}