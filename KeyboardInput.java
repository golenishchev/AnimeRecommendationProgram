package com.example.anime;

import java.util.Scanner;

public class KeyboardInput {
    private WatchedTitlesCounter myWatchedTitlesCounter;
    private Scanner dataInput;

    public void scanTitlesCount() {
        myWatchedTitlesCounter = new WatchedTitlesCounter();
        dataInput = new Scanner(System.in); // закрыть поток
        myWatchedTitlesCounter.setWatchedTitlesCount(dataInput.nextInt());
    }

    public void getMoreDetails() {
        System.out.println("functionality is not implemented");
    }
}
