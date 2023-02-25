package item03.number5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class UsageOfFunctions {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        ArrayList<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2002, 1, 1));
        dates.add(LocalDate.of(2003, 1, 1));
        dates.add(LocalDate.of(2004, 1, 1));

        List<Integer> collect = dates.stream()
                .filter(date -> date.isBefore(LocalDate.of(2003, 1, 1)))
                .map(LocalDate::getYear)
                .collect(Collectors.toList());

        Function<Integer, String> intToStringFunctionMethod = String::valueOf;
        Function<Integer, String> intToStringFunctionLambda = (i) -> String.valueOf(i);

        Function<LocalDate, Person> personFunction1 = (date) -> new Person(date);
        Function<LocalDate, Person> personFunction2 = Person::new;

        Supplier<Person> personSupplierMethodReference = Person::new;
        Supplier<Person> personSupplierLambdaExpression = () -> new Person();


        Consumer<String> systemOutConsumerMethodReference = System.out::println;
        Consumer<String> systemOutConsumerLambdaExpression = (message) -> System.out.println("message = " + message)


        Predicate<LocalDate> isBeforePredicate = (date) -> date.isBefore(LocalDate.of(2003, 1, 1));





    }

}
