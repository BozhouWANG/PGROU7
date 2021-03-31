package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.NationalInternationalCollaboration;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-31T09:11:06")
@StaticMetamodel(ChoiceTypeCollab.class)
public class ChoiceTypeCollab_ { 

    public static volatile SingularAttribute<ChoiceTypeCollab, Integer> idType;
    public static volatile CollectionAttribute<ChoiceTypeCollab, NationalInternationalCollaboration> nationalInternationalCollaborationCollection;
    public static volatile SingularAttribute<ChoiceTypeCollab, String> nameChoice;

}