package Normal;

class QuickSortPart1{
    public int partition(int[] a, int left, int right) {
        int pivot = a[left];
        while(left<=right) {
            while(a[left] < pivot)
                left++;
            while(a[right] > pivot)
                right--;
            if(left<=right) {
                int tmp = a[left];
                a[left] = a[right];
                a[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }
    public void recursiveQuickSort(int[] a, int i, int j) {
       int idx = partition(a, i, j);
       if(i < idx-1) {
           recursiveQuickSort(a, i, idx-1);
        }
       if(j > idx) {
           recursiveQuickSort(a, idx, j);
        }
    }

    void printarray(int arr[]){
        int len = arr.length;
        for(int i=0; i<len; i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int arr[] = new int[]{ 10,5,8,4,3 };
            System.out.print(" ");
        System.out.println("\n");
        QuickSortPart1 ob = new QuickSortPart1();
        ob.recursiveQuickSort(arr, 0, arr.length-1);
        ob.printarray(arr);
    }
}
DECLARE
     sqr NUMBER(10);
     val NUMBER(10);
BEGIN
     dbms_output.put_line('Enter the value for square');
     sqr := :sqr;
     val := sqr;
     squares(sqr);
     dbms_output.put_line('Square of '|| val|| ' is '|| sqr);
END;