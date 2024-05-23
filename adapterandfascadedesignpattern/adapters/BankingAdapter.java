package adapterandfascadedesignpattern.adapters;

public interface BankingAdapter {
    public Integer getBalance(String accNo);
    public void sendMoney(String from, String to, Integer amount);
}
