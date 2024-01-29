package modules.xlsx.services;

import core.entities.StockEntity;
import modules.xlsx.dtos.XlsxIndexesDto;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class XlsxService {
    public static ArrayList<StockEntity> readFile(String file) {
        try (XSSFWorkbook wb = new XSSFWorkbook(new File(file));) {
            var sheet = wb.getSheetAt(0);
            boolean isFirstRow = true;

            var indexes = new XlsxIndexesDto();
            var stocks = new ArrayList<StockEntity>();

            for (Row row : sheet) {
                var stock = new StockEntity();
                for (var index = 0; index < 13; index++) {
                    var cell = row.getCell(index);

                    if (isFirstRow) {
                        var value = String.format("%s", cell.getStringCellValue());
                        if (value.equals("TICKER")) {
                            indexes.setTickerIndex(index);
                        }
                        if (value.equals("PREÇO")) {
                            indexes.setPriceIndex(index);
                        }
                        if (value.equals("P/L")) {
                            indexes.setPlIndex(index);
                        }
                        if (value.equals("DY")) {
                            indexes.setDyIndex(index);
                        }
                        if (value.equals("P/VP")) {
                            indexes.setPvpIndex(index);
                        }
                        if (value.equals("EV/EBIT")) {
                            indexes.setEvEbitdaIndex(index);
                        }
                        if (value.equals("MARG. LÍQUIDA")) {
                            indexes.setNetMarginIndex(index);
                        }
                        if (value.equals("ROE")) {
                            indexes.setRoeIndex(index);
                        }
                        if (value.equals("ROA")) {
                            indexes.setRoaIndex(index);
                        }
                        if (value.equals("ROIC")) {
                            indexes.setRoicIndex(index);
                        }
                        if (value.equals("CAGR LUCROS 5 ANOS")) {
                            indexes.setCagrIndex(index);
                        }
                        if (value.equals("VPA")) {
                            indexes.setVpaIndex(index);
                        }
                        if (value.equals("LPA")) {
                            indexes.setLpaIndex(index);
                        }
                    } else {
                        if (indexes.getLpaIndex() == index) {
                            stock.setLpa(cell.getNumericCellValue());
                        }
                        if (indexes.getTickerIndex() == index) {
                            stock.setSymbol(cell.getStringCellValue());
                        }
                        if (indexes.getDyIndex() == index) {
                            stock.setDividendYeld(cell.getNumericCellValue());
                        }
                        if (indexes.getPlIndex() == index) {
                            stock.setPl(cell.getNumericCellValue());
                        }
                        if (indexes.getEvEbitdaIndex() == index) {
                            stock.setEvEbitda(cell.getNumericCellValue());
                        }
                        if (indexes.getPriceIndex() == index) {
                            stock.setPrice(cell.getNumericCellValue());
                        }
                        if (indexes.getRoaIndex() == index) {
                            stock.setRoa(cell.getNumericCellValue());
                        }
                        if (indexes.getPvpIndex() == index) {
                            stock.setPvp(cell.getNumericCellValue());
                        }
                        if (indexes.getVpaIndex() == index) {
                            stock.setVpa(cell.getNumericCellValue());
                        }
                        if (indexes.getPriceIndex() == index) {
                            stock.setPrice(cell.getNumericCellValue());
                        }
                    }
                }
                isFirstRow = false;
                stocks.add(stock);
            }
            return stocks;
        } catch (InvalidFormatException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
