public class SumOfDigitRunner {
    public static void main(String[] args) {
        SumOfDigit sd = new SumOfDigit();
        System.out.println(sd.sumOfDigit(12345510));
    }
}
class SumOfDigit{

    public int sumOfDigit(int n){

        if (n == 0)
        return 0;

        return (n%10) + sumOfDigit(n/10);
    }
}
