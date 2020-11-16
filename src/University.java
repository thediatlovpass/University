public class University {
    public static void main(String[] args) {

        Student student1 = new Student("Jan", "Kowalski", 1234);
        Student student2 = new Student("Janina", "Kowalska", 1235);
        Student student3 = new Student("Janina", "Kowalska", 1235);
        Student student4 = new Student("Janina", "Kowalska", 1235);
        Student student5 = new Student("Janina", "Kowalska", 1235);
        System.out.println("Aktualna liczba studentów to: " + Student.numberOfStudents);

    }
}
