import javax.swing.*;

/*
 * Main menu for the Chicken Option
 */

public class Chicken extends pork{
      //calls the porkwindow class, basically just copies the window
      public Chicken(){
        cHicken();
    }
   private void cHicken(){
        changeButtonText();
        button1.setIcon(new ImageIcon("c://Users//JEPI//OneDrive//Desktop//Resources//FriedChicken.jpg"));
        button2.setIcon(new ImageIcon("c://Users//JEPI//OneDrive//Desktop//Resources//ChickenCurry.jpg"));
        button3.setIcon(new ImageIcon("c://Users//JEPI//OneDrive//Desktop//Resources//Tinola.jpg"));
        button4.setIcon(new ImageIcon("c://Users//JEPI//OneDrive//Desktop//Resources//chickenAdobo.jpg"));
    }
    private void changeButtonText(){
        button1.setText("Fried");
        button2.setText("Curry");
        button3.setText("Tinola");
        button4.setText("Adobo");
    }
}