//package knhel7.jd14.javacore14.task121;

import java.util.Arrays;
import java.util.function.Consumer;

public interface IntegerArrayPrinterImpl {
    Consumer<Integer[]> printer =
            (Integer[] arr) -> System.out.println(Arrays.toString(arr));

    default void printIntArray(String msg, Integer[] arr) {
        System.out.print(msg);
        printer.accept(arr);
    }
}
