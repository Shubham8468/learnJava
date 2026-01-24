package HashSets;
// all time complexity is (1) like :- insertion , deletion , search
// if i add same item again again // in this case set size not increas ..
// if i add some item in set its store the item in rendomely ..
// hashset implement with the help of BST
import java.util.HashSet;
public class Start_01 {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        set.add(77);
        set.add(65);
        set.add(90);
        set.add(67);
        System.out.println(set.size());
        System.out.println(set.contains(77));// this is method for use search item in
        set.remove(77);
        System.out.println(set.contains(77));
    }
}
