package test.com.oop;

public class main {
    public static void main (String[] args){

        /*1*/
        /*BinaryGap gb= new BinaryGap();
        System.out.println(gb.solution(529));*/

        /*2*/
        CyclicRotation cr= new CyclicRotation();
        int[] result= cr.solution(new int[] {3, 8, 9, 7,6 },3 );
        for (int i :result) {
            System.out.print((i+" "));
        }

    }
}
