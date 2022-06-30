import java.util.Scanner;

public class Conta extends Cliente{
   
    private int agencia;
    public String tipoConta;
    private int senha;
    private int t;
    public double saldo;
    Scanner scn = new Scanner(System.in);
    
    public Conta(){
        
        String st;
        int in;
        
        System.out.println("Digite o nome do cliente: ");
        st = scn.nextLine();
        setNome(st);
        
        System.out.println("Digite o cpf do cliente: ");
        st = scn.nextLine();
        setCpf(st);
        
        System.out.println("Digite o endereço do cliente: ");
        st = scn.nextLine();
        setEndereco(st);
        
        System.out.println("Digite o celular do cliente: ");
        st = scn.nextLine();
        setCelular(st);
        
        System.out.println("Digite a agencia do cliente");
        in = scn.nextInt();
        setAgencia(in);
        
        System.out.println("Crie uma senha para o cliente (Somente numeros) ");
        in = scn.nextInt();
        setAgencia(in);
        
        System.out.println("Cliente " + getNome() + " cadastrado com sucesso!!!");
        System.out.println("============================================================");
        System.out.println("                     Dados:");
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Numero do cliente: " + getNumeroCliente());
        System.out.println("Senha: " + getSenha());
        System.out.println("============================================================");
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String conta) {
        this.tipoConta = tipoConta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
 
    public void deposita(double x){
        double y;
        y = this.saldo + x; 
        setSaldo(y);
    }
    
    public void saca(double x){
        double y;
        y = this.saldo - x;
        setSaldo(y);
    }
}
