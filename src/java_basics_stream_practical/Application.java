package java_basics_stream_practical;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) throws IOException {

        //Integer Stream
        IntStream
                .range(1, 10)  //source
                .forEach((x) -> System.out.print(x));  // terminal operation
        System.out.println("------------------------------------------------>");


        //Integer Stream with Skip
        IntStream
                .range(1, 10)  //source
                .skip(5) // skip 5 elements of the stream  - intermediate operation
                .forEach((x) -> System.out.print(x));  // terminal operation
        System.out.println("------------------------------------------------>");


        //Integer Stream with Sum
        int val = IntStream
                .range(1, 5)  //source
                .sum(); //   terminal operation
        System.out.print(val);
        System.out.println("------------------------------------------------>");

        //Stream.of sorted and findFirst
        Stream.of("Hello", "bottle", "Africa") // source
                .sorted() // intermediate operation
                .findFirst() // terminal operation
                .ifPresent((x) -> System.out.print(x)); // make sure not null
        System.out.println("------------------------------------------------>");

        //Stream from Array, sort, filter and print
        String[] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
        Stream.of(items) // source
                .filter((x) -> x.startsWith("t")) // intermediate operation
                .sorted() // intermediate operation
                .forEach(x -> System.out.print(x + ",")); // terminal operation
        System.out.println("------------------------------------------------>");

        //Avarage of squares of an int array
        Arrays.stream(new int[]{2, 4, 6, 8})
                .map((x) -> x * x)// intermediate operation
                .average() // intermediate operation
                .ifPresent(n -> System.out.print(n)); // terminal operation
        System.out.println("------------------------------------------------>");


        //Stream from a list, filter and print
        List<String> listOfItems = Arrays.asList("Computer", "Toothpaste", "Box", "Pencil", "Car");
        listOfItems.stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("c"))
                .sorted()
                .forEach(x -> System.out.print(x + ", "));
        System.out.println("------------------------------------------------>");

        //Print words with length greater than 6
        Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
        lines.filter(l -> l.length() > 6)
                .sorted()
                .forEach(s -> System.out.print(s + ", "));
        lines.close();
        System.out.println("------------------------------------------------>");

        //
        List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
                .filter(x -> x.contains("th"))
                .collect(Collectors.toList());
        words.forEach(x -> System.out.print(x + ","));
        System.out.println("------------------------------------------------>");

        //
        Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
        int rowCount = (int) rows
                .map(x -> x.split(","))
                .filter(x -> x.length > 3)
                .count();
        System.out.println(rowCount + " good rows.");
        rows.close();

        //
        Stream<String> r = Files.lines(Paths.get("files/stockDataCsv.txt"));
        r.map(x -> x.split(","))
                .filter(x -> x.length > 3)
                .filter(x -> Integer.parseInt(x[1].trim()) > 15)
                .forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
        rows.close();

    }
}
