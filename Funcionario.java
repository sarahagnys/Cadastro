package model;

@Entity
@Table(name = "funcionario")
public class Funcionario {


    @Id
    @Column(name = "identificacao")
    @NotNull
    private String identificacao;

    @Column(name = "nome")
    @NotNull
    private String nome;

    @Column(name = "dataNasc")
    @NotNull
    private int dataNasc;

    @Column(name = "salario")
    @NotNull
    private float salario;

    @Column(name = "contato")
    @NotNull
    private String contato;

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
