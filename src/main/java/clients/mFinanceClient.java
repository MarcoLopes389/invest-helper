package clients;

import dtos.mFinanceStockDto;
import dtos.nFinanceStocksResponseDto;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class mFinanceClient {
    private HttpClient httpClient;
    public mFinanceClient () {
        this.httpClient = HttpClient.newHttpClient();
    }

    public nFinanceStocksResponseDto findAllStocks() {
        HttpRequest request = HttpRequest.newBuilder(URI.create("https://mfinance.com.br/api/v1/stocks")).build();
        try {
            HttpResponse<String> response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            var result = nFinanceStocksResponseDto.fromJson(response.body());

            return result;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public mFinanceStockDto findOne(String symbol) {
        HttpRequest request = HttpRequest.newBuilder(URI.create(String.format("https://mfinance.com.br/api/v1/stocks/%s", symbol))).build();
        try {
            HttpResponse<String> response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            var result = mFinanceStockDto.fromJson(response.body());

            return result;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
