package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.RolePiThesis;
import org.centrale.pgrou.items.TypeThesis;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-30T16:09:58")
@StaticMetamodel(ProjectEvaluationThesis.class)
public class ProjectEvaluationThesis_ { 

    public static volatile SingularAttribute<ProjectEvaluationThesis, String> nameUniversity;
    public static volatile SingularAttribute<ProjectEvaluationThesis, TypeThesis> idType;
    public static volatile SingularAttribute<ProjectEvaluationThesis, Integer> year;
    public static volatile SingularAttribute<ProjectEvaluationThesis, RolePiThesis> idRolePiThesis;
    public static volatile SingularAttribute<ProjectEvaluationThesis, Integer> idActivity;

}