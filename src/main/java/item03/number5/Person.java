package item03.number5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Person {

    LocalDate birthDay;

    public static int compareByAge(Person a, Person b) {
        return a.birthDay.compareTo(b.birthDay);
    }

    public int compareByAgeInstance(Person a, Person b) {
        return a.birthDay.compareTo(b.birthDay);
    }

    public int compareByAgeTemp(Person b) {
        return birthDay.compareTo(b.birthDay);
    }


    public Person() {
    }

    public Person(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthDay.getYear();
    }

    public static void main2(String[] args) {

        ArrayList<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1982, 7, 15));
        dates.add(LocalDate.of(2000, 7, 15));
        dates.add(LocalDate.of(2022, 7, 15));

        // 생성자 레퍼런스
        List<Person> collect = dates.stream().map(Person::new)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(1982, 7, 15)));
        people.add(new Person(LocalDate.of(2000, 7, 15)));
        people.add(new Person(LocalDate.of(1322, 7, 15)));


        // 스태틱 메서드 레퍼런스
        Comparator<Person> comparator = Person::compareByAge;

        // 인스턴스 메서드 레펀러스
        Person person = new Person();
        Comparator<Person> compareByAgeInstance = person::compareByAgeInstance;

        // 임의의 인스턴스 메서드 레퍼런스
        Comparator<Person> compareByAgeTemp = Person::compareByAgeTemp;
        people.sort(comparator);
    }

}
