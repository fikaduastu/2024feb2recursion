public class BinarySearchRunner {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,55,66,343};
        BinarySearch bs = new BinarySearch();
        int a = bs.findELement(arr, 10, 0, arr.length -1);
        System.out.println(a);
    }
}
class BinarySearch{
    public int findELement(int arr[],int target,int start,int end){

        if (start > end )
        return -1;


        int mid = (start + end)/2;

        if (arr[mid] == target)
            return mid;
        if (target > arr[mid])
        return findELement(arr, target, mid + 1, end);
        if (target < arr[mid])
        return findELement(arr, target, start, mid - 1);
        
        return mid;
    }
}