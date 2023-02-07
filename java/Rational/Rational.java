public class Rational {
   // instance variables
    private int numerator;
    private int denominator;

    // one argument type constructors
    public Rational(int numerator) {
        this.numerator=numerator;
        this.denominator=1;
        reduce();
    }
    // two argument type constructor
    public Rational(int numerator, int denominator) {
       this.numerator=numerator;
       this.denominator=denominator;
        reduce();
    }
    // getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // instance methods

    public Rational plus(Rational other) {
        // example for visualization 1/2+2/5 => (1*5+2*2)/2*5
        int newDenominator=denominator* other.getDenominator();
        int numerator1=numerator* other.getDenominator();
        int numerator2= other.getNumerator()*denominator;
        int sum=numerator1+numerator2;
        return new Rational(sum,newDenominator);

    }

    public static Rational plus(Rational a, Rational b) {
        // example for visualization 1/2+2/5 => (1*5+2*2)/2*5
        int newDenominator=a.getDenominator()* b.getDenominator();
        int numerator1=a.getNumerator()* b.getDenominator();
        int numerator2= b.getNumerator()*a.getDenominator();
        int sum=numerator1+numerator2;
        return new Rational(sum,newDenominator);
    }

    // Transforms this number into its reduced form
    //Reduces this rational number by dividing both the numerator
    //   and the denominator by their gcd.
    private void reduce() {
        if(numerator!=0){
            int common=gcd(Math.abs(numerator),denominator);
            numerator=numerator/common;
            denominator=denominator/common;
        }
    }

    // Euclid's algorithm for calculating the greatest common divisor
    private int gcd(int a, int b) {
        // Note that the loop below, as-is, will time out on negative inputs.
        // The gcd should always be a positive number.
        // Add code here to pre-process the inputs so this doesn't happen.
        while (a != b)
            if (a > b)
                a = a - b;
            else
                b = b - a;
        return a;
    }

    public int compareTo(Rational other) {
        return difference(this,other);
    }

    private int difference(Rational a, Rational b) {
        // example for visualization 1/2-2/3 => (1*3-2*2)/2*3
        int newDenominator=a.getDenominator()* b.getDenominator();
        int numerator1=a.getNumerator()* b.getDenominator();
        int numerator2= b.getNumerator()*a.getDenominator();
        int difference=numerator1-numerator2;
        return difference;

    }

    public boolean equals(Rational other) {
        return (numerator==other.numerator && denominator==other.denominator);
    }

    public String toString() {
        String result="";
        if (denominator == 1) {
            result=result+numerator;
        } else {
            result=result+numerator+"/"+denominator;
        }
        return result;
    }

}
