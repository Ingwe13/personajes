/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pj;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "personaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personaje.findAll", query = "SELECT p FROM Personaje p"),
    @NamedQuery(name = "Personaje.findByIdPersonaje", query = "SELECT p FROM Personaje p WHERE p.idPersonaje = :idPersonaje"),
    @NamedQuery(name = "Personaje.findByNombre", query = "SELECT p FROM Personaje p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Personaje.findByEdad", query = "SELECT p FROM Personaje p WHERE p.edad = :edad"),
    @NamedQuery(name = "Personaje.findByRaza", query = "SELECT p FROM Personaje p WHERE p.raza = :raza"),
    @NamedQuery(name = "Personaje.findByAlianza", query = "SELECT p FROM Personaje p WHERE p.alianza = :alianza"),
    @NamedQuery(name = "Personaje.findByFechaDeNacmiento", query = "SELECT p FROM Personaje p WHERE p.fechaDeNacmiento = :fechaDeNacmiento"),
    @NamedQuery(name = "Personaje.findByFechaDeDefuncion", query = "SELECT p FROM Personaje p WHERE p.fechaDeDefuncion = :fechaDeDefuncion"),
    @NamedQuery(name = "Personaje.findByDinero", query = "SELECT p FROM Personaje p WHERE p.dinero = :dinero")})
public class Personaje implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idPersonaje")
    private String idPersonaje;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "edad")
    private String edad;
    @Column(name = "raza")
    private String raza;
    @Column(name = "alianza")
    private Boolean alianza;
    @Column(name = "fechaDeNacmiento")
    @Temporal(TemporalType.DATE)
    private Date fechaDeNacmiento;
    @Column(name = "fechaDeDefuncion")
    @Temporal(TemporalType.DATE)
    private Date fechaDeDefuncion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Dinero")
    private BigDecimal dinero;
    @OneToMany(mappedBy = "idPersonaje")
    private Collection<Clasearmas> clasearmasCollection;

    public Personaje() {
    }

    public Personaje(String idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(String idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Boolean getAlianza() {
        return alianza;
    }

    public void setAlianza(Boolean alianza) {
        this.alianza = alianza;
    }

    public Date getFechaDeNacmiento() {
        return fechaDeNacmiento;
    }

    public void setFechaDeNacmiento(Date fechaDeNacmiento) {
        this.fechaDeNacmiento = fechaDeNacmiento;
    }

    public Date getFechaDeDefuncion() {
        return fechaDeDefuncion;
    }

    public void setFechaDeDefuncion(Date fechaDeDefuncion) {
        this.fechaDeDefuncion = fechaDeDefuncion;
    }

    public BigDecimal getDinero() {
        return dinero;
    }

    public void setDinero(BigDecimal dinero) {
        this.dinero = dinero;
    }

    @XmlTransient
    public Collection<Clasearmas> getClasearmasCollection() {
        return clasearmasCollection;
    }

    public void setClasearmasCollection(Collection<Clasearmas> clasearmasCollection) {
        this.clasearmasCollection = clasearmasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersonaje != null ? idPersonaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personaje)) {
            return false;
        }
        Personaje other = (Personaje) object;
        if ((this.idPersonaje == null && other.idPersonaje != null) || (this.idPersonaje != null && !this.idPersonaje.equals(other.idPersonaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pj.Personaje[ idPersonaje=" + idPersonaje + " ]";
    }
    
}
