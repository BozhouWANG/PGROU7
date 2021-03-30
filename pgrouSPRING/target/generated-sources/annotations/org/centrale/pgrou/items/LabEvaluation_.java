package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.RolePiLabEval;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-30T09:20:04")
@StaticMetamodel(LabEvaluation.class)
public class LabEvaluation_ { 

    public static volatile SingularAttribute<LabEvaluation, Integer> year;
    public static volatile SingularAttribute<LabEvaluation, RolePiLabEval> idRolePiLabEval;
    public static volatile SingularAttribute<LabEvaluation, String> nameEvaluatedLaboratory;
    public static volatile SingularAttribute<LabEvaluation, Integer> idActivity;

}