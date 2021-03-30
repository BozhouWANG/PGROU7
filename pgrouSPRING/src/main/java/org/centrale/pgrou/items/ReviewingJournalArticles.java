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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "reviewing_journal_articles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReviewingJournalArticles.findAll", query = "SELECT r FROM ReviewingJournalArticles r"),
    @NamedQuery(name = "ReviewingJournalArticles.findByIdActivity", query = "SELECT r FROM ReviewingJournalArticles r WHERE r.idActivity = :idActivity"),
    @NamedQuery(name = "ReviewingJournalArticles.findByYear", query = "SELECT r FROM ReviewingJournalArticles r WHERE r.year = :year"),
    @NamedQuery(name = "ReviewingJournalArticles.findByNameJournal", query = "SELECT r FROM ReviewingJournalArticles r WHERE r.nameJournal = :nameJournal"),
    @NamedQuery(name = "ReviewingJournalArticles.findByNbReviewedArticles", query = "SELECT r FROM ReviewingJournalArticles r WHERE r.nbReviewedArticles = :nbReviewedArticles"),
    @NamedQuery(name = "ReviewingJournalArticles.findByImpactFactorJournal", query = "SELECT r FROM ReviewingJournalArticles r WHERE r.impactFactorJournal = :impactFactorJournal")})
public class ReviewingJournalArticles implements Serializable {

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
    @Column(name = "name_journal")
    private String nameJournal;
    @Column(name = "nb_reviewed_articles")
    private Integer nbReviewedArticles;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "impact_factor_journal")
    private Float impactFactorJournal;

    public ReviewingJournalArticles() {
    }

    public ReviewingJournalArticles(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public ReviewingJournalArticles(Integer idActivity, int year, String nameJournal) {
        this.idActivity = idActivity;
        this.year = year;
        this.nameJournal = nameJournal;
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

    public String getNameJournal() {
        return nameJournal;
    }

    public void setNameJournal(String nameJournal) {
        this.nameJournal = nameJournal;
    }

    public Integer getNbReviewedArticles() {
        return nbReviewedArticles;
    }

    public void setNbReviewedArticles(Integer nbReviewedArticles) {
        this.nbReviewedArticles = nbReviewedArticles;
    }

    public Float getImpactFactorJournal() {
        return impactFactorJournal;
    }

    public void setImpactFactorJournal(Float impactFactorJournal) {
        this.impactFactorJournal = impactFactorJournal;
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
        if (!(object instanceof ReviewingJournalArticles)) {
            return false;
        }
        ReviewingJournalArticles other = (ReviewingJournalArticles) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.ReviewingJournalArticles[ idActivity=" + idActivity + " ]";
    }
    
}
