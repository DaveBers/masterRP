package masterRP.cadastros.bancos;

import masterRP.cadastros.contaBancaria.ContaBancaria;

import java.util.Scanner;

public class BancoController {
    public Banco createBanco(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do banco: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o código do banco: ");
        String codigo = scanner.nextLine();

        Banco banco = new Banco(nome,codigo);

        return banco;
    }

    public void bancoList (Banco banco){
        System.out.println("--------------------------------");
        System.out.println("Nome do banco: " + banco.getNome());
        System.out.println("Código do banco: " + banco.getCodigo());
        System.out.println("--------------------------------");
    }
}
