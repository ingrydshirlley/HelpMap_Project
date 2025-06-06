package br.com.helpmap;
import br.com.helpmap.model.*;
import br.com.helpmap.service.AbrigoService;
import br.com.helpmap.service.CadastroInstituicaoService;
import br.com.helpmap.service.PontoDoacaoService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroInstituicaoService instituicaoService = new CadastroInstituicaoService();
        AbrigoService abrigoService = new AbrigoService();
        PontoDoacaoService pontoService = new PontoDoacaoService();
        CadastroInstituicao inst = null;

        System.out.println("==== Cadastro de Instituição ====");
        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("País: ");
        String pais = scanner.nextLine();

        System.out.print("Estado: ");
        String estado = scanner.nextLine();

        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        inst = instituicaoService.cadastrarInstituicao(
                1L, email, senha, nome, sobrenome, pais, estado, cidade, cep, endereco
        );

        boolean executando = true;

        while (executando) {
            System.out.println("\n==== Menu ====");
            System.out.println("1 - Cadastrar Abrigo");
            System.out.println("2 - Cadastrar Ponto de Doação");
            System.out.println("3 - Listar Abrigos");
            System.out.println("4 - Listar Pontos de Doação");
            System.out.println("5 - Listar Instituições");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    Abrigo abrigo = abrigoService.cadastrarAbrigo(
                            "Abrigo Esperança",
                            "Rua da Luz, 123",
                            "(11) 91234-5678",
                            20,
                            "08h às 18h",
                            StatusOcupacao.RECEBENDO_PESSOAS,
                            TipoCadastro.ABRIGO,
                            inst
                    );
                    System.out.println("Abrigo cadastrado com sucesso: " + abrigo.getNome());
                    break;

                case 2:
                    PontoDoacao ponto = pontoService.cadastrarPontoDoacao(
                            "Ponto Central",
                            "Av. Solidariedade, 456",
                            "(11) 99888-7766",
                            "09h às 17h",
                            TipoCadastro.PONTO_DOACAO,
                            inst
                    );
                    System.out.println("Ponto de doação cadastrado com sucesso: " + ponto.getNome());
                    break;

                case 3:
                    System.out.println("\nAbrigoss cadastrados:");
                    for (Abrigo a : abrigoService.listarAbrigos()) {
                        System.out.println("- " + a.getNome() + " | " + a.getEndereco());
                    }
                    break;

                case 4:
                    System.out.println("\nPontos de Doação cadastrados:");
                    for (PontoDoacao p : pontoService.listarPontosDoacao()) {
                        System.out.println("- " + p.getNome() + " | " + p.getEndereco());
                    }
                    break;

                case 5:
                    System.out.println("\nInstituições cadastradas:");
                    for (CadastroInstituicao i : instituicaoService.listarInstituicoes()) {
                        System.out.println("- " + i.getNome() + " " + i.getSobrenome() + " | " + i.getEmail());
                    }
                    break;

                case 0:
                    executando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
