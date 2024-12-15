import java.util.stream.Stream;

public class Stream8 {

    public static void main(String[] args){

        Stream.of("nas","abh","viv","soo","arj","siv")
                .skip(2) // skip upto index 2
                .forEach(System.out::println);

        Stream.of("nas","abh","nas","nas","nas","nas")
                .distinct() // only nas and abh printed
                .forEach(System.out::println);
    }

}
