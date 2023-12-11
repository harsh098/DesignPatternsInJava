public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getTaxCalulator();
        calculator.calculateTax();
    }

    public static TaxCalculator getTaxCalulator(){
        return new TaxCalculator2022();
    }
}