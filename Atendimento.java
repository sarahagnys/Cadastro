package model;

import java.util.Date;

@Entity
@Table(name = "atendimento")
public class Atendimento {
    @Id
    @Column(name = "hora_atendimento")
    @NotNull
    private Date hora_atendimento;

    public Date getHora_atendimento() {
        return hora_atendimento;
    }

    public void setHora_atendimento(Date hora_atendimento) {
        this.hora_atendimento = hora_atendimento;
    }
}
