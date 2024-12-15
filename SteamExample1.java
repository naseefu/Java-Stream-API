import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SteamExample1 {

    public static void main(String[] args){

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello Stream !!";
            }
        };

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Stream<String> stream = Stream.generate(supplier);

        //also

        Stream<String> stream1 = Stream.generate(()->"Hello world");

        stream.forEach(consumer);

    }


}
