package com.homestay.pojo;

public class repair {
    private String repairid;
    private String houseid;
    private String requesttime;
    private String repairewhy;
    private String repairestatue;

    public String getRepairid() {
        return repairid;
    }

    public void setRepairid(String repairid) {
        this.repairid = repairid;
    }

    public String getHouseid() {
        return houseid;
    }

    public void setHouseid(String houseid) {
        this.houseid = houseid;
    }

    public String getRequesttime() {
        return requesttime;
    }

    public void setRequesttime(String requesttime) {
        this.requesttime = requesttime;
    }

    public String getRepairewhy() {
        return repairewhy;
    }

    public void setRepairewhy(String repairewhy) {
        this.repairewhy = repairewhy;
    }

    public String getRepairestatue() {
        return repairestatue;
    }

    public void setRepairestatue(String repairestatue) {
        this.repairestatue = repairestatue;
    }

    @Override
    public String toString() {
        return "repair{" +
                "repairid='" + repairid + '\'' +
                ", houseid='" + houseid + '\'' +
                ", requesttime='" + requesttime + '\'' +
                ", repairewhy='" + repairewhy + '\'' +
                ", repairestatue='" + repairestatue + '\'' +
                '}';
    }
}
