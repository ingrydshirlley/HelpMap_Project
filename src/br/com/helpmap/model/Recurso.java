package br.com.helpmap.model;

public class Recurso {

    private Long id;
    private String descricao;
    private String obs;

    //Construtor
    public Recurso(Long id, String descricao, String obs) {
        this.id = id;
        this.descricao = descricao;
        this.obs = obs;
    }


    //Getter e Setter
    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public String toString() {
        return "Recurso{" +
                "descricao='" + descricao + '\'' +
                ", obs='" + obs + '\'' +
                '}';
    }
}

