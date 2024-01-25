import java.sql.SQLIntegrityConstraintViolationException;

public class PlacedTiles {
    public static int tilesplaced(int n,int m){
        if(n==m){return 2;}
         if(n<m){return 1;}
        //vertical placement
        int vertical=tilesplaced(n-m, m);
        //horizontal
        int horizontal=tilesplaced(n-1, m);
        return vertical+horizontal;

    }
    public static void main(String[] args) {
        int m=2,n=4;
        System.out.println(tilesplaced(n,m));
    }
}
