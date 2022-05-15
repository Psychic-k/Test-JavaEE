package com.homestay.pojo;

public class notice {
    private String title;
    private String time;
    private String noticetxt;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNoticetxt() {
        return noticetxt;
    }

    public void setNoticetxt(String noticetxt) {
        this.noticetxt = noticetxt;
    }

    @Override
    public String toString() {
        return "notice{" +
                "title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", noticetxt='" + noticetxt + '\'' +
                '}';
    }
}
