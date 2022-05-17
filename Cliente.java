package model;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @Column(name = "cpf")
    @NotNull
    private String cpf;

    @Column(name = "nome")
    @NotNull
    private String nome;

    @Column(name = "contato")
    @NotNull
    private String contato;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "tratamento")
    @NotNull
    private String tratamento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }
}
