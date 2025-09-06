package linearSearching;

public class searchInString {
    public static void main(String[] args) {
        String name="Shubham";
        char target='a';
        System.out.println(search(name,target));

    }
    static boolean search(String name,char target){
        if(name.length()==0){
            return false;
        }
        for (int i = 0; i <name.length() ; i++) {
            if(target==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
