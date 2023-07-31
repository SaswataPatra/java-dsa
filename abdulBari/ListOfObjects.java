package abdulBari;
import java.util.*;
class subject{
String subId;
String name;
int maxMarks;
int marksObtain;
}
class students{
String rollNumber;
String name;
String dept;
subject[]subs;
List<subject> subjects;
}
public class ListOfObjects {
    public static void main(String[]args){
        students s = new students();
        subject sub = new subject();
        sub.subId = "9x9s9s9";
        sub.name = "maths";
        sub.maxMarks = 100;
        sub.marksObtain = 80;
        s.rollNumber = "100";
        s.name = "Saswata Patra";
        s.dept = "cmsa";
        s.subjects.add(sub);
        subject subArr[] = new subject[3];
        s.subs[0].subId = "hello";

    }
}
