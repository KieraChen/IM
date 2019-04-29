package com.model;

public class IMStorageLocation extends IMStorageLocationKey {
    private String szStorageLocationName;

    private String szStorageLocationDesc;

    private Integer lChangedOperatorID;

    private Integer lTechLayerAccessID;

    private String szLastUpdLocal;

    public String getSzStorageLocationName() {
        return szStorageLocationName;
    }

    public void setSzStorageLocationName(String szStorageLocationName) {
        this.szStorageLocationName = szStorageLocationName;
    }

    public String getSzStorageLocationDesc() {
        return szStorageLocationDesc;
    }

    public void setSzStorageLocationDesc(String szStorageLocationDesc) {
        this.szStorageLocationDesc = szStorageLocationDesc;
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