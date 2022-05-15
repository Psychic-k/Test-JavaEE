package com.homestay.pojo;

public class house {
    private String houseid;
    private String housename;
    private String housetype;
    private String housestatue;
    private String houseprice;

    public String getHouseid() {
        return houseid;
    }

    public void setHouseid(String houseid) {
        this.houseid = houseid;
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }

    public String getHousestatue() {
        return housestatue;
    }

    public void setHousestatue(String housestatue) {
        this.housestatue = housestatue;
    }

    public String getHouseprice() {
        return houseprice;
    }

    public void setHouseprice(String houseprice) {
        this.houseprice = houseprice;
    }

    @Override
    public String toString() {
        return "house{" +
                "houseid='" + houseid + '\'' +
                ", housename='" + housename + '\'' +
                ", housetype='" + housetype + '\'' +
                ", housestatue='" + housestatue + '\'' +
                ", houseprice=" + houseprice +
                '}';
    }
}
