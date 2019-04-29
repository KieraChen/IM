package com.model;

import java.math.BigDecimal;

public class IMMovementDetail extends IMMovementDetailKey {
    private String szPOSItemID;

    private String szDesc;

    private String szStorageLocationID;

    private String szPriceUnitOfMeasureName;

    private BigDecimal dOrderQty;

    private BigDecimal dQty;

    private Integer lChangedOperatorID;

    private Integer lTechLayerAccessID;

    private String szLastUpdLocal;

    private String szItemShelfLoc;

    private BigDecimal dPackingUnitPriceAmount;

    private BigDecimal dMAP;

    private String szStorageLocationName;

    private BigDecimal dTotalRetailAmount;

    private Integer bParkingCoupon;

    private Integer lSupplySource;

    private Integer bConsignment;

    private String szArticleType;

    private String szPurchaseGroup;

    private String szVendorIDOrCDCExternalID;

    private String szReasonCode;

    private String szReasonName;

    private BigDecimal dLossQty;

    private BigDecimal dRvrActualQty;

    private BigDecimal dCompensateDamageQty;

    private BigDecimal dCompensateDiffQty;

    private Integer szDamaConfirm;

    private Integer szDiffConfirm;

    public String getSzPOSItemID() {
        return szPOSItemID;
    }

    public void setSzPOSItemID(String szPOSItemID) {
        this.szPOSItemID = szPOSItemID;
    }

    public String getSzDesc() {
        return szDesc;
    }

    public void setSzDesc(String szDesc) {
        this.szDesc = szDesc;
    }

    public String getSzStorageLocationID() {
        return szStorageLocationID;
    }

    public void setSzStorageLocationID(String szStorageLocationID) {
        this.szStorageLocationID = szStorageLocationID;
    }

    public String getSzPriceUnitOfMeasureName() {
        return szPriceUnitOfMeasureName;
    }

    public void setSzPriceUnitOfMeasureName(String szPriceUnitOfMeasureName) {
        this.szPriceUnitOfMeasureName = szPriceUnitOfMeasureName;
    }

    public BigDecimal getdOrderQty() {
        return dOrderQty;
    }

    public void setdOrderQty(BigDecimal dOrderQty) {
        this.dOrderQty = dOrderQty;
    }

    public BigDecimal getdQty() {
        return dQty;
    }

    public void setdQty(BigDecimal dQty) {
        this.dQty = dQty;
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

    public String getSzItemShelfLoc() {
        return szItemShelfLoc;
    }

    public void setSzItemShelfLoc(String szItemShelfLoc) {
        this.szItemShelfLoc = szItemShelfLoc;
    }

    public BigDecimal getdPackingUnitPriceAmount() {
        return dPackingUnitPriceAmount;
    }

    public void setdPackingUnitPriceAmount(BigDecimal dPackingUnitPriceAmount) {
        this.dPackingUnitPriceAmount = dPackingUnitPriceAmount;
    }

    public BigDecimal getdMAP() {
        return dMAP;
    }

    public void setdMAP(BigDecimal dMAP) {
        this.dMAP = dMAP;
    }

    public String getSzStorageLocationName() {
        return szStorageLocationName;
    }

    public void setSzStorageLocationName(String szStorageLocationName) {
        this.szStorageLocationName = szStorageLocationName;
    }

    public BigDecimal getdTotalRetailAmount() {
        return dTotalRetailAmount;
    }

    public void setdTotalRetailAmount(BigDecimal dTotalRetailAmount) {
        this.dTotalRetailAmount = dTotalRetailAmount;
    }

    public Integer getbParkingCoupon() {
        return bParkingCoupon;
    }

    public void setbParkingCoupon(Integer bParkingCoupon) {
        this.bParkingCoupon = bParkingCoupon;
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

    public String getSzPurchaseGroup() {
        return szPurchaseGroup;
    }

    public void setSzPurchaseGroup(String szPurchaseGroup) {
        this.szPurchaseGroup = szPurchaseGroup;
    }

    public String getSzVendorIDOrCDCExternalID() {
        return szVendorIDOrCDCExternalID;
    }

    public void setSzVendorIDOrCDCExternalID(String szVendorIDOrCDCExternalID) {
        this.szVendorIDOrCDCExternalID = szVendorIDOrCDCExternalID;
    }

    public String getSzReasonCode() {
        return szReasonCode;
    }

    public void setSzReasonCode(String szReasonCode) {
        this.szReasonCode = szReasonCode;
    }

    public String getSzReasonName() {
        return szReasonName;
    }

    public void setSzReasonName(String szReasonName) {
        this.szReasonName = szReasonName;
    }

    public BigDecimal getdLossQty() {
        return dLossQty;
    }

    public void setdLossQty(BigDecimal dLossQty) {
        this.dLossQty = dLossQty;
    }

    public BigDecimal getdRvrActualQty() {
        return dRvrActualQty;
    }

    public void setdRvrActualQty(BigDecimal dRvrActualQty) {
        this.dRvrActualQty = dRvrActualQty;
    }

    public BigDecimal getdCompensateDamageQty() {
        return dCompensateDamageQty;
    }

    public void setdCompensateDamageQty(BigDecimal dCompensateDamageQty) {
        this.dCompensateDamageQty = dCompensateDamageQty;
    }

    public BigDecimal getdCompensateDiffQty() {
        return dCompensateDiffQty;
    }

    public void setdCompensateDiffQty(BigDecimal dCompensateDiffQty) {
        this.dCompensateDiffQty = dCompensateDiffQty;
    }

    public Integer getSzDamaConfirm() {
        return szDamaConfirm;
    }

    public void setSzDamaConfirm(Integer szDamaConfirm) {
        this.szDamaConfirm = szDamaConfirm;
    }

    public Integer getSzDiffConfirm() {
        return szDiffConfirm;
    }

    public void setSzDiffConfirm(Integer szDiffConfirm) {
        this.szDiffConfirm = szDiffConfirm;
    }
}