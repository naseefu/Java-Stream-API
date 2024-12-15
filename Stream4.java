import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream4 {

    public static void main(String[] args){

        Integer[] integers = {1,2,3,4,5,6,7,8,9};

        Student s = new Student(1,"n",2);

        Long ss = Arrays.stream(integers)
                .filter(num->num>3)
                .map(num->
                {
                    return switch (num) {
                        case 4 -> "four";
                        case 5 -> "five";
                        case 6 -> "six";
                        case 7 -> "seven";
                        case 8 -> "eight";
                        case 9 -> "nine";
                        default -> "null";
                    };
                })
                .count();

        System.out.println(ss);

    }

}
