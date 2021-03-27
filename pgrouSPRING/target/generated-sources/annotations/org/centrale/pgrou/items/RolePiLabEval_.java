package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.LabEvaluation;
import org.centrale.pgrou.items.ResponsibilityInstitutionalComiteeJury;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-27T11:28:52")
@StaticMetamodel(RolePiLabEval.class)
public class RolePiLabEval_ { 

    public static volatile SingularAttribute<RolePiLabEval, Integer> idRolePiLabEval;
    public static volatile CollectionAttribute<RolePiLabEval, ResponsibilityInstitutionalComiteeJury> responsibilityInstitutionalComiteeJuryCollection;
    public static volatile SingularAttribute<RolePiLabEval, String> nameChoice;
    public static volatile CollectionAttribute<RolePiLabEval, LabEvaluation> labEvaluationCollection;

}