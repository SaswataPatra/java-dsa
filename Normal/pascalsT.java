package Normal;
import java.util.*;
public class pascalsT {
    public static void main(String[]args){
        int rows = 6;
        List<List<Integer>> arr = new ArrayList<List<Integer>>(rows);
        arr = generate(rows);
        System.out.println(arr);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listOflists = new ArrayList<List<Integer>>(numRows);
        for (int i=0; i<numRows;i++){
            List<Integer> innerList = new ArrayList<Integer>();
            if ( listOflists.isEmpty()){//first row
                innerList.add(1);
                listOflists.add(innerList);
            }else{
                innerList.add(1);
                if (listOflists.size()>=2){//wont activate the second row
                    for( int j =1; j<=i-1;j++){
                        innerList.add(listOflists.get(i-1).get(j-1) + listOflists.get(i-1).get(j));
                    }
                }
                innerList.add(1);
                listOflists.add(innerList);
            }
            
        }
        return listOflists;
    }
}
