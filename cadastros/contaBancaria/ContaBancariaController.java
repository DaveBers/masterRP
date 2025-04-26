package masterRP.cadastros.contaBancaria;

import java.util.Scanner;

public class ContaBancariaController {
    public void createContaBancaria(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome da conta: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o número da conta: ");
        String numeroConta = scanner.nextLine();

        ContaBancaria contaBancaria = new ContaBancaria(nome,numeroConta);
        System.out.println("Conta: " + contaBancaria.getNome());
        System.out.println("Número: " + contaBancaria.getNumeroConta());

        scanner.close();
    }

    public static void main(String[] args){
        System.out.println("Criação de Conta Bancária");
        ContaBancariaController contaBancariaController = new ContaBancariaController();
        contaBancariaController.createContaBancaria();
    }
}