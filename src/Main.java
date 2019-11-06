

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i< 3;i++){
            System.out.print(" ");
            System.out.println("Enter the name of the artist: ");
            String artist = key.next();
            System.out.println(" ");
            System.out.println("Enter the name of the title: ");
            String title = key.next(); //modify program to prompt user for a title
            Song s = new Song();
            System.out.println(" ");
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song song: songs){
            System.out.println(song.display());
        }

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song song:songs){
            if (song.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",song.display());
            }
        }
    }
}