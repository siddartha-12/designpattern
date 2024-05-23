package adapterandfascadedesignpattern.adapters;

public class YesBankAdapter implements BankingAdapter{
    @Override
    public Integer getBalance(String accNo) {
        System.out.println("This is yes bank balance method");
        return 0;
    }

    @Override
    public void sendMoney(String from, String to, Integer amount) {
        System.out.println("This is Yes bank adapter");
    }
}
