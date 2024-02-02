public class CountZeros {

    public static int countZeros(int n){
        return helper(n,0);
    }
    private static int helper(int n, int i) {
        if ( n == 0)
        return i;
        if(n%10 == 0)
        return helper(n/10, ++i);
        return helper(n/10, i);
    }
    public static void main(String[] args) {
        System.out.println(countZeros(1020340));
    }

   
}
