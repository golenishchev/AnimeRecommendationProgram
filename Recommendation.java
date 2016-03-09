package com.example.anime;

public class Recommendation {
    private int randomRecommendation;
    AnimeLibraryService myAnimeLibraryService = new AnimeLibraryService();

    public void askHowManyTitlesWatched() {
        System.out.println("How many anime titles have you watched?");
    }

    public int getRandomRecommendation() {
        randomRecommendation = (int) (Math.random() * myAnimeLibraryService.getAnimeLibrarySize());
        return randomRecommendation;
    }

    public void setRandomRecommendation(int randomRecommendation) {
        this.randomRecommendation = randomRecommendation;
    }
}
