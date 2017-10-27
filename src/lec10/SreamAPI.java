package lec10;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SreamAPI {
    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5,6,7,8,9};
        List<Integer> list = Arrays.asList(array);
      //List<Integer> stream = list.stream();
        //stream.filter(i->i%2==0).forEach(i-> System.out.println(i));
        Integer collection = list
                .stream()
                .filter(i -> i % 2 == 0)
                .map(i->i)
                .reduce((i,j) -> i+j)
                .orElse(0);





        System.out.println(collection);
    }
}
