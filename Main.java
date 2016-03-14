package com.example.anime;

public class Main {
    private static AnimeLibraryService myAnimeLibraryService;
    private static Recommendation myRecommendation;
    private static KeyboardInput myKeyboardInput;
    private static WatchedTitlesCounter myWatchedTitlesCounter;
    private static Achivement myAchivement;

    public static void main(String[] args) {
        myAnimeLibraryService = new AnimeLibraryService();
        myRecommendation = new Recommendation();
        myKeyboardInput = new KeyboardInput();
        myWatchedTitlesCounter = new WatchedTitlesCounter();
        myAchivement = new Achivement();
        myAnimeLibraryService.addToAnimeLibraryService();
        myRecommendation.askHowManyTitlesWatched();
        myKeyboardInput.scanTitlesCount(); // закрыть поток
        myAchivement.giveAchivement(myWatchedTitlesCounter.getWatchedTitlesCount()); // Outputs only in some cases
        System.out.println(myRecommendation.animeFun(myWatchedTitlesCounter.getWatchedTitlesCount())); // использовать промежуточную переменную, "много точек" это "не круто"
        int recomendAnime = myRecommendation.getRandomRecommendation();
        System.out.println(myAnimeLibraryService.getAnimeByIndex(recomendAnime).toString());
        System.out.println("For More Details Press \"M\"");
        myKeyboardInput.getMoreDetails();
    }
}
