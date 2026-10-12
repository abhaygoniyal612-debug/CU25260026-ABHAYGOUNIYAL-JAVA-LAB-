class Person {
    String name;
    int age;
    static String country = "India";

    void checkVoting() {
        String personName = name;
        int personAge = age;

        System.out.println("Name: " + personName);
        System.out.println("Country: " + country);

        if (personAge >= 18)
            System.out.println("Eligible for voting");
        else
            System.out.println("Not eligible for voting");
    }

    public static void main(String[] args) {
        Person p = new Person();

        String n = "Abhay";
        int a = 20;

        p.name = n;
        p.age = a;

        p.checkVoting();
    }
}