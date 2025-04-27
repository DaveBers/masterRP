package masterRP.cadastros.contaBancaria;

import java.util.Scanner;

public class ContaBancariaController {
    public ContaBancaria createContaBancaria(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome da conta: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o número da conta: ");
        String numeroConta = scanner.nextLine();

        ContaBancaria contaBancaria = new ContaBancaria(nome,numeroConta);

        return contaBancaria;
    }

    public void contaBancariaList(ContaBancaria contaBancaria){
        System.out.println("--------------------------------");
        System.out.println("Nome da conta: " + contaBancaria.getNome());
        System.out.println("Número da conta: " + contaBancaria.getNumeroConta());
        System.out.println("--------------------------------");
    }
}