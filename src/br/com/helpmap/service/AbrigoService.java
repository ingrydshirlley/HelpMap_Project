package br.com.helpmap.service;

import br.com.helpmap.model.Abrigo;
import br.com.helpmap.model.CadastroInstituicao;
import br.com.helpmap.model.StatusOcupacao;
import br.com.helpmap.model.TipoCadastro;

import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;
import java.util.*;

public class AbrigoService {
    private List<Abrigo> abrigos = new ArrayList<>();
    private Long contadorId = 1L;

    public Abrigo cadastrarAbrigo(String nome, String endereco, String telefone, Integer vagasDisponiveis,
                                  String horarioRecebimento, StatusOcupacao statusOcupacao,
                                  TipoCadastro tipoCadastro, CadastroInstituicao instituicao) {

        Abrigo novoAbrigo = new Abrigo(
                contadorId++,
                nome,
                endereco,
                telefone,
                LocalDate.now(),                      // ultimaAtualizacao
                vagasDisponiveis,
                horarioRecebimento,
                new HashSet<>(),                      // recursosDisponiveis vazio
                new HashSet<>(),                      // necessidadesUrgentes vazio
                statusOcupacao,
                tipoCadastro,
                instituicao
        );

        abrigos.add(novoAbrigo);
        return novoAbrigo;
    }

    public List<Abrigo> listarAbrigos() {
        return abrigos;
    }
}


