package com.example.anime;

public class Main {

    public static void main(String[] args) {
        AnimeLibraryService myAnimeLibraryService = new AnimeLibraryService();
        Recommendation myRecommendation = new Recommendation();
        KeyboardInput myKeyboardInput = new KeyboardInput();
        WatchedTitlesCounter myWatchedTitlesCounter = new WatchedTitlesCounter();
        myAnimeLibraryService.addToAnimeLibraryService();
        Achivement myAchivement = new Achivement();
        myRecommendation.askHowManyTitlesWatched();
        myKeyboardInput.scanTitlesCount();
        myAchivement.giveAchivement(myWatchedTitlesCounter.getWatchedTitlesCount()); // Outputs only in some cases
        System.out.println(myRecommendation.animeFun(myWatchedTitlesCounter.getWatchedTitlesCount()));
        int recomendAnime = myRecommendation.getRandomRecommendation();
        System.out.println(myAnimeLibraryService.getAnimeByIndex(recomendAnime).toString());
        System.out.println("For More Details Press \"M\"");
        myKeyboardInput.getMoreDetails();
    }
}
