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
@Table(name = "status_thesis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusThesis.findAll", query = "SELECT s FROM StatusThesis s"),
    @NamedQuery(name = "StatusThesis.findByIdStatusThesis", query = "SELECT s FROM StatusThesis s WHERE s.idStatusThesis = :idStatusThesis"),
    @NamedQuery(name = "StatusThesis.findByNameChoice", query = "SELECT s FROM StatusThesis s WHERE s.nameChoice = :nameChoice")})
public class StatusThesis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_status_thesis")
    private Integer idStatusThesis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_choice")
    private String nameChoice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idStatusThesis")
    private Collection<TrainingThesisPublication> trainingThesisPublicationCollection;

    public StatusThesis() {
    }

    public StatusThesis(Integer idStatusThesis) {
        this.idStatusThesis = idStatusThesis;
    }

    public StatusThesis(Integer idStatusThesis, String nameChoice) {
        this.idStatusThesis = idStatusThesis;
        this.nameChoice = nameChoice;
    }

    public Integer getIdStatusThesis() {
        return idStatusThesis;
    }

    public void setIdStatusThesis(Integer idStatusThesis) {
        this.idStatusThesis = idStatusThesis;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    @XmlTransient
    public Collection<TrainingThesisPublication> getTrainingThesisPublicationCollection() {
        return trainingThesisPublicationCollection;
    }

    public void setTrainingThesisPublicationCollection(Collection<TrainingThesisPublication> trainingThesisPublicationCollection) {
        this.trainingThesisPublicationCollection = trainingThesisPublicationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStatusThesis != null ? idStatusThesis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusThesis)) {
            return false;
        }
        StatusThesis other = (StatusThesis) object;
        if ((this.idStatusThesis == null && other.idStatusThesis != null) || (this.idStatusThesis != null && !this.idStatusThesis.equals(other.idStatusThesis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.StatusThesis[ idStatusThesis=" + idStatusThesis + " ]";
    }
    
}
