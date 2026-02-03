package com.streamapi.insuranceclaimanalysis;
import java.util.*;
import java.util.stream.*;

public class ClaimMain {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 2000),
            new Claim("Vehicle", 5000),
            new Claim("Health", 3000),
            new Claim("Vehicle", 7000),
            new Claim("Home", 10000)
        );

        Map<String, Double> avgClaims = claims.stream()
            .collect(Collectors.groupingBy(
                Claim::getClaimType,
                Collectors.averagingDouble(Claim::getAmount)
            ));

        avgClaims.forEach((type, avg) ->
            System.out.println(type + " Avg Claim: " + avg));
    }
}
