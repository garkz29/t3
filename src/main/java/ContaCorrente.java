
public class ContaCorrente extends Conta{
    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String conta) {
        super.tipoConta = "Conta Corrente";
    }    
    
    public void saca(double x){
        double y;
        y = this.saldo - x -(x*0.1);
        setSaldo(y);
    }
}
