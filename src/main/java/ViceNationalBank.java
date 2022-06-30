import java.util.Scanner;
public class ViceNationalBank {
    public static void main(String[] args) {
        int cont =0;
        double sq;
        int alt;
        int in;
        Scanner scn = new Scanner(System.in);
        Conta c;
        
        System.out.println("Digite o numero correspondente ao numero da conta tipo da conta: ");
        System.out.println("1- Conta corrente");
        System.out.println("2- Conta poupança");
        in = scn.nextInt();
        
        if(in == 1){
            c = new ContaCorrente();
        }
        else{
            c = new ContaPoupança();
        }
        
        
        while (cont <= 0){
           
            
            System.out.println("Digite o numero correspondente a opção desejada: ");
            System.out.println("1- Depositar ");
            System.out.println("2- Sacar");
            System.out.println("3- Ver saldo");
            System.out.println("4- Sair");
            
            alt = scn.nextInt();
            
            switch (alt) {
                case 1:
                    System.out.println("Insira o valor a ser depositado: ");
                    sq = scn.nextDouble();
                    c.deposita(sq);
                    break;
                case 2:
                    System.out.println("Insira o valor a ser sacado: ");
                    sq = scn.nextDouble();
                    c.saca(sq);
                    break;
                case 3:
                    System.out.println("Seu saldo é:" +c.getSaldo());
                    break;
                case 4:
                    cont += 2;
                    break;    
                default:
                    return;
            }
            
            System.out.println("Deseja encerrar o Programa? ");
            System.out.println("1- Sim");
            System.out.println("2- Nao");
           
            alt = scn.nextInt();
            
            if(alt == 1){
                cont = 40;
            }
            else{
                
            }
        }
        
    }
}
