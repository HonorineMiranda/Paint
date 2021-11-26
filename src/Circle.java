import java.awt.Color;


public class Circle extends Ellipse {

    public Circle( int px, int py, Color couleur) {
        super(px, py, couleur);
        System.out.println("Création d'un cercle");
    }


      /*
    public void setSemiAxysX(int x){
        semiAxysX = x;

    }


    public void setSemiAxysY(int y){
        semiAxysY = y;

    }

    */


    @Override
    public String toString(){
        return "Cercle de rayon "+ semiAxysX;}


    // On redéfini la méthode avec un Override

    @Override
    public void setBoundingBox (int heightBB, int widthBB){
        super.semiAxysX = Math.max(heightBB, widthBB);
        super.semiAxysY = Math.max(heightBB,widthBB);
    }
}
