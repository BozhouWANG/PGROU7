package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.TrainingThesisPublication;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-28T18:00:41")
@StaticMetamodel(StatusThesis.class)
public class StatusThesis_ { 

    public static volatile SingularAttribute<StatusThesis, Integer> idStatusThesis;
    public static volatile SingularAttribute<StatusThesis, String> nameChoice;
    public static volatile CollectionAttribute<StatusThesis, TrainingThesisPublication> trainingThesisPublicationCollection;

}