package com.homestay.pojo;

public class message {
    private String messageid;
    private String houseid;
    private String messagetime;
    private String txt;
    private String solvestatue;

    public  message(){

    }

    public message(String messageid,String houseid,String messagetime,String txt,String solvestatue){
        this.messageid = messageid;
        this.houseid = houseid;
        this.messagetime = messagetime;
        this.txt = txt;
        this.solvestatue = solvestatue;


    }
    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid;
    }

    public String getHouseid() {
        return houseid;
    }

    public void setHouseid(String houseid) {
        this.houseid = houseid;
    }

    public String getMessagetime() {
        return messagetime;
    }

    public void setMessagetime(String messagetime) {
        this.messagetime = messagetime;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getSolvestatue() {
        return solvestatue;
    }

    public void setSolvestatue(String solvestatue) {
        this.solvestatue = solvestatue;
    }

    @Override
    public String toString() {
        return "message{" +
                "messageid='" + messageid + '\'' +
                ", houseid='" + houseid + '\'' +
                ", messagetime='" + messagetime + '\'' +
                ", txt='" + txt + '\'' +
                ", solvestatue='" + solvestatue + '\'' +
                '}';
    }
}
