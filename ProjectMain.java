/**
*@param args
*@author Mirghani
*@course CPSC 220
*@section 1
*@description This program will use GUI 
*graphics to draw a cit and will accept input 
*from the user to draw additional objects
*/

import java.awt.*;
import javax.swing.*;

public class ProjectMain {

   public static void main(String[] args) {
   // Initializes the window and makes it pop up
   JFrame frame = new JFrame("City");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.getContentPane().add(new setup());
   frame.setPreferredSize(new Dimension(1100, 620));
   
   //Makes the window visible
   frame.pack();
   frame.setVisible(true);
   
   }
}   