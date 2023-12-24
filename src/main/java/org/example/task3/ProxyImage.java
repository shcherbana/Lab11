package org.example.task3;

public class ProxyImage implements MyImage{
    private String filename;
    public ProxyImage(String filename){
        this.filename = filename;
    }
    @Override
    public void display() {
        RealImage img = new RealImage(this.filename);
        img.display();
    }
}