package br.com.helpmap.model;

import java.time.LocalDate;
import java.util.Set;

public class PontoDoacao {

    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDate ultimaAtualizacao;
    private String horarioRecebimento;
    private Set<Recurso> itensRecebidos;
    private Set<Necessidade> necessidadesUrgentes;
    private TipoCadastro tipoCadastro;
    private CadastroInstituicao instituicao;

    //Construtor
    public PontoDoacao(Long id, String nome, String endereco, String telefone, LocalDate ultimaAtualizacao, String horarioRecebimento, Set<Recurso> itensRecebidos, Set<Necessidade> necessidadesUrgentes, TipoCadastro tipoCadastro, CadastroInstituicao instituicao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.horarioRecebimento = horarioRecebimento;
        this.itensRecebidos = itensRecebidos;
        this.necessidadesUrgentes = necessidadesUrgentes;
        this.tipoCadastro = tipoCadastro;
        this.instituicao = instituicao;
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

    public String getHorarioRecebimento() {
        return horarioRecebimento;
    }

    public void setHorarioRecebimento(String horarioRecebimento) {
        this.horarioRecebimento = horarioRecebimento;
    }

    public Set<Recurso> getItensRecebidos() {
        return itensRecebidos;
    }

    public void setItensRecebidos(Set<Recurso> itensRecebidos) {
        this.itensRecebidos = itensRecebidos;
    }

    public Set<Necessidade> getNecessidadesUrgentes() {
        return necessidadesUrgentes;
    }

    public void setNecessidadesUrgentes(Set<Necessidade> necessidadesUrgentes) {
        this.necessidadesUrgentes = necessidadesUrgentes;
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

    @Override
    public String toString() {
        return "PontoDoacao{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}

