package lambdasinaction.chap4;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/**
 * collection与stream的区别：collection存储和遍历数据，stream用来出来处理数据
 */
public class StreamVsCollection {

    public static void main(String...args){
        List<String> names = Arrays.asList("Java8", "Lambdas", "In", "Action");
        Stream<String> s = names.stream();
        s.forEach(System.out::println);
        // uncommenting this line will result in an IllegalStateException
        // because streams can be consumed only once
        //s.forEach(System.out::println);
    }
}