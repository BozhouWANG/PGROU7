package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.ProjectEvaluationThesis;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-31T09:11:06")
@StaticMetamodel(RolePiThesis.class)
public class RolePiThesis_ { 

    public static volatile SingularAttribute<RolePiThesis, Integer> idRolePiThesis;
    public static volatile SingularAttribute<RolePiThesis, String> nameChoice;
    public static volatile CollectionAttribute<RolePiThesis, ProjectEvaluationThesis> projectEvaluationThesisCollection;

}