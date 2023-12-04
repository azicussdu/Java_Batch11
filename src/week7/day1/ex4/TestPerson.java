package week7.day1.ex4;

public class TestPerson {
    public static void main(String[] args) {

        Person p1 = new Person("Mike", true);
        Person p2 = new Person("Jeniffer", false);
        Person p3 = new Person(true);
        Person p4 = new Person( false);
        Person p5 = new Person("Mary", false);

        System.out.println("male count = " + Person.countMale);
        System.out.println("female count = " + Person.countFemale);
        System.out.println("total objects = " + (Person.countMale + Person.countFemale));

    }
}
