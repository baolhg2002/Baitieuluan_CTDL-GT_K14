package oo.tuan3;

public class Dog {

    //attribute - data
    private int size; //implementation
    /**default */ String name; //interface
    /**default */ String breed; //interface

    //method
    //interface
    public void setSize(int size){
        //viet code rang buoc khong bao gio am
        if (size > 0){
            this.size = size;
        }else{
            System.out.println("Size unvalid! (Khong hop le)");
        }
    }

    //interface
    public int getSize(){
        return this.size;
    }
}
