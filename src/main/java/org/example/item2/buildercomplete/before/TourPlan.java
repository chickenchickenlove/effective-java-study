package org.example.item2.buildercomplete.before;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TourPlan {

    private String title;
    private LocalDate startDate;

    private int nights;
    private int days;

    private List<DetailPlan> detailPlans;




    public void addPlan(int day, String content) {
        if (detailPlans == null) {
            this.detailPlans = new ArrayList<>();
        }
        detailPlans.add(new DetailPlan(day, content));
    }



    public void setNights(int nights) {
        this.nights = nights;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getNights() {
        return nights;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
