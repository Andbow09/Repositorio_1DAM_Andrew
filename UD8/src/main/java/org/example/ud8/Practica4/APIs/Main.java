package org.example.ud8.Practica4.APIs;

import com.google.gson.Gson;
import org.checkerframework.checker.units.qual.C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        String apiUrl = "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin,ethereum&vs_currencies=usd,eur";

        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder json = new StringBuilder();
        String line;

        while ((line = in.readLine()) != null) {
            json.append(line);
        }

        in.close();

        Gson gson = new Gson();
        Crypto root = gson.fromJson(json.toString(), Crypto.class);

        System.out.println("Bitcoin en €: " + root.bitcoin.eur);
        System.out.println("Ethereum en €: " + root.ethereum.eur);
    }
}