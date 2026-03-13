package collections.sortedmaps;

import java.time.LocalDate;
import java.util.*;

public class Main {

    private static Map<String, Purchase> purchases = new LinkedHashMap<>();

    private static NavigableMap<String, Student> students = new TreeMap<>();

    public static void main(String[] args) {

        Course jmc = new Course("jmc101", "Java Master Class", "Java");
        Course phyton = new Course("pyt101", "Phyton Master Class", "Phyton");

        addPurchase("Mary Martin", jmc, 129.99);
        addPurchase("Andy Martin", jmc, 139.99);
        addPurchase("Mary Martin", phyton, 149.99);
        addPurchase("Joe Jones", phyton, 149.99);
        addPurchase("Bill Brown", phyton, 119.99);

        addPurchase("Chuck Cheese", phyton, 119.99);
        addPurchase("Davey Jones", jmc, 139.99);
        addPurchase("Eva East", phyton, 139.99);
        addPurchase("Fred Forker", jmc, 139.99);
        addPurchase("Greg Brady", phyton, 129.99);


        purchases.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("-----------------------------------------");
        students.forEach((key, value) -> System.out.println(key + ": " + value));

        NavigableMap<LocalDate, List<Purchase>> datePurchase = new TreeMap<>();

        for (Purchase p : purchases.values()) {
            datePurchase.compute(p.purchaseDate(),
                    (pdate, plist) ->
                    {
                        List<Purchase> list =
                                (plist == null) ? new ArrayList<>() : plist;
                             list.add(p);
                             return list;
                    });
        }
        datePurchase.forEach((key, value) -> System.out.println(key + ": " + value));

        int currentYear = LocalDate.now().getYear();
        LocalDate firstDay = LocalDate.ofYearDay(currentYear, 1);
        LocalDate week1 = firstDay.plusDays(7);
        Map<LocalDate, List<Purchase>> week1Purchases = datePurchase.headMap(week1);
        Map<LocalDate, List<Purchase>> week2Purchases = datePurchase.tailMap(week1);

//        System.out.println("-----------------------------");
//        week1Purchases.forEach((key, value) -> System.out.println(" key = " + key + " value = " + value));
//        System.out.println("-----------------------------");
//        week2Purchases.forEach((key, value) -> System.out.println(" key = " + key + " value = " + value));

        displayStats(1, week1Purchases);
        displayStats(3, week2Purchases);

        System.out.println("-----------------------------");

        LocalDate lastDate = datePurchase.lastKey();
        var previousEntry = datePurchase.lastEntry();

        List<Purchase> lastDayData = previousEntry.getValue();
        System.out.println(lastDate + " purchases : " + lastDayData.size());
    }

    private static void addPurchase(String name, Course course, double price) {

        Student existingStudent = students.get(name);
        if (existingStudent == null) {
            existingStudent = new Student(name, course);
            students.put(name, existingStudent);
        } else {
            existingStudent.addCourse(course);
        }

        int day = new Random().nextInt(1, 15);
        String key = course.courseId() + "_" + existingStudent.getId();
        int year = LocalDate.now().getYear();
        Purchase purchase = new Purchase(course.courseId(), existingStudent.getId(), price, year, day);

        purchases.put(key, purchase);
    }

    private static void displayStats(int period, Map<LocalDate, List<Purchase>> periodData) {
        System.out.println("-----------------------------");
        Map<String, Integer> weeklyCounts = new TreeMap<>();
        periodData.forEach((key, value) -> {
            System.out.println(key + ": " + value);
            for (Purchase p : value) {
                weeklyCounts.merge(p.courseId(), 1, (prev, current) -> {
                    return prev + current;
                });
            }
        });
        System.out.printf("Week %d Purchases = %s%n", period, weeklyCounts );
    }
}
