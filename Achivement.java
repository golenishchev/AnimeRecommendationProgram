package com.example.anime;

public class Achivement {
    private int titlesCount;
    WatchedTitlesCounter myWatchedTitlesCounter = new WatchedTitlesCounter();
    public int getTitlesCount() {
        return titlesCount;
    }
    public void setTitlesCount(int titlesCount) {
        this.titlesCount = myWatchedTitlesCounter.getWatchedTitlesCount();;
    }
    public void giveAchivement() {
        if (titlesCount == 1) {
            System.out.println("New Achivement: First step of Otaku");
        } else {

        }
    }
}
