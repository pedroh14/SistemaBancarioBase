package codigo;

public class SavingsAcount extends Acount {
    private  double interestRate;

    public SavingsAcount(){
    }

    public SavingsAcount(Integer number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;

    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void updateBalance(double amount){
        balance = balance * interestRate;
    }

    @Override
    public void saque(double amount){
        balance = balance - amount;
    }
}
