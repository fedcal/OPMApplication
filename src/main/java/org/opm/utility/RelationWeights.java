package org.opm.utility;

import java.util.Map;

public class RelationWeights {
    private Map<RelationType,Float> relationTypeMap;

    public RelationWeights(){
        this.relationTypeMap.put(RelationType.FRIEND,0.2F);
        this.relationTypeMap.put(RelationType.BEST_FRIEND,0.3F);
        this.relationTypeMap.put(RelationType.BOSS,0.38F);
        this.relationTypeMap.put(RelationType.COLLEAGUE,0.38F);
        this.relationTypeMap.put(RelationType.GIRLFRIEND,0.4F);
        this.relationTypeMap.put(RelationType.BOYFRIEND,0.4F);
        this.relationTypeMap.put(RelationType.MOTHER,1F);
        this.relationTypeMap.put(RelationType.FATHER,1F);
        this.relationTypeMap.put(RelationType.BROTHER,0.95F);
        this.relationTypeMap.put(RelationType.SISTER,0.95F);
        this.relationTypeMap.put(RelationType.DAUGTHER,0.85F);
        this.relationTypeMap.put(RelationType.SON,0.85F);
        this.relationTypeMap.put(RelationType.UNCLE,0.6F);
        this.relationTypeMap.put(RelationType.AUNT,0.6F);
        this.relationTypeMap.put(RelationType.GRAMPA,0.6F);
        this.relationTypeMap.put(RelationType.GRANDMOTHER,0.6F);
        this.relationTypeMap.put(RelationType.COUSIN,0.6F);
        this.relationTypeMap.put(RelationType.GRANDCHILD,0.6F);
        this.relationTypeMap.put(RelationType.WIFE,0.85F);
        this.relationTypeMap.put(RelationType.HUSBAND,0.85F);
        this.relationTypeMap.put(RelationType.SON_IN_LAW,0.45F);
        this.relationTypeMap.put(RelationType.DAUGHTER_IN_LAW,0.45F);
        this.relationTypeMap.put(RelationType.FATHER_IN_LAW,0.45F);
        this.relationTypeMap.put(RelationType.MOTHER_IN_LAW,0.45F);
    }

}
