package ru.netology;

import ru.netology.taxes.IncomeTaxType;
import ru.netology.taxes.ProgressiveTaxType;
import ru.netology.taxes.VATaxType;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(100, new IncomeTaxType(), taxService),
                new Bill(100, new VATaxType(), taxService),
                new Bill(101000, new ProgressiveTaxType(), taxService)
        };
        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}