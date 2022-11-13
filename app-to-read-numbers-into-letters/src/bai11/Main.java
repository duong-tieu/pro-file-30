package bai11;


import java.util.*;


import java.util.*;

public class Main {
    public static void main(String args[]) {

        String[] arr = {"1", "2" , "3", "4", "5"};

        System.out.println("orgin arr:\n"+Arrays.toString(arr));


        List<String> testList = new ArrayList<>(Arrays.asList(arr));


        System.out.println("ArrayList before:\n"+ testList);


        testList.add("88");
        testList.add("99");


        System.out.println("ArrayList after:\n"+ testList);


        arr = testList.toArray(new String[0]);


        System.out.println("new arr :\n"+Arrays.toString(arr));

    }
}
