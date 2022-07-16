package pe.org.chaclacayo.pyfinal2.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 *
 * @author admin
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "os")
public class Os {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idos")
    private int idos;
    private String nombre;
    private String tipo;
    private String denominacion;
    private String representante_jd;
    private String ubicacion;
    private int c_miembros;
    private String inicio_vigencia;
    private String fin_vigencia;
}
