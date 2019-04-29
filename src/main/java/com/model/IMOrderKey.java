package com.model;

public class IMOrderKey {
    private Integer lRetailStoreID;

    private String szDocumentType;

    private String szDate;

    private String szPOSItemID;

    public Integer getlRetailStoreID() {
        return lRetailStoreID;
    }

    public void setlRetailStoreID(Integer lRetailStoreID) {
        this.lRetailStoreID = lRetailStoreID;
    }

    public String getSzDocumentType() {
        return szDocumentType;
    }

    public void setSzDocumentType(String szDocumentType) {
        this.szDocumentType = szDocumentType;
    }

    public String getSzDate() {
        return szDate;
    }

    public void setSzDate(String szDate) {
        this.szDate = szDate;
    }

    public String getSzPOSItemID() {
        return szPOSItemID;
    }

    public void setSzPOSItemID(String szPOSItemID) {
        this.szPOSItemID = szPOSItemID;
    }
}