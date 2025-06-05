package br.com.helpmap.service;

import br.com.helpmap.model.CadastroInstituicao;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class CadastroInstituicaoService {
    private List<CadastroInstituicao> instituicoes = new ArrayList<>();

    public CadastroInstituicao cadastrarInstituicao(Long id, String email, String senha, String nome, String sobrenome,
                                                    String pais, String estado, String cidade, String cep, String endereco) {
        CadastroInstituicao nova = new CadastroInstituicao(id, email, senha, nome, sobrenome, pais, estado, cidade, cep, endereco);
        instituicoes.add(nova);
        return nova;
    }

    public List<CadastroInstituicao> listarInstituicoes() {
        return instituicoes;
    }
}

