/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pj;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "razas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Razas.findAll", query = "SELECT r FROM Razas r"),
    @NamedQuery(name = "Razas.findByIdraza", query = "SELECT r FROM Razas r WHERE r.idraza = :idraza"),
    @NamedQuery(name = "Razas.findByRaza", query = "SELECT r FROM Razas r WHERE r.raza = :raza")})
public class Razas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idraza")
    private Integer idraza;
    @Column(name = "raza")
    private String raza;
    @OneToMany(mappedBy = "idraza")
    private Collection<Personaje> personajeCollection;

    public Razas() {
    }

    public Razas(Integer idraza) {
        this.idraza = idraza;
    }

    public Integer getIdraza() {
        return idraza;
    }

    public void setIdraza(Integer idraza) {
        this.idraza = idraza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @XmlTransient
    public Collection<Personaje> getPersonajeCollection() {
        return personajeCollection;
    }

    public void setPersonajeCollection(Collection<Personaje> personajeCollection) {
        this.personajeCollection = personajeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idraza != null ? idraza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Razas)) {
            return false;
        }
        Razas other = (Razas) object;
        if ((this.idraza == null && other.idraza != null) || (this.idraza != null && !this.idraza.equals(other.idraza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pj.Razas[ idraza=" + idraza + " ]";
    }
    
}
