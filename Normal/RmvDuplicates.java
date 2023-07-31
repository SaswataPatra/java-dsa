package Normal;

public class RmvDuplicates {
    public static void main(String[]args){
        int arr[] = {1,1,2};
        int sum = remove_duplicates(arr);
        System.out.print(sum);
    }
    public static int remove_duplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]) i++;
            arr[i]=arr[j];
        }
        return i+1;
    }
}
