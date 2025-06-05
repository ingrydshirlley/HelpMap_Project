package br.com.helpmap;

import br.com.helpmap.model.Abrigo;
import br.com.helpmap.model.CadastroInstituicao;
import br.com.helpmap.model.StatusOcupacao;
import br.com.helpmap.model.TipoCadastro;
import br.com.helpmap.service.AbrigoService;
import br.com.helpmap.service.CadastroInstituicaoService;

public class Main {
    public static void main(String[] args) {
        CadastroInstituicaoService instituicaoService = new CadastroInstituicaoService();
        AbrigoService abrigoService = new AbrigoService();

        // Cadastro da instituição com todos os dados
        CadastroInstituicao inst = instituicaoService.cadastrarInstituicao(
                1L,
                "contato@ajuda.org",
                "senha123",
                "Instituto",
                "Solidário",
                "Brasil",
                "SP",
                "São Paulo",
                "01234-567",
                "Rua Exemplo, 100"
        );

        // Agora essa instituição cadastra um abrigo
        Abrigo abrigo = abrigoService.cadastrarAbrigo(
                "Abrigo Esperança",
                "Rua da Luz, 123",
                "(11) 91234-5678",
                20,
                "08h às 18h",
                StatusOcupacao.RECEBENDO_PESSOAS,
                TipoCadastro.ABRIGO,
                inst // instituição já cadastrada
        );

        // Mostrar resultado
        System.out.println("Abrigo cadastrado: " + abrigo.getNome() +
                "\nInstituição: " + abrigo.getInstituicao().getNome() +
                " " + abrigo.getInstituicao().getSobrenome() +
                "\nEndereço da instituição: " + abrigo.getInstituicao().getEndereco());
    }
}
