package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.TrainingThesisPublication;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-31T09:11:06")
@StaticMetamodel(BackgroundStudent.class)
public class BackgroundStudent_ { 

    public static volatile SingularAttribute<BackgroundStudent, Integer> idBackground;
    public static volatile SingularAttribute<BackgroundStudent, String> nameChoice;
    public static volatile CollectionAttribute<BackgroundStudent, TrainingThesisPublication> trainingThesisPublicationCollection;

}