/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.pgrou.items;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "emploeur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emploeur.findAll", query = "SELECT e FROM Emploeur e"),
    @NamedQuery(name = "Emploeur.findByIdEmployer", query = "SELECT e FROM Emploeur e WHERE e.idEmployer = :idEmployer"),
    @NamedQuery(name = "Emploeur.findByNameEmployer", query = "SELECT e FROM Emploeur e WHERE e.nameEmployer = :nameEmployer")})
public class Emploeur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_employer")
    private Integer idEmployer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_employer")
    private String nameEmployer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmployer")
    private Collection<Researcher> researcherCollection;

    public Emploeur() {
    }

    public Emploeur(Integer idEmployer) {
        this.idEmployer = idEmployer;
    }

    public Emploeur(Integer idEmployer, String nameEmployer) {
        this.idEmployer = idEmployer;
        this.nameEmployer = nameEmployer;
    }

    public Integer getIdEmployer() {
        return idEmployer;
    }

    public void setIdEmployer(Integer idEmployer) {
        this.idEmployer = idEmployer;
    }

    public String getNameEmployer() {
        return nameEmployer;
    }

    public void setNameEmployer(String nameEmployer) {
        this.nameEmployer = nameEmployer;
    }

    @XmlTransient
    public Collection<Researcher> getResearcherCollection() {
        return researcherCollection;
    }

    public void setResearcherCollection(Collection<Researcher> researcherCollection) {
        this.researcherCollection = researcherCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmployer != null ? idEmployer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emploeur)) {
            return false;
        }
        Emploeur other = (Emploeur) object;
        if ((this.idEmployer == null && other.idEmployer != null) || (this.idEmployer != null && !this.idEmployer.equals(other.idEmployer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.Emploeur[ idEmployer=" + idEmployer + " ]";
    }
    
}
