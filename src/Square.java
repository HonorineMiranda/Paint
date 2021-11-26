import java.awt.*;

public class Square extends Rectangle {

    public Square( int px, int py, Color couleur){
        super( px,py, couleur);

    }

    public void setBoundingBox(int a, int b){
        super.length = Math.max(a, b);
        super.width = Math.max(a, b);
    }

    /*
    public void setLength(int length){
        this.length = length;
        this.width = length;
    }

    public void setWidth(int width){
        this.width = width;
        this.length = width;
    }

     */

    @Override
    public String toString(){
        return "Carré de coté "+ length +" et de couleur" + couleur;
    }

}
