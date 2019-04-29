package com.model;

import java.math.BigDecimal;

public class IMOrder extends IMOrderKey {
    private String szTime;

    private String szRetailStoreExternalID;

    private Integer lWorkstationNmbr;

    private Integer lCreatedOperatorID;

    private String szStorageLocationID;

    private String szVendorID;

    private String szPriceUnitOfMeasureName;

    private String szItemClassification;

    private BigDecimal dQty;

    private BigDecimal dShift1Qty;

    private BigDecimal dShift2Qty;

    private BigDecimal dShift3Qty;

    private String szDeliveryDate;

    private BigDecimal dOrderDayOnHand;

    private BigDecimal dOrderDayForecast;

    private BigDecimal dNextDayOnHand;

    private BigDecimal dNextDayForecast;

    private String szItemName;

    private BigDecimal dItemMOQ;

    private BigDecimal dItemLDU;

    private Integer lChangedOperatorID;

    private Integer lHostInterfaceID1;

    private Integer lTechLayerAccessID;

    private String szLastUpdLocal;

    private Integer lSupplySource;

    private Integer bConsignment;

    private String szArticleType;

    private String szRetailStoreExternalIDFrom;

    private String szPurchaseGroup;

    private String szUploadFTPStatus;

    private String szSerialNmbr;

    private String szABCIndicator;

    private String szABCIndicatorDesc;

    public String getSzTime() {
        return szTime;
    }

    public void setSzTime(String szTime) {
        this.szTime = szTime;
    }

    public String getSzRetailStoreExternalID() {
        return szRetailStoreExternalID;
    }

    public void setSzRetailStoreExternalID(String szRetailStoreExternalID) {
        this.szRetailStoreExternalID = szRetailStoreExternalID;
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

    public String getSzStorageLocationID() {
        return szStorageLocationID;
    }

    public void setSzStorageLocationID(String szStorageLocationID) {
        this.szStorageLocationID = szStorageLocationID;
    }

    public String getSzVendorID() {
        return szVendorID;
    }

    public void setSzVendorID(String szVendorID) {
        this.szVendorID = szVendorID;
    }

    public String getSzPriceUnitOfMeasureName() {
        return szPriceUnitOfMeasureName;
    }

    public void setSzPriceUnitOfMeasureName(String szPriceUnitOfMeasureName) {
        this.szPriceUnitOfMeasureName = szPriceUnitOfMeasureName;
    }

    public String getSzItemClassification() {
        return szItemClassification;
    }

    public void setSzItemClassification(String szItemClassification) {
        this.szItemClassification = szItemClassification;
    }

    public BigDecimal getdQty() {
        return dQty;
    }

    public void setdQty(BigDecimal dQty) {
        this.dQty = dQty;
    }

    public BigDecimal getdShift1Qty() {
        return dShift1Qty;
    }

    public void setdShift1Qty(BigDecimal dShift1Qty) {
        this.dShift1Qty = dShift1Qty;
    }

    public BigDecimal getdShift2Qty() {
        return dShift2Qty;
    }

    public void setdShift2Qty(BigDecimal dShift2Qty) {
        this.dShift2Qty = dShift2Qty;
    }

    public BigDecimal getdShift3Qty() {
        return dShift3Qty;
    }

    public void setdShift3Qty(BigDecimal dShift3Qty) {
        this.dShift3Qty = dShift3Qty;
    }

    public String getSzDeliveryDate() {
        return szDeliveryDate;
    }

    public void setSzDeliveryDate(String szDeliveryDate) {
        this.szDeliveryDate = szDeliveryDate;
    }

    public BigDecimal getdOrderDayOnHand() {
        return dOrderDayOnHand;
    }

    public void setdOrderDayOnHand(BigDecimal dOrderDayOnHand) {
        this.dOrderDayOnHand = dOrderDayOnHand;
    }

    public BigDecimal getdOrderDayForecast() {
        return dOrderDayForecast;
    }

    public void setdOrderDayForecast(BigDecimal dOrderDayForecast) {
        this.dOrderDayForecast = dOrderDayForecast;
    }

    public BigDecimal getdNextDayOnHand() {
        return dNextDayOnHand;
    }

    public void setdNextDayOnHand(BigDecimal dNextDayOnHand) {
        this.dNextDayOnHand = dNextDayOnHand;
    }

    public BigDecimal getdNextDayForecast() {
        return dNextDayForecast;
    }

    public void setdNextDayForecast(BigDecimal dNextDayForecast) {
        this.dNextDayForecast = dNextDayForecast;
    }

    public String getSzItemName() {
        return szItemName;
    }

    public void setSzItemName(String szItemName) {
        this.szItemName = szItemName;
    }

    public BigDecimal getdItemMOQ() {
        return dItemMOQ;
    }

    public void setdItemMOQ(BigDecimal dItemMOQ) {
        this.dItemMOQ = dItemMOQ;
    }

    public BigDecimal getdItemLDU() {
        return dItemLDU;
    }

    public void setdItemLDU(BigDecimal dItemLDU) {
        this.dItemLDU = dItemLDU;
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

    public Integer getlSupplySource() {
        return lSupplySource;
    }

    public void setlSupplySource(Integer lSupplySource) {
        this.lSupplySource = lSupplySource;
    }

    public Integer getbConsignment() {
        return bConsignment;
    }

    public void setbConsignment(Integer bConsignment) {
        this.bConsignment = bConsignment;
    }

    public String getSzArticleType() {
        return szArticleType;
    }

    public void setSzArticleType(String szArticleType) {
        this.szArticleType = szArticleType;
    }

    public String getSzRetailStoreExternalIDFrom() {
        return szRetailStoreExternalIDFrom;
    }

    public void setSzRetailStoreExternalIDFrom(String szRetailStoreExternalIDFrom) {
        this.szRetailStoreExternalIDFrom = szRetailStoreExternalIDFrom;
    }

    public String getSzPurchaseGroup() {
        return szPurchaseGroup;
    }

    public void setSzPurchaseGroup(String szPurchaseGroup) {
        this.szPurchaseGroup = szPurchaseGroup;
    }

    public String getSzUploadFTPStatus() {
        return szUploadFTPStatus;
    }

    public void setSzUploadFTPStatus(String szUploadFTPStatus) {
        this.szUploadFTPStatus = szUploadFTPStatus;
    }

    public String getSzSerialNmbr() {
        return szSerialNmbr;
    }

    public void setSzSerialNmbr(String szSerialNmbr) {
        this.szSerialNmbr = szSerialNmbr;
    }

    public String getSzABCIndicator() {
        return szABCIndicator;
    }

    public void setSzABCIndicator(String szABCIndicator) {
        this.szABCIndicator = szABCIndicator;
    }

    public String getSzABCIndicatorDesc() {
        return szABCIndicatorDesc;
    }

    public void setSzABCIndicatorDesc(String szABCIndicatorDesc) {
        this.szABCIndicatorDesc = szABCIndicatorDesc;
    }
}