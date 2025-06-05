package br.com.helpmap.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Abrigo {

    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDate ultimaAtualizacao;
    private Integer vagasDisponiveis;
    private String horarioRecebimento;
    private Set<Recurso> recursosDisponiveis = new HashSet<>();
    private Set<Necessidade> necessidadesUrgentes = new HashSet<>();
    private StatusOcupacao statusOcupacao;
    private TipoCadastro tipoCadastro;
    private CadastroInstituicao instituicao;

    // Construtor
    public Abrigo(Long id, String nome, String endereco, String telefone, LocalDate ultimaAtualizacao, Integer vagasDisponiveis, String horarioRecebimento, Set<Recurso> recursosDisponiveis, Set<Necessidade> necessidadesUrgentes, StatusOcupacao statusOcupacao, TipoCadastro tipoCadastro, CadastroInstituicao instituicao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.vagasDisponiveis = vagasDisponiveis;
        this.horarioRecebimento = horarioRecebimento;
        this.recursosDisponiveis = recursosDisponiveis;
        this.necessidadesUrgentes = necessidadesUrgentes;
        this.statusOcupacao = statusOcupacao;
        this.tipoCadastro = tipoCadastro;
        this.instituicao = instituicao;
    }


    // Adiciona um recurso no conjunto de recursos disponíveis
    public void adicionarRecurso(Recurso recurso) {
        recursosDisponiveis.add(recurso);
        this.ultimaAtualizacao = LocalDate.now();
    }

    // Remove um recurso do conjunto
    public void removerRecurso(Recurso recurso) {
        recursosDisponiveis.remove(recurso);
        this.ultimaAtualizacao = LocalDate.now();
    }

    // Adiciona uma necessidade urgente
    public void adicionarNecessidade(Necessidade necessidade) {
        necessidadesUrgentes.add(necessidade);
        this.ultimaAtualizacao = LocalDate.now();
    }

    // Remove uma necessidade urgente
    public void removerNecessidade(Necessidade necessidade) {
        necessidadesUrgentes.remove(necessidade);
        this.ultimaAtualizacao = LocalDate.now();
    }


    //Getter e Setter
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDate ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Integer getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(Integer vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public String getHorarioRecebimento() {
        return horarioRecebimento;
    }

    public void setHorarioRecebimento(String horarioRecebimento) {
        this.horarioRecebimento = horarioRecebimento;
    }

    public Set<Recurso> getRecursosDisponiveis() {
        return recursosDisponiveis;
    }

    public void setRecursosDisponiveis(Set<Recurso> recursosDisponiveis) {
        this.recursosDisponiveis = recursosDisponiveis;
    }

    public Set<Necessidade> getNecessidadesUrgentes() {
        return necessidadesUrgentes;
    }

    public void setNecessidadesUrgentes(Set<Necessidade> necessidadesUrgentes) {
        this.necessidadesUrgentes = necessidadesUrgentes;
    }

    public StatusOcupacao getStatusOcupacao() {
        return statusOcupacao;
    }

    public void setStatusOcupacao(StatusOcupacao statusOcupacao) {
        this.statusOcupacao = statusOcupacao;
    }

    public TipoCadastro getTipoCadastro() {
        return tipoCadastro;
    }

    public void setTipoCadastro(TipoCadastro tipoCadastro) {
        this.tipoCadastro = tipoCadastro;
    }

    public CadastroInstituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(CadastroInstituicao instituicao) {
        this.instituicao = instituicao;
    }
}
