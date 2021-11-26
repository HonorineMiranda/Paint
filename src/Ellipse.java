import java.awt.*;

public class Ellipse extends Figure {

    protected int semiAxysX = 0;
    protected int semiAxysY = 0;

    public Ellipse(int px, int py, Color couleur ) {
         super(couleur,new Point(px,py)) ;
         //super : lorsqu'on veut appeler une méthode de la classe parente que l'on a remplacé dans la sous-classe

    }

    /*
    public void setSemiAxysX(int a) {
        semiAxysX = a;
    }

     public void setSemiAxysY(int b) {
        semiAxysY = b;
    }
    */


    public void draw (Graphics graphic){
        graphic.setColor(couleur);
        graphic.fillOval(origine.getX(), origine.getY(), 2*semiAxysX, 2*semiAxysY );
    }

    @Override
    public void setBoundingBox(int a, int b){
        semiAxysX = a;
        semiAxysY = b;

    }


    /*

    @Override
    public String toString() {
        return " Ellipse de demi-axe x "+ semiAxysX +" et de demi-axe  y"+ semiAxysY;
    }

     */


}