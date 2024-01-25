public class MovingAllXtoEnd {public static int count=0;
    public static void moveall(String str,int index,String newstString,int count){
        if(index==str.length()){for(int i=0;i<count;i++){newstString+='x';}
       System.out.println(newstString);
       
    return;}
    char current=str.charAt(index);
    if(current=='x'){
    count++;
 
    moveall(str, index+1, newstString, count);}
    else{newstString+=current; 
    moveall(str, index+1, newstString, count);
    }}

public static void main(String[] args) {
    String str="xcaxsxsxsxx";
    moveall(str,0,"",0);
}

}
