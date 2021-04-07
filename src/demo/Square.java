package demo;

public class Square extends Rectangle {
//    private double size;
    public Square(String color, boolean filled, double size) {
        super(size, size, color, filled);
    }
    public Square(double size){
        super(size,size);
    }
    public Square(){
        super(1.0,1.0);
    }

    public double getSize() {
        return super.getWidth();
    }

    public void setSize(double size) {
        super.setWidth(size);
        super.setHeight(size);
    }
    public void setWidth(double size){
        super.setWidth(size);
        super.setHeight(size);
    }
    public double getWidth(){
        return  super.getWidth();
    }

    @Override
    public String toString() {
        return "A Square with side= "+super.getWidth()+" , which is a subclass off "+super.toString();
    }
}
