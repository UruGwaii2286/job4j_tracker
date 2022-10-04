package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Let run clumsily");
        } else if (position == 2) {
            System.out.println("Goodnight");
        } else {
            System.out.println("Song not found");
        }
    }

    public static void main(String[] args) {
        Jukebox seeburg = new Jukebox();
        seeburg.music(1);
        seeburg.music(2);
        seeburg.music(3);
    }
}
