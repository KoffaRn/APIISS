package org.koffa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ISSApiHandler {
    public IssNow getIssNow() {
        Gson gson = new GsonBuilder().create();
        try {
            // Return json as IssNow-object
            return gson.fromJson(getJson(getUrl()), IssNow.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private URL getUrl() {
        try {
            return new URL("https://api.wheretheiss.at/v1/satellites/25544");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    private  String getJson(URL url) {
        if(url == null) throw new RuntimeException("URL can't be null.");
        StringBuilder strResp = new StringBuilder();
        try {
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {
                strResp.append(sc.nextLine());
            }
            sc.close();
            return String.valueOf(strResp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
