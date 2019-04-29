package com.model;

public class IMStockTakeDetailKey {
    private Integer lRetailStoreID;

    private String szDocumentNmbr;

    private String szPosItemID;

    private String szGondolaNmbr;

    public Integer getlRetailStoreID() {
        return lRetailStoreID;
    }

    public void setlRetailStoreID(Integer lRetailStoreID) {
        this.lRetailStoreID = lRetailStoreID;
    }

    public String getSzDocumentNmbr() {
        return szDocumentNmbr;
    }

    public void setSzDocumentNmbr(String szDocumentNmbr) {
        this.szDocumentNmbr = szDocumentNmbr;
    }

    public String getSzPosItemID() {
        return szPosItemID;
    }

    public void setSzPosItemID(String szPosItemID) {
        this.szPosItemID = szPosItemID;
    }

    public String getSzGondolaNmbr() {
        return szGondolaNmbr;
    }

    public void setSzGondolaNmbr(String szGondolaNmbr) {
        this.szGondolaNmbr = szGondolaNmbr;
    }
}