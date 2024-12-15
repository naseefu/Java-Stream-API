import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Stream9 {

    public static void main(String[] args){

        Supplier<String> stringSupplier = ()-> {
                return "Hello";
            };

        Consumer<String> consumer = (String s)-> {
            System.out.println(s);
        };

        Stream.generate(stringSupplier).limit(20).forEach(consumer);

    }

}
