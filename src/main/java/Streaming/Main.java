package Streaming;

public class Main {
    public static void main(String[] args) {

        Video breakingBad = new TvSeries("Breaking Bad", 50, 62);
        Video inception = new Movie("Inception", 148, 8.8);

        System.out.println(breakingBad.getInfo());
        System.out.println(inception.getInfo());
    }
}

