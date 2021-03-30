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
@Table(name = "tool_product_decision_support_tool")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ToolProductDecisionSupportTool.findAll", query = "SELECT t FROM ToolProductDecisionSupportTool t"),
    @NamedQuery(name = "ToolProductDecisionSupportTool.findByIdActivity", query = "SELECT t FROM ToolProductDecisionSupportTool t WHERE t.idActivity = :idActivity"),
    @NamedQuery(name = "ToolProductDecisionSupportTool.findByNameDecisionSupportTool", query = "SELECT t FROM ToolProductDecisionSupportTool t WHERE t.nameDecisionSupportTool = :nameDecisionSupportTool"),
    @NamedQuery(name = "ToolProductDecisionSupportTool.findByCreationDate", query = "SELECT t FROM ToolProductDecisionSupportTool t WHERE t.creationDate = :creationDate"),
    @NamedQuery(name = "ToolProductDecisionSupportTool.findByAuthors", query = "SELECT t FROM ToolProductDecisionSupportTool t WHERE t.authors = :authors"),
    @NamedQuery(name = "ToolProductDecisionSupportTool.findByDescription", query = "SELECT t FROM ToolProductDecisionSupportTool t WHERE t.description = :description")})
public class ToolProductDecisionSupportTool implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_decision_support_tool")
    private String nameDecisionSupportTool;
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

    public ToolProductDecisionSupportTool() {
    }

    public ToolProductDecisionSupportTool(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public ToolProductDecisionSupportTool(Integer idActivity, String nameDecisionSupportTool, Date creationDate) {
        this.idActivity = idActivity;
        this.nameDecisionSupportTool = nameDecisionSupportTool;
        this.creationDate = creationDate;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public String getNameDecisionSupportTool() {
        return nameDecisionSupportTool;
    }

    public void setNameDecisionSupportTool(String nameDecisionSupportTool) {
        this.nameDecisionSupportTool = nameDecisionSupportTool;
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
        if (!(object instanceof ToolProductDecisionSupportTool)) {
            return false;
        }
        ToolProductDecisionSupportTool other = (ToolProductDecisionSupportTool) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.ToolProductDecisionSupportTool[ idActivity=" + idActivity + " ]";
    }
    
}
