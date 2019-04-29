package com.model;

public class ReasonCode extends ReasonCodeKey {
    private String szDescription;

    private Integer lTechLayerAccessID;

    private String szLastUpdLocal;

    private String IM_szReasonGroupCode;

    public String getSzDescription() {
        return szDescription;
    }

    public void setSzDescription(String szDescription) {
        this.szDescription = szDescription;
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

    public String getIM_szReasonGroupCode() {
        return IM_szReasonGroupCode;
    }

    public void setIM_szReasonGroupCode(String IM_szReasonGroupCode) {
        this.IM_szReasonGroupCode = IM_szReasonGroupCode;
    }
}