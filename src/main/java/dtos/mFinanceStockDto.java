package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class mFinanceStockDto {
        @JsonProperty("change")
        Double change;
        @JsonProperty("closingPrice")
        Double closingPrice;
        @JsonProperty("dividendYield")
        Double dividendYield;
        @JsonProperty("eps")
        Double eps;
        @JsonProperty("high")
        Double high;
        @JsonProperty("lastPrice")
        Double lastPrice;
        @JsonProperty("lastYearHigh")
        Double lastYearHigh;
        @JsonProperty("lastYearLow")
        Double lastYearLow;
        @JsonProperty("low")
        Double low;
        @JsonProperty("marketCap")
        Double marketCap;
        @JsonProperty("name")
        String name;
        @JsonProperty("pe")
        Double pe;
        @JsonProperty("priceOpen")
        Double priceOpen;
        @JsonProperty("shares")
        Double shares;
        @JsonProperty("symbol")
        String symbol;
        @JsonProperty("volume")
        Double volume;
        @JsonProperty("volumeAvg")
        Double volumeAvg;
        @JsonProperty("sector")
        String sector;
        @JsonProperty("subSector")
        String subSector;
        @JsonProperty("segment")
        String segment;

        public Double getChange() {
                return change;
        }

        public void setChange(Double change) {
                this.change = change;
        }

        public Double getClosingPrice() {
                return closingPrice;
        }

        public void setClosingPrice(Double closingPrice) {
                this.closingPrice = closingPrice;
        }

        public Double getDividendYield() {
                return dividendYield;
        }

        public void setDividendYield(Double dividendYield) {
                this.dividendYield = dividendYield;
        }

        public Double getEps() {
                return eps;
        }

        public void setEps(Double eps) {
                this.eps = eps;
        }

        public Double getHigh() {
                return high;
        }

        public void setHigh(Double high) {
                this.high = high;
        }

        public Double getLastPrice() {
                return lastPrice;
        }

        public void setLastPrice(Double lastPrice) {
                this.lastPrice = lastPrice;
        }

        public Double getLastYearHigh() {
                return lastYearHigh;
        }

        public void setLastYearHigh(Double lastYearHigh) {
                this.lastYearHigh = lastYearHigh;
        }

        public Double getLastYearLow() {
                return lastYearLow;
        }

        public void setLastYearLow(Double lastYearLow) {
                this.lastYearLow = lastYearLow;
        }

        public Double getLow() {
                return low;
        }

        public void setLow(Double low) {
                this.low = low;
        }

        public Double getMarketCap() {
                return marketCap;
        }

        public void setMarketCap(Double marketCap) {
                this.marketCap = marketCap;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Double getPe() {
                return pe;
        }

        public void setPe(Double pe) {
                this.pe = pe;
        }

        public Double getPriceOpen() {
                return priceOpen;
        }

        public void setPriceOpen(Double priceOpen) {
                this.priceOpen = priceOpen;
        }

        public Double getShares() {
                return shares;
        }

        public void setShares(Double shares) {
                this.shares = shares;
        }

        public String getSymbol() {
                return symbol;
        }

        public void setSymbol(String symbol) {
                this.symbol = symbol;
        }

        public Double getVolume() {
                return volume;
        }

        public void setVolume(Double volume) {
                this.volume = volume;
        }

        public Double getVolumeAvg() {
                return volumeAvg;
        }

        public void setVolumeAvg(Double volumeAvg) {
                this.volumeAvg = volumeAvg;
        }

        public String getSector() {
                return sector;
        }

        public void setSector(String sector) {
                this.sector = sector;
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

        public static mFinanceStockDto fromJson(String json) {
                ObjectMapper mapper = new ObjectMapper();
                try {
                        mFinanceStockDto stock = mapper.readValue(json.getBytes(StandardCharsets.UTF_8), mFinanceStockDto.class);
                        return stock;
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }
}
