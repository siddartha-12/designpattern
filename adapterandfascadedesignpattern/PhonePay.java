package adapterandfascadedesignpattern;

import adapterandfascadedesignpattern.adapters.BankingAdapter;

public class PhonePay {
    private BankingAdapter bankingAdapter;
    public PhonePay(BankingAdapter bankingAdapter){
        this.bankingAdapter = bankingAdapter;
    }
    public Integer getBalance(String accNo){
        return bankingAdapter.getBalance(accNo);
    }
    // this Fascade design pattern
    public void sendMoney(String from, String to, Integer amount){
        bankingAdapter.sendMoney(from,to,amount);
        sendNotification(to, "Hi");
        sendNotification(from, "Hi");
        updateBalance(from,getBalance(from)-amount);
        updateBalance(to, getBalance(to)+amount);
    }
    private void sendNotification(String to, String message){
        System.out.println("sending notification to "+message);
    }
    public void updateBalance(String accNo, Integer amount){
        System.out.println("Balance updated");
    }
}
