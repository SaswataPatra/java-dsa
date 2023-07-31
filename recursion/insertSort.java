package recursion;

import java.util.ArrayList;

public class insertSort {
    public static void main(String[]args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(1);
        a.add(50);
        a.add(2);
        sort(a);
        System.out.println(a);
    }
    public static void sort(ArrayList<Integer> a){
        if (a.size()==0) return;

        int temp = a.get(a.size()-1);
        a.remove(a.size()-1);
        System.out.println(temp);
        sort(a);
        insert(a,temp);
    }

    public static void insert(ArrayList<Integer> a, int temp){
        if (a.size()==0 || a.get(a.size()-1)<temp){
            a.add(temp);
            return;
        }
        int val = a.get(a.size()-1);
        a.remove(a.size()-1);
        insert(a,temp);
        a.add(val);
        return;
    }
}
