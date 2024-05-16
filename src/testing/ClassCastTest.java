package testing;

import java.util.*;

public class ClassCastTest {

    public static void main(String[] args) {
        First first = null;
        first.show();
        /*List<Object> listOfObjects = new ArrayList<>(List.of("BC"));
        ArrayList<Object> arraysListOfObjects = new ArrayList<>();
        System.out.println(ClassCastTest.getList(listOfObjects));
        //System.out.println(ClassCastTest.getList(arraysListOfObjects));

        List<String> listOfStrings = List.of("ABC");
        //ArrayList<String> arrayListOfStrings = List.of("");
        //System.out.println(ClassCastTest.getListString(listOfStrings));
        //System.out.println(ClassCastTest.getListString(arrayListOfStrings));*/
    }

    public static List<Object> getList(List<Object> listOfObjects) {
        listOfObjects.add("XYZ");
        return listOfObjects;
    }

    public static List<String> getListString(List<String> listOfString) {
        listOfString.add("XYZ");
        return listOfString;
    }
}
