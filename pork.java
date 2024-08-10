import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/* 
 * Main menu for the Pork Option
 */

public class pork implements ActionListener  {
    JFrame PorkFrame = new JFrame("Pork Dishes");
    SpringLayout layout = new SpringLayout();
    JPanel Main_Panel = new JPanel();
    Font font = new Font("Arial Black",Font.BOLD,11);
    static JButton button1;
    static JButton button2;
    static JButton button3;
    static JButton button4;
    static JButton button5;

    public pork(){
        PorkWindow();
    }

    //creates the window for the pork option
    public void PorkWindow(){ 
        PorkFrame.add(Main_Panel);
        Main_Panel.setLayout(layout);
        PorkFrame.setUndecorated(true);
        PorkFrame.setResizable(false);
        PorkFrame.setSize(720,480);
        PorkFrame.setVisible(true);
        PorkFrame.setLocationRelativeTo(null);
        buttons();
    }

    //button placements from right to left
    public void buttons(){ 
        addingbuttons();
        textInButton();
        textFonts();
        setButtonSize();
        setTextColor();

        layout.putConstraint(SpringLayout.WEST, button1,235, SpringLayout.NORTH, Main_Panel);
        layout.putConstraint(SpringLayout.NORTH,button1,80,SpringLayout.NORTH,Main_Panel);
        button1.setIcon(new ImageIcon("C://Users//JEPI//OneDrive//Desktop//Resources//porkchops.jpg"));
        button1.setHorizontalTextPosition(SwingConstants.CENTER);                 
        
        layout.putConstraint(SpringLayout.WEST, button2,135, SpringLayout.WEST, button1);
        layout.putConstraint(SpringLayout.NORTH,button2,80,SpringLayout.NORTH,Main_Panel);
        button2.setIcon(new ImageIcon("C://Users//JEPI//OneDrive//Desktop//Resources//sinigang.jpg"));
        button2.setHorizontalTextPosition(SwingConstants.CENTER);         
       
        layout.putConstraint(SpringLayout.WEST, button3,235, SpringLayout.WEST, Main_Panel);
        layout.putConstraint(SpringLayout.NORTH,button3,235,SpringLayout.NORTH,Main_Panel);
        button3.setIcon(new ImageIcon("C://Users//JEPI//OneDrive//Desktop//Resources//porksteak.jpg"));
        button3.setHorizontalTextPosition(SwingConstants.CENTER);
        
        layout.putConstraint(SpringLayout.WEST, button4,135, SpringLayout.WEST, button3);
        layout.putConstraint(SpringLayout.NORTH,button4, 235,SpringLayout.NORTH,Main_Panel);
        button4.setIcon(new ImageIcon("C://Users//JEPI//OneDrive//Desktop//Resources//porkAdobo.jpg"));
        button4.setHorizontalTextPosition(SwingConstants.CENTER);
        
 
        validation();
    } 

    //Adds the buttons
    private void addingbuttons(){
        Main_Panel.add(button1);
        Main_Panel.add(button2);
        Main_Panel.add(button3);
        Main_Panel.add(button4);
        Main_Panel.add(button5);
    } 
    //Edits the Texts in the buttons
    private void textInButton(){
        button1.setText("Pork Chops");
        button2.setText("Sinigang");
        button3.setText("Pork Steak");
        button4.setText("Adobo");
    }
    //sets the fonts of the texts in the buttons
    private void textFonts(){
        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);
        button4.setFont(font);
    }
    //sets up the sizes of each button
    private void setButtonSize(){
        button1.setPreferredSize(new Dimension(110,120));
        button2.setPreferredSize(new Dimension(110,120));
        button3.setPreferredSize(new Dimension(110,120));
        button4.setPreferredSize(new Dimension(110,120));
        button5.setPreferredSize(new Dimension(50,50));
    }
    //sets ButtonTextColor
    private void setTextColor(){
        button1.setForeground(Color.WHITE);
        button2.setForeground(Color.WHITE);
        button3.setForeground(Color.WHITE);
        button4.setForeground(Color.WHITE);
    }

    //exits the window
    private void exitWindow(){
         PorkFrame.dispose();
    }
    
    //VALIDATES THE IMAGES IN THE BUTTONS
    private void validation(){
        PorkFrame.validate();
    }
    // Things that happens when you clicked the buttons.
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(button5)){
            exitWindow();     
        }
     }

}
