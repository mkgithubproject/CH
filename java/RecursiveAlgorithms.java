public class RecursiveAlgorithms {
    // function define which gives nth Fibonacci number of the series.
    public static int fibonacci(int n){
        // base case
        if(n==1 || n==2){
            return 1;
        }
        int nthMinusOneFibonacciNumber=fibonacci(n-1);//  recursive call for calculating nth-1 number
        int nthMinusTwoFibonacciNumber=fibonacci(n-2);// recursive call for calculating nth-2 number
        int nthFibonacciNumber=nthMinusOneFibonacciNumber+nthMinusTwoFibonacciNumber; // calculate nth number by sum of nth-1 and nth-2
        return nthFibonacciNumber; // return nth number
    }
    // function which gives binomial coefficient
    public static int binomialCoefficient(int n,int k){
        // base case
            if(k==0){
                return 1;
            }
            // base case
            if(k==n){
                return 1;
            }
        int sum1 = binomialCoefficient(n - 1, k - 1); // recursive call

        int sum2 = binomialCoefficient(n - 1, k); // recursive call
        return sum2+sum1;
    }
    public static void main(String[] args) {
        System.out.println("nth fib is: "+fibonacci(6));// 6th fibonacci number will be 8
        System.out.println("binomial Coef is: "+binomialCoefficient(7,3));// C(7,3) will be 35
    }
}
