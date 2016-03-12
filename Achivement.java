package com.example.anime;

public class Achivement {
    private String achivementText;
    WatchedTitlesCounter myWatchedTitlesCounter = new WatchedTitlesCounter();

    public void giveAchivement(int titlesCount) {
        if (titlesCount == 1) {
            System.out.println("New Achivement: First step of Otaku");
        } else if (titlesCount >= 10) {
            System.out.println("New Achivement: Casual wather");
        } else if (titlesCount >= 100) {
            System.out.println("New Achivement: Big eyes lover");
        } else if (titlesCount >= 300) {
            System.out.println("New Achivement: Millionaire. You didn't pirated all this anime? =)");
        } else if (titlesCount >= 1000) {

        } else {

        }
    }
}
