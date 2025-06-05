package br.com.helpmap.model;

public class CadastroInstituicao {

    private Long id;
    private String email;
    private String senha;
    private String nome;
    private String sobrenome;
    private String pais;
    private String estado;
    private String cidade;
    private String cep;
    private String endereco;

    // Construtor
    public CadastroInstituicao(Long id, String email, String senha, String nome, String sobrenome, String pais, String estado, String cidade, String cep, String endereco) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.endereco = endereco;
    }


    // Método para autenticação
    public boolean autenticar(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    // Método para atualizar os dados da instituição
    public void atualizarCadastro(CadastroInstituicao dadosAtualizados) {
        this.email = dadosAtualizados.email;
        this.senha = dadosAtualizados.senha;
        this.nome = dadosAtualizados.nome;
        this.sobrenome = dadosAtualizados.sobrenome;
        this.pais = dadosAtualizados.pais;
        this.estado = dadosAtualizados.estado;
        this.cidade = dadosAtualizados.cidade;
        this.cep = dadosAtualizados.cep;
        this.endereco = dadosAtualizados.endereco;
    }


    // Getter e Setter
    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome + " (" + email + ")";
    }
}
