package oo.baitapxoayhinh;

public class Circle {
    String soundFile;

    public Square(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Rotating 360...");
    } 
    
    void playSound(){
        System.out.println("Play file " + this.soundFile + "music");
    }
}
