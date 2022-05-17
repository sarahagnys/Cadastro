package model;

@Entity
@Table(name = "entregador")
public class Entregador extends Funcionario {

    @Id
    @Column(name = "categoria_cnh")
    @NotNull
    private String categoriaCnh;

    @Column(name = "numeroCnh")
    @NotNull
    private String numeroCnh;
}
