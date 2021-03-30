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
@Table(name = "book_chapter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BookChapter.findAll", query = "SELECT b FROM BookChapter b"),
    @NamedQuery(name = "BookChapter.findByIdActivity", query = "SELECT b FROM BookChapter b WHERE b.idActivity = :idActivity"),
    @NamedQuery(name = "BookChapter.findByPublicationDate", query = "SELECT b FROM BookChapter b WHERE b.publicationDate = :publicationDate"),
    @NamedQuery(name = "BookChapter.findByChapterTitle", query = "SELECT b FROM BookChapter b WHERE b.chapterTitle = :chapterTitle"),
    @NamedQuery(name = "BookChapter.findByBookTitle", query = "SELECT b FROM BookChapter b WHERE b.bookTitle = :bookTitle"),
    @NamedQuery(name = "BookChapter.findByEditor", query = "SELECT b FROM BookChapter b WHERE b.editor = :editor"),
    @NamedQuery(name = "BookChapter.findByNbPage", query = "SELECT b FROM BookChapter b WHERE b.nbPage = :nbPage"),
    @NamedQuery(name = "BookChapter.findByAuthors", query = "SELECT b FROM BookChapter b WHERE b.authors = :authors"),
    @NamedQuery(name = "BookChapter.findByLanguage", query = "SELECT b FROM BookChapter b WHERE b.language = :language"),
    @NamedQuery(name = "BookChapter.findByAdditionalInfo", query = "SELECT b FROM BookChapter b WHERE b.additionalInfo = :additionalInfo")})
public class BookChapter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "publication_date")
    @Temporal(TemporalType.DATE)
    private Date publicationDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "chapter_title")
    private String chapterTitle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "book_title")
    private String bookTitle;
    @Size(max = 2147483647)
    @Column(name = "editor")
    private String editor;
    @Column(name = "nb_page")
    private Integer nbPage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "authors")
    private String authors;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "language")
    private String language;
    @Size(max = 2147483647)
    @Column(name = "additional_info")
    private String additionalInfo;

    public BookChapter() {
    }

    public BookChapter(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public BookChapter(Integer idActivity, Date publicationDate, String chapterTitle, String bookTitle, String authors, String language) {
        this.idActivity = idActivity;
        this.publicationDate = publicationDate;
        this.chapterTitle = chapterTitle;
        this.bookTitle = bookTitle;
        this.authors = authors;
        this.language = language;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Integer getNbPage() {
        return nbPage;
    }

    public void setNbPage(Integer nbPage) {
        this.nbPage = nbPage;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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
        if (!(object instanceof BookChapter)) {
            return false;
        }
        BookChapter other = (BookChapter) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.BookChapter[ idActivity=" + idActivity + " ]";
    }
    
}
