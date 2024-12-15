import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {

        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        Stream<Integer> stream =  Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(integerConsumer);

    }
}