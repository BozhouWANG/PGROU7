/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.pgrou.items;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "tool_product_database")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ToolProductDatabase.findAll", query = "SELECT t FROM ToolProductDatabase t"),
    @NamedQuery(name = "ToolProductDatabase.findByIdActivity", query = "SELECT t FROM ToolProductDatabase t WHERE t.idActivity = :idActivity"),
    @NamedQuery(name = "ToolProductDatabase.findByTitkeDatabase", query = "SELECT t FROM ToolProductDatabase t WHERE t.titkeDatabase = :titkeDatabase"),
    @NamedQuery(name = "ToolProductDatabase.findByCreationDate", query = "SELECT t FROM ToolProductDatabase t WHERE t.creationDate = :creationDate"),
    @NamedQuery(name = "ToolProductDatabase.findByAuthors", query = "SELECT t FROM ToolProductDatabase t WHERE t.authors = :authors"),
    @NamedQuery(name = "ToolProductDatabase.findByDescription", query = "SELECT t FROM ToolProductDatabase t WHERE t.description = :description")})
public class ToolProductDatabase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "titke_database")
    private String titkeDatabase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creation_date")
    @Temporal(TemporalType.DATE)
    private Date creationDate;
    @Size(max = 2147483647)
    @Column(name = "authors")
    private String authors;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;

    public ToolProductDatabase() {
    }

    public ToolProductDatabase(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public ToolProductDatabase(Integer idActivity, String titkeDatabase, Date creationDate) {
        this.idActivity = idActivity;
        this.titkeDatabase = titkeDatabase;
        this.creationDate = creationDate;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public String getTitkeDatabase() {
        return titkeDatabase;
    }

    public void setTitkeDatabase(String titkeDatabase) {
        this.titkeDatabase = titkeDatabase;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof ToolProductDatabase)) {
            return false;
        }
        ToolProductDatabase other = (ToolProductDatabase) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.ToolProductDatabase[ idActivity=" + idActivity + " ]";
    }
    
}
