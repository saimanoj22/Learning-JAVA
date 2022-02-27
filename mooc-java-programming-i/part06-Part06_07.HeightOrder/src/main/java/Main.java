
public class Main {

    public static void main(String[] args) {
        // Test your class here
        // Part 1
        Room room = new Room();
        System.out.println("Empty room? " + room.isEmpty());
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        System.out.println("Empty room? " + room.isEmpty());

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        
        // Part 2
        room = new Room();
        System.out.println("Shortest: " + room.shortest());
        System.out.println("Empty room? " + room.isEmpty());
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        System.out.println("Empty room? " + room.isEmpty());

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.shortest());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        
        //Part 3
        room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        // using take() to print persons in increasing order of their heights
        room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        while (!room.isEmpty()) {
            System.out.println(room.take());
        }
    }
}
