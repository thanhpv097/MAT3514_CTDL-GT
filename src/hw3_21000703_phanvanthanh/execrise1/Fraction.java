package hw3_21000703_phanvanthanh.execrise1;

public class Fraction {
    private final float numerator;
    private final float denominator;
    public Fraction(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction add(Fraction c) {
        float numeratorNew = this.numerator*c.denominator + this.denominator*c.numerator;
        float denominatorNew = this.denominator*c.denominator;
        return new Fraction(numeratorNew, denominatorNew);
    }
    public Fraction minus(Fraction c) {
        float numeratorNew = this.numerator*c.denominator - this.denominator*c.numerator;
        float denominatorNew = this.denominator*c.denominator;
        return new Fraction(numeratorNew, denominatorNew);
    }
    public Fraction multi(Fraction c) {
        float numeratorNew = this.numerator*c.numerator;
        float denominatorNew = this.denominator*c.denominator;
        return new Fraction(numeratorNew, denominatorNew);
    }
    public Fraction divi(Fraction c) {
        float numeratorNew = this.numerator*c.denominator;
        float denominatorNew = this.denominator*c.numerator;
        return new Fraction(numeratorNew, denominatorNew);
    }
    public float gcd(Fraction c) {
        float numeratorNew = Math.abs(c.numerator);
        float denominatorNew = Math.abs(c.denominator);
        while(numeratorNew % 10 != 0 && denominatorNew % 10 != 0) {
            numeratorNew *= 10;
            denominatorNew *= 10;
        }
        while(numeratorNew * denominatorNew != 0) {
            if (numeratorNew > denominatorNew) {
                numeratorNew %= denominatorNew;
            }else{
                denominatorNew %= numeratorNew;
            }
        }
        return numeratorNew + denominatorNew;
    }
    public Fraction normalize(Fraction c) {
        float numeratorNew = c.numerator;
        float denominatorNew = c.denominator;
        while(numeratorNew % 10 != 0 && denominatorNew % 10 != 0) {
            numeratorNew *= 10;
            denominatorNew *= 10;
        }
        float gcd = gcd(c);
        return new Fraction(numeratorNew / gcd, denominatorNew / gcd);
    }
    public float getNumerator() {
        return numerator;
    }
    public float getDenominator() {
        return denominator;
    }
    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }
}
