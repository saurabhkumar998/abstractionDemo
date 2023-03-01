package ArrayListChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();

        System.out.println("""
                Available actions : 
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                
                
                                """);
 //       String inputValue = scanner.nextLine();
//        int input = Integer.parseInt(inputValue);

        while(true) {
            System.out.println("Enter a number for which action you want to do :");
            String inputValue = scanner.nextLine();
            if(inputValue.equals("0")) {
                break;
            }
            if(inputValue.equals("1")) {
                System.out.println("Please enter the values to add (comma delimited list)");
                String str = scanner.nextLine();
                addElements(groceryList, str);
                groceryList.sort(Comparator.naturalOrder());
                System.out.println(groceryList);
            }
            if (inputValue.equals("2")) {
                System.out.println("Please enter the values to delete (comma delimited list)");
                String str = scanner.nextLine();
                removeElements(groceryList, str);
                groceryList.sort(Comparator.naturalOrder());
                System.out.println(groceryList);
            }

        }
    }

    public static void addElements(ArrayList<String> groceryList, String str) {
        String[] list = str.split(",");
        for(String s : list) {
            if(!groceryList.contains(s.trim())) {
                groceryList.add(s.trim());
            }
        }
    }

    public static void removeElements(ArrayList<String> groceryList, String str) {
        String[] list = str.split(",");
        for(String s : list) {
            if(groceryList.contains(s.trim())) {
                groceryList.remove(s.trim());
            }
        }
    }
}
