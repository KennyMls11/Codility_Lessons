package test.com.oop;

public class FrogJmp {

    public int solution (int X, int Y, int D){
        int distance= Y-X;
        /*La función Math.ceil() devuelve el entero mayor o igual más próximo a un número dado.*/
        /*El casteo (casting)es un procedimiento para transformar una variable primitiva de un tipo a otro, o transformar un objeto de una clase a otra clase siempre y cuando haya una relación de herencia entre ambas*/
        int jumps = (int) Math.ceil (distance/ (double)D);
        return jumps;
    }
}
