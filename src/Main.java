import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        Figur rectangle = new Rectangle(0,0,0,0);
        Figur circl = new Circle(0,0,0);
        int k = 0;
        while (k < 3) {
            System.out.println("Введите координату точки по x: ");
            int x = scanner.nextInt();
            System.out.println("Введите координату точки по y: ");
            int y = scanner.nextInt();
            System.out.println("Введите: 1 - создать круг, 2 - создать прямоугольник, 3 - выйти");
            k = scanner.nextInt();
            if (k == 1){
                circl.inputNumbers();
                if (circl.figurExist(x,y) == true){
                    System.out.println("Точка попадает в круг");
                } else {
                    System.out.println("Точка не попадает в круг");
                }
                System.out.println("Площадь круга: " + circl.square());
            } else if (k == 2) {
                rectangle.inputNumbers();
                if (rectangle.figurExist(x,y) == true){
                    System.out.println("Точка попадает в прямоугольник");
                } else {
                    System.out.println("Точка не попадает в прямоугольник");
                }
                System.out.println("Площадь прямоугльника: " + rectangle.square());
            } else if (k == 3) {
                System.exit(0);
            }
        }
    }
}




        /*circl.inputNumbers();
        System.out.println("Площадь круга: " + circl.square());



        rectangle.inputNumbers();
        System.out.println("Площадь прямоугольника: " + rectangle.square());

        int k = 0;
        System.out.println("Выберите фигуру; 1 - круг, 2 - прямоугольник");

        Scanner scanner = new Scanner(System.in);*/

        /*if (k == 1) {
                circl.inputNumbers();
                System.out.println("Площадь круга");
                } else if (k == 2) {
                rectangle.inputNumbers();
                System.out.println("Площадь прямоугольника");*/