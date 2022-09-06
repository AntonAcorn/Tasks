package Sets;
/*
Set отличвается тем, что может хранить в себе только уникальные значения, повторения перезаписываются
Set differs in that it can store only unique values, repetitions are overwritten
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main (String [] args){
        Set <String> hashSet = new HashSet<>();
        Set <String> treeSet = new TreeSet<>();
        Set <String> linkedSet = new LinkedHashSet<>();

        print(hashSet);
        print(treeSet);
        print(linkedSet);
    }
    public static void print (Set <String> set){
        set.add("8Vasa");
        set.add("4Vasa");
        set.add("1Vasa");
        set.add("9Vasa");
        set.add("3Vasa");
        set.add("6Vasa");

        System.out.println(set);

    }
}
