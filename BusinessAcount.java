package codigo;

public class BusinessAcount extends Acount {
    private double limite_emprestimo;

    public BusinessAcount(){
        super();
    }

    public BusinessAcount(Integer number, String holder, double balance, double limite_saque) {
        super(number, holder, balance);
        this.limite_emprestimo = limite_saque;
    }

    public double getLimite_saque() {
        return limite_emprestimo;
    }

    public void setLimite_saque(double limite_saque) {
        this.limite_emprestimo = limite_saque;
    }
    public void limite(double emprestimo){
        if(emprestimo <= limite_emprestimo){
            depositar(emprestimo);
        }

    }



}
