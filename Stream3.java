import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {

        Student s1 = new Student(1,"naseef",21);
        Student s2= new Student(2,"nash",11);
        Student s3 = new Student(3,"naz",24);

        List<Student> students = List.of(s1,s2,s3);

        Stream<Student> stream = students.stream();
        stream.forEach(System.out::println);

    }
}