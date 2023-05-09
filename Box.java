package Generics;

public class Box <T>{
    //object class is parent class of all java classes
    T container;
    public Box(T container){
        this.container = container;
    }
    public Object getValue(){
        return this.container;
    }
    
}
