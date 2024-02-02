class FibonaciiRunner{
    public static void main(String[] args) {
        Fibonacii fib = new Fibonacii();
        System.out.println(fib.getNthFibonacii(10));
    }
}

class Fibonacii{
    public int getNthFibonacii(int n){
        if ( n < 2)
        return n;
        return getNthFibonacii(n - 1) + getNthFibonacii(n - 2);
    }
}