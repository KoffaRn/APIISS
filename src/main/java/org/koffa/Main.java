package org.koffa;

public class Main {
    public static void main(String[] args) {
        ISSApiHandler issApiHandler = new ISSApiHandler();
        try {
            System.out.println("Hämtar data från API: ");
            IssNow issNow = issApiHandler.getIssNow();
            System.out.println(issNow.toString());
        } catch (Exception e) {
            System.err.println("Något gick fel i hämtningen från API: " + e.getMessage());
        }
    }
}