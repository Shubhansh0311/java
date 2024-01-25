public class FirstAndLastOccurence {
    public static int first =-1,last=-1;
        public static void PrintOccurence(String str,int index,char element){
        if(index==str.length()){
            System.out.println(first+" "+last);return;
        }
        char current =str.charAt(index);
        if(current==element){if(first==-1){
            first=index;
        }else{last=index;}
            
        }
        PrintOccurence(str, index+1, element);
    }
    public static void main(String[] args) {
        String str="shubhansh";
        
        PrintOccurence(str,0,'s');}}