package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.ChoicePublication;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T22:17:13")
@StaticMetamodel(Publication.class)
public class Publication_ { 

    public static volatile SingularAttribute<Publication, ChoicePublication> idChoice;
    public static volatile SingularAttribute<Publication, Boolean> colabIntraCrti;
    public static volatile SingularAttribute<Publication, Float> impactFactor;
    public static volatile SingularAttribute<Publication, Boolean> colabInter;
    public static volatile SingularAttribute<Publication, Integer> idActivity;
    public static volatile SingularAttribute<Publication, String> source;
    public static volatile SingularAttribute<Publication, Boolean> clinic;
    public static volatile SingularAttribute<Publication, String> title;
    public static volatile SingularAttribute<Publication, Integer> pmid;
    public static volatile SingularAttribute<Publication, Date> publicationDate;
    public static volatile SingularAttribute<Publication, Boolean> pdc;
    public static volatile SingularAttribute<Publication, String> authors;

}