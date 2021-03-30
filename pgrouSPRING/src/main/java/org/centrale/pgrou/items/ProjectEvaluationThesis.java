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
@Table(name = "project_evaluation_thesis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjectEvaluationThesis.findAll", query = "SELECT p FROM ProjectEvaluationThesis p"),
    @NamedQuery(name = "ProjectEvaluationThesis.findByIdActivity", query = "SELECT p FROM ProjectEvaluationThesis p WHERE p.idActivity = :idActivity"),
    @NamedQuery(name = "ProjectEvaluationThesis.findByYear", query = "SELECT p FROM ProjectEvaluationThesis p WHERE p.year = :year"),
    @NamedQuery(name = "ProjectEvaluationThesis.findByNameUniversity", query = "SELECT p FROM ProjectEvaluationThesis p WHERE p.nameUniversity = :nameUniversity")})
public class ProjectEvaluationThesis implements Serializable {

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
    @Size(max = 2147483647)
    @Column(name = "name_university")
    private String nameUniversity;
    @JoinColumn(name = "id_role_pi_thesis", referencedColumnName = "id_role_pi_thesis")
    @ManyToOne(optional = false)
    private RolePiThesis idRolePiThesis;
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    @ManyToOne(optional = false)
    private TypeThesis idType;

    public ProjectEvaluationThesis() {
    }

    public ProjectEvaluationThesis(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public ProjectEvaluationThesis(Integer idActivity, int year) {
        this.idActivity = idActivity;
        this.year = year;
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

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public RolePiThesis getIdRolePiThesis() {
        return idRolePiThesis;
    }

    public void setIdRolePiThesis(RolePiThesis idRolePiThesis) {
        this.idRolePiThesis = idRolePiThesis;
    }

    public TypeThesis getIdType() {
        return idType;
    }

    public void setIdType(TypeThesis idType) {
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
        if (!(object instanceof ProjectEvaluationThesis)) {
            return false;
        }
        ProjectEvaluationThesis other = (ProjectEvaluationThesis) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.ProjectEvaluationThesis[ idActivity=" + idActivity + " ]";
    }
    
}
