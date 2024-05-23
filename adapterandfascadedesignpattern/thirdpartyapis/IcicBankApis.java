package adapterandfascadedesignpattern.thirdpartyapis;

public class IcicBankApis {

    public Integer getBalance(String accNo){
        return 0;
    }
    public void sendMoney(String from, String to, Integer amount){
        System.out.println("sent "+amount+" from "+from+" to "+to);
    }
}
