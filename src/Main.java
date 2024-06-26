import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Figur> figurArrayList = new ArrayList<Figur>();
    public static void main(String[] args)
    {
        int k;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите: 1 - создать круг, 2 - создать прямоугольник, 3 - выйти");
            k = scanner.nextInt();

            int pointX;
            int pointY;

            switch (k) {
                case 1:
                    System.out.println("Введите координату точки X");
                    pointX = scanner.nextInt();
                    System.out.println("Введите координату точки Y");
                    pointY = scanner.nextInt();
                    Circle circle = new Circle(pointX,pointY);
                    figurArrayList.add(circle);
                    circle.inputNumbers();
                    for (int i = 0; i < figurArrayList.size(); i++) {
                        System.out.println("Площадь круга: " + figurArrayList.get(i).square() +
                                ", попадание точки в окружность: " + circle.figurExist(pointX,pointY));
                    }
                    break;
                case 2:
                    System.out.println("Введите координату точки X");
                    pointX = scanner.nextInt();
                    System.out.println("Введите координату точки Y");
                    pointY = scanner.nextInt();
                    Rectangle rectangle = new Rectangle(pointX,pointY);
                    figurArrayList.add(rectangle);
                    rectangle.inputNumbers();
                    for (int i = 0; i < figurArrayList.size(); i++) {
                        System.out.println("Площадь прямоугольника: " + figurArrayList.get(i).square() +
                                ", попадание точки в прямоугольник: " + rectangle.figurExist(pointX,pointY));
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Неверный ввод!!!");
            }
        } while (k != 3);
    }
}