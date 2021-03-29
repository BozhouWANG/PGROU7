package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.ProjectEvaluationGrant;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T21:59:57")
@StaticMetamodel(CategoryGrant.class)
public class CategoryGrant_ { 

    public static volatile SingularAttribute<CategoryGrant, Integer> idCategoryGrant;
    public static volatile SingularAttribute<CategoryGrant, String> nameChoice;
    public static volatile CollectionAttribute<CategoryGrant, ProjectEvaluationGrant> projectEvaluationGrantCollection;

}