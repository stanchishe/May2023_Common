package OOP_part2.Encapsulation;

public class Student {
    private static String passWord = "123";
    private final String studentId;
    private String studentName;
    private int studentAge;

    public Student(String studentId, String studentName, Integer studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public int getStudentAge(String providedPassword) {
        if(passWord.equals(providedPassword)) return studentAge;
        return 0;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentId(String providedPassword) {
        if(passWord.equals(providedPassword)) return studentId;
        return "";
    }

    public void setStudentAge(int studentAge) {
        if(studentAge <= this.studentAge) return;
        this.studentAge = studentAge;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}

class StudentStart {
    public static void main(String[] args) {
        Student student = new Student("mark01", "Mark", 27);
        int receivedStudentAge = student.getStudentAge("133");
        if(receivedStudentAge != 0) System.out.println(receivedStudentAge);
        else System.out.println("Access to the students age was denied!");

        System.out.println(student.getStudentName());

        student.setStudentAge(28);
        System.out.println(student.getStudentAge("123"));
    }
}
