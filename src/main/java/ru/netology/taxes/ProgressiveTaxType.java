package ru.netology.taxes;

public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        if (amount <= 100_000) {
            return amount * 0.1;

        } else if (amount > 100000) {
        }
        return amount * 0.15;
    }
}
