import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Figur circl = new Circle();
        circl.inputNumbers();
        System.out.println("Площадь круга: " + circl.square());


        Figur rectangle = new Rectangle();
        rectangle.inputNumbers();
        System.out.println("Площадь прямоугольника: " + rectangle.square());

        /*int k = 0;
        System.out.println("Выберите фигуру; 1 - круг, 2 - прямоугольник");

        Scanner scanner = new Scanner(System.in);*/
        }
    }





        /*if (k == 1) {
                circl.inputNumbers();
                System.out.println("Площадь круга");
                } else if (k == 2) {
                rectangle.inputNumbers();
                System.out.println("Площадь прямоугольника");*/