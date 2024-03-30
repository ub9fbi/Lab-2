import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Figur> figurArrayList = new ArrayList<Figur>();
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        int k = 0;
        while (k < 3) {
            System.out.println("Введите: 1 - создать круг, 2 - создать прямоугольник, 3 - выйти");
            k = scanner.nextInt();
            if (k == 1){
                System.out.println("Введите координату точки X");
                int pointX = scanner.nextInt();
                System.out.println("Введите координату точки Y");
                int pointY = scanner.nextInt();
                Circle circle = new Circle();
                figurArrayList.add(circle);
                circle.inputNumbers();
                System.out.println("Попадание точки в окружность: " + circle.figurExist(pointX,pointY));
                System.out.println("Площадь круга равна: " + circle.square());


            } else if (k == 2) {
                System.out.println("Введите координату точки X");
                int pointX = scanner.nextInt();
                System.out.println("Введите координату точки Y");
                int pointY = scanner.nextInt();
                Rectangle rectangle = new Rectangle();
                figurArrayList.add(rectangle);
                rectangle.inputNumbers();
                System.out.println("Попадание точки в прямоугольник " + rectangle.figurExist(pointX,pointY));
                System.out.println("Площадь прямоугольника равна: " + rectangle.square());


            } else if (k == 3) {
                System.exit(0);
            }
        }
    }
}




