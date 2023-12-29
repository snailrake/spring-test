package org.example;

public class RapMusic implements Music {
    private RapMusic() {

    }

    public static RapMusic getRapMusic() {
        return new RapMusic();
    }

    @Override
    public String getSong() {
        return "Lose Yourself";
    }

    public void init() {
        System.out.println("Initialization...");
    }

    public void destroy() {
        System.out.println("Destroying...");
    }
}
