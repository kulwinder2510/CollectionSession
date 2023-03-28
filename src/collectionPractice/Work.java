package collectionPractice;

import java.util.*;

public class Work {
    public static void main(String[] args){

        // CREATE A LIST OF 5 COLORS

        ArrayList<String> ListOfColors = new ArrayList<>();
        ListOfColors.add("Red");
        ListOfColors.add("Yellow");
        ListOfColors.add("Green");
        ListOfColors.add("Blue");
        ListOfColors.add("Black");

        //PRINT COLOR LIST

        System.out.println("list size of colors : " + ListOfColors.size());
        System.out.println("list of colors : " + ListOfColors);

        // REMOVE YELLOW COLOR TO USE 'INDEX'

        ListOfColors.remove(1);
        System.out.println("list size of colors : " + ListOfColors.size());
        System.out.println("list of colors : " + ListOfColors);

        //REPLACE GREEN WITH WHITE

        ListOfColors.set(1, "White");
        System.out.println("list of colors : " + ListOfColors);

// CREATE ANOTHER LIST OF STRING : ANOTHERCOLORS

        ArrayList<String> ListOfAnotherColors = new ArrayList<>();
        ListOfAnotherColors.add("Grey");
        ListOfAnotherColors.add("Purple");
        ListOfAnotherColors.add("Orange");
        ListOfAnotherColors.add("Brown");

        System.out.println("list size of colors : " + ListOfAnotherColors.size());
        System.out.println("list of colors : " + ListOfAnotherColors);

        //ADD ANOTHERCOLORS TO LISTOFCOLORS ON 3RD INDEX

        ListOfColors.addAll(3,ListOfAnotherColors);
        System.out.println("list size of colors : " + ListOfColors.size());
        System.out.println("list of colors : " + ListOfColors);

        // DELETE ALL COLORS WHOSE LENGTH 5

         Iterator<String> iterator = ListOfColors.iterator();
                while(iterator.hasNext()) {
            if (iterator.next().length() == 5) {
                iterator.remove();
            }
        }
        System.out.println("deleted colors whose length equals to 5 \n" +ListOfColors);

                // ADD ALL COLORS TO COLORLIST

        ListOfColors.addAll(ListOfColors);
        System.out.println("all colors list \n" +ListOfColors);

        // CREATE COLORSET, USE TREESET WITH LIST COLOR,

        TreeSet<String> ColorSet = new TreeSet<>();
        ColorSet.add("Red");
        ColorSet.add("Yellow");
        ColorSet.add("Green");
        ColorSet.add("Blue");
        ColorSet.add("Black");
        
        System.out.println("color set : " +ColorSet);

        TreeSet<String> ColorSets = new TreeSet<>(ListOfAnotherColors);

        // DESCENDING ORDER

       System.out.println("Descending order list: "+ColorSet.descendingSet());

    //NavigableSet<String> strings1 = ColorSet.descendingSet();

    }
}

