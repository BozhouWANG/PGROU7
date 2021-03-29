package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T22:17:13")
@StaticMetamodel(PostDoc.class)
public class PostDoc_ { 

    public static volatile SingularAttribute<PostDoc, Integer> duration;
    public static volatile SingularAttribute<PostDoc, String> associatedPubliRef;
    public static volatile SingularAttribute<PostDoc, String> namePostDoc;
    public static volatile SingularAttribute<PostDoc, String> nationality;
    public static volatile SingularAttribute<PostDoc, String> associatedFunding;
    public static volatile SingularAttribute<PostDoc, String> originalLab;
    public static volatile SingularAttribute<PostDoc, Integer> idActivity;
    public static volatile SingularAttribute<PostDoc, String> nameSupervisor;
    public static volatile SingularAttribute<PostDoc, Date> departureDate;
    public static volatile SingularAttribute<PostDoc, Date> arrivalDate;

}