public class Studentdetails {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Please provide the student's name, age, and grade as arguments.");
            return;
        }
        String studentName = args[0];
        String studentAge = args[1];
        String studentGrade = args[2];

        System.out.println("Student Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Grade: " + studentGrade);
    }
}

