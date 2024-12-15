import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream5 {

    public static void main(String[] args){

        List<Student> s = new ArrayList<Student>();

        Student s1 = new Student(1,"naseef",20);
        Student s2 = new Student(2,"nash",22);
        Student s3 = new Student(3,"nas",23);
        Student s4 = new Student(4,"abhi",19);
        Student s5 = new Student(5,"viv",29);
        Student s6 = new Student(6,"son",18);

        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);
        s.add(s6);

        List<StudentNew> stunew = s.stream().filter(m->m.getAge()>=20).limit(3).map(ma-> {
            StudentNew stud = new StudentNew();
            stud.setName(ma.getName());
            stud.setAge(ma.getAge());
            return stud;
        }).toList();

        stunew.forEach(f->{
            System.out.println(f.getAge()+":"+f.getName());
        });

    }

}
