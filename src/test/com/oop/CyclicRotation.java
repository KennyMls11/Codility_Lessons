package test.com.oop;
/*Se da una matriz A que consta de N enteros. La rotación de la matriz significa que cada elemento se desplaza un índice hacia la derecha y el último elemento de la matriz se mueve al primer lugar. Por ejemplo, la rotación de la matriz A = [3, 8, 9, 7, 6] es [6, 3, 8, 9, 7] (los elementos se desplazan un índice hacia la derecha y el 6 se desplaza al primer lugar).
El objetivo es rotar la matriz AK veces; es decir, cada elemento de A se desplazará a la derecha K veces.
Escribe una función:
solución de clase { public int[] solution(int[] A, int K); }
que, dada una matriz A que consta de N enteros y un entero K, devuelve la matriz A rotada K veces.
Por ejemplo, dado
    A = [3, 8, 9, 7, 6]
    K = 3
la función debería devolver [9, 7, 6, 3, 8]. Se hicieron tres rotaciones:
    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
Para otro ejemplo, dado
    A = [0, 0, 0]
    k = 1
la función debería devolver [0, 0, 0]
Dado
    A = [1, 2, 3, 4]
    K = 4
la función debería devolver [1, 2, 3, 4]
Asumir que:
N y K son números enteros dentro del rango [ 0 .. 100 ];
cada elemento de la matriz A es un número entero dentro del rango [ −1,000 .. 1,000 ].*/
public class CyclicRotation {
        public int[] solution(int[] A, int K) {
            /*cuando se quede vacio o cuando ya no tenga mas repeticiones*/
            if(A.length==0 || A.length==K){
                return A;
            }

            for (int i=0; i <K; i++ ){
                int lastValue= A[A.length-1];

                for (int j= A.length-2; j>=0; j--) {

                    A[j+1]= A[j];
                }
                A[0]= lastValue;
            }
            return A;
        }
}
