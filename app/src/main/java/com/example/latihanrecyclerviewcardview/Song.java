package com.example.latihanrecyclerviewcardview;

public class Song {
    private String name;

    private String singer;
    private String year;
    private int pic, rank;

    public Song(String name, String singer, int rank, int pic){
        this.name = name;
        this.rank = rank;
        this.singer = singer;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
