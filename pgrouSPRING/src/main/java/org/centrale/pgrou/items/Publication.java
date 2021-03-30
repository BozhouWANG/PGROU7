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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "publication")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Publication.findAll", query = "SELECT p FROM Publication p"),
    @NamedQuery(name = "Publication.findByIdActivity", query = "SELECT p FROM Publication p WHERE p.idActivity = :idActivity"),
    @NamedQuery(name = "Publication.findByTitle", query = "SELECT p FROM Publication p WHERE p.title = :title"),
    @NamedQuery(name = "Publication.findByAuthors", query = "SELECT p FROM Publication p WHERE p.authors = :authors"),
    @NamedQuery(name = "Publication.findBySource", query = "SELECT p FROM Publication p WHERE p.source = :source"),
    @NamedQuery(name = "Publication.findByPublicationDate", query = "SELECT p FROM Publication p WHERE p.publicationDate = :publicationDate"),
    @NamedQuery(name = "Publication.findByPmid", query = "SELECT p FROM Publication p WHERE p.pmid = :pmid"),
    @NamedQuery(name = "Publication.findByImpactFactor", query = "SELECT p FROM Publication p WHERE p.impactFactor = :impactFactor"),
    @NamedQuery(name = "Publication.findByClinic", query = "SELECT p FROM Publication p WHERE p.clinic = :clinic"),
    @NamedQuery(name = "Publication.findByPdc", query = "SELECT p FROM Publication p WHERE p.pdc = :pdc"),
    @NamedQuery(name = "Publication.findByColabInter", query = "SELECT p FROM Publication p WHERE p.colabInter = :colabInter"),
    @NamedQuery(name = "Publication.findByColabIntraCrti", query = "SELECT p FROM Publication p WHERE p.colabIntraCrti = :colabIntraCrti")})
public class Publication implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "authors")
    private String authors;
    @Size(max = 2147483647)
    @Column(name = "source")
    private String source;
    @Basic(optional = false)
    @NotNull
    @Column(name = "publication_date")
    @Temporal(TemporalType.DATE)
    private Date publicationDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pmid")
    private int pmid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "impact_factor")
    private float impactFactor;
    @Column(name = "clinic")
    private Boolean clinic;
    @Column(name = "pdc")
    private Boolean pdc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "colab_inter")
    private boolean colabInter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "colab_intra_crti")
    private boolean colabIntraCrti;
    @JoinColumn(name = "id_choice", referencedColumnName = "id_choice")
    @ManyToOne(optional = false)
    private ChoicePublication idChoice;

    public Publication() {
    }

    public Publication(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Publication(Integer idActivity, String title, String authors, Date publicationDate, int pmid, float impactFactor, boolean colabInter, boolean colabIntraCrti) {
        this.idActivity = idActivity;
        this.title = title;
        this.authors = authors;
        this.publicationDate = publicationDate;
        this.pmid = pmid;
        this.impactFactor = impactFactor;
        this.colabInter = colabInter;
        this.colabIntraCrti = colabIntraCrti;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPmid() {
        return pmid;
    }

    public void setPmid(int pmid) {
        this.pmid = pmid;
    }

    public float getImpactFactor() {
        return impactFactor;
    }

    public void setImpactFactor(float impactFactor) {
        this.impactFactor = impactFactor;
    }

    public Boolean getClinic() {
        return clinic;
    }

    public void setClinic(Boolean clinic) {
        this.clinic = clinic;
    }

    public Boolean getPdc() {
        return pdc;
    }

    public void setPdc(Boolean pdc) {
        this.pdc = pdc;
    }

    public boolean getColabInter() {
        return colabInter;
    }

    public void setColabInter(boolean colabInter) {
        this.colabInter = colabInter;
    }

    public boolean getColabIntraCrti() {
        return colabIntraCrti;
    }

    public void setColabIntraCrti(boolean colabIntraCrti) {
        this.colabIntraCrti = colabIntraCrti;
    }

    public ChoicePublication getIdChoice() {
        return idChoice;
    }

    public void setIdChoice(ChoicePublication idChoice) {
        this.idChoice = idChoice;
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
        if (!(object instanceof Publication)) {
            return false;
        }
        Publication other = (Publication) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.Publication[ idActivity=" + idActivity + " ]";
    }
    
}
