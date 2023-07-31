package Normal;
class Solution {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int cursor1 = m - 1;
        int cursor2 = n - 1;
        
        while(cursor2 >= 0) {
            if(cursor1 >= 0 && nums1[cursor1] >= nums2[cursor2]) {
                nums1[cursor1 + cursor2 + 1] = nums1[cursor1--];
            }
            else {
                nums1[cursor1 + cursor2 + 1] = nums2[cursor2--];
            }
        }
       return nums1;
    }
    public static void main(String [] args){
        int[] arr1 = {1,2,7,0,0,0};
        int [] arr2 = {2,5,6};
        int m = 3;
        int n =3;
        arr1 = merge(arr1,m,arr2,n);
        for(int i =0; i<m+n;i++){
            System.out.println(arr1[i]);
        }
    }
}
