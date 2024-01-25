public class RemoveDuplicate {
    public static boolean[]map=new boolean[26];
public static void RemoveDuplicates(String str,int index,String newstrinng) {
    if(index==str.length()){
        System.out.println(newstrinng);
        return;
    }
    char current=str.charAt(index);
    if(map[current-'a']==true){
        RemoveDuplicates(str, index+1, newstrinng);
    }
    else{
    newstrinng+=current;
    map[current-'a']=true;
RemoveDuplicates(str, index+1, newstrinng);
    }
}   public static void main(String[] args) {
        String str="aabbccddcd";
        RemoveDuplicates(str,0,"");
    }
}