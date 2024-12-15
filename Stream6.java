import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Stream6 {

    public static void main(String[] args){

        Stream.iterate(0, new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer+1;
            }
        }).limit(20 )
                .forEach(System.out::println);

    }

}
