public class ReverseIntegerRunner {
    static int sum = 0;
    public static void reverseInteger(int n){
        if (n == 0)
        return;

        sum = (sum * 10) + n%10;
        reverseInteger(n/10);
        
    }
    public static void main(String[] args) {
        reverseInteger(16);
        System.out.println(sum);
    }
}
class ReverseInteger{

}