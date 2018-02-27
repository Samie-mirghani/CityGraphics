/*
*@param args
*@author Mirghani
*@course CPSC 220
*@section 1
*@description This program will use GUI 
*graphics to draw a cit and will accept input 
*from the user to draw additional objects
*/

public class Rain {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Rain(int a , int b, int c, int d) {
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
        
    }
    
    public int getx1() {
        return x1;
     
    }
    
    public int gety1() {
        return y1;
        
    }
    
    public int getx2() {
        return x2;
    }
    
    public int gety2() {
        return y2;
    }
    
    
}
