package org.example.item2.buildercomplete.after;

import org.example.item2.buildercomplete.before.DetailPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TourPlan {

    private String title;
    private LocalDate startDate;


    private int nights;
    private int days;

    private List<DetailPlan> detailPlans;
    private String whereToStay;

    public TourPlan(String title, LocalDate startDate, int nights, int days, List<DetailPlan> detailPlans, String whereToStay) {
        this.title = title;
        this.startDate = startDate;
        this.nights = nights;
        this.days = days;
        this.detailPlans = detailPlans;
        this.whereToStay = whereToStay;
    }
}
