/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pj;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "clasearmas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clasearmas.findAll", query = "SELECT c FROM Clasearmas c"),
    @NamedQuery(name = "Clasearmas.findByClase", query = "SELECT c FROM Clasearmas c WHERE c.clase = :clase"),
    @NamedQuery(name = "Clasearmas.findByArma", query = "SELECT c FROM Clasearmas c WHERE c.arma = :arma")})
public class Clasearmas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "clase")
    private String clase;
    @Column(name = "arma")
    private String arma;
    @JoinColumn(name = "idPersonaje", referencedColumnName = "idPersonaje")
    @ManyToOne
    private Personaje idPersonaje;

    public Clasearmas() {
    }

    public Clasearmas(String clase) {
        this.clase = clase;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public Personaje getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(Personaje idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clase != null ? clase.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clasearmas)) {
            return false;
        }
        Clasearmas other = (Clasearmas) object;
        if ((this.clase == null && other.clase != null) || (this.clase != null && !this.clase.equals(other.clase))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pj.Clasearmas[ clase=" + clase + " ]";
    }
    
}
