package org.edi.stocktask.bo.stocktask;

import java.math.BigDecimal;

/**
 * @author Fancy
 * @date 2018/5/27
 */
public class StockTaskItem implements IStockTaskItem{

    private Integer objectKey;//yes
    private String objectCode;
    private Integer lineId;//yes
    private String reference1;//yes
    private String reference2;//yes
    private String documentType;//yes
    private Integer documentEntry;//yes
    private Integer documentLineId;//yes
    private String itemCode;//yes
    private String itemDescription;//yes
    private BigDecimal packageQuantity;
    private BigDecimal quantity;//yes
    private String inventoryUoM;//yes
    private String serialNumberManagement;//yes
    private String batchNumberManagement;//yes
    private String serviceNumberManagement;
    private BigDecimal price;//yes
    private String currency;//yes
    private BigDecimal currencyRate;//yes
    private BigDecimal lineTotal;//yes
    private String fromWarehose;//yes
    private String fromLocation;//yes
    private String toWarehouse;//yes
    private String toLocation;//yes
    private String transactionType;//yes
    private String baseDocumentType;//yes
    private Integer baseDocumentEntry;//yes
    private Integer baseDocumentLineId;//yes
    private String originalDocumentType;//yes
    private Integer originalDocumentEntry;//yes
    private Integer originalDocumentLineId;//yes
    private String scanningType;//yes
    private String waterCode;

    @Override
    public Integer getObjectKey() {
        return objectKey;
    }

    @Override
    public void setObjectKey(Integer objectKey) {
        this.objectKey = objectKey;
    }

    @Override
    public String getObjectCode() {
        return objectCode;
    }

    @Override
    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    @Override
    public Integer getLineId() {
        return lineId;
    }

    @Override
    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    @Override
    public String getReference1() {
        return reference1;
    }

    @Override
    public void setReference1(String reference1) {
        this.reference1 = reference1;
    }

    @Override
    public String getReference2() {
        return reference2;
    }

    @Override
    public void setReference2(String reference2) {
        this.reference2 = reference2;
    }

    @Override
    public String getDocumentType() {
        return documentType;
    }

    @Override
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Override
    public Integer getDocumentEntry() {
        return documentEntry;
    }

    @Override
    public void setDocumentEntry(Integer documentEntry) {
        this.documentEntry = documentEntry;
    }

    @Override
    public Integer getDocumentLineId() {
        return documentLineId;
    }

    @Override
    public void setDocumentLineId(Integer documentLineId) {
        this.documentLineId = documentLineId;
    }

    @Override
    public String getItemCode() {
        return itemCode;
    }

    @Override
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public String getItemDescription() {
        return itemDescription;
    }

    @Override
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Override
    public BigDecimal getPackageQuantity() {
        return packageQuantity;
    }

    @Override
    public void setPackageQuantity(BigDecimal packageQuantity) {
        this.packageQuantity = packageQuantity;
    }

    @Override
    public BigDecimal getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    @Override
    public String getInventoryUoM() {
        return inventoryUoM;
    }

    @Override
    public void setInventoryUoM(String inventoryUoM) {
        this.inventoryUoM = inventoryUoM;
    }

    @Override
    public String getSerialNumberManagement() {
        return serialNumberManagement;
    }

    @Override
    public void setSerialNumberManagement(String serialNumberManagement) {
        this.serialNumberManagement = serialNumberManagement;
    }

    @Override
    public String getBatchNumberManagement() {
        return batchNumberManagement;
    }

    @Override
    public void setBatchNumberManagement(String batchNumberManagement) {
        this.batchNumberManagement = batchNumberManagement;
    }

    @Override
    public String getServiceNumberManagement() {
        return serviceNumberManagement;
    }

    @Override
    public void setServiceNumberManagement(String serviceNumberManagement) {
        this.serviceNumberManagement = serviceNumberManagement;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    @Override
    public void setCurrencyRate(BigDecimal currencyRate) {
        this.currencyRate = currencyRate;
    }

    @Override
    public BigDecimal getLineTotal() {
        return lineTotal;
    }

    @Override
    public void setLineTotal(BigDecimal lineTotal) {
        this.lineTotal = lineTotal;
    }

    @Override
    public String getFromWarehose() {
        return fromWarehose;
    }

    @Override
    public void setFromWarehose(String fromWarehose) {
        this.fromWarehose = fromWarehose;
    }

    @Override
    public String getFromLocation() {
        return fromLocation;
    }

    @Override
    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    @Override
    public String getToWarehouse() {
        return toWarehouse;
    }

    @Override
    public void setToWarehouse(String toWarehouse) {
        this.toWarehouse = toWarehouse;
    }

    @Override
    public String getToLocation() {
        return toLocation;
    }

    @Override
    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    @Override
    public String getTransactionType() {
        return transactionType;
    }

    @Override
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String getBaseDocumentType() {
        return baseDocumentType;
    }

    @Override
    public void setBaseDocumentType(String baseDocumentType) {
        this.baseDocumentType = baseDocumentType;
    }

    @Override
    public Integer getBaseDocumentEntry() {
        return baseDocumentEntry;
    }

    @Override
    public void setBaseDocumentEntry(Integer baseDocumentEntry) {
        this.baseDocumentEntry = baseDocumentEntry;
    }

    @Override
    public Integer getBaseDocumentLineId() {
        return baseDocumentLineId;
    }

    @Override
    public void setBaseDocumentLineId(Integer baseDocumentLineId) {
        this.baseDocumentLineId = baseDocumentLineId;
    }

    @Override
    public String getOriginalDocumentType() {
        return originalDocumentType;
    }

    @Override
    public void setOriginalDocumentType(String originalDocumentType) {
        this.originalDocumentType = originalDocumentType;
    }

    @Override
    public Integer getOriginalDocumentEntry() {
        return originalDocumentEntry;
    }

    @Override
    public void setOriginalDocumentEntry(Integer originalDocumentEntry) {
        this.originalDocumentEntry = originalDocumentEntry;
    }

    @Override
    public Integer getOriginalDocumentLineId() {
        return originalDocumentLineId;
    }

    @Override
    public void setOriginalDocumentLineId(Integer originalDocumentLineId) {
        this.originalDocumentLineId = originalDocumentLineId;
    }

    @Override
    public String getScanningType() {
        return scanningType;
    }

    @Override
    public void setScanningType(String scanningType) {
        this.scanningType = scanningType;
    }

    @Override
    public String getWaterCode() {
        return waterCode;
    }

    @Override
    public void setWaterCode(String waterCode) {
        this.waterCode = waterCode;
    }


    public StockTaskItem() {
    }

    public StockTaskItem(Integer objectKey, String objectCode, Integer lineId, String reference1, String reference2, String documentType, Integer documentEntry, Integer documentLineId, String itemCode, String itemDescription, BigDecimal packageQuantity, BigDecimal quantity, String inventoryUoM, String serialNumberManagement, String batchNumberManagement, String serviceNumberManagement, BigDecimal price, String currency, BigDecimal currencyRate, BigDecimal lineTotal, String fromWarehose, String fromLocation, String toWarehouse, String toLocation, String transactionType, String baseDocumentType, Integer baseDocumentEntry, Integer baseDocumentLineId, String originalDocumentType, Integer originalDocumentEntry, Integer originalDocumentLineId, String scanningType, String waterCode) {
        this.objectKey = objectKey;
        this.objectCode = objectCode;
        this.lineId = lineId;
        this.reference1 = reference1;
        this.reference2 = reference2;
        this.documentType = documentType;
        this.documentEntry = documentEntry;
        this.documentLineId = documentLineId;
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.packageQuantity = packageQuantity;
        this.quantity = quantity;
        this.inventoryUoM = inventoryUoM;
        this.serialNumberManagement = serialNumberManagement;
        this.batchNumberManagement = batchNumberManagement;
        this.serviceNumberManagement = serviceNumberManagement;
        this.price = price;
        this.currency = currency;
        this.currencyRate = currencyRate;
        this.lineTotal = lineTotal;
        this.fromWarehose = fromWarehose;
        this.fromLocation = fromLocation;
        this.toWarehouse = toWarehouse;
        this.toLocation = toLocation;
        this.transactionType = transactionType;
        this.baseDocumentType = baseDocumentType;
        this.baseDocumentEntry = baseDocumentEntry;
        this.baseDocumentLineId = baseDocumentLineId;
        this.originalDocumentType = originalDocumentType;
        this.originalDocumentEntry = originalDocumentEntry;
        this.originalDocumentLineId = originalDocumentLineId;
        this.scanningType = scanningType;
        this.waterCode = waterCode;
    }



}