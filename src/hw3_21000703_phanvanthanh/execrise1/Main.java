package hw3_21000703_phanvanthanh.execrise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Fraction> fractions = new ArrayList<>();
        System.out.println("Enter the fractional quantity: ");
        int numeberOfFraction = sc.nextInt();
        for(int i = 0; i < numeberOfFraction; ++i) {
            System.out.println("Enter the numerator: ");
            float numerator = sc.nextFloat();
            System.out.println("Enter the denominator: ");
            float denominator = sc.nextFloat();
            Fraction fraction = new Fraction(numerator, denominator);
            fractions.add(fraction);
        }

        System.out.println("Enter the place of the fraction: ");
        int numberOfPlace = sc.nextInt();
        System.out.println("That fraction is: " + fractions.get(numberOfPlace - 1));

        Fraction fractionSum = new Fraction(0,1);
        for(int index = 0; index < numeberOfFraction; ++index) {
            fractionSum = fractionSum.add(fractions.get(index));
        }
        System.out.println("The sum of " + numeberOfFraction + " fractions is: " + fractionSum.normalize(fractionSum));

        Fraction fractionDiff = new Fraction(0, 1);
        for(int index = 0; index < numeberOfFraction; ++index) {
            fractionDiff = fractionDiff.minus(fractions.get(index));
        }
        System.out.println("The difference of " + numeberOfFraction + " fraction is: " + fractionDiff.normalize(fractionDiff));

        Fraction fractionPro = new Fraction(1,1);
        for(int index = 0; index < numeberOfFraction; ++index) {
            fractionPro = fractionPro.multi(fractions.get(index));
        }
        System.out.println("The Product of " + numeberOfFraction + " fraction is: " + fractionPro.normalize(fractionPro));

        Fraction fractionQuo = new Fraction(1,1);
        for(int index = 0; index < numeberOfFraction; ++index) {
            fractionQuo = fractionQuo.divi(fractions.get(index));
        }
        System.out.println("The Quotient of " + numeberOfFraction + " fraction is: " + fractionQuo.normalize(fractionQuo));
    }
}
