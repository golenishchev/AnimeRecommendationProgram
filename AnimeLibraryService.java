package com.example.anime;

import java.util.ArrayList;

public class AnimeLibraryService {
    private String animeTitle;
    private double score;
    private String type; //movie
    private int episodes;
    private String genres;
    private String rating; // age
    private int elementsInAnimeList;
    private static ArrayList<AnimeLibraryService> animeList;

    public AnimeLibraryService() {
    }

    public AnimeLibraryService(String animeTitle, double score, String type, int episodes, String genres, String rating) {
        this.animeTitle = animeTitle;
        this.score = score;
        this.type = type;
        this.episodes = episodes;
        this.genres = genres;
        this.rating = rating;
    }

    @Override
    public String toString() {
        String result = "Title: ";
        result += animeTitle + "\n";
        result += "Score: " + score + "\n";
        result += "Type: " + type + "\n";
        result += "Episodes: " + episodes + "\n";
        result += "Genres: " + genres + "\n";
        result += "Rating: " + rating + "\n";
        return result;
    }

    public void addToAnimeLibraryService() {
        animeList = new ArrayList<AnimeLibraryService>();
        animeList.add(new AnimeLibraryService("Eve no Jikan (Movie)", 8.33, "Movie", 1, "Sci-Fi, Slice of Life", "PG-13"));
        animeList.add(new AnimeLibraryService("Watashi ga Motenai no wa Dou Kangaetemo Omaera ga Warui!", 7.34, "TV", 12,
                "Comedy, School, Shounen, Slice of Life", "PG-13"));
        animeList.add(new AnimeLibraryService("Tokyo Godfathers", 8.34, "Movie", 1, "Comedy, Drama", "PG-13"));
        animeList.add(new AnimeLibraryService("Shokugeki no Souma", 8.67, "TV", 24, "Ecchi, School, Shounen", "PG-13"));
        animeList.add(new AnimeLibraryService("Sennen Joyuu", 8.35, "Movie", 1,
                "Action, Adventure, Drama, Fantasy, Historical, Romance", "PG-13"));
        animeList.add(new AnimeLibraryService("Perfect Blue", 8.18, "Movie", 1, "Dementia, Drama, Horror, Psychological",
                "R+"));
        animeList.add(new AnimeLibraryService("Overlord", 8.10, "TV", 13, "Action, Adventure, Fantasy, Game, Supernatural",
                "R - 17+"));
        animeList.add(new AnimeLibraryService("Shiki", 8.03, "TV", 22, "Mystery, Supernatural, Thriller, Vampire", "R - 17+"));
        animeList.add(new AnimeLibraryService("Lucky☆Star", 7.91, "TV", 24, "Comedy, Parody, School, Slice of Life",
                "PG-13"));
        animeList.add(new AnimeLibraryService("Kurau Phantom Memory", 7.49, "TV", 24,
                "Action, Drama, Sci-Fi, Space, Super Power", "PG-13"));
        animeList.add(new AnimeLibraryService("Kiseijuu: Sei no Kakuritsu", 8.63, "TV", 24,
                "Action, Drama, Horror, Psychological, Sci-Fi, Seinen", "R - 17+"));
        animeList.add(new AnimeLibraryService("Jormungand", 7.98, "TV", 12, "Action, Adventure, Seinen", "R+"));
        animeList.add(new AnimeLibraryService("Hyouka", 8.19, "TV", 22, "Mystery, School, Slice of Life", "PG-13"));
        animeList.add(new AnimeLibraryService("Hotaru no Haka", 8.59, "Movie", 1, " Drama, Historical", "PG-13"));
        animeList.add(new AnimeLibraryService("Hellsing Ultimate", 8.63, "OVA", 10,
                "Action, Horror, Military, Seinen, Supernatural, Vampire", " R - 17+"));
        animeList.add(new AnimeLibraryService("Gintama Movie: Kanketsu-hen - Yorozuya yo Eien Nare", 9.12, "Movie", 1,
                " Action, Comedy, Historical, Parody, Samurai, Sci-Fi, Shounen", "PG-13"));
        animeList.add(new AnimeLibraryService("Gankutsuou", 8.30, "TV", 24, "Drama, Mystery, Sci-Fi, Supernatural, Thriller",
                "R - 17+"));
        animeList.add(new AnimeLibraryService("Detroit Metal City", 8.30, "OVA", 12, "Comedy, Music", "R - 17+"));
        animeList.add(new AnimeLibraryService("Dennou Coil", 8.21, "TV", 26, "Adventure, Comedy, Drama, Mystery, Sci-Fi",
                "G - All Ages"));
        animeList.add(new AnimeLibraryService("Death Note", 8.75, "TV", 37,
                "Mystery, Police, Psychological, Supernatural, Thriller", " R - 17+"));
        animeList.add(new AnimeLibraryService("B Gata H Kei", 7.23, "TV", 12, "Comedy, Ecchi, Romance, School, Seinen", "R+"));
        animeList.add(new AnimeLibraryService("Code Geass: Hangyaku no Lelouch", 8.85, "TV", 25,
                "Action, Mecha, Military, School, Sci-Fi, Super Power", "R - 17+"));
        animeList.add(new AnimeLibraryService("Azumanga Daioh", 8.09, "TV", 26, "Comedy, School, Slice of Life", "PG-13"));
    }

    public int getAnimeLibrarySize() {
        return animeList.size();
    }
   /* public void setAnimeList(ArrayList<AnimeLibraryService> animeList) {
        this.animeList = animeList;
    }*/
   public AnimeLibraryService getAnimeByIndex(int index) {
       return animeList.get(index);
   }
    // В мэйне System.out.println(library.getAnimeByIndex(recomendAnime).toString());
}
