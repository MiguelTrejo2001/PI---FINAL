package pe.org.chaclacayo.pyfinal2.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author admin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "os")
public class Os implements Serializable {




   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idos")
    @Id
    private int idos;
    @Column(unique=true)
    private String nombre;
    private String tipo;
    private String denominacion;
    private String representante_jd;
    private String ubicacion;
    private int c_miembros;
    private String inicio_vigencia;
    private String fin_vigencia;
}