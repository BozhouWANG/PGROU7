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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "involvement_training_pedagogical_responsibility")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvolvementTrainingPedagogicalResponsibility.findAll", query = "SELECT i FROM InvolvementTrainingPedagogicalResponsibility i"),
    @NamedQuery(name = "InvolvementTrainingPedagogicalResponsibility.findByIdActivity", query = "SELECT i FROM InvolvementTrainingPedagogicalResponsibility i WHERE i.idActivity = :idActivity"),
    @NamedQuery(name = "InvolvementTrainingPedagogicalResponsibility.findByYear", query = "SELECT i FROM InvolvementTrainingPedagogicalResponsibility i WHERE i.year = :year"),
    @NamedQuery(name = "InvolvementTrainingPedagogicalResponsibility.findByNameMaster", query = "SELECT i FROM InvolvementTrainingPedagogicalResponsibility i WHERE i.nameMaster = :nameMaster")})
public class InvolvementTrainingPedagogicalResponsibility implements Serializable {

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
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_master")
    private String nameMaster;
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    @ManyToOne(optional = false)
    private TypeInvolvementInTraining idType;

    public InvolvementTrainingPedagogicalResponsibility() {
    }

    public InvolvementTrainingPedagogicalResponsibility(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public InvolvementTrainingPedagogicalResponsibility(Integer idActivity, int year, String nameMaster) {
        this.idActivity = idActivity;
        this.year = year;
        this.nameMaster = nameMaster;
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

    public String getNameMaster() {
        return nameMaster;
    }

    public void setNameMaster(String nameMaster) {
        this.nameMaster = nameMaster;
    }

    public TypeInvolvementInTraining getIdType() {
        return idType;
    }

    public void setIdType(TypeInvolvementInTraining idType) {
        this.idType = idType;
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
        if (!(object instanceof InvolvementTrainingPedagogicalResponsibility)) {
            return false;
        }
        InvolvementTrainingPedagogicalResponsibility other = (InvolvementTrainingPedagogicalResponsibility) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.InvolvementTrainingPedagogicalResponsibility[ idActivity=" + idActivity + " ]";
    }
    
}
