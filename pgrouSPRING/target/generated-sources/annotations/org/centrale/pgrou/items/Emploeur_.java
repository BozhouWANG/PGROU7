package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.Researcher;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T22:17:13")
@StaticMetamodel(Emploeur.class)
public class Emploeur_ { 

    public static volatile CollectionAttribute<Emploeur, Researcher> researcherCollection;
    public static volatile SingularAttribute<Emploeur, String> nameEmployer;
    public static volatile SingularAttribute<Emploeur, Integer> idEmployer;

}