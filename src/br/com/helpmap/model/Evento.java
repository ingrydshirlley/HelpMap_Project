package br.com.helpmap.model;

import java.time.LocalDate;
import java.util.Set;

public class Evento {

    private Long id;
    private String localizacao;
    private LocalDate ultimaAtualizacao;
    private String descricao;
    private Set<AreaAfetada> areasAfetadas;
    private StatusEvento statusEvento;
    private TipoEvento tipoEvento;

    //Construtor
    public Evento(Long id, String localizacao, LocalDate ultimaAtualizacao, String descricao, Set<AreaAfetada> areasAfetadas, StatusEvento statusEvento, TipoEvento tipoEvento) {
        this.id = id;
        this.localizacao = localizacao;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.descricao = descricao;
        this.areasAfetadas = areasAfetadas;
        this.statusEvento = statusEvento;
        this.tipoEvento = tipoEvento;
    }


    // Atualiza o status do evento
    public void atualizarStatus(StatusEvento novoStatus) {
        this.statusEvento = novoStatus;
        this.ultimaAtualizacao = LocalDate.now();
    }

    // Adiciona uma área afetada
    public void adicionarAreaAfetada(AreaAfetada area) {
        this.areasAfetadas.add(area);
        this.ultimaAtualizacao = LocalDate.now();
    }

    // Remove uma área afetada
    public void removerAreaAfetada(AreaAfetada area) {
        this.areasAfetadas.remove(area);
        this.ultimaAtualizacao = LocalDate.now();
    }


    //Getter e Setter
    public Long getId() {
        return id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public LocalDate getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDate ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<AreaAfetada> getAreasAfetadas() {
        return areasAfetadas;
    }

    public void setAreasAfetadas(Set<AreaAfetada> areasAfetadas) {
        this.areasAfetadas = areasAfetadas;
    }

    public StatusEvento getStatusEvento() {
        return statusEvento;
    }

    public void setStatusEvento(StatusEvento statusEvento) {
        this.statusEvento = statusEvento;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "localizacao='" + localizacao + '\'' +
                ", statusEvento=" + statusEvento +
                ", tipoEvento=" + tipoEvento +
                '}';
    }
}
