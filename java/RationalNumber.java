import java.util.*;
public class RationalNumber {
      private int numerator;
      private int denominator;
      // constructor with arguments
    public  RationalNumber(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    // default constructor
    public RationalNumber(){
        this.numerator=0;
        this.denominator=1;
    }
    // getter, returned denominator
    public int getDenominator(){
        return this.denominator;
    }
    //getter return numerator
    public int getNumerator(){
        return this.numerator;
    }

    @Override
    // to string method
    public String toString() {
        if(this.denominator==1 && this.numerator!=0){
            return ""+this.numerator;
        }else if(this.numerator==0){
            return "0";
        }else if(this.numerator<0 && this.denominator<0 && this.denominator!=-1 ){
            return ""+Math.abs(this.numerator)+"/"+Math.abs(this.denominator);
        }else if(this.numerator<0 && this.denominator<0 && this.denominator==-1 ){
            return ""+Math.abs(this.numerator);
        }else if(this.numerator<0 && this.denominator>0 || this.numerator>0 && this.denominator<0){
            return "-"+Math.abs(this.numerator)+"/"+Math.abs(this.denominator);
        }else{
            return this.numerator+"/"+this.denominator;
        }
    }
    // add two Rational numbers
    public RationalNumber add(RationalNumber numberToAdd){
        int resultDenominator = this.denominator * numberToAdd.denominator;
        int resultNumerator = this.numerator * numberToAdd.denominator +
                numberToAdd.numerator * this.denominator;

        return new RationalNumber(resultNumerator,resultDenominator);
    }
    // subtract two Rational numbers
    public RationalNumber subtract( RationalNumber numberToSubtract )
    {
        int resultDenominator = denominator * numberToSubtract.denominator;
        int resultNumerator = numerator * numberToSubtract.denominator -
                numberToSubtract.numerator * denominator;

        return new RationalNumber( resultNumerator, resultDenominator );
    } // end method subtract
    // multiply two Rational numbers
    public RationalNumber multiply( RationalNumber numberToMultiply )
    {
        return new RationalNumber( numerator * numberToMultiply.numerator,
                denominator * numberToMultiply.denominator );
    } // end method multiply
    // divide two Rational numbers
    public RationalNumber divide( RationalNumber numberToDivide )
    {
        return new RationalNumber( numerator * numberToDivide.denominator,
                denominator * numberToDivide.numerator );
    } // end method divide

}
