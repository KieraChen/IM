package com.model;

public class IMStockTakeItem extends IMStockTakeItemKey {
    private String szItemName;

    private Integer lChangedOperatorID;

    private Integer lTechLayerAccessID;

    private String szLastUpdLocal;

    public String getSzItemName() {
        return szItemName;
    }

    public void setSzItemName(String szItemName) {
        this.szItemName = szItemName;
    }

    public Integer getlChangedOperatorID() {
        return lChangedOperatorID;
    }

    public void setlChangedOperatorID(Integer lChangedOperatorID) {
        this.lChangedOperatorID = lChangedOperatorID;
    }

    public Integer getlTechLayerAccessID() {
        return lTechLayerAccessID;
    }

    public void setlTechLayerAccessID(Integer lTechLayerAccessID) {
        this.lTechLayerAccessID = lTechLayerAccessID;
    }

    public String getSzLastUpdLocal() {
        return szLastUpdLocal;
    }

    public void setSzLastUpdLocal(String szLastUpdLocal) {
        this.szLastUpdLocal = szLastUpdLocal;
    }
}