import java.util.Scanner;

public abstract class Figur {
    public int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    public Fegur () {
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите координату X");
        int newX
    }


    public abstract boolean belongPointShape (int x,int y) {



    }
    public abstract int areaFigure () {

    }

    public abstract int enteringField () {

    }


}
