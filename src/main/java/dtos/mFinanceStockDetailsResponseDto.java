package dtos;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class mFinanceStockDetailsResponseDto {
    List<mFinanceStockDetailsDto> indicators;

    public List<mFinanceStockDetailsDto> getIndicators() {
        return indicators;
    }

    public void setIndicators(List<mFinanceStockDetailsDto> indicators) {
        this.indicators = indicators;
    }

    public static mFinanceStockDetailsResponseDto fromJson(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mFinanceStockDetailsResponseDto stock = mapper.readValue(json.getBytes(StandardCharsets.UTF_8), mFinanceStockDetailsResponseDto.class);
            return stock;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
