import java.util.*;
//
//public class Main {
// public static void main(String[] args) {
////        // ************ create array whose integer size 10
////        int[] numbers = new int[10];                        //arrays aren't flexible in size
////        ArrayList<Integer> ListOfNumbers = new ArrayList<>();         //lists are flexible in size,increaseable,default size
////        ListOfNumbers.add(1);
////        ListOfNumbers.add(2);                                     //Wrapper classes
////        ListOfNumbers.add(3);                                     // primitive datatypes=int,double,char,float
////        ListOfNumbers.add(4);                                    //generic structure, generic classes< >
////        ListOfNumbers.add(5);
////        ListOfNumbers.add(6);                                   // internal structure = arrays
////        ListOfNumbers.add(7);
////        ListOfNumbers.add(8);
////        ListOfNumbers.add(9);
////        ListOfNumbers.add(10);
////        System.out.println("total numbers in list : "+ ListOfNumbers.size());
////    }
////}
//
//
//// ************* increase the size of list
//
//        int[] numbers = new int[10];
//        ArrayList<Integer> ListOfNumbers = new ArrayList<>();
//        ListOfNumbers.add(1);
//        ListOfNumbers.add(2);
//        ListOfNumbers.add(3);
//        ListOfNumbers.add(4);
//        ListOfNumbers.add(5);
//        ListOfNumbers.add(6);
//        ListOfNumbers.add(7);
//        ListOfNumbers.add(8);
//        ListOfNumbers.add(9);
//        ListOfNumbers.add(10);
//        ListOfNumbers.add(11);
//
//        //ListOfNumbers.remove(3);
//
//        ListOfNumbers.add(5,3500);            //can use COPY OPERATION
//
//        System.out.println("total numbers in list : " + ListOfNumbers.size());
//        System.out.println("list of numbers: " + ListOfNumbers);
//
//        //LINKED LIST
//
//        for(int i=0; i<ListOfNumbers.size(); i++){
//            System.out.println(ListOfNumbers.get(i));
//        }
//    }
//}

//  String[] Names = new String[6];
//  ArrayList<String> ListOfNames = new ArrayList<>();
//  ListOfNames.add("Sam");
//  ListOfNames.add("Xyz");
//  ListOfNames.add("Abc");
//  ListOfNames.add("Pam");
//  ListOfNames.add("Sam");
//  ListOfNames.add("Ram");
//  ListOfNames.add("Ham");
//  ListOfNames.add("Sam");
//  System.out.println("list of names: " + ListOfNames);
//
//  ListOfNames.add("Bam");
//  System.out.println("list of names: " + ListOfNames);
//
//  ListOfNames.add(3, "gerry");
//  System.out.println("list of names: " + ListOfNames);
//
//  ListOfNames.remove("Bam");
//  System.out.println("list of names: " + ListOfNames);
//
//  ListOfNames.remove("Sam");
//  System.out.println("list of names: " + ListOfNames);
//
//  ListOfNames.removeAll(Collections.singleton("Sam"));
//  System.out.println("list of names: " + ListOfNames);

  // use for LOOP

//     for(String name:ListOfNames){
//      if(name.equals("Sam")){
//      }
//     }
//System.out.println(ListOfNames);
//    }


  // use ITERATOR
//  Iterator<String> iterator = ListOfNames.iterator();
//  while (iterator.hasNext()) {
//   String next = iterator.next();
//   if (next.equals("Sam")) {
//    iterator.remove();
//   }
//  }
//  System.out.println("list of names : " +ListOfNames);
// }
//}

//  System.out.println("\n\n\n  Set  \n\n");
//  HashSet<String> UniqueNames = new HashSet<>();
//  UniqueNames.add("Abc");
//  UniqueNames.add("Abc");
//  UniqueNames.add("Xyz");
//  UniqueNames.add("Sam");
//  UniqueNames.add("Pam");
//  UniqueNames.add("Jam");
//  UniqueNames.add("null");
//  UniqueNames.add("null");
//  UniqueNames.add("She");
//  UniqueNames.add("null");
//  UniqueNames.add("He");
//  System.out.println(UniqueNames);
// }
//}

//        System.out.println("\n\n\n  Tree  \n\n");
//          TreeSet<String> TreeNames = new TreeSet<>();
//  TreeNames.add("Abc");
//  TreeNames.add("Abc");
//  TreeNames.add("Xyz");
//  TreeNames.add("Sam");
//  TreeNames.add("Pam");
//  TreeNames.add("Jam");
//  TreeNames.add("null");
//  TreeNames.add("null");
//  TreeNames.add("She");
//  TreeNames.add("null");
//  TreeNames.add("He");
//        System.out.println(TreeNames);
//        }
//        }

//  System.out.println("\n\n\n  List  \n\n");
//  List<String> name = new LinkedList<>();
//  name.add("Abc");
//  name.add("Abc");
//  name.add("Xyz");
//  name.add("Sam");
//  name.add("Pam");
//  name.add("Jam");
//  name.add("null");
//  name.add("null");
//  name.add("She");
//  name.add("null");
//  name.add("He");
//  System.out.println(name);
// }
//}


//  System.out.println("\n\n\n  Set  \n\n");
//  Set<String> SetNames = new HashSet<String>();
//  SetNames.remove(null);
//  SetNames.add("Abc");
//  SetNames.add("Abc");
//  SetNames.add("Xyz");
//  SetNames.add("Sam");
//  SetNames.add("Pam");
//  SetNames.add("Jam");
//  SetNames.add("null");
//  SetNames.add("null");
//  SetNames.add("She");
//  SetNames.add("null");
//  SetNames.add("He");
//  System.out.println(SetNames);
// }
//}


//          List<String> TreeNames = new LinkedList<>();
//  TreeNames.add("Emaan");
//  TreeNames.add("Kulwinder");
//  TreeNames.add("Mukhmeet");
//  TreeNames.add("Null");
//  TreeNames.add("Null");
//  TreeNames.add("Singh");
//  TreeNames.add("Kaur");
//        System.out.println(TreeNames);
//        }
//        }


//     TreeSet<String> TreeNames = new TreeSet<>();
//     TreeNames.add("Emaan");
//     TreeNames.add("Kulwinder");
//     TreeNames.add("Mukhmeet");
//     TreeNames.add("Null");
//     TreeNames.add("Null");
//     TreeNames.add("Singh");
//     TreeNames.add("Kaur");
//     System.out.println(TreeNames);
// }
//}


//     Set<String> TreeNames = new HashSet<>();
//     TreeNames.add("Emaan");
//     TreeNames.add("Kulwinder");
//     TreeNames.add("Mukhmeet");
//     TreeNames.add("Null");
//     TreeNames.add("Null");
//     TreeNames.add("Singh");
//     TreeNames.add("Kaur");
//     System.out.println(TreeNames);
// }
//}