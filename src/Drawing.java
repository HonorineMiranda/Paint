import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.awt.event.*;


public class Drawing extends JPanel implements MouseListener, MouseMotionListener {
    protected Color couleur;
    protected ArrayList<Figure> liste = new ArrayList<>();
    protected int x;
    protected int y;
    protected String nameFigure;


    public Drawing() {
        this.setBackground(Color.white);
        nameFigure = "Rectangle";
        this.setSize(400,400);
        this.addMouseListener(this);
        this.addMouseMotionListener( this);
    }


    public void setColor(Color couleur) {
        this.couleur = couleur;
    }


    public void setName(String nameFigure) {
        this.nameFigure = nameFigure;
    }


    // We want that a new shape is drawn when we press the mouse.
    // So, we can make a switch to add the sort of shape selected in the list.



    @Override
    public void mousePressed(MouseEvent event) {
        x = event.getX();
        y = event.getY();
        //System.out.println("Creation of a new " + nameFigure + " coloured " + c + " and originating from :" + x + " " + y);
        switch (nameFigure) {
            case "Ellipse" -> liste.add(new Ellipse(x, y, couleur));
            case "Circle" -> liste.add(new Circle(x, y, couleur));
            case "Rectangle" -> liste.add(new Rectangle(x, y, couleur));
            case "Square" -> liste.add(new Square(x, y, couleur));
            default -> System.out.println("Erreur");
        }
    }

    @Override
    public void mouseReleased(MouseEvent event) {

    }

    @Override
    public void mouseEntered(MouseEvent event) {

    }
    @Override
    public void mouseExited(MouseEvent event) {

    }
    @Override
    public void mouseDragged(MouseEvent event) {
        (this.liste.get(this.liste.size() -1)).setBoundingBox(event.getY(), event.getX());
         this.repaint();
    }
    @Override
    public void mouseMoved(MouseEvent event) {

    }
    @Override
    public void mouseClicked(MouseEvent event) {

    }

    @Override
    public void paintComponent(Graphics graphic){
        super.paintComponent(graphic);
        for(Figure f : liste){
            f.draw(graphic);
        }
    }

    // New is the method which allows us to create a new blank project.

    public void New() {
        liste.clear();
        super.paintComponent(this.getGraphics());
    }

    // On vide la liste puis on ajoute à la liste courante les elements sauvegardés

    public void Open(){
        try {
            FileInputStream fis = new FileInputStream("sauvegarde du Dessin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            liste.clear();
            int taille = ois.readInt();
            for(int i=0 ; i<taille ; i++) {
                liste.add((Figure) ois.readObject()); // (Figure) : type Object renvoyé par readObject
            }
            this.repaint();

            //ferme le fichier ois
            //ois.close();
            super.paintComponent(this.getGraphics());

        }
        catch(Exception event){
            System.out.println("Le fichier n'a pas pu être ouvert");
        }

    }




    public static void main(String[] args){}


}
























