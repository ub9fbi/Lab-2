import java.util.Scanner;

public abstract class Figur {

    //проверка существования фигуры
    public abstract boolean figurExist(int newX, int newY);
    //определение площади

    public abstract double square();

    public abstract void inputNumbers();
}