/*
*@param args
*@author Mirghani
*@course CPSC 220
*@section 1
*@description This program will use GUI 
*graphics to draw a cit and will accept input 
*from the user to draw additional objects
*/

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class City {
   private Color Brown = new Color(139, 69, 19);
   private Color Blue = new Color(0, 0, 128);
   private Color Green = new Color(0, 100, 0);
  //ArrayList and Array are inititalized
   private ArrayList<Bird> birdList;
   private Rain [] rainList;
   
   City() {
      birdList = new ArrayList<Bird>();
      rainList = new Rain[1];
      Rain temp=new Rain(0,0,0,0);
      rainList[0]=temp;
      
   }
   
   public void createBirds(int number) {
      Random rand = new Random();
      for(int i=0; i<number; i++) {
         int x1 = rand.nextInt(800);
         int y1 = rand.nextInt(600);
         int x2 = x1 - 25;
         int y2 = y1 - 5;
         int xx1 = x1 + 25;
         int yy1 = y1 - 5;
         int xx2 = x1;
         int yy2 = y1;
         
         Bird temp = new Bird(x1, y1, x2, y2, xx1, yy1, xx2, yy2);
         birdList.add(temp);
         
      }
   }
   
   public void createRain(int number) {
      rainList = new Rain [number];
      Random rand = new Random();
      for(int i=0; i<number; i++) {
         int x1 = rand.nextInt(800);
         int y1 = rand. nextInt(600);
         int x2 = x1;
         int y2 = y1 + 5;
         
         Rain temp = new Rain(x1, y1, x2, y2);
         rainList[i] = temp;
      }
   }
   public void drawCity(Graphics dlh) {
          //Draws the three buildings
      building(dlh, 10, 100, 100, 400, Color.BLACK);
      building(dlh, 120, 200, 100, 300, Color.darkGray);
      building(dlh, 230, 150, 100, 350, Color.BLACK);
           
          //Rest of the objects are drawn in the buildings method
          
          //cliff
      dlh.setColor(Brown);
      dlh.fillRect(0,500,400,100);
          //Ocean            
      dlh.setColor(Blue);
      dlh.fillRect(400,550,400,50);
      
         //Calls methods to draw rain and birds    
      drawBird(dlh);
      drawRain(dlh);
   }
   
   public void drawBird(Graphics g) {
      g.setColor(Color.BLACK);
      for(int i=0; i< birdList.size(); i++) {
         Bird currentBird = birdList.get(i);
         int x1 = currentBird.getx1();
         int y1 = currentBird.gety1();
         int x2 = currentBird.getx2();
         int y2 = currentBird.gety2();
         int xx1 = currentBird.getxx1();
         int yy1 = currentBird.getyy1();
         int xx2 = currentBird.getxx2();
         int yy2 = currentBird.getyy2();
         
         g.drawLine(x1, y1, x2, y2);
         g.drawLine(xx1, yy1, xx2, yy2);
      }
   }
    
   public void drawRain(Graphics g) {
      g.setColor(Color.WHITE);
      for(int i=0; i<rainList.length; i++) {
         Rain currentRain = rainList[i];
         int x1 = currentRain.getx1();
         int y1 = currentRain.gety1();
         int x2 = currentRain.getx2();
         int y2 = currentRain.gety2();
         
         g.drawLine(x1, y1, x2, y2);
      }
   
   }
   
   public void building(Graphics dlh, int x, int y, int width,
       int height, Color color) {
      
      
      dlh.setColor(color);
      dlh.fillRect(x, y, width, height);
      
       
      //windows
      dlh.setColor(Color.yellow);
      int x5 = width/21;
      int y5 = height/21;
          
      //first row
      dlh.fillRect(x + x5 * 2, y + y5 *1, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 8, y + y5 *1, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 14, y + y5 *1, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 20, y + y5 *1, x5 * 3, y5 * 2);
      
      //Second row
      dlh.fillRect(x + x5 * 2, y + y5 *4, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 8, y + y5 *4, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 14, y + y5 *4, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 20, y + y5 *4, x5 * 3, y5 * 2);
      
      //Third row
      dlh.fillRect(x + x5 * 2, y + y5 *7, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 8, y + y5 *7, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 14, y + y5 *7, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 20, y + y5 *7, x5 * 3, y5 * 2);
      
      //Fourth row
      dlh.fillRect(x + x5 * 2, y + y5 *10, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 8, y + y5 *10, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 14, y + y5 *10, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 20, y + y5 *10, x5 * 3, y5 * 2);
      
      //Fifth row
      dlh.fillRect(x + x5 * 2, y + y5 *13, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 8, y + y5 *13, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 14, y + y5 *13, x5 * 3, y5 * 2);
      dlh.fillRect(x + x5 * 20, y + y5 *13, x5 * 3, y5 * 2);
      
      //Doors
      int middle = x + (width/2);
      dlh.setColor(Color.GRAY);
      dlh.fillRect(middle- 15, ((y + height) - 50), 30,50);
      
      //Door handle
      dlh.setColor(Color.BLACK);
      dlh.drawLine(middle + 10, ((y+height) - 30), middle + 10, ((y+height) - 20)); 
      
      //Sun
      dlh.setColor(Color.YELLOW);
      dlh.fillOval(700,50,75,75);
      
      //Cloud
      dlh.setColor(Color.WHITE);
      dlh.fillOval(400, 50, 75 ,75);
      dlh.fillOval(410, 75, 60, 60);
      dlh.fillOval(385, 50, 60, 60);
      dlh.fillOval(425, 50, 60, 60);
      dlh.fillOval(435, 50, 60, 60);
      
      dlh.setColor(Color.WHITE);
      dlh.fillOval(350, 50, 75 ,75);
      dlh.fillOval(360, 75, 60, 60);
      dlh.fillOval(335, 50, 60, 60);
      dlh.fillOval(375, 50, 60, 60);
      dlh.fillOval(385, 50, 60, 60);
      
      
      //Wave 1
      dlh.setColor(Blue);
      dlh.fillArc(500, 515, 75, 95, 0, 90);
      dlh.fillArc(550, 515, 75, 95, 0, 90);
      
       
      
      //Wave 2
      dlh.setColor(Blue);
      dlh.fillArc(675, 515, 75, 95, 0 , 90);
      dlh.fillArc(625, 515, 75, 94, 0, 90);
      
      
      //Recycling Can
      dlh.setColor(Green);
      dlh.fillRect(340, 472, 20, 30);
      
      //Lid to Recycling
      dlh.setColor(Color.WHITE);
      dlh.fillRect(340, 471, 20, 5);
      
      
      
      
      
   }
     
       
   
}
