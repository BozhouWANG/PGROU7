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
@Table(name = "function_editorial_activity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FunctionEditorialActivity.findAll", query = "SELECT f FROM FunctionEditorialActivity f"),
    @NamedQuery(name = "FunctionEditorialActivity.findByIdFunction", query = "SELECT f FROM FunctionEditorialActivity f WHERE f.idFunction = :idFunction"),
    @NamedQuery(name = "FunctionEditorialActivity.findByNameChoice", query = "SELECT f FROM FunctionEditorialActivity f WHERE f.nameChoice = :nameChoice")})
public class FunctionEditorialActivity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_function")
    private Integer idFunction;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_choice")
    private String nameChoice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFunction")
    private Collection<EditorialActivity> editorialActivityCollection;

    public FunctionEditorialActivity() {
    }

    public FunctionEditorialActivity(Integer idFunction) {
        this.idFunction = idFunction;
    }

    public FunctionEditorialActivity(Integer idFunction, String nameChoice) {
        this.idFunction = idFunction;
        this.nameChoice = nameChoice;
    }

    public Integer getIdFunction() {
        return idFunction;
    }

    public void setIdFunction(Integer idFunction) {
        this.idFunction = idFunction;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    @XmlTransient
    public Collection<EditorialActivity> getEditorialActivityCollection() {
        return editorialActivityCollection;
    }

    public void setEditorialActivityCollection(Collection<EditorialActivity> editorialActivityCollection) {
        this.editorialActivityCollection = editorialActivityCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFunction != null ? idFunction.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FunctionEditorialActivity)) {
            return false;
        }
        FunctionEditorialActivity other = (FunctionEditorialActivity) object;
        if ((this.idFunction == null && other.idFunction != null) || (this.idFunction != null && !this.idFunction.equals(other.idFunction))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.FunctionEditorialActivity[ idFunction=" + idFunction + " ]";
    }
    
}
