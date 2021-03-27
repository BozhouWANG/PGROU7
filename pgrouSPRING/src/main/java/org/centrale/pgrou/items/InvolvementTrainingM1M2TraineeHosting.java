/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.pgrou.items;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "involvement_training_m1_m2_trainee_hosting")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvolvementTrainingM1M2TraineeHosting.findAll", query = "SELECT i FROM InvolvementTrainingM1M2TraineeHosting i"),
    @NamedQuery(name = "InvolvementTrainingM1M2TraineeHosting.findByIdActivity", query = "SELECT i FROM InvolvementTrainingM1M2TraineeHosting i WHERE i.idActivity = :idActivity"),
    @NamedQuery(name = "InvolvementTrainingM1M2TraineeHosting.findByYear", query = "SELECT i FROM InvolvementTrainingM1M2TraineeHosting i WHERE i.year = :year"),
    @NamedQuery(name = "InvolvementTrainingM1M2TraineeHosting.findByNbTraineeHosted", query = "SELECT i FROM InvolvementTrainingM1M2TraineeHosting i WHERE i.nbTraineeHosted = :nbTraineeHosted")})
public class InvolvementTrainingM1M2TraineeHosting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "year")
    private int year;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nb_trainee_hosted")
    private int nbTraineeHosted;

    public InvolvementTrainingM1M2TraineeHosting() {
    }

    public InvolvementTrainingM1M2TraineeHosting(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public InvolvementTrainingM1M2TraineeHosting(Integer idActivity, int year, int nbTraineeHosted) {
        this.idActivity = idActivity;
        this.year = year;
        this.nbTraineeHosted = nbTraineeHosted;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNbTraineeHosted() {
        return nbTraineeHosted;
    }

    public void setNbTraineeHosted(int nbTraineeHosted) {
        this.nbTraineeHosted = nbTraineeHosted;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActivity != null ? idActivity.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvolvementTrainingM1M2TraineeHosting)) {
            return false;
        }
        InvolvementTrainingM1M2TraineeHosting other = (InvolvementTrainingM1M2TraineeHosting) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.InvolvementTrainingM1M2TraineeHosting[ idActivity=" + idActivity + " ]";
    }
    
}
