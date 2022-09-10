package main;

public class Matriz {
    
    int dimensiones;
    Object matriz[][];

    public Matriz(int dimensiones) {
       this.matriz = new Object[dimensiones][dimensiones];
    }
    
    public void adyacencia(Object matriz1[][], Object matriz2[][]){
        int f1=0, f2=0, c1=0, c2=0;
        Object newMatriz[][] = new Object[matriz.length][matriz.length];
        
        if(esValida(matriz1) && esValida(matriz2)){
            
            for (f1 = 0; f1 < matriz.length; f1++) {
                
            }
            
        }else{
            System.out.println("Dimensiones inválidas");
        }
        
    }
    
    public boolean esValida(Object matriz[][]){
        return matriz.length>1;
    }
}
