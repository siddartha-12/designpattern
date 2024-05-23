package adapterandfascadedesignpattern.adapters;

import adapterandfascadedesignpattern.thirdpartyapis.IcicBankApis;

public class IcicBankAdapter implements BankingAdapter{
    private final IcicBankApis icicBankApis;
    public IcicBankAdapter(){
        icicBankApis=new IcicBankApis();
    }

    @Override
    public Integer getBalance(String accNo) {
        return icicBankApis.getBalance(accNo);
    }

    @Override
    public void sendMoney(String from, String to, Integer amount) {
        icicBankApis.sendMoney(from,to,amount);
    }
}
