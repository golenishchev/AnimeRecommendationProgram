package com.example.anime;

import java.util.Scanner;

public class KeyboardInputScanner {
    Recommendation myRecommendation = new Recommendation();
    WatchedTitlesCounter myWatchedTitlesCounter = new WatchedTitlesCounter();
    public void scanFromKeyboardInputTitlesCount() {
        Scanner dataInput = new Scanner(System.in);
        myWatchedTitlesCounter.setWatchedTitlesCount(dataInput.nextInt());
        switch (myWatchedTitlesCounter.getWatchedTitlesCount()) {
            case 1:
                myRecommendation.getRandomRecommendation();
                break;
            default:
                System.out.println("You have a typo, try again");
                break;
        }
    }
}
