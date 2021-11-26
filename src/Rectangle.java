import java.awt.*;
import java.lang.String;

public class Rectangle extends Figure {
    protected int length = 0;
    protected int width = 0;



    public Rectangle(int px, int py, Color couleur) {
        super(couleur, new Point(px,py));
    }

    @Override
    public void setBoundingBox (int a, int b){
        length = a;
        width = b;
    }

    /*
    public int getWidth(){
        return width;
    }
    public int getLength(){return length;}


    public void setLength(int a){
        length = a;}

    public void setWidth(int b){width = b;}
    */

    public int  getPerimeter(){return (2*length + 2*width);}
    public int  getSurface(){return (length*width);}

    public void afficher(){

        System.out.println("La surface du rectangle est : " + getSurface());
        System.out.println("Le périmètre du rectangle est : " + getPerimeter());
    }


    public void draw (Graphics graphic){
        graphic.setColor(couleur);
        graphic.fillRect(origine.getX(), origine.getY(), width, length);
    }

    @Override
    public String toString(){
        return "Ce rectangle a une largeur de " + width+ " et une largeur de "+ length;
    }


    public static void main(String[] args){}
    }


