package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.PatentLicenceInventionDisclosure;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-28T18:00:41")
@StaticMetamodel(TypePatent.class)
public class TypePatent_ { 

    public static volatile SingularAttribute<TypePatent, Integer> idType;
    public static volatile CollectionAttribute<TypePatent, PatentLicenceInventionDisclosure> patentLicenceInventionDisclosureCollection;
    public static volatile SingularAttribute<TypePatent, String> nameChoice;

}