/**
 * Created @ 2017-9-6.
 * Auther chenfan
 */
public class ShuZu {

    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4};
        int[] b = new int[10];
        System.out.println(a[0]);

        int[][] c ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0; i<c.length;i++){
            for(int j=0; j<c[i].length;j++){
                System.out.println(c[i][j]);
            }
        }

    }
}
