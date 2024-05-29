package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {

    static class Song {

        String typeList;
        String name;
        String time;

        public Song (String typeList, String name, String time) {

            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return this.name;
        }

        public String getTypeList() {
            return this.typeList;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();
            String[] songsArr = input.split("_");

            String listName = songsArr[0];
            String songName = songsArr[1];
            String time = songsArr[2];

            Song current = new Song(listName, songName, time);

            songs.add(current);
        }
        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                String list = song.getTypeList();
                if (command.equals(list)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
