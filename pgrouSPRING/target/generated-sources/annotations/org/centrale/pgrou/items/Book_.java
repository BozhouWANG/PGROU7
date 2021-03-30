package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-30T10:42:10")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, String> editor;
    public static volatile SingularAttribute<Book, String> language;
    public static volatile SingularAttribute<Book, Integer> idActivity;
    public static volatile SingularAttribute<Book, String> title;
    public static volatile SingularAttribute<Book, Integer> nbPage;
    public static volatile SingularAttribute<Book, Date> publicationDate;
    public static volatile SingularAttribute<Book, String> authors;

}