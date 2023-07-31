package abdulBari;

class Parent{
    public int x;

    Parent(){
        System.out.println("Non param constructor - Parent");
    }
    Parent(int x){
        this.x = x;
        System.out.println("Param const of parent :"+ x);
    }
}

class Child extends Parent{
    int y;

    Child(){
        System.out.println("Non-Param const of child");
    }
    Child(int y){
        this.y = y;
        System.out.println("Param const of child :"+y);
    }
    Child(int x,int y){
        super(x); //Must be called at starting of the function else will throw an errors
        System.out.println("Param const of parent and child x:"+x+" y: "+y);
        System.out.println(x*y);
    }

}

public class Superuse {
    public static void main(String[] args){
        // Child c = new Child();

        // Child c = new Child(10);

        Child c = new Child(5,10);
    }
}
