package org.example.item2.buildercomplete.before;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("오레곤 롱비치 여행");
        shortTrip.setStartDate(LocalDate.of(2021, 7, 15));

        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setStartDate(LocalDate.of(2021, 7, 15));
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
    }

}
