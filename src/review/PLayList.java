package review;

import java.util.ArrayList;
import java.util.Scanner;

public class PLayList {

    private static int maxSize = 5;
    private static ArrayList<String> songTitles = new ArrayList<String>();
    private static Scanner scanner = new Scanner(System.in);

    public PLayList(int maxSize){
        this.maxSize = maxSize;
        this.songTitles = new ArrayList<>();
    }

    public static void main(String[] args) {

        boolean isFinished = false;

        while (!isFinished) {
            System.out.println("***** Dessert PlayList *****");
            System.out.println("Please select your option: 1 - 6");
            System.out.println("1. Add a song" + "\n" + "2. Show Playlist Size" + "\n" + "3. Swap songs" + "\n" + "4. List all songs" + "\n" + "5. Remove songs" + "\n" + "6. Exit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter song name: ");
                    String songName = scanner.nextLine();
                    addPlayListSong(songName);
                    break;
                case "2":
                    System.out.println(playlistSize());
                    break;
                case "3":
                    swapSongs();
                    break;
                case "4":
                    loopThroughPlaylist();
                    break;
                case "5":
                    System.out.println("Enter song name: ");
                    String removeSong = scanner.nextLine();
                    removeSongs(removeSong);
                    break;
                case "6":
                    break;

            }

            if(choice.equalsIgnoreCase("6")){
                System.out.println("\n" + "Goodbye!");
                isFinished = true;
            }
        }
    }

    public static void addPlayListSong(String songName){
        if(songTitles.size() < maxSize){
            songTitles.add(songName);
        } else {
            System.out.println("Cannot add more than 5 titles in the PlayList.");
        }
    }

    public static String playlistSize(){
        return "The playlist current has: " + songTitles.size() + " songs.";
    }

    public static void removeSongs(String songName){
        for(int i = 0; i < songTitles.size(); i++){
            System.out.println("Song #" + (i + 1) + " " + songTitles.get(i) + "\n");
        }

        songTitles.remove(songName);
        System.out.println("Playlist songs: " + songTitles.toString() + "\n");
    }

    public static void swapSongs(){

        for(int i = 0; i < songTitles.size(); i++){
            System.out.println("Song #" + (i + 1) + " " + songTitles.get(i) + "\n");
        }

        System.out.println("Please enter song number to be replace: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        System.out.println("Please enter song name to replace with: ");
        String replacement = scanner.nextLine();

        if(index >= 0 && index < songTitles.size()){
            songTitles.set(index, replacement);
        } else {
            System.out.println("Invalid song number");
        }

        System.out.println("Playlist songs: " + songTitles.toString() + "\n");
    }

    public static void loopThroughPlaylist(){
        for(int i = 0; i < songTitles.size(); i++){
            System.out.println("Song #" + (i + 1) + " " + songTitles.get(i) + "\n");
        }
    }

}
