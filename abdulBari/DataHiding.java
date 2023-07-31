package abdulBari;
class Rectangle{
    private double length;
    private double breadth;

    public double getLength(double l){
        return l;
    }
    public double getBreadth(double b){
        return b;
    }
    public void setLength(double l){
        length =l;
    }
    public void setBreadth(double b){
        breadth = b;
    }

    public double area(){
        return length*breadth;
    }

}
public class DataHiding {
    public static void main(String[]args){
        Rectangle r = new Rectangle();
        // r.length = 10.5;
        // r.breadth = 12.5;

        r.setLength(10.5);
        r.setBreadth(12.5);

        System.out.println(r.area());
    }

}
