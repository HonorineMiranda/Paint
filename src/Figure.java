import java.awt.*;
import java.lang.String;
import java.io.Serializable;

abstract public class Figure implements Serializable {

    protected Color couleur;
    protected Point origine;

    public Figure(Color couleur, Point origine) {
        this.origine = origine;
        this.couleur = couleur;

    }

    /*
    public Point getOrigine(){ return this.origine;  }
    public Color getColor(){ return this.couleur;  }

    //public abstract int getPerimeter ();

    public Color getCouleur(){
        return couleur;
    }
    public void setCouleur(Color couleur){
        this.couleur = couleur;
    }
    public void setOrigine(int x, int y){
        origine.setX(x);
        origine.setY(y);

    } */

    // public abstract void Figure();
    public abstract void setBoundingBox(int a, int b);

    // width = y size; length = x size
    public abstract void draw (Graphics graphic);


    //public abstract int getSurface();

    @Override
    public String toString (){ return " Origine de la figure: "+ origine ;}

    public static void main(String[] args){}
}
