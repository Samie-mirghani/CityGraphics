/**
*@param args
*@author Mirghani
*@course CPSC 220
*@section 1
*@description This program will use GUI 
*graphics to draw a cit and will accept input 
*from the user to draw additional objects
*/

public class Bird {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int xx1;
    private int yy1;
    private int xx2;
    private int yy2;
    
    public Bird(int a, int b, int c, int d, int f, int g, int e , int i) {
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
        xx1 = f;
        yy1 = g;
        xx2 = e;
        yy2 = i;
        
        
        
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
    
    public int getxx1() {
        return xx1;
    }
    
    public int getyy1() {
        return yy1;
    }
    
    public int getxx2() {
        return xx2;
    }
    
    public int getyy2() {
        return yy2;
    }
    
}
