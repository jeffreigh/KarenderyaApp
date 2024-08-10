import javax.swing.*;

/*
 * Main menu for the Fried Rice Option
 */

public class FriedRice extends pork{
    //calls the porkwindow class, basically just copies the window
    public FriedRice(){
        friedRice();
    }
    private void friedRice(){
        changeButtonTextFriedRice();
        button1.setIcon(new ImageIcon("c://Users//JEPI//OneDrive//Desktop//Resources//GarlicRice.jpg"));
        button2.setIcon(new ImageIcon("c://Users//JEPI//OneDrive//Desktop//Resources//adoboFriedRice.jpg"));
        button3.setIcon(new ImageIcon("c://Users//JEPI//OneDrive//Desktop//Resources//EggFriedRice.jpg"));
        button4.setIcon(new ImageIcon("c://Users//JEPI//OneDrive//Desktop//Resources//PorkPepperRice.jpg"));
    }
    private void changeButtonTextFriedRice(){
        button1.setText("Garlic");
        button2.setText("Adobo");
        button3.setText("Egg");
        button4.setText("PepperLunch");
}
}
