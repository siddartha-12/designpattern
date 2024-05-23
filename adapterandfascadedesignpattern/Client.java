package adapterandfascadedesignpattern;

import adapterandfascadedesignpattern.adapters.BankingAdapter;
import adapterandfascadedesignpattern.adapters.YesBankAdapter;

public class Client {
    public static void main(String[] args) {
        BankingAdapter bankingAdapter = new YesBankAdapter();
        PhonePay phonePay = new PhonePay(bankingAdapter);
        phonePay.getBalance("123");
        phonePay.sendMoney("1","2", 100);
    }
}
