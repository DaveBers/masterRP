package masterRP;

import masterRP.cadastros.bancos.Banco;
import masterRP.cadastros.bancos.BancoController;
import masterRP.cadastros.contaBancaria.ContaBancaria;
import masterRP.cadastros.contaBancaria.ContaBancariaController;

import java.util.Scanner;

public class Global {
    public static void main(String[] args){
        Banco banco = new Banco();
        BancoController bancoController = new BancoController();
        ContaBancaria contaBancaria = new ContaBancaria();
        ContaBancariaController contaBancariaController = new ContaBancariaController();

        Scanner scanner = new Scanner(System.in);
        String opcao;
        Boolean continua = true;

        while (continua){
            System.out.println("Cadastro de Conta Bancária");
            System.out.println("1- Criar um banco\n2- Criar uma conta\n3- Listar tudo\nDigite o número da opção desejada:");
            opcao = scanner.nextLine();

            switch (opcao){
                case "1":
                    banco = bancoController.createBanco();
                    break;

                case "2":
                    contaBancaria = contaBancariaController.createContaBancaria();
                    break;

                case "3":
                    System.out.println("Banco:");
                    bancoController.bancoList(banco);

                    System.out.println("\nConta:");
                    contaBancariaController.contaBancariaList(contaBancaria);
                    break;

                case null:
                    continua = false;
                    break;

                default:
                    throw new IllegalStateException("Opção " + opcao + " inválida");
            }
        }
    }
}
