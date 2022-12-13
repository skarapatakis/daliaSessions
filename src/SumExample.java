import java.util.ArrayList;
import java.util.List;

public class SumExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Einstein");
        names.add("Dalia");
        names.add("Kim");
        names.add("Kim");


        List<Student> students = new ArrayList<>();

        Student john = new Student("John"); //create an instance of Student, i.e. object

        students.add(john);
        students.add(new Student("Tom"));
        students.add(new Student("Maria"));
        students.add(new Student("Barbara"));
        students.add(new Student("Jeniffer"));

        for(Student student: students) {
            System.out.println(student.getFullName());
        }

    }

    private static void calculateSumForEach() {
        int[] numbers = new int[]{1,4,345,6,44,9,121,1234,455};

        int sum = 0; //to keep the result

        for(int num: numbers){ //for-each loop
            sum += num;
        }
        System.out.println(sum);
    }

    private static void calculateSum() {
        //calculate the total sum of numbers in an array
        int[] numbers = new int[]{1,4,345,6,44,9,121,1234,455};

        int sum = 0; //to keep the result

        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }

        System.out.println(sum);
    }
}
