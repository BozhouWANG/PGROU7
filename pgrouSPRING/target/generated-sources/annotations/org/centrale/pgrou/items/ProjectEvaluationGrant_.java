package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.CategoryGrant;
import org.centrale.pgrou.items.RolePiGrant;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-31T09:11:06")
@StaticMetamodel(ProjectEvaluationGrant.class)
public class ProjectEvaluationGrant_ { 

    public static volatile SingularAttribute<ProjectEvaluationGrant, CategoryGrant> idCategoryGrant;
    public static volatile SingularAttribute<ProjectEvaluationGrant, String> nameFunder;
    public static volatile SingularAttribute<ProjectEvaluationGrant, Integer> year;
    public static volatile SingularAttribute<ProjectEvaluationGrant, Integer> idActivity;
    public static volatile SingularAttribute<ProjectEvaluationGrant, RolePiGrant> idRolePiGrant;

}