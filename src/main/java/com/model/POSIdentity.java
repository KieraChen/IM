package com.model;

import java.math.BigDecimal;

public class POSIdentity extends POSIdentityKey {
    private String szItemId;

    private String szDesc;

    private String szDesc1;

    private String szDesc2;

    private String szDescription;

    private Short bPriceEntryRequiredFlag;

    private Short bMeasurementEntryRequired;

    private Short bQuantityKeyProhibitFlag;

    private Short bProhibitReturnFlag;

    private Short bProhibitRepeatKeyFlag;

    private BigDecimal dFrequentShopperPointsCount;

    private Integer lCurrencyID;

    private BigDecimal dPackingUnitPriceAmount;

    private BigDecimal dPieceQuantity;

    private BigDecimal dPiecePriceAmount;

    private Short bCalculationOnPiecePriceFlag;

    private Short bLinkedSaleOnlyFlag;

    private String szPackingUnitCounterTypeCode;

    private Short bPriceNegativeFlag;

    private String szQuantityEntryUnitOfMeasure;

    private Short bPriceChangeProhibitFlag;

    private BigDecimal dPriceEntryLowAmount;

    private BigDecimal dPriceEntryHighAmount;

    private String szExternalID;

    private BigDecimal d2ndPrice;

    private BigDecimal d3rdPrice;

    private BigDecimal d4thPrice;

    private BigDecimal d5thPrice;

    private BigDecimal dLowArtDiscPrice;

    private String szArtLink;

    private Short bLocked;

    private Integer lWarranty;

    private String szPrintLayoutID;

    private String szAddOnDialog;

    private Short bIsContract;

    private Short bIsFiscalArt;

    private Short bIsSerialized;

    private Short bOnStock;

    private Short bArtKVSet;

    private Short bArtKSet;

    private Short bArtVSet;

    private Short bTotalDiscountAllowed;

    private Short bScaleItemFlag;

    private Short bBrandItemFlag;

    private Short bSupervisorRequiredFlag;

    private Short bCheckPriceFlag;

    private Short bAgeControlFlag;

    private String szPriceUnitOfMeasureName;

    private BigDecimal dTareAmount;

    private String szDateValidFrom;

    private String szTimeValidFrom;

    private String szDateValidTo;

    private String szTimeValidTo;

    private Short bIsDepositItem;

    private BigDecimal dQtyArtLink;

    private Short bPressItem;

    private Short bQuantityEntryRequired;

    private Integer lAgeControl;

    private Short bUseSizeAndColor;

    private Short bIsBundleItem;

    private Short bLockedByERP;

    private Short bLoyaltyPointsAllowed;

    private Integer lChangedByOperatorID;

    private Integer dLoyaltyPoints;

    private String szDeleteDate;

    private Integer lTechLayerAccessID;

    private String szLastUpdLocal;

    private String uidObjectID;

    private String szAccountingID;

    private Short bVoidAllowed;

    private BigDecimal dMaxAllowedQty;

    private Integer lOperatorAgeControl;

    private Integer IM_bAllowPOGoodReturn;

    private BigDecimal IM_dMinOrderQty;

    private Integer IM_lInventoryDays;

    private Integer IM_lShelfLife;

    private Integer IM_lReceiveShelfLife;

    private Integer IM_lSaleShelfLife;

    private String IM_szPrimaryStorageLocationID;

    private Integer IM_lOrderType;

    private Integer IM_bFreshFoodD1;

    private Integer IM_bFreshFoodD2;

    private Integer IM_bFreshFoodD3;

    private String IM_szOrderBlockDate;

    private String IM_szReturnBlockDate;

    private String IM_szDailySalesBlockTimeFrom;

    private String IM_szDailySalesBlockTimeTo;

    private String IM_szPrimaryVendorID;

    private String IM_szPrimaryCDCRetailStoreExternalID;

    private Integer IM_bParkingCoupon;

    private BigDecimal IM_dMaxOrderQty;

    private Integer IM_bCoreItem;

    private Integer IM_bUnderCDUControl;

    private Integer IM_bUnderStockControl;

    private Integer IM_lSupplySource;

    private String IM_szArticleType;

    private String IM_szPurchaseGroup;

    private Integer IM_bGRWithoutPOAllowed;

    private Integer IM_bConsignment;

    private Integer IM_bWriteOffAllowed;

    private String IM_szOrderCycleCode;

    private String IM_szIMPSA;

    private String IM_szABCIndicator;

    private Integer IM_lDeliveryLeadTime;

    public String getSzItemId() {
        return szItemId;
    }

    public void setSzItemId(String szItemId) {
        this.szItemId = szItemId;
    }

    public String getSzDesc() {
        return szDesc;
    }

    public void setSzDesc(String szDesc) {
        this.szDesc = szDesc;
    }

    public String getSzDesc1() {
        return szDesc1;
    }

    public void setSzDesc1(String szDesc1) {
        this.szDesc1 = szDesc1;
    }

    public String getSzDesc2() {
        return szDesc2;
    }

    public void setSzDesc2(String szDesc2) {
        this.szDesc2 = szDesc2;
    }

    public String getSzDescription() {
        return szDescription;
    }

    public void setSzDescription(String szDescription) {
        this.szDescription = szDescription;
    }

    public Short getbPriceEntryRequiredFlag() {
        return bPriceEntryRequiredFlag;
    }

    public void setbPriceEntryRequiredFlag(Short bPriceEntryRequiredFlag) {
        this.bPriceEntryRequiredFlag = bPriceEntryRequiredFlag;
    }

    public Short getbMeasurementEntryRequired() {
        return bMeasurementEntryRequired;
    }

    public void setbMeasurementEntryRequired(Short bMeasurementEntryRequired) {
        this.bMeasurementEntryRequired = bMeasurementEntryRequired;
    }

    public Short getbQuantityKeyProhibitFlag() {
        return bQuantityKeyProhibitFlag;
    }

    public void setbQuantityKeyProhibitFlag(Short bQuantityKeyProhibitFlag) {
        this.bQuantityKeyProhibitFlag = bQuantityKeyProhibitFlag;
    }

    public Short getbProhibitReturnFlag() {
        return bProhibitReturnFlag;
    }

    public void setbProhibitReturnFlag(Short bProhibitReturnFlag) {
        this.bProhibitReturnFlag = bProhibitReturnFlag;
    }

    public Short getbProhibitRepeatKeyFlag() {
        return bProhibitRepeatKeyFlag;
    }

    public void setbProhibitRepeatKeyFlag(Short bProhibitRepeatKeyFlag) {
        this.bProhibitRepeatKeyFlag = bProhibitRepeatKeyFlag;
    }

    public BigDecimal getdFrequentShopperPointsCount() {
        return dFrequentShopperPointsCount;
    }

    public void setdFrequentShopperPointsCount(BigDecimal dFrequentShopperPointsCount) {
        this.dFrequentShopperPointsCount = dFrequentShopperPointsCount;
    }

    public Integer getlCurrencyID() {
        return lCurrencyID;
    }

    public void setlCurrencyID(Integer lCurrencyID) {
        this.lCurrencyID = lCurrencyID;
    }

    public BigDecimal getdPackingUnitPriceAmount() {
        return dPackingUnitPriceAmount;
    }

    public void setdPackingUnitPriceAmount(BigDecimal dPackingUnitPriceAmount) {
        this.dPackingUnitPriceAmount = dPackingUnitPriceAmount;
    }

    public BigDecimal getdPieceQuantity() {
        return dPieceQuantity;
    }

    public void setdPieceQuantity(BigDecimal dPieceQuantity) {
        this.dPieceQuantity = dPieceQuantity;
    }

    public BigDecimal getdPiecePriceAmount() {
        return dPiecePriceAmount;
    }

    public void setdPiecePriceAmount(BigDecimal dPiecePriceAmount) {
        this.dPiecePriceAmount = dPiecePriceAmount;
    }

    public Short getbCalculationOnPiecePriceFlag() {
        return bCalculationOnPiecePriceFlag;
    }

    public void setbCalculationOnPiecePriceFlag(Short bCalculationOnPiecePriceFlag) {
        this.bCalculationOnPiecePriceFlag = bCalculationOnPiecePriceFlag;
    }

    public Short getbLinkedSaleOnlyFlag() {
        return bLinkedSaleOnlyFlag;
    }

    public void setbLinkedSaleOnlyFlag(Short bLinkedSaleOnlyFlag) {
        this.bLinkedSaleOnlyFlag = bLinkedSaleOnlyFlag;
    }

    public String getSzPackingUnitCounterTypeCode() {
        return szPackingUnitCounterTypeCode;
    }

    public void setSzPackingUnitCounterTypeCode(String szPackingUnitCounterTypeCode) {
        this.szPackingUnitCounterTypeCode = szPackingUnitCounterTypeCode;
    }

    public Short getbPriceNegativeFlag() {
        return bPriceNegativeFlag;
    }

    public void setbPriceNegativeFlag(Short bPriceNegativeFlag) {
        this.bPriceNegativeFlag = bPriceNegativeFlag;
    }

    public String getSzQuantityEntryUnitOfMeasure() {
        return szQuantityEntryUnitOfMeasure;
    }

    public void setSzQuantityEntryUnitOfMeasure(String szQuantityEntryUnitOfMeasure) {
        this.szQuantityEntryUnitOfMeasure = szQuantityEntryUnitOfMeasure;
    }

    public Short getbPriceChangeProhibitFlag() {
        return bPriceChangeProhibitFlag;
    }

    public void setbPriceChangeProhibitFlag(Short bPriceChangeProhibitFlag) {
        this.bPriceChangeProhibitFlag = bPriceChangeProhibitFlag;
    }

    public BigDecimal getdPriceEntryLowAmount() {
        return dPriceEntryLowAmount;
    }

    public void setdPriceEntryLowAmount(BigDecimal dPriceEntryLowAmount) {
        this.dPriceEntryLowAmount = dPriceEntryLowAmount;
    }

    public BigDecimal getdPriceEntryHighAmount() {
        return dPriceEntryHighAmount;
    }

    public void setdPriceEntryHighAmount(BigDecimal dPriceEntryHighAmount) {
        this.dPriceEntryHighAmount = dPriceEntryHighAmount;
    }

    public String getSzExternalID() {
        return szExternalID;
    }

    public void setSzExternalID(String szExternalID) {
        this.szExternalID = szExternalID;
    }

    public BigDecimal getD2ndPrice() {
        return d2ndPrice;
    }

    public void setD2ndPrice(BigDecimal d2ndPrice) {
        this.d2ndPrice = d2ndPrice;
    }

    public BigDecimal getD3rdPrice() {
        return d3rdPrice;
    }

    public void setD3rdPrice(BigDecimal d3rdPrice) {
        this.d3rdPrice = d3rdPrice;
    }

    public BigDecimal getD4thPrice() {
        return d4thPrice;
    }

    public void setD4thPrice(BigDecimal d4thPrice) {
        this.d4thPrice = d4thPrice;
    }

    public BigDecimal getD5thPrice() {
        return d5thPrice;
    }

    public void setD5thPrice(BigDecimal d5thPrice) {
        this.d5thPrice = d5thPrice;
    }

    public BigDecimal getdLowArtDiscPrice() {
        return dLowArtDiscPrice;
    }

    public void setdLowArtDiscPrice(BigDecimal dLowArtDiscPrice) {
        this.dLowArtDiscPrice = dLowArtDiscPrice;
    }

    public String getSzArtLink() {
        return szArtLink;
    }

    public void setSzArtLink(String szArtLink) {
        this.szArtLink = szArtLink;
    }

    public Short getbLocked() {
        return bLocked;
    }

    public void setbLocked(Short bLocked) {
        this.bLocked = bLocked;
    }

    public Integer getlWarranty() {
        return lWarranty;
    }

    public void setlWarranty(Integer lWarranty) {
        this.lWarranty = lWarranty;
    }

    public String getSzPrintLayoutID() {
        return szPrintLayoutID;
    }

    public void setSzPrintLayoutID(String szPrintLayoutID) {
        this.szPrintLayoutID = szPrintLayoutID;
    }

    public String getSzAddOnDialog() {
        return szAddOnDialog;
    }

    public void setSzAddOnDialog(String szAddOnDialog) {
        this.szAddOnDialog = szAddOnDialog;
    }

    public Short getbIsContract() {
        return bIsContract;
    }

    public void setbIsContract(Short bIsContract) {
        this.bIsContract = bIsContract;
    }

    public Short getbIsFiscalArt() {
        return bIsFiscalArt;
    }

    public void setbIsFiscalArt(Short bIsFiscalArt) {
        this.bIsFiscalArt = bIsFiscalArt;
    }

    public Short getbIsSerialized() {
        return bIsSerialized;
    }

    public void setbIsSerialized(Short bIsSerialized) {
        this.bIsSerialized = bIsSerialized;
    }

    public Short getbOnStock() {
        return bOnStock;
    }

    public void setbOnStock(Short bOnStock) {
        this.bOnStock = bOnStock;
    }

    public Short getbArtKVSet() {
        return bArtKVSet;
    }

    public void setbArtKVSet(Short bArtKVSet) {
        this.bArtKVSet = bArtKVSet;
    }

    public Short getbArtKSet() {
        return bArtKSet;
    }

    public void setbArtKSet(Short bArtKSet) {
        this.bArtKSet = bArtKSet;
    }

    public Short getbArtVSet() {
        return bArtVSet;
    }

    public void setbArtVSet(Short bArtVSet) {
        this.bArtVSet = bArtVSet;
    }

    public Short getbTotalDiscountAllowed() {
        return bTotalDiscountAllowed;
    }

    public void setbTotalDiscountAllowed(Short bTotalDiscountAllowed) {
        this.bTotalDiscountAllowed = bTotalDiscountAllowed;
    }

    public Short getbScaleItemFlag() {
        return bScaleItemFlag;
    }

    public void setbScaleItemFlag(Short bScaleItemFlag) {
        this.bScaleItemFlag = bScaleItemFlag;
    }

    public Short getbBrandItemFlag() {
        return bBrandItemFlag;
    }

    public void setbBrandItemFlag(Short bBrandItemFlag) {
        this.bBrandItemFlag = bBrandItemFlag;
    }

    public Short getbSupervisorRequiredFlag() {
        return bSupervisorRequiredFlag;
    }

    public void setbSupervisorRequiredFlag(Short bSupervisorRequiredFlag) {
        this.bSupervisorRequiredFlag = bSupervisorRequiredFlag;
    }

    public Short getbCheckPriceFlag() {
        return bCheckPriceFlag;
    }

    public void setbCheckPriceFlag(Short bCheckPriceFlag) {
        this.bCheckPriceFlag = bCheckPriceFlag;
    }

    public Short getbAgeControlFlag() {
        return bAgeControlFlag;
    }

    public void setbAgeControlFlag(Short bAgeControlFlag) {
        this.bAgeControlFlag = bAgeControlFlag;
    }

    public String getSzPriceUnitOfMeasureName() {
        return szPriceUnitOfMeasureName;
    }

    public void setSzPriceUnitOfMeasureName(String szPriceUnitOfMeasureName) {
        this.szPriceUnitOfMeasureName = szPriceUnitOfMeasureName;
    }

    public BigDecimal getdTareAmount() {
        return dTareAmount;
    }

    public void setdTareAmount(BigDecimal dTareAmount) {
        this.dTareAmount = dTareAmount;
    }

    public String getSzDateValidFrom() {
        return szDateValidFrom;
    }

    public void setSzDateValidFrom(String szDateValidFrom) {
        this.szDateValidFrom = szDateValidFrom;
    }

    public String getSzTimeValidFrom() {
        return szTimeValidFrom;
    }

    public void setSzTimeValidFrom(String szTimeValidFrom) {
        this.szTimeValidFrom = szTimeValidFrom;
    }

    public String getSzDateValidTo() {
        return szDateValidTo;
    }

    public void setSzDateValidTo(String szDateValidTo) {
        this.szDateValidTo = szDateValidTo;
    }

    public String getSzTimeValidTo() {
        return szTimeValidTo;
    }

    public void setSzTimeValidTo(String szTimeValidTo) {
        this.szTimeValidTo = szTimeValidTo;
    }

    public Short getbIsDepositItem() {
        return bIsDepositItem;
    }

    public void setbIsDepositItem(Short bIsDepositItem) {
        this.bIsDepositItem = bIsDepositItem;
    }

    public BigDecimal getdQtyArtLink() {
        return dQtyArtLink;
    }

    public void setdQtyArtLink(BigDecimal dQtyArtLink) {
        this.dQtyArtLink = dQtyArtLink;
    }

    public Short getbPressItem() {
        return bPressItem;
    }

    public void setbPressItem(Short bPressItem) {
        this.bPressItem = bPressItem;
    }

    public Short getbQuantityEntryRequired() {
        return bQuantityEntryRequired;
    }

    public void setbQuantityEntryRequired(Short bQuantityEntryRequired) {
        this.bQuantityEntryRequired = bQuantityEntryRequired;
    }

    public Integer getlAgeControl() {
        return lAgeControl;
    }

    public void setlAgeControl(Integer lAgeControl) {
        this.lAgeControl = lAgeControl;
    }

    public Short getbUseSizeAndColor() {
        return bUseSizeAndColor;
    }

    public void setbUseSizeAndColor(Short bUseSizeAndColor) {
        this.bUseSizeAndColor = bUseSizeAndColor;
    }

    public Short getbIsBundleItem() {
        return bIsBundleItem;
    }

    public void setbIsBundleItem(Short bIsBundleItem) {
        this.bIsBundleItem = bIsBundleItem;
    }

    public Short getbLockedByERP() {
        return bLockedByERP;
    }

    public void setbLockedByERP(Short bLockedByERP) {
        this.bLockedByERP = bLockedByERP;
    }

    public Short getbLoyaltyPointsAllowed() {
        return bLoyaltyPointsAllowed;
    }

    public void setbLoyaltyPointsAllowed(Short bLoyaltyPointsAllowed) {
        this.bLoyaltyPointsAllowed = bLoyaltyPointsAllowed;
    }

    public Integer getlChangedByOperatorID() {
        return lChangedByOperatorID;
    }

    public void setlChangedByOperatorID(Integer lChangedByOperatorID) {
        this.lChangedByOperatorID = lChangedByOperatorID;
    }

    public Integer getdLoyaltyPoints() {
        return dLoyaltyPoints;
    }

    public void setdLoyaltyPoints(Integer dLoyaltyPoints) {
        this.dLoyaltyPoints = dLoyaltyPoints;
    }

    public String getSzDeleteDate() {
        return szDeleteDate;
    }

    public void setSzDeleteDate(String szDeleteDate) {
        this.szDeleteDate = szDeleteDate;
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

    public String getUidObjectID() {
        return uidObjectID;
    }

    public void setUidObjectID(String uidObjectID) {
        this.uidObjectID = uidObjectID;
    }

    public String getSzAccountingID() {
        return szAccountingID;
    }

    public void setSzAccountingID(String szAccountingID) {
        this.szAccountingID = szAccountingID;
    }

    public Short getbVoidAllowed() {
        return bVoidAllowed;
    }

    public void setbVoidAllowed(Short bVoidAllowed) {
        this.bVoidAllowed = bVoidAllowed;
    }

    public BigDecimal getdMaxAllowedQty() {
        return dMaxAllowedQty;
    }

    public void setdMaxAllowedQty(BigDecimal dMaxAllowedQty) {
        this.dMaxAllowedQty = dMaxAllowedQty;
    }

    public Integer getlOperatorAgeControl() {
        return lOperatorAgeControl;
    }

    public void setlOperatorAgeControl(Integer lOperatorAgeControl) {
        this.lOperatorAgeControl = lOperatorAgeControl;
    }

    public Integer getIM_bAllowPOGoodReturn() {
        return IM_bAllowPOGoodReturn;
    }

    public void setIM_bAllowPOGoodReturn(Integer IM_bAllowPOGoodReturn) {
        this.IM_bAllowPOGoodReturn = IM_bAllowPOGoodReturn;
    }

    public BigDecimal getIM_dMinOrderQty() {
        return IM_dMinOrderQty;
    }

    public void setIM_dMinOrderQty(BigDecimal IM_dMinOrderQty) {
        this.IM_dMinOrderQty = IM_dMinOrderQty;
    }

    public Integer getIM_lInventoryDays() {
        return IM_lInventoryDays;
    }

    public void setIM_lInventoryDays(Integer IM_lInventoryDays) {
        this.IM_lInventoryDays = IM_lInventoryDays;
    }

    public Integer getIM_lShelfLife() {
        return IM_lShelfLife;
    }

    public void setIM_lShelfLife(Integer IM_lShelfLife) {
        this.IM_lShelfLife = IM_lShelfLife;
    }

    public Integer getIM_lReceiveShelfLife() {
        return IM_lReceiveShelfLife;
    }

    public void setIM_lReceiveShelfLife(Integer IM_lReceiveShelfLife) {
        this.IM_lReceiveShelfLife = IM_lReceiveShelfLife;
    }

    public Integer getIM_lSaleShelfLife() {
        return IM_lSaleShelfLife;
    }

    public void setIM_lSaleShelfLife(Integer IM_lSaleShelfLife) {
        this.IM_lSaleShelfLife = IM_lSaleShelfLife;
    }

    public String getIM_szPrimaryStorageLocationID() {
        return IM_szPrimaryStorageLocationID;
    }

    public void setIM_szPrimaryStorageLocationID(String IM_szPrimaryStorageLocationID) {
        this.IM_szPrimaryStorageLocationID = IM_szPrimaryStorageLocationID;
    }

    public Integer getIM_lOrderType() {
        return IM_lOrderType;
    }

    public void setIM_lOrderType(Integer IM_lOrderType) {
        this.IM_lOrderType = IM_lOrderType;
    }

    public Integer getIM_bFreshFoodD1() {
        return IM_bFreshFoodD1;
    }

    public void setIM_bFreshFoodD1(Integer IM_bFreshFoodD1) {
        this.IM_bFreshFoodD1 = IM_bFreshFoodD1;
    }

    public Integer getIM_bFreshFoodD2() {
        return IM_bFreshFoodD2;
    }

    public void setIM_bFreshFoodD2(Integer IM_bFreshFoodD2) {
        this.IM_bFreshFoodD2 = IM_bFreshFoodD2;
    }

    public Integer getIM_bFreshFoodD3() {
        return IM_bFreshFoodD3;
    }

    public void setIM_bFreshFoodD3(Integer IM_bFreshFoodD3) {
        this.IM_bFreshFoodD3 = IM_bFreshFoodD3;
    }

    public String getIM_szOrderBlockDate() {
        return IM_szOrderBlockDate;
    }

    public void setIM_szOrderBlockDate(String IM_szOrderBlockDate) {
        this.IM_szOrderBlockDate = IM_szOrderBlockDate;
    }

    public String getIM_szReturnBlockDate() {
        return IM_szReturnBlockDate;
    }

    public void setIM_szReturnBlockDate(String IM_szReturnBlockDate) {
        this.IM_szReturnBlockDate = IM_szReturnBlockDate;
    }

    public String getIM_szDailySalesBlockTimeFrom() {
        return IM_szDailySalesBlockTimeFrom;
    }

    public void setIM_szDailySalesBlockTimeFrom(String IM_szDailySalesBlockTimeFrom) {
        this.IM_szDailySalesBlockTimeFrom = IM_szDailySalesBlockTimeFrom;
    }

    public String getIM_szDailySalesBlockTimeTo() {
        return IM_szDailySalesBlockTimeTo;
    }

    public void setIM_szDailySalesBlockTimeTo(String IM_szDailySalesBlockTimeTo) {
        this.IM_szDailySalesBlockTimeTo = IM_szDailySalesBlockTimeTo;
    }

    public String getIM_szPrimaryVendorID() {
        return IM_szPrimaryVendorID;
    }

    public void setIM_szPrimaryVendorID(String IM_szPrimaryVendorID) {
        this.IM_szPrimaryVendorID = IM_szPrimaryVendorID;
    }

    public String getIM_szPrimaryCDCRetailStoreExternalID() {
        return IM_szPrimaryCDCRetailStoreExternalID;
    }

    public void setIM_szPrimaryCDCRetailStoreExternalID(String IM_szPrimaryCDCRetailStoreExternalID) {
        this.IM_szPrimaryCDCRetailStoreExternalID = IM_szPrimaryCDCRetailStoreExternalID;
    }

    public Integer getIM_bParkingCoupon() {
        return IM_bParkingCoupon;
    }

    public void setIM_bParkingCoupon(Integer IM_bParkingCoupon) {
        this.IM_bParkingCoupon = IM_bParkingCoupon;
    }

    public BigDecimal getIM_dMaxOrderQty() {
        return IM_dMaxOrderQty;
    }

    public void setIM_dMaxOrderQty(BigDecimal IM_dMaxOrderQty) {
        this.IM_dMaxOrderQty = IM_dMaxOrderQty;
    }

    public Integer getIM_bCoreItem() {
        return IM_bCoreItem;
    }

    public void setIM_bCoreItem(Integer IM_bCoreItem) {
        this.IM_bCoreItem = IM_bCoreItem;
    }

    public Integer getIM_bUnderCDUControl() {
        return IM_bUnderCDUControl;
    }

    public void setIM_bUnderCDUControl(Integer IM_bUnderCDUControl) {
        this.IM_bUnderCDUControl = IM_bUnderCDUControl;
    }

    public Integer getIM_bUnderStockControl() {
        return IM_bUnderStockControl;
    }

    public void setIM_bUnderStockControl(Integer IM_bUnderStockControl) {
        this.IM_bUnderStockControl = IM_bUnderStockControl;
    }

    public Integer getIM_lSupplySource() {
        return IM_lSupplySource;
    }

    public void setIM_lSupplySource(Integer IM_lSupplySource) {
        this.IM_lSupplySource = IM_lSupplySource;
    }

    public String getIM_szArticleType() {
        return IM_szArticleType;
    }

    public void setIM_szArticleType(String IM_szArticleType) {
        this.IM_szArticleType = IM_szArticleType;
    }

    public String getIM_szPurchaseGroup() {
        return IM_szPurchaseGroup;
    }

    public void setIM_szPurchaseGroup(String IM_szPurchaseGroup) {
        this.IM_szPurchaseGroup = IM_szPurchaseGroup;
    }

    public Integer getIM_bGRWithoutPOAllowed() {
        return IM_bGRWithoutPOAllowed;
    }

    public void setIM_bGRWithoutPOAllowed(Integer IM_bGRWithoutPOAllowed) {
        this.IM_bGRWithoutPOAllowed = IM_bGRWithoutPOAllowed;
    }

    public Integer getIM_bConsignment() {
        return IM_bConsignment;
    }

    public void setIM_bConsignment(Integer IM_bConsignment) {
        this.IM_bConsignment = IM_bConsignment;
    }

    public Integer getIM_bWriteOffAllowed() {
        return IM_bWriteOffAllowed;
    }

    public void setIM_bWriteOffAllowed(Integer IM_bWriteOffAllowed) {
        this.IM_bWriteOffAllowed = IM_bWriteOffAllowed;
    }

    public String getIM_szOrderCycleCode() {
        return IM_szOrderCycleCode;
    }

    public void setIM_szOrderCycleCode(String IM_szOrderCycleCode) {
        this.IM_szOrderCycleCode = IM_szOrderCycleCode;
    }

    public String getIM_szIMPSA() {
        return IM_szIMPSA;
    }

    public void setIM_szIMPSA(String IM_szIMPSA) {
        this.IM_szIMPSA = IM_szIMPSA;
    }

    public String getIM_szABCIndicator() {
        return IM_szABCIndicator;
    }

    public void setIM_szABCIndicator(String IM_szABCIndicator) {
        this.IM_szABCIndicator = IM_szABCIndicator;
    }

    public Integer getIM_lDeliveryLeadTime() {
        return IM_lDeliveryLeadTime;
    }

    public void setIM_lDeliveryLeadTime(Integer IM_lDeliveryLeadTime) {
        this.IM_lDeliveryLeadTime = IM_lDeliveryLeadTime;
    }
}