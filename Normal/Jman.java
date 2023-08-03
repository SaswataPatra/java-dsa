package Normal;

public class Jman {
    public static void main(String[]args){
        int arr1[] = {1,2,3,4,5,7};
        int arr2[] = {7,8,9,0};
        int arr3[] = new int[arr1.length+arr2.length];
        int count=0;
        for(int i: arr1){
            arr3[count++] = i;
        }
        for(int i : arr2){
            arr3[count++] = i;
        }
        // int i=0;
        // for(;i<arr1.length;i++){
        //     arr3[i] = arr1[i];
        // }
        // for(;i<arr3.length;i++){
        //     arr3[i] = arr2[i-arr1.length];
        // }
        for(int j =0;j<arr3.length;j++){
            System.out.println(arr3[j]);
        }
    }
}
