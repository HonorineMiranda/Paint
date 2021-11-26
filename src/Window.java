import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame implements ActionListener {

       Drawing mydraw = new Drawing();

    public Window(String Title,int x,int y)
 {
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane() ;
        contentPanel.add(mydraw, "Center");

        JMenuBar BarreHaut= new JMenuBar();



        /* Menu 1 en haut à gauche*/

        JMenu menu1= new JMenu("File");


        JMenuItem New = new JMenuItem("New") ;
        New.addActionListener(this);
        JMenuItem Open = new JMenuItem("Open") ;
        Open.addActionListener(this);
        JMenuItem Save = new JMenuItem("Save") ;
        Save.addActionListener(this);
        JMenuItem Quit = new JMenuItem("Quit") ;
        Quit.addActionListener(this);


        menu1.add(New);
        menu1.add(Open);
        menu1.add(Save);
        menu1.add(Quit);


       /* Menu 2 en haut à gauche*/
        JMenu menu2= new JMenu("A Propos");
        JMenuItem Aide = new JMenuItem("Aide") ;
        Aide.addActionListener(this);
        menu2.add(Aide);

        /* Menu Gomme en haut à gauche*/
        JMenu menuGomme = new JMenu("Effacer");
        JMenuItem Supprimer = new JMenuItem("Gomme");
        Supprimer.addActionListener(this);
        menuGomme.add(Supprimer);



     /* Ajout des menus à la barre du haut */
        BarreHaut.add(menu1);
        BarreHaut.add(menu2);
        BarreHaut.add(menuGomme);

        // Ajout d'une interface d'accueil

        JOptionPane info = new JOptionPane();
        JOptionPane.showInternalMessageDialog( info, "Bienvenue dans l'application Paint !",
                "Honorine Miranda",JOptionPane.INFORMATION_MESSAGE);


        /* Création de la barre du bas : choix des couleurs et mise en place des actions*/

        JMenuBar BarreBas= new JMenuBar();
        BarreBas.setLayout(new GridLayout(2,6));

        JButton Noir = new JButton("Noir");
        JButton Jaune = new JButton("Jaune");
        JButton Rouge = new JButton("Rouge");
        JButton Rose = new JButton("Rose");
        JButton Vert = new JButton("Vert");
        JButton Majenta = new JButton("Majenta");
        JButton Bleu = new JButton("Bleu");
        JButton Orange = new JButton("Orange");
        JButton Ellipse = new JButton("Ellipse");
        JButton Cercle = new JButton("Cercle");
        JButton Rectangle = new JButton("Rectangle");
        JButton Carre = new JButton("Carré");



        Noir.setBackground(Color.BLACK);
        Jaune.setBackground(Color.YELLOW);
        Rouge.setBackground(Color.RED);
        Rose.setBackground(Color.PINK);
        Vert.setBackground(Color.GREEN);
        Majenta.setBackground(Color.MAGENTA);
        Bleu.setBackground(Color.BLUE);
        Orange.setBackground(Color.ORANGE);

        /* couleurs de fonds + interraction écran */
        BarreBas.add(Noir);
        Noir.addActionListener(this);
        BarreBas.add(Rouge);
        Rouge.addActionListener(this);
        BarreBas.add(Vert);
        Vert.addActionListener(this);
        BarreBas.add(Bleu);
        Bleu.addActionListener(this);
        BarreBas.add(Ellipse);
        Ellipse.addActionListener(this);
        BarreBas.add(Cercle);
        Cercle.addActionListener(this);
        BarreBas.add(Jaune);
        Jaune.addActionListener(this);
        BarreBas.add(Rose);
        Rose.addActionListener(this);
        BarreBas.add(Majenta);
        Majenta.addActionListener(this);
        BarreBas.add(Orange);
        Orange.addActionListener(this);
        BarreBas.add(Rectangle);
        Rectangle.addActionListener(this);
        BarreBas.add(Carre);
        Carre.addActionListener(this);





        JMenuBar BarreMilieu = new JMenuBar();
        BarreMilieu.setMinimumSize(new Dimension(200,200));
        BarreMilieu.setBackground(Color.WHITE);
        contentPanel.add(BarreMilieu);
        contentPanel.add(BarreBas,"South");

        setJMenuBar(BarreHaut);
        //BarreBas.setVisible(true);
        //BarreMilieu.setVisible(true);

        this.setVisible(true);
         }



       /* On utilise les fonctions setColor et setFigure décrites dans la class Drawing afin de sélectionner la couleur/la figure de notre choix */
      @Override
       public void actionPerformed(ActionEvent event) {
              String cmd = event.getActionCommand();
             switch (cmd) {
                    case "Noir" -> mydraw.setColor(Color.black);
                    case "Rouge" -> mydraw.setColor(Color.red);
                    case "Vert" -> mydraw.setColor(Color.green);
                    case "Bleu" -> mydraw.setColor(Color.blue);
                    case "Jaune" -> mydraw.setColor(Color.yellow);
                    case "Rose" -> mydraw.setColor(Color.pink);
                    case "Magenta" -> mydraw.setColor(Color.magenta);
                    case "Orange" -> mydraw.setColor(Color.orange);
                    case "Ellipse" -> mydraw.setName("Ellipse");
                    case "Circle" -> mydraw.setName("Circle");
                    case "Rectangle" -> mydraw.setName("Rectangle");
                    case "Square" -> mydraw.setName("Square");
                    case "New" -> this.mydraw.New();
                    case "Open" -> this.mydraw.Open();
                    case " Quit" -> this.dispose();
                    case "Aide" -> {
                           JOptionPane Aider = new JOptionPane();
                           JOptionPane.showInternalMessageDialog(Aider, "Courage !",
                                   "Honorine Miranda", JOptionPane.INFORMATION_MESSAGE);
                    }
             }
       }


       public static void main(String[] args){}
        }

