package org.example.models;

public class Blog {
    private int bid;
    private String title;
    private String content;
    private String author;
    private String date_time;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public Blog(int bid, String title, String content, String author, String dateTime) {
        this.bid = bid;
        this.title = title;
        this.content = content;
        this.author = author;
        date_time = dateTime;
    }
}
