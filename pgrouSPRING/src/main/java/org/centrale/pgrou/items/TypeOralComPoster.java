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
@Table(name = "type_oral_com_poster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeOralComPoster.findAll", query = "SELECT t FROM TypeOralComPoster t"),
    @NamedQuery(name = "TypeOralComPoster.findByIdTypeCom", query = "SELECT t FROM TypeOralComPoster t WHERE t.idTypeCom = :idTypeCom"),
    @NamedQuery(name = "TypeOralComPoster.findByNameChoice", query = "SELECT t FROM TypeOralComPoster t WHERE t.nameChoice = :nameChoice")})
public class TypeOralComPoster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_type_com")
    private Integer idTypeCom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_choice")
    private String nameChoice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTypeCom")
    private Collection<OralCommunicationPoster> oralCommunicationPosterCollection;

    public TypeOralComPoster() {
    }

    public TypeOralComPoster(Integer idTypeCom) {
        this.idTypeCom = idTypeCom;
    }

    public TypeOralComPoster(Integer idTypeCom, String nameChoice) {
        this.idTypeCom = idTypeCom;
        this.nameChoice = nameChoice;
    }

    public Integer getIdTypeCom() {
        return idTypeCom;
    }

    public void setIdTypeCom(Integer idTypeCom) {
        this.idTypeCom = idTypeCom;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    @XmlTransient
    public Collection<OralCommunicationPoster> getOralCommunicationPosterCollection() {
        return oralCommunicationPosterCollection;
    }

    public void setOralCommunicationPosterCollection(Collection<OralCommunicationPoster> oralCommunicationPosterCollection) {
        this.oralCommunicationPosterCollection = oralCommunicationPosterCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTypeCom != null ? idTypeCom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeOralComPoster)) {
            return false;
        }
        TypeOralComPoster other = (TypeOralComPoster) object;
        if ((this.idTypeCom == null && other.idTypeCom != null) || (this.idTypeCom != null && !this.idTypeCom.equals(other.idTypeCom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.TypeOralComPoster[ idTypeCom=" + idTypeCom + " ]";
    }
    
}
