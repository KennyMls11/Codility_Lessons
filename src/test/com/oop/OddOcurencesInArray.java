package test.com.oop;


/*Enunciado
* Se da una matriz A no vacía que consta de N enteros. La matriz contiene un número impar de elementos, y cada elemento de la matriz se puede emparejar con otro elemento que tenga el mismo valor, excepto por un elemento que se deja sin emparejar.
Por ejemplo, en el arreglo A tal que:
  A[0] = 9 A[1] = 3 A[2] = 9
  A[3] = 3 A[4] = 9 A[5] = 7
  A[6] = 9
los elementos en los índices 0 y 2 tienen valor 9,
los elementos en los índices 1 y 3 tienen valor 3,
los elementos en los índices 4 y 6 tienen valor 9,
el elemento en el índice 5 tiene el valor 7 y no está emparejado.
Escribe una función:
solución de clase { public int solution(int[] A); }
que, dada una matriz A que consta de N enteros que cumplen las condiciones anteriores, devuelve el valor del elemento desapareado.
Por ejemplo, dada la matriz A tal que:
  A[0] = 9 A[1] = 3 A[2] = 9
  A[3] = 3 A[4] = 9 A[5] = 7
  A[6] = 9
la función debería devolver 7, como se explica en el ejemplo anterior.
Escriba un algoritmo eficiente para las siguientes suposiciones:
N es un número entero impar dentro del rango [1..1,000,000];
cada elemento de la matriz A es un número entero dentro del rango [1..1,000,000,000];
todos menos uno de los valores en A ocurren un número par de veces.*/

import java.util.HashSet;

public class OddOcurencesInArray {
    /*porq hashset? porq es una coleccion en la que cada elemento es unico */
    HashSet<Integer> aList= new HashSet<Integer>();

    /* va recorriendo el arreglo y a medida q encuentre pares los elimina, quedando en la posicion i=0 solo el numero que
    no tiene par, con el metodo .iterator lo muestro*/
    public int solution(int[] A) {
        for (int i=0; i<A.length;i++){
            int a= A[i];
            if (aList.contains(a)){
                aList.remove(a);
            } else {
                aList.add(a);
            }
        }
        return aList.iterator().next();

    }


}
