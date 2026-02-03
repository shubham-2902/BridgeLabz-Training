package com.streamapi.stockpricelogger;
import java.util.*;

public class StockMain {
    public static void main(String[] args) {
        List<Stock> liveStocks = Arrays.asList(
            new Stock("MRF", 189.5),
            new Stock("PW", 2750.0),
            new Stock("SMT", 720.3)
        );

        liveStocks.forEach(stock -> System.out.println("Live Update -> " + stock));
    }
}
