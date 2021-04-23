package polimorfismo;

public class Calculadora{
    
    float somar(float a,float b){
        return a+b;
    }
    float somar(float a,float b,float c){
        return somar(a,b)+c;
    }
    float somar(float a,float b,float c,float d){
        return somar(a, b, c)+d;
    }
 
    float subtrair(float a,float b){
        return a-b;
    }
    float subitrair(float a,float b,float c){
        return subtrair(a, b)-c;
    }

     float multiplicar(float a,float b){
        return a*b;
    }
    float multiplicar(float a,float b,float c){
        return multiplicar(a, b)*c;
    }
    float multiplicar(float a,float b,float c,float d){
        return multiplicar(a, b, c)*d;
    }

}