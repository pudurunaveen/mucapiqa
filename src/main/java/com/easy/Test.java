
package com.easy;
import java.util.ArrayList;
import java.util.Collection;
 
public class Test {
 
    public static void main(String[] args) {
 
        Collection<String> collection = new ArrayList<String>();
 
        collection.add("zero");
        collection.add("one");
        collection.add("two");
 
        // for-each loop
        for (String s : collection) {
        System.out.println("value= " + s);
        }
    }
}
