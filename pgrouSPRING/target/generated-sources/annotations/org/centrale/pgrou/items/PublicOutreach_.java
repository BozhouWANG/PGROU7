package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.ChoicePublicOutreach;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T21:59:57")
@StaticMetamodel(PublicOutreach.class)
public class PublicOutreach_ { 

    public static volatile SingularAttribute<PublicOutreach, ChoicePublicOutreach> idType;
    public static volatile SingularAttribute<PublicOutreach, String> description;
    public static volatile SingularAttribute<PublicOutreach, Date> completionDate;
    public static volatile SingularAttribute<PublicOutreach, Integer> idActivity;

}