public class MethodExamples {
    public static void main(String[] args) {
        SayHello();
        int lower = getLower(5, 75);
        System.out.println(lower);

        Student student = new Student();
        System.out.println(student.getName());
    }

    public static void SayHello() {
        System.out.println("Hello!");
    }

    public static int getLower(int a, int b) {
        if(a > b) return b;
        else return a;
    }


}

class Student {
    private String name = "Mark";

    public String getName() {
        return name;
    }
}
