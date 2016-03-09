package com.example.anime;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  //  private ArrayList<AnimeLibraryService> animeList;

    public static void main(String[] args) {
        AnimeLibraryService myAnimeLibraryService = new AnimeLibraryService();
        Recommendation myRecommendation = new Recommendation();
        KeyboardInputScanner myKeyboardInputScanner = new KeyboardInputScanner();
        myAnimeLibraryService.addToAnimeLibraryService();
        Achivement myAchivement = new Achivement();
        myRecommendation.askHowManyTitlesWatched();
        Scanner dataInput = new Scanner(System.in);
        myKeyboardInputScanner.scanFromKeyboardInputTitlesCount();
        System.out.println("--- Recommended anime ---");
        myAchivement.giveAchivement(); // Outputs only in some cases
        int recomendAnime = myRecommendation.getRandomRecommendation();
        System.out.println(myAnimeLibraryService.getAnimeByIndex(recomendAnime).toString());
        System.out.println("For More Details Press \"M\"");
    } // END main
}
