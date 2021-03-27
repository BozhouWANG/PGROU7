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
@Table(name = "category_grant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoryGrant.findAll", query = "SELECT c FROM CategoryGrant c"),
    @NamedQuery(name = "CategoryGrant.findByIdCategoryGrant", query = "SELECT c FROM CategoryGrant c WHERE c.idCategoryGrant = :idCategoryGrant"),
    @NamedQuery(name = "CategoryGrant.findByNameChoice", query = "SELECT c FROM CategoryGrant c WHERE c.nameChoice = :nameChoice")})
public class CategoryGrant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_category_grant")
    private Integer idCategoryGrant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_choice")
    private String nameChoice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCategoryGrant")
    private Collection<ProjectEvaluationGrant> projectEvaluationGrantCollection;

    public CategoryGrant() {
    }

    public CategoryGrant(Integer idCategoryGrant) {
        this.idCategoryGrant = idCategoryGrant;
    }

    public CategoryGrant(Integer idCategoryGrant, String nameChoice) {
        this.idCategoryGrant = idCategoryGrant;
        this.nameChoice = nameChoice;
    }

    public Integer getIdCategoryGrant() {
        return idCategoryGrant;
    }

    public void setIdCategoryGrant(Integer idCategoryGrant) {
        this.idCategoryGrant = idCategoryGrant;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    @XmlTransient
    public Collection<ProjectEvaluationGrant> getProjectEvaluationGrantCollection() {
        return projectEvaluationGrantCollection;
    }

    public void setProjectEvaluationGrantCollection(Collection<ProjectEvaluationGrant> projectEvaluationGrantCollection) {
        this.projectEvaluationGrantCollection = projectEvaluationGrantCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoryGrant != null ? idCategoryGrant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoryGrant)) {
            return false;
        }
        CategoryGrant other = (CategoryGrant) object;
        if ((this.idCategoryGrant == null && other.idCategoryGrant != null) || (this.idCategoryGrant != null && !this.idCategoryGrant.equals(other.idCategoryGrant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.CategoryGrant[ idCategoryGrant=" + idCategoryGrant + " ]";
    }
    
}
