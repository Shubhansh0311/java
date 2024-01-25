import javax.swing.text.StyledEditorKit.BoldAction;

public class IsSorted {
    public static Boolean CheckSorting(int arr[],int index){
        if(index==arr.length-1){
            return true;}
            if(arr[index]<arr[index+1]){
                return CheckSorting(arr, index+1);
            }else{return false;}
        
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,9,6};
    System.out.println((CheckSorting(arr, 0)));
    }}