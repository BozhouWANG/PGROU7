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
@Table(name = "tool_product_software")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ToolProductSoftware.findAll", query = "SELECT t FROM ToolProductSoftware t"),
    @NamedQuery(name = "ToolProductSoftware.findByIdActivity", query = "SELECT t FROM ToolProductSoftware t WHERE t.idActivity = :idActivity"),
    @NamedQuery(name = "ToolProductSoftware.findByNameSoftware", query = "SELECT t FROM ToolProductSoftware t WHERE t.nameSoftware = :nameSoftware"),
    @NamedQuery(name = "ToolProductSoftware.findByCreationDate", query = "SELECT t FROM ToolProductSoftware t WHERE t.creationDate = :creationDate"),
    @NamedQuery(name = "ToolProductSoftware.findByAuthors", query = "SELECT t FROM ToolProductSoftware t WHERE t.authors = :authors"),
    @NamedQuery(name = "ToolProductSoftware.findByDescription", query = "SELECT t FROM ToolProductSoftware t WHERE t.description = :description")})
public class ToolProductSoftware implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_software")
    private String nameSoftware;
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

    public ToolProductSoftware() {
    }

    public ToolProductSoftware(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public ToolProductSoftware(Integer idActivity, String nameSoftware, Date creationDate) {
        this.idActivity = idActivity;
        this.nameSoftware = nameSoftware;
        this.creationDate = creationDate;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public String getNameSoftware() {
        return nameSoftware;
    }

    public void setNameSoftware(String nameSoftware) {
        this.nameSoftware = nameSoftware;
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
        if (!(object instanceof ToolProductSoftware)) {
            return false;
        }
        ToolProductSoftware other = (ToolProductSoftware) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.ToolProductSoftware[ idActivity=" + idActivity + " ]";
    }
    
}
