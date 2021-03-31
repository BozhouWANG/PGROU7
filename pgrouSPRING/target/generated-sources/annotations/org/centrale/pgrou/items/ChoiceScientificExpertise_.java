package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.ScientificExpertise;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-31T09:11:06")
@StaticMetamodel(ChoiceScientificExpertise.class)
public class ChoiceScientificExpertise_ { 

    public static volatile SingularAttribute<ChoiceScientificExpertise, Integer> idType;
    public static volatile SingularAttribute<ChoiceScientificExpertise, String> nameChoice;
    public static volatile CollectionAttribute<ChoiceScientificExpertise, ScientificExpertise> scientificExpertiseCollection;

}