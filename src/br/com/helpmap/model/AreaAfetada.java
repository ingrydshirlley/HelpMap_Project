package br.com.helpmap.model;

public class AreaAfetada {

    private Long id;
    private String nome;

    //Construtor
    public AreaAfetada(Long id, String nome) {
        this.id = id;
        this.nome = nome;
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

    @Override
    public String toString() {
        return "AreaAfetada{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}

