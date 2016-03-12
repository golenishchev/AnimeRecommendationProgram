package com.example.anime;

public class Recommendation {
    private String result;
    private int randomRecommendation;
    AnimeLibraryService myAnimeLibraryService = new AnimeLibraryService();

    public void askHowManyTitlesWatched() {
        System.out.println("How many anime titles have you watched?");
    }

    public int getRandomRecommendation() {
        randomRecommendation = (int) (Math.random() * myAnimeLibraryService.getAnimeLibrarySize());
        return randomRecommendation;
    }

    public String animeFun(int watchedTitles) {
        if (watchedTitles < 0) {
            result = "Impossibru!";
        } else if (watchedTitles == 0) {
            result = "You are in front of point of no return =)";
        } else if (watchedTitles > 0 && watchedTitles <= 10) {
            result = "Tutturu~! I have some good stuff for you.";
        } else if (watchedTitles > 300 && watchedTitles <= 1000) {
            result = "Maybe you haven't seen this one";
        } else if (watchedTitles >= 1000) {
            result = "Recommend me something XD";
        } else {
            result = "";
        }
        result += "\n--- Recommended anime ---";
        return result;
    }
}
