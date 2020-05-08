package codigo;

public class Acount {
    private Integer number;
    private String holder;
    protected double balance;

    public Acount(){
    }

    public Acount(Integer number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
    public void saque(double amount){
        this.balance = balance - amount + 5;
    }
    public void depositar(double amount){
        this.balance = balance + amount;
    }
}
