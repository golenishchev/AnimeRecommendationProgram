package com.example.anime;

public class Achivement {

    public void giveAchivement(int titlesCount) {
        if (titlesCount == 1) {
            System.out.println("New Achivement: First step of Otaku");
        } else if (titlesCount >= 10 && titlesCount < 100) {
            System.out.println("New Achivement: Casual watcher");
        } else if (titlesCount >= 100 && titlesCount < 300) {
            System.out.println("New Achivement: Big eyes lover");
        } else if (titlesCount >= 300 && titlesCount < 1000) {
            System.out.println("New Achivement: Millionaire. You didn't pirated all this anime? =)");
        } else if (titlesCount >= 1000) {
            System.out.println("New Achivement: One more life");
        }
    }
}
