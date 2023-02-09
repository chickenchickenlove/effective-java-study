package org.example.item2.buildercomplete.after;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        // 자주 사용하는 객체는 디렉터 객체를 통해서 생성한다.
        TourPlan tourPlan = tourDirector.cancunTrip();
        TourPlan tourPlan1 = tourDirector.longBeachTrip();


    }

}
