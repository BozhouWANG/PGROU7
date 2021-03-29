package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.FunctionEditorialActivity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T22:17:13")
@StaticMetamodel(EditorialActivity.class)
public class EditorialActivity_ { 

    public static volatile SingularAttribute<EditorialActivity, String> nameJournal;
    public static volatile SingularAttribute<EditorialActivity, Date> endDate;
    public static volatile SingularAttribute<EditorialActivity, FunctionEditorialActivity> idFunction;
    public static volatile SingularAttribute<EditorialActivity, Float> impactFactorJournal;
    public static volatile SingularAttribute<EditorialActivity, Integer> idActivity;
    public static volatile SingularAttribute<EditorialActivity, Date> startDate;

}