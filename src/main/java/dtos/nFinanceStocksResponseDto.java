package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

public class nFinanceStocksResponseDto {
    @JsonProperty("stocks")
    List<mFinanceStockDto> stocks;

    public List<mFinanceStockDto> getStocks() {
        return stocks;
    }

    public void setStocks(List<mFinanceStockDto> stocks) {
        this.stocks = stocks;
    }

    public static nFinanceStocksResponseDto fromJson(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            nFinanceStocksResponseDto stock = mapper.readValue(json.getBytes(StandardCharsets.UTF_8), nFinanceStocksResponseDto.class);
            return stock;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
