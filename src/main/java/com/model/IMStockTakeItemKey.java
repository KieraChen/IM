package com.model;

public class IMStockTakeItemKey {
    private Integer lRetailStoreID;

    private String szDocumentNmbr;

    private String szPosItemID;

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
}