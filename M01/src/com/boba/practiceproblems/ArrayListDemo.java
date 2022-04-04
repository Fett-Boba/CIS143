package com.boba.practiceproblems;
import java.util.*;

public class ArrayListDemo {
   public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<String>(157);
      String[] array = new String[157];
      
      list.add("duplicate");
      list.add("duplicate");
      list.add("duplicate");
      list.add("duplicate");
      list.add("duplicate");
      removeDuplicates(list);
      System.out.println(list);
      
      list.clear();
      
      System.out.println("array length = "+array.length);
      System.out.println("list length  = "+list.size());
      
      array[0] = "Hello";
      list.add("World");
      
      System.out.println(Arrays.toString(array));
      System.out.println(list);
      
      list.add(0,"Hi");
      System.out.println(Arrays.toString(array));
      System.out.println(list);
      
      array[0] = null;
      list.remove(0);
      System.out.println(Arrays.toString(array));
      System.out.println(list);
      
      int[] intArray = new int[20];
      ArrayList<Integer> intList = new ArrayList<Integer>();
      
      for (int i=0; i<intArray.length; i++) {
         intArray[i] = i*10;
         intList.add(i*10);
      }
      System.out.println(Arrays.toString(intArray));
      System.out.println(intList);
      
      
      System.out.println("contains: "+intList.contains(140));
      System.out.println(intList.contains(142));
      
      System.out.println("indexOf "+intList.indexOf(140));
      System.out.println(intList.indexOf(142));
      
      intArray[12] = -99;
      intList.set(12,-88);
      System.out.println(Arrays.toString(intArray));
      System.out.println(intList);
      
      
   }
   
   // from Practice-It
   public static void removeDuplicates(ArrayList<String> list) {
      
      for (int i=1; i<list.size(); i++) {
         
         if (list.get(i-1).equals(list.get(i))) {
            list.remove(i);
            i--;
         }
         
      }
      
   }
   
   // from Practice-It
   public static void minToFront(ArrayList<Integer> list) {
      
      int smallest = list.get(0);
      int smallestIndex = 0;
      
      // find the index of the smallest value
      for (int i=1; i<list.size(); i++) {
         if (list.get(i) < smallest) {
            smallestIndex = i;
            smallest = list.get(i);
         }
      }
      
      // move the smallest to the front
      list.remove(smallestIndex);
      list.add(0,smallest);
   }
}