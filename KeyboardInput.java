package com.example.anime;

import java.util.Scanner;

public class KeyboardInput {
    WatchedTitlesCounter myWatchedTitlesCounter = new WatchedTitlesCounter();

    public void scanTitlesCount() {
        Scanner dataInput = new Scanner(System.in);
        myWatchedTitlesCounter.setWatchedTitlesCount(dataInput.nextInt());
    }

    public void getMoreDetails() {
        System.out.println("functionality is not implemented");
    }
}
