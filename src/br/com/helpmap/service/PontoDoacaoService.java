package br.com.helpmap.service;

import br.com.helpmap.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PontoDoacaoService {

    private List<PontoDoacao> pontosDoacao = new ArrayList<>();
    private Long contadorId = 1L;

    public PontoDoacao cadastrarPontoDoacao(String nome, String endereco, String telefone,
                                            String horarioRecebimento, TipoCadastro tipoCadastro,
                                            CadastroInstituicao instituicao) {

        PontoDoacao novoPonto = new PontoDoacao(
                contadorId++,
                nome,
                endereco,
                telefone,
                LocalDate.now(),               // ultimaAtualizacao
                horarioRecebimento,
                new HashSet<>(),               // itensRecebidos vazio
                new HashSet<>(),               // necessidadesUrgentes vazio
                tipoCadastro,
                instituicao
        );

        pontosDoacao.add(novoPonto);
        return novoPonto;
    }

    public List<PontoDoacao> listarPontosDoacao() {
        return pontosDoacao;
    }
}
