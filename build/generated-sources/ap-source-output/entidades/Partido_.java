package entidades;

import entidades.Anotacion;
import entidades.EquiposAJugar;
import entidades.PartidoPK;
import entidades.ResultadoEquipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-08-13T16:15:20")
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile SingularAttribute<Partido, Integer> nueroPartido;
    public static volatile SingularAttribute<Partido, EquiposAJugar> equiposAJugar;
    public static volatile SingularAttribute<Partido, ResultadoEquipo> resultadoEquipo;
    public static volatile ListAttribute<Partido, Anotacion> anotacionList;
    public static volatile SingularAttribute<Partido, PartidoPK> partidoPK;

}