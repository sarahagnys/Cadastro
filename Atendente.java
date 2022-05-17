package model;

import java.util.Date;

@Entity
@Table(name = "atendente")
public class Atendente extends Funcionario {
    @Id
    @Column(name = "hora_entrada")
    @NotNull
    private Date entrada;

    @Column(name = "hora_saida")
    @NotNull
    private Date saida;

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;


}
