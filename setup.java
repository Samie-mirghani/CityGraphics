/*
*@param args
*@author Mirghani
*@course CPSC 220
*@section 1
*@description This program will use GUI 
*graphics to draw a cit and will accept input 
*from the user to draw additional objects
*/



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class setup extends JPanel {
   
   private JButton draw;
   private JTextField howMany1, howMany2;
   private DrawingPanel output;
   private City myCity;
   private Color Sky = new Color(135, 206, 250);
   
   
   setup() {
      //News both the Layout and the DrawingPanel
      setLayout(new BorderLayout());
      output = new DrawingPanel(800,600);
      
      //News all the different components
      JLabel labelBirds = new JLabel("Enter the amount of birds you want");
      howMany1 = new JTextField(20);
      JLabel labelRain = new JLabel("Enter the amount of rain you want");
      howMany2 = new JTextField(20);
      draw = new JButton("Draw Picture");
      
      //Creates a JPanel for the buttons
      JPanel ButtonPanel1 = new JPanel();
      ButtonPanel1.setLayout(new FlowLayout());
      ButtonPanel1.add(labelBirds);
      ButtonPanel1.add(howMany1);
      ButtonPanel1.add(labelRain);
      ButtonPanel1.add(howMany2);
      ButtonPanel1.add(draw);
      draw.addActionListener(new buttonListener());
      ButtonPanel1.setPreferredSize(new Dimension(300, 600));

      //Adds the DrawingPanel and the buttonPanel to the window
      add(output, BorderLayout.CENTER);
      add(ButtonPanel1, BorderLayout.WEST);
      myCity = new City();
   
   }
   
   private class DrawingPanel extends JPanel {
      private int width;
      private int height;
      private boolean paintFlag;
      
      private DrawingPanel(int number, int number2) {
      
         this.width = width;
         this.height = height;
         
      }
      private void setHowMany(int number, int number2) {
      
         if(number < 1)
            number = 1;
         if(number < 1)
            number = 1;
         myCity.createBirds(number);
         myCity.createRain(number2);
      }
      
      public void paintComponent(Graphics g) {
      
         if(paintFlag = false) {
            return;
         }
         //gets graphics
         super.paintComponent(g);
         //2D graphics
         Graphics2D g2 = (Graphics2D)g;
         g2.setColor(Sky);
         g2.fillRect(0,0,800,600);
         myCity.drawCity(g2);
      }
         
   } 
        
   private class buttonListener implements ActionListener {
         
         public void actionPerformed(ActionEvent event) {                                         
            //Makes sure that something is entered into the TextField 
            //Then takes numbers entered into textfields
            if(!howMany1.getText().equals("")&&!howMany2.getText().equals("")) {
            
               int num = Integer.parseInt(howMany1.getText());
               int num2 = Integer.parseInt(howMany2.getText());
               output.setHowMany(num, num2);
            
            }          
             
            output.repaint();
            
          
      
       }
      
   }                                       

}