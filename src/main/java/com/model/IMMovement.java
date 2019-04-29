package com.model;

import java.math.BigDecimal;

public class IMMovement extends IMMovementKey {
    private String szRetailStoreExternalID;

    private String szDate;

    private String szTime;

    private Integer lWorkstationNmbr;

    private Integer lCreatedOperatorID;

    private String szExternalDocumentNmbr;

    private String szExternalDocumentDate;

    private String szVendorID;

    private Integer lRetailStoreIDFrom;

    private String szRetailStoreExternalIDFrom;

    private Integer lRetailStoreIDTo;

    private String szRetailStoreExternalIDTo;

    private String szVendorOrStoreName;

    private String szStorageLocationIDFrom;

    private String szStorageLocationIDTo;

    private String szExpectedDeliveryDate;

    private String szInvoiceNmbr;

    private String szInvoiceDate;

    private BigDecimal dInvoiceAmount;

    private String szDSDReceiptNmbr;

    private String szReasonCode;

    private String szReference;

    private Integer bConfirmed;

    private Integer lChangedOperatorID;

    private Integer lHostInterfaceID1;

    private Integer lTechLayerAccessID;

    private String szLastUpdLocal;

    private String szDocTypeName;

    private Integer bIsCDC;

    private Integer lStockTakeType;

    private String szExternalPurchaseGroup;

    private String szRDODate;

    private String szRDOTime;

    private String szStatusPO;

    private String szSaveDSDReceiptNmbr;

    private String szReceiptDocumentNmbr;

    private String szSerialNmbr;

    private Integer bNoObject;

    private String szRVRSerialNmbr;

    private String szPoDocumentNmber;

    public String getSzRetailStoreExternalID() {
        return szRetailStoreExternalID;
    }

    public void setSzRetailStoreExternalID(String szRetailStoreExternalID) {
        this.szRetailStoreExternalID = szRetailStoreExternalID;
    }

    public String getSzDate() {
        return szDate;
    }

    public void setSzDate(String szDate) {
        this.szDate = szDate;
    }

    public String getSzTime() {
        return szTime;
    }

    public void setSzTime(String szTime) {
        this.szTime = szTime;
    }

    public Integer getlWorkstationNmbr() {
        return lWorkstationNmbr;
    }

    public void setlWorkstationNmbr(Integer lWorkstationNmbr) {
        this.lWorkstationNmbr = lWorkstationNmbr;
    }

    public Integer getlCreatedOperatorID() {
        return lCreatedOperatorID;
    }

    public void setlCreatedOperatorID(Integer lCreatedOperatorID) {
        this.lCreatedOperatorID = lCreatedOperatorID;
    }

    public String getSzExternalDocumentNmbr() {
        return szExternalDocumentNmbr;
    }

    public void setSzExternalDocumentNmbr(String szExternalDocumentNmbr) {
        this.szExternalDocumentNmbr = szExternalDocumentNmbr;
    }

    public String getSzExternalDocumentDate() {
        return szExternalDocumentDate;
    }

    public void setSzExternalDocumentDate(String szExternalDocumentDate) {
        this.szExternalDocumentDate = szExternalDocumentDate;
    }

    public String getSzVendorID() {
        return szVendorID;
    }

    public void setSzVendorID(String szVendorID) {
        this.szVendorID = szVendorID;
    }

    public Integer getlRetailStoreIDFrom() {
        return lRetailStoreIDFrom;
    }

    public void setlRetailStoreIDFrom(Integer lRetailStoreIDFrom) {
        this.lRetailStoreIDFrom = lRetailStoreIDFrom;
    }

    public String getSzRetailStoreExternalIDFrom() {
        return szRetailStoreExternalIDFrom;
    }

    public void setSzRetailStoreExternalIDFrom(String szRetailStoreExternalIDFrom) {
        this.szRetailStoreExternalIDFrom = szRetailStoreExternalIDFrom;
    }

    public Integer getlRetailStoreIDTo() {
        return lRetailStoreIDTo;
    }

    public void setlRetailStoreIDTo(Integer lRetailStoreIDTo) {
        this.lRetailStoreIDTo = lRetailStoreIDTo;
    }

    public String getSzRetailStoreExternalIDTo() {
        return szRetailStoreExternalIDTo;
    }

    public void setSzRetailStoreExternalIDTo(String szRetailStoreExternalIDTo) {
        this.szRetailStoreExternalIDTo = szRetailStoreExternalIDTo;
    }

    public String getSzVendorOrStoreName() {
        return szVendorOrStoreName;
    }

    public void setSzVendorOrStoreName(String szVendorOrStoreName) {
        this.szVendorOrStoreName = szVendorOrStoreName;
    }

    public String getSzStorageLocationIDFrom() {
        return szStorageLocationIDFrom;
    }

    public void setSzStorageLocationIDFrom(String szStorageLocationIDFrom) {
        this.szStorageLocationIDFrom = szStorageLocationIDFrom;
    }

    public String getSzStorageLocationIDTo() {
        return szStorageLocationIDTo;
    }

    public void setSzStorageLocationIDTo(String szStorageLocationIDTo) {
        this.szStorageLocationIDTo = szStorageLocationIDTo;
    }

    public String getSzExpectedDeliveryDate() {
        return szExpectedDeliveryDate;
    }

    public void setSzExpectedDeliveryDate(String szExpectedDeliveryDate) {
        this.szExpectedDeliveryDate = szExpectedDeliveryDate;
    }

    public String getSzInvoiceNmbr() {
        return szInvoiceNmbr;
    }

    public void setSzInvoiceNmbr(String szInvoiceNmbr) {
        this.szInvoiceNmbr = szInvoiceNmbr;
    }

    public String getSzInvoiceDate() {
        return szInvoiceDate;
    }

    public void setSzInvoiceDate(String szInvoiceDate) {
        this.szInvoiceDate = szInvoiceDate;
    }

    public BigDecimal getdInvoiceAmount() {
        return dInvoiceAmount;
    }

    public void setdInvoiceAmount(BigDecimal dInvoiceAmount) {
        this.dInvoiceAmount = dInvoiceAmount;
    }

    public String getSzDSDReceiptNmbr() {
        return szDSDReceiptNmbr;
    }

    public void setSzDSDReceiptNmbr(String szDSDReceiptNmbr) {
        this.szDSDReceiptNmbr = szDSDReceiptNmbr;
    }

    public String getSzReasonCode() {
        return szReasonCode;
    }

    public void setSzReasonCode(String szReasonCode) {
        this.szReasonCode = szReasonCode;
    }

    public String getSzReference() {
        return szReference;
    }

    public void setSzReference(String szReference) {
        this.szReference = szReference;
    }

    public Integer getbConfirmed() {
        return bConfirmed;
    }

    public void setbConfirmed(Integer bConfirmed) {
        this.bConfirmed = bConfirmed;
    }

    public Integer getlChangedOperatorID() {
        return lChangedOperatorID;
    }

    public void setlChangedOperatorID(Integer lChangedOperatorID) {
        this.lChangedOperatorID = lChangedOperatorID;
    }

    public Integer getlHostInterfaceID1() {
        return lHostInterfaceID1;
    }

    public void setlHostInterfaceID1(Integer lHostInterfaceID1) {
        this.lHostInterfaceID1 = lHostInterfaceID1;
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

    public String getSzDocTypeName() {
        return szDocTypeName;
    }

    public void setSzDocTypeName(String szDocTypeName) {
        this.szDocTypeName = szDocTypeName;
    }

    public Integer getbIsCDC() {
        return bIsCDC;
    }

    public void setbIsCDC(Integer bIsCDC) {
        this.bIsCDC = bIsCDC;
    }

    public Integer getlStockTakeType() {
        return lStockTakeType;
    }

    public void setlStockTakeType(Integer lStockTakeType) {
        this.lStockTakeType = lStockTakeType;
    }

    public String getSzExternalPurchaseGroup() {
        return szExternalPurchaseGroup;
    }

    public void setSzExternalPurchaseGroup(String szExternalPurchaseGroup) {
        this.szExternalPurchaseGroup = szExternalPurchaseGroup;
    }

    public String getSzRDODate() {
        return szRDODate;
    }

    public void setSzRDODate(String szRDODate) {
        this.szRDODate = szRDODate;
    }

    public String getSzRDOTime() {
        return szRDOTime;
    }

    public void setSzRDOTime(String szRDOTime) {
        this.szRDOTime = szRDOTime;
    }

    public String getSzStatusPO() {
        return szStatusPO;
    }

    public void setSzStatusPO(String szStatusPO) {
        this.szStatusPO = szStatusPO;
    }

    public String getSzSaveDSDReceiptNmbr() {
        return szSaveDSDReceiptNmbr;
    }

    public void setSzSaveDSDReceiptNmbr(String szSaveDSDReceiptNmbr) {
        this.szSaveDSDReceiptNmbr = szSaveDSDReceiptNmbr;
    }

    public String getSzReceiptDocumentNmbr() {
        return szReceiptDocumentNmbr;
    }

    public void setSzReceiptDocumentNmbr(String szReceiptDocumentNmbr) {
        this.szReceiptDocumentNmbr = szReceiptDocumentNmbr;
    }

    public String getSzSerialNmbr() {
        return szSerialNmbr;
    }

    public void setSzSerialNmbr(String szSerialNmbr) {
        this.szSerialNmbr = szSerialNmbr;
    }

    public Integer getbNoObject() {
        return bNoObject;
    }

    public void setbNoObject(Integer bNoObject) {
        this.bNoObject = bNoObject;
    }

    public String getSzRVRSerialNmbr() {
        return szRVRSerialNmbr;
    }

    public void setSzRVRSerialNmbr(String szRVRSerialNmbr) {
        this.szRVRSerialNmbr = szRVRSerialNmbr;
    }

    public String getSzPoDocumentNmber() {
        return szPoDocumentNmber;
    }

    public void setSzPoDocumentNmber(String szPoDocumentNmber) {
        this.szPoDocumentNmber = szPoDocumentNmber;
    }
}