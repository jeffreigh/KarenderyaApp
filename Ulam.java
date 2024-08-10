import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * The first window that shows up when you run the app
 */

public class Ulam implements ActionListener {  
    JFrame Main_Frame = new JFrame("Karenderya App");
    SpringLayout layout = new SpringLayout();
    JPanel Main_Panel = new JPanel();
    JButton confirmbtn = new JButton("Confirm");
    JButton exitbtn = new JButton("Exit");

    //makes an array to put inside the combobox
    String [] insideCombobox = {"                              ---                     ","Pork", "Chicken", "Fried Rice"};

    //create a combobox
    JComboBox combobox = new JComboBox(insideCombobox);
    JLabel label = new JLabel("Choose The Main Ingredient.");

    //adds the objects

    Chicken chick;  
    FriedRice friedrice;
    pork porkWindow;

    //calls the component method so it can show the components in the frame
    public Ulam(){
        components();
    }
   //sets up the components
    private void components(){
        componentSize();
        componentPlacements();
        addListeners();

        Main_Panel.setLayout(new BorderLayout());
        Main_Frame.add(Main_Panel);
        Main_Panel.setLayout(layout);

        Main_Panel.add(combobox); 
        Main_Panel.add(confirmbtn); 
        Main_Panel.add(exitbtn);
        Main_Panel.add(label);

        
        Main_Frame.pack();
        show();
        Main_Frame.setSize(350,500);
        Main_Frame.setResizable(false);
        Main_Frame.setLocationRelativeTo(null);
        Main_Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
        //sets the components Sizes
        private void componentSize(){
            combobox.setPreferredSize(new Dimension(200,30));
            confirmbtn.setPreferredSize(new Dimension(80,30));
            exitbtn.setPreferredSize(new Dimension(80,30));
        }
        
        //Places the components in specific places
        private void componentPlacements(){
            //label placement
            layout.putConstraint(SpringLayout.WEST, label, 90, SpringLayout.NORTH, Main_Panel);
            layout.putConstraint(SpringLayout.NORTH, label, 50, SpringLayout.NORTH, Main_Panel);

            //combobox placement
            layout.putConstraint(SpringLayout.WEST, combobox, 70, SpringLayout.NORTH, Main_Panel);
            layout.putConstraint(SpringLayout.NORTH, combobox, 80,SpringLayout.NORTH,Main_Panel);

            //comfirm button placement
            layout.putConstraint(SpringLayout.WEST, confirmbtn,20, SpringLayout.SOUTH, combobox);
            layout.putConstraint(SpringLayout.NORTH, confirmbtn,10,SpringLayout.SOUTH,combobox);

            //exit button placement
            layout.putConstraint(SpringLayout.WEST, exitbtn,20, SpringLayout.SOUTH,combobox);
            layout.putConstraint(SpringLayout.NORTH, exitbtn,10,SpringLayout.SOUTH,confirmbtn);
        }

        private void addListeners(){
            exitbtn.addActionListener(this);
            confirmbtn.addActionListener(this);
        }
        //exits the windows
        private void exitWindow(){
           System.exit(0);
        }
        //shows the main window
        public void show (){
            Main_Frame.setVisible(true);
        }

        //shows the message
        private void message(){
            JOptionPane.showMessageDialog(null, "That is invalid. (You need to pick a dish)","Error.", JOptionPane.ERROR_MESSAGE); 
        }

        //button events
        public void actionPerformed(ActionEvent e){ 
            if (e.getSource() == exitbtn){
                exitWindow();
                combobox.setSelectedItem("                              ---                     ");
            }   
            if(combobox.getSelectedItem()=="Pork"){       
                new pork();     
            }
            if(combobox.getSelectedItem() == "Chicken"){
                new Chicken();
            }
            if(combobox.getSelectedItem()=="Fried Rice"){  
                new FriedRice();
            }
            //shows the message when clicked confirm w/o any dishes selected
            if(combobox.getSelectedItem()=="                              ---                     "){
                message();
            }
        }
    //it calls the ulam method so it can run and the frame can be shown
    public static void main(String[] args){
        new Ulam();
        
    }   
}
