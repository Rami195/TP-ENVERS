package entidades;
import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Builder
@Audited
@Entity
@Table(name="Domicilio")
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_calle")
    private String nombreCalle;
    @Column(name = "numero")
    private int numero;


    @OneToOne(mappedBy = "domicilio")
    private Cliente cliente;


    public Domicilio(String nombreCalle, int  numero) {
        this.nombreCalle =  nombreCalle;
        this.numero = numero;
    }
}


