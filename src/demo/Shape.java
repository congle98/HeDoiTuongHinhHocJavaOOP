package demo;

public class Shape {
    private String color;
    private boolean filled;
    public Shape(){
        this.color="green";
        this.filled=true;
    }
    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return  this.filled;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public void setFilled(boolean on){
        this.filled = on;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " +
                (this.filled?" and filled":" not filled");
    }
}
