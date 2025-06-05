package br.com.helpmap.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FaleConosco {

    private Long id;
    private String nome;
    private String sobrenome;
    private String assunto;
    private String texto;
    private LocalDateTime dataEnvio;

    //Construtor
    public FaleConosco(Long id, String nome, String sobrenome, String assunto, String texto, LocalDateTime dataEnvio) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.assunto = assunto;
        this.texto = texto;
        this.dataEnvio = dataEnvio;
    }


    // Registrar mensagem
    public void registrarMensagem() {
        this.dataEnvio = LocalDateTime.now();
        System.out.println("Mensagem registrada com sucesso em " + dataEnvio + "!");
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    @Override
    public String toString() {
        return "FaleConosco{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", assunto='" + assunto + '\'' +
                ", texto='" + texto + '\'' +
                ", dataEnvio=" + dataEnvio +
                '}';
    }
}

