package org.koffa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ISSApiHandler {
    public IssNow getIssNow() {
        return getIssNow(
                getJson(
                        getUrl()
                ));
    }
    private URL getUrl() {
        try {
            return new URL("https://api.wheretheiss.at/v1/satellites/25544");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    private  String getJson(URL url) {
        StringBuilder strResp = new StringBuilder();
        try {
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {
                strResp.append(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return String.valueOf(strResp);
    }
    private static IssNow getIssNow(String json) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(json, IssNow.class);
    }
}
