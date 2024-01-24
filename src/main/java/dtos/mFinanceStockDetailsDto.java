package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class mFinanceStockDetailsDto {
    @JsonProperty("dividendYield")
    Double dividendYield;
    @JsonProperty("symbol")
    String symbol;
    @JsonProperty("type")
    String type;
    @JsonProperty("subSector")
    String subSector;
    @JsonProperty("segment")
    String segment;
    @JsonProperty("assetTurnoverRatio")
    mFinanceFieldDetailDto assetTurnoverRatio;
    @JsonProperty("bookValuePerShare")
    mFinanceFieldDetailDto bookValuePerShare;
    @JsonProperty()
    mFinanceFieldDetailDto cagrProfitsFiveYears;
    @JsonProperty()
    mFinanceFieldDetailDto cagrRecipesFiveYears;
    @JsonProperty()
    mFinanceFieldDetailDto currentLiquidity;
    @JsonProperty()
    mFinanceFieldDetailDto earningsPerShare;
    @JsonProperty()
    mFinanceFieldDetailDto ebitdaMargin;
    @JsonProperty()
    mFinanceFieldDetailDto ebitMargin;
    @JsonProperty()
    mFinanceFieldDetailDto enterpriseValueEbit;
    @JsonProperty()
    mFinanceFieldDetailDto enterpriseValueEbitda;
    @JsonProperty()
    mFinanceFieldDetailDto equityToAssetsRatio;
    @JsonProperty()
    mFinanceFieldDetailDto grossMargin;
    @JsonProperty()
    mFinanceFieldDetailDto liabilitiesToAssetsRatio;
    @JsonProperty()
    mFinanceFieldDetailDto netDebtToAssets;
    @JsonProperty()
    mFinanceFieldDetailDto netDebtToEbit;
    @JsonProperty()
    mFinanceFieldDetailDto netDebtToEbitda;
    @JsonProperty()
    mFinanceFieldDetailDto netMargin;
    @JsonProperty()
    mFinanceFieldDetailDto priceEarningsRatio;
    @JsonProperty()
    mFinanceFieldDetailDto priceToAssets;
    @JsonProperty()
    mFinanceFieldDetailDto priceToBookValue;
    @JsonProperty()
    mFinanceFieldDetailDto priceToEbit;
    @JsonProperty()
    mFinanceFieldDetailDto priceToEbitda;
    @JsonProperty()
    mFinanceFieldDetailDto priceToNetCurrentAssets;
    @JsonProperty()
    mFinanceFieldDetailDto priceToNetNetWorkingCapital;
    @JsonProperty()
    mFinanceFieldDetailDto priceToSalesRatio;
    @JsonProperty()
    mFinanceFieldDetailDto returnOnAssets;
    @JsonProperty()
    mFinanceFieldDetailDto returnOnEquity;
    @JsonProperty()
    mFinanceFieldDetailDto returnOnInvestedCapital;
    public mFinanceStockDetailsDto () {}

    public Double getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(Double dividendYield) {
        this.dividendYield = dividendYield;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubSector() {
        return subSector;
    }

    public void setSubSector(String subSector) {
        this.subSector = subSector;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public mFinanceFieldDetailDto getAssetTurnoverRatio() {
        return assetTurnoverRatio;
    }

    public void setAssetTurnoverRatio(mFinanceFieldDetailDto assetTurnoverRatio) {
        this.assetTurnoverRatio = assetTurnoverRatio;
    }

    public mFinanceFieldDetailDto getBookValuePerShare() {
        return bookValuePerShare;
    }

    public void setBookValuePerShare(mFinanceFieldDetailDto bookValuePerShare) {
        this.bookValuePerShare = bookValuePerShare;
    }

    public mFinanceFieldDetailDto getCagrProfitsFiveYears() {
        return cagrProfitsFiveYears;
    }

    public void setCagrProfitsFiveYears(mFinanceFieldDetailDto cagrProfitsFiveYears) {
        this.cagrProfitsFiveYears = cagrProfitsFiveYears;
    }

    public mFinanceFieldDetailDto getCagrRecipesFiveYears() {
        return cagrRecipesFiveYears;
    }

    public void setCagrRecipesFiveYears(mFinanceFieldDetailDto cagrRecipesFiveYears) {
        this.cagrRecipesFiveYears = cagrRecipesFiveYears;
    }

    public mFinanceFieldDetailDto getCurrentLiquidity() {
        return currentLiquidity;
    }

    public void setCurrentLiquidity(mFinanceFieldDetailDto currentLiquidity) {
        this.currentLiquidity = currentLiquidity;
    }

    public mFinanceFieldDetailDto getEarningsPerShare() {
        return earningsPerShare;
    }

    public void setEarningsPerShare(mFinanceFieldDetailDto earningsPerShare) {
        this.earningsPerShare = earningsPerShare;
    }

    public mFinanceFieldDetailDto getEbitdaMargin() {
        return ebitdaMargin;
    }

    public void setEbitdaMargin(mFinanceFieldDetailDto ebitdaMargin) {
        this.ebitdaMargin = ebitdaMargin;
    }

    public mFinanceFieldDetailDto getEbitMargin() {
        return ebitMargin;
    }

    public void setEbitMargin(mFinanceFieldDetailDto ebitMargin) {
        this.ebitMargin = ebitMargin;
    }

    public mFinanceFieldDetailDto getEnterpriseValueEbit() {
        return enterpriseValueEbit;
    }

    public void setEnterpriseValueEbit(mFinanceFieldDetailDto enterpriseValueEbit) {
        this.enterpriseValueEbit = enterpriseValueEbit;
    }

    public mFinanceFieldDetailDto getEnterpriseValueEbitda() {
        return enterpriseValueEbitda;
    }

    public void setEnterpriseValueEbitda(mFinanceFieldDetailDto enterpriseValueEbitda) {
        this.enterpriseValueEbitda = enterpriseValueEbitda;
    }

    public mFinanceFieldDetailDto getEquityToAssetsRatio() {
        return equityToAssetsRatio;
    }

    public void setEquityToAssetsRatio(mFinanceFieldDetailDto equityToAssetsRatio) {
        this.equityToAssetsRatio = equityToAssetsRatio;
    }

    public mFinanceFieldDetailDto getGrossMargin() {
        return grossMargin;
    }

    public void setGrossMargin(mFinanceFieldDetailDto grossMargin) {
        this.grossMargin = grossMargin;
    }

    public mFinanceFieldDetailDto getLiabilitiesToAssetsRatio() {
        return liabilitiesToAssetsRatio;
    }

    public void setLiabilitiesToAssetsRatio(mFinanceFieldDetailDto liabilitiesToAssetsRatio) {
        this.liabilitiesToAssetsRatio = liabilitiesToAssetsRatio;
    }

    public mFinanceFieldDetailDto getNetDebtToAssets() {
        return netDebtToAssets;
    }

    public void setNetDebtToAssets(mFinanceFieldDetailDto netDebtToAssets) {
        this.netDebtToAssets = netDebtToAssets;
    }

    public mFinanceFieldDetailDto getNetDebtToEbit() {
        return netDebtToEbit;
    }

    public void setNetDebtToEbit(mFinanceFieldDetailDto netDebtToEbit) {
        this.netDebtToEbit = netDebtToEbit;
    }

    public mFinanceFieldDetailDto getNetDebtToEbitda() {
        return netDebtToEbitda;
    }

    public void setNetDebtToEbitda(mFinanceFieldDetailDto netDebtToEbitda) {
        this.netDebtToEbitda = netDebtToEbitda;
    }

    public mFinanceFieldDetailDto getNetMargin() {
        return netMargin;
    }

    public void setNetMargin(mFinanceFieldDetailDto netMargin) {
        this.netMargin = netMargin;
    }

    public mFinanceFieldDetailDto getPriceEarningsRatio() {
        return priceEarningsRatio;
    }

    public void setPriceEarningsRatio(mFinanceFieldDetailDto priceEarningsRatio) {
        this.priceEarningsRatio = priceEarningsRatio;
    }

    public mFinanceFieldDetailDto getPriceToAssets() {
        return priceToAssets;
    }

    public void setPriceToAssets(mFinanceFieldDetailDto priceToAssets) {
        this.priceToAssets = priceToAssets;
    }

    public mFinanceFieldDetailDto getPriceToBookValue() {
        return priceToBookValue;
    }

    public void setPriceToBookValue(mFinanceFieldDetailDto priceToBookValue) {
        this.priceToBookValue = priceToBookValue;
    }

    public mFinanceFieldDetailDto getPriceToEbit() {
        return priceToEbit;
    }

    public void setPriceToEbit(mFinanceFieldDetailDto priceToEbit) {
        this.priceToEbit = priceToEbit;
    }

    public mFinanceFieldDetailDto getPriceToEbitda() {
        return priceToEbitda;
    }

    public void setPriceToEbitda(mFinanceFieldDetailDto priceToEbitda) {
        this.priceToEbitda = priceToEbitda;
    }

    public mFinanceFieldDetailDto getPriceToNetCurrentAssets() {
        return priceToNetCurrentAssets;
    }

    public void setPriceToNetCurrentAssets(mFinanceFieldDetailDto priceToNetCurrentAssets) {
        this.priceToNetCurrentAssets = priceToNetCurrentAssets;
    }

    public mFinanceFieldDetailDto getPriceToNetNetWorkingCapital() {
        return priceToNetNetWorkingCapital;
    }

    public void setPriceToNetNetWorkingCapital(mFinanceFieldDetailDto priceToNetNetWorkingCapital) {
        this.priceToNetNetWorkingCapital = priceToNetNetWorkingCapital;
    }

    public mFinanceFieldDetailDto getPriceToSalesRatio() {
        return priceToSalesRatio;
    }

    public void setPriceToSalesRatio(mFinanceFieldDetailDto priceToSalesRatio) {
        this.priceToSalesRatio = priceToSalesRatio;
    }

    public mFinanceFieldDetailDto getReturnOnAssets() {
        return returnOnAssets;
    }

    public void setReturnOnAssets(mFinanceFieldDetailDto returnOnAssets) {
        this.returnOnAssets = returnOnAssets;
    }

    public mFinanceFieldDetailDto getReturnOnEquity() {
        return returnOnEquity;
    }

    public void setReturnOnEquity(mFinanceFieldDetailDto returnOnEquity) {
        this.returnOnEquity = returnOnEquity;
    }

    public mFinanceFieldDetailDto getReturnOnInvestedCapital() {
        return returnOnInvestedCapital;
    }

    public void setReturnOnInvestedCapital(mFinanceFieldDetailDto returnOnInvestedCapital) {
        this.returnOnInvestedCapital = returnOnInvestedCapital;
    }
}
