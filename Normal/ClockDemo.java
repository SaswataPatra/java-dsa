package Normal;


public class ClockDemo extends Clock{
    public static void main( String args[] ) {
        Clock firstClock = new Clock( 9, 59, 59 );
        firstClock.tick();
        System.err.println( firstClock.toString() ); 
     }
}
