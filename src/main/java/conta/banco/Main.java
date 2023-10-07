package conta.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Sun Bank");
        System.out.println("-------------------------");

        System.out.println("Digite sua conta: ");
        int conta = new Scanner(System.in).nextInt();
        
        System.out.println("Digite sua agência: ");
        String agencia = new Scanner(System.in).next();

        System.out.println("Digite seu nome: ");
        String nome = new Scanner(System.in).next();

        System.out.println("Digite seu Saldo: ");
        float saldo = new Scanner(System.in).nextFloat();
        
        System.out.println("-------------------------");      
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s,conta %d e seu saldo %.2f já está disponível para saque",nome,agencia,conta,saldo);


       }
}