import java.util.stream.Stream;

public class Stream7 {

    public static void main(String[] args){

        Stream.of(1,2,3,4,5,6,7,8,9)
                .filter(f->f<7)
                .map(m->m*m)
                .forEach(System.out::println);

    }

}
