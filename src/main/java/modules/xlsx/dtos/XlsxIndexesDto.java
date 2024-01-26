package modules.xlsx.dtos;

public class XlsxIndexesDto {
    Integer tickerIndex;
    Integer priceIndex;
    Integer plIndex;
    Integer dyIndex;
    Integer pvpIndex;
    Integer evEbitdaIndex;
    Integer netMarginIndex;
    Integer roeIndex;
    Integer roaIndex;
    Integer roicIndex;
    Integer cagrIndex;
    Integer vpaIndex;
    Integer lpaIndex;

    public XlsxIndexesDto() {}

    public Integer getTickerIndex() {
        return tickerIndex;
    }

    public void setTickerIndex(Integer tickerIndex) {
        this.tickerIndex = tickerIndex;
    }

    public Integer getPriceIndex() {
        return priceIndex;
    }

    public void setPriceIndex(Integer priceIndex) {
        this.priceIndex = priceIndex;
    }

    public Integer getPlIndex() {
        return plIndex;
    }

    public void setPlIndex(Integer plIndex) {
        this.plIndex = plIndex;
    }

    public Integer getDyIndex() {
        return dyIndex;
    }

    public void setDyIndex(Integer dyIndex) {
        this.dyIndex = dyIndex;
    }

    public Integer getPvpIndex() {
        return pvpIndex;
    }

    public void setPvpIndex(Integer pvpIndex) {
        this.pvpIndex = pvpIndex;
    }

    public Integer getEvEbitdaIndex() {
        return evEbitdaIndex;
    }

    public void setEvEbitdaIndex(Integer evEbitdaIndex) {
        this.evEbitdaIndex = evEbitdaIndex;
    }

    public Integer getNetMarginIndex() {
        return netMarginIndex;
    }

    public void setNetMarginIndex(Integer netMarginIndex) {
        this.netMarginIndex = netMarginIndex;
    }

    public Integer getRoeIndex() {
        return roeIndex;
    }

    public void setRoeIndex(Integer roeIndex) {
        this.roeIndex = roeIndex;
    }

    public Integer getRoaIndex() {
        return roaIndex;
    }

    public void setRoaIndex(Integer roaIndex) {
        this.roaIndex = roaIndex;
    }

    public Integer getRoicIndex() {
        return roicIndex;
    }

    public void setRoicIndex(Integer roicIndex) {
        this.roicIndex = roicIndex;
    }

    public Integer getCagrIndex() {
        return cagrIndex;
    }

    public void setCagrIndex(Integer cagrIndex) {
        this.cagrIndex = cagrIndex;
    }

    public Integer getVpaIndex() {
        return vpaIndex;
    }

    public void setVpaIndex(Integer vpaIndex) {
        this.vpaIndex = vpaIndex;
    }

    public Integer getLpaIndex() {
        return lpaIndex;
    }

    public void setLpaIndex(Integer lpaIndex) {
        this.lpaIndex = lpaIndex;
    }

    @Override
    public String toString() {
        return "XlsxIndexesDto{" +
                "tickerIndex=" + tickerIndex +
                ", priceIndex=" + priceIndex +
                ", plIndex=" + plIndex +
                ", dyIndex=" + dyIndex +
                ", pvpIndex=" + pvpIndex +
                ", evEbitdaIndex=" + evEbitdaIndex +
                ", netMarginIndex=" + netMarginIndex +
                ", roeIndex=" + roeIndex +
                ", roaIndex=" + roaIndex +
                ", roicIndex=" + roicIndex +
                ", cagrIndex=" + cagrIndex +
                ", vpaIndex=" + vpaIndex +
                ", lpaIndex=" + lpaIndex +
                '}';
    }
}
