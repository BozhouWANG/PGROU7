package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.ProjectEvaluationThesis;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T21:59:57")
@StaticMetamodel(TypeThesis.class)
public class TypeThesis_ { 

    public static volatile SingularAttribute<TypeThesis, Integer> idType;
    public static volatile SingularAttribute<TypeThesis, String> nameChoice;
    public static volatile CollectionAttribute<TypeThesis, ProjectEvaluationThesis> projectEvaluationThesisCollection;

}