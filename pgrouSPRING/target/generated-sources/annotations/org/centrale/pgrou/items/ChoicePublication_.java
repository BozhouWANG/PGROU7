package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.Publication;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-31T09:11:06")
@StaticMetamodel(ChoicePublication.class)
public class ChoicePublication_ { 

    public static volatile SingularAttribute<ChoicePublication, Integer> idChoice;
    public static volatile CollectionAttribute<ChoicePublication, Publication> publicationCollection;
    public static volatile SingularAttribute<ChoicePublication, String> nameChoice;

}