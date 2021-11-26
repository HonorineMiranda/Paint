import java.io.Serializable;

public class Point implements Serializable {

    public int x ;
    public int y ;



    public int getX(){
        return x;
    }

    /*
    public void setX(int a){
        x = a;
    }

    public void setY(int b){
        y = b;
    } */

    public int getY(){
        return y;
    }

    /*public Point(){
        x = 0;
        y = 0;

    }*/

    public Point ( int a, int b){
        x = a;
        y = b;
    }

    @Override

    public String toString(){
        return ("x=" + getX() + "," +"y=" + getY());
    }

    public static void main(String[] args){}

}
