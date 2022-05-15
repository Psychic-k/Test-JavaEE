package com.homestay.pojo;

public class profit {
    private String year;
    private String income;
    private String paid;
    private String profit;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "profit{" +
                "year='" + year + '\'' +
                ", income='" + income + '\'' +
                ", paid='" + paid + '\'' +
                ", profit='" + profit + '\'' +
                '}';
    }
}
