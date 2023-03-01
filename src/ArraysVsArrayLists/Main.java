package ArraysVsArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"Apple", "Banana", "Grapes", "Tomato"};

        System.out.println(stringArray);
        System.out.println(Arrays.toString(stringArray));

        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Grapes", "Tomato"));

        System.out.println(stringArrayList);

        String[][] twoDArray = new String[][] {{"Apple", "Banana", "Grapes", "Tomato"}, {"pomegranate", "chiku"}};

        System.out.println(twoDArray);
        System.out.println(Arrays.toString(twoDArray));
        System.out.println(Arrays.deepToString(twoDArray));

        ArrayList<ArrayList<String>> twoDarrayList = new ArrayList<>();
        twoDarrayList.add(new ArrayList<>(Arrays.asList("pomegranate", "chiku")));
        twoDarrayList.add(new ArrayList<>(Arrays.asList("Apple", "Banana", "Grapes", "Tomato")));

        System.out.println(twoDarrayList);

        String[] array = {"Banana", "Grapes", "Tomato", "Apple"};

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] intArray = {3,4,2,166,4,33,12,99,43,22};

        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        ArrayList<String> arrayList = new ArrayList<>(List.of("Saurabh", "Saumya", "Gaurav", "Saurabh"));

        System.out.println(arrayList);
        arrayList.add("Rajesh");
        arrayList.set(2, "Nidhi");

        System.out.println(arrayList.contains("Saurabh"));
        System.out.println(arrayList.indexOf("Saurabh"));
        System.out.println(arrayList.lastIndexOf("Saurabh"));
        System.out.println(arrayList.containsAll(List.of("Saurabh", "Gaurav")));

        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);
        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList);

        List<String> stringList = Arrays.asList("Saurabh", "Hello", "World");
   //     stringList.add("Again");
        System.out.println(stringList);

        String[] days = {"Monday", "Tuesday", "Wednesday"};
        List<String> newList =  Arrays.asList(days);

        newList.set(0,"Thursday");

        List<String> dayList = List.of(days);

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr1.equals(arr2));

        System.out.println(Arrays.equals(arr1, arr2));
        Arrays.fill(arr1, 8);
        System.out.println(Arrays.toString(arr1));

        Arrays.stream(arr1).map(x -> x*x).forEach(System.out::println);

        ArrayList<String> l = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Thursday"));

        l.remove(1);
        l.add("Saturday");
        l.addAll(Arrays.asList("Sunday","Friday"));
        System.out.println(l);






    }
}
