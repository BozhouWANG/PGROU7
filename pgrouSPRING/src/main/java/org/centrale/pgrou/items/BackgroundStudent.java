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
@Table(name = "background_student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BackgroundStudent.findAll", query = "SELECT b FROM BackgroundStudent b"),
    @NamedQuery(name = "BackgroundStudent.findByIdBackground", query = "SELECT b FROM BackgroundStudent b WHERE b.idBackground = :idBackground"),
    @NamedQuery(name = "BackgroundStudent.findByNameChoice", query = "SELECT b FROM BackgroundStudent b WHERE b.nameChoice = :nameChoice")})
public class BackgroundStudent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_background")
    private Integer idBackground;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_choice")
    private String nameChoice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idBackground")
    private Collection<TrainingThesisPublication> trainingThesisPublicationCollection;

    public BackgroundStudent() {
    }

    public BackgroundStudent(Integer idBackground) {
        this.idBackground = idBackground;
    }

    public BackgroundStudent(Integer idBackground, String nameChoice) {
        this.idBackground = idBackground;
        this.nameChoice = nameChoice;
    }

    public Integer getIdBackground() {
        return idBackground;
    }

    public void setIdBackground(Integer idBackground) {
        this.idBackground = idBackground;
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
        hash += (idBackground != null ? idBackground.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BackgroundStudent)) {
            return false;
        }
        BackgroundStudent other = (BackgroundStudent) object;
        if ((this.idBackground == null && other.idBackground != null) || (this.idBackground != null && !this.idBackground.equals(other.idBackground))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.BackgroundStudent[ idBackground=" + idBackground + " ]";
    }
    
}
