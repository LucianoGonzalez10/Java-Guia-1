// PROGRAMACION ORIENTADA A OBJETOS
/* 

- Es una forma de ver las cosas. 
- Es facilitar una solucion informatica identificando los conceptos relevantes presentes en el problema. 

Clase: Es el modelo a seguir. 
Objeto: Es una instancia de una clase.

Los valores de los atributos de un objeto se conocen como estado.

Asociacion: Se define como el momento en que dos objetos se unen para trabajar en conjunto.
Herencia: facilita la creacion de objetos a partir de otros ya existentes.
Polimorfismo: Capacidad de un objeto a responder a multiples formas.

Importante modularizar !!
Reusabilidad: Reutilizar las funciones, para no repetir codigo.

MODIFICADORES DE OBJETOS
Public: Puede ser visible desde cualquier clase.
Private: Su uso queda restringido desde la misma clase.
Protected: Un metodo o atributo es visible para las clases del mismo paquete o sub clases.


*/

import java.util.Scanner;

class Persona {
    private String nombre;
    public int edad;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class miClase{
    void contador(){
        for(int i = 0; i < 10; i++){
            System.out.println("Contador: " + i);
        }
    }
}

public class index {
    public static void main(String[] args) {
        Persona personaPrueba = new Persona();
        personaPrueba.setNombre("Luciano"); // Variable privada, tengo que utilizar la funcion set ya que la variable existe dentro de la clase.
        personaPrueba.edad = 19; // Variable publica, puedo declarla ya que existe por fuera de la clase.

        System.out.println("Nombre de la persona: " + personaPrueba.getNombre());
        personaPrueba.setNombre("Matteo");
        System.out.println("Nombre de la persona: " + personaPrueba.getNombre());
        System.out.println("Edad de la persona: " + personaPrueba.edad);

        Scanner scanner = new Scanner(System.in);

       //  System.out.print("Por favor, ingresa un número: ");
        // int numero = scanner.nextInt();

        // System.out.println("El número ingresado es: " + numero);

        // System.out.println("Ingrese la letra");
        // char datoTexto = scanner.next().charAt(0);
        // System.out.println("La letra es: " + datoTexto);
        
        miClase funcionesPrueba = new miClase();
        funcionesPrueba.contador();

        System.out.println("Dime el ejercicio que quieres ejecutar: ");
        int numEjercicio = scanner.nextInt();

        switch (numEjercicio) {
            case 1:
                Ejercicio1(scanner);
            break;
        
            case 2:
                Ejercicio2(scanner);
            break;

            case 3:
                Ejercicio3(scanner);
            break;

            case 4:
                Ejercicio4(scanner);
            break;

            case 5:
                Ejercicio5(scanner);
            break;

            case 6:
                Ejercicio6(scanner);
            break;
        
            case 7:
                Ejercicio7(scanner);
            break;

            case 8:
                Ejercicio8(scanner);
            break;
            
            case 9:
                Ejercicio9(scanner);
            break;

            case 10:
                Ejercicio10(scanner);
            break;

            case 11:
                Ejercicio11(scanner);
            break;
        
            case 12:
                Ejercicio12(scanner);
            break;

            case 13:
                Ejercicio13(scanner);
            break;
            
            case 14:
                Ejercicio14(scanner);
            break;

            case 15:
                Ejercicio15(scanner);
            break;

            case 16:
                Ejercicio16(scanner);
            break;
        
            case 17:
                Ejercicio17(scanner);
            break;

            case 18:
                Ejercicio18(scanner);
            break;
            default:
            System.out.println("El Ejercicio no existe.");
                break;
        }
} 
public static void Ejercicio1(Scanner scanner){
    System.out.println("Ingrese el numero entero");
        int N = scanner.nextInt();

        System.out.println("Ingrese el numero de tipo doble");
        double A = scanner.nextDouble();

        System.out.println("Ingrese la letra");
        char C = scanner.next().charAt(0); 

        System.out.println("Variable N: " + N);
        System.out.println("Variable A: " + A);
        System.out.println("Variable C: " + C);
        
        double suma = (double) N + A;
        System.out.println(suma);
        
        double diferencia = (double) N - A;
        System.out.println(diferencia);
        System.out.println((int)C);
    
}

public static void Ejercicio2(Scanner scanner){
    int X, Y;
    double P, M;
    
    System.out.println("Asigna un valor a la variable X");
    X = scanner.nextInt();

    System.out.println("Asigna un valor a la variable Y");
    Y = scanner.nextInt();

    System.out.println("Asigna un valor a la variable P");
    P = scanner.nextDouble();

    System.out.println("Asigna un valor a la variable M");
    M = scanner.nextDouble();

    double multiplicacion = (double) X * (double) Y * P * M;
    System.out.println("Multiplicacion: " + multiplicacion);

    double suma = (double) X + (double) Y + P + M;
    System.out.println("Suma: " + suma);

    double resta = (double) X - (double) Y - P - M;
    System.out.println("Resta: " + resta);

    double combinada = (double) X * (double) Y - (P + M);
    System.out.println("Combinada: " + combinada);  

}

public static void Ejercicio3(Scanner scanner){
    System.out.println("Ingrese un valor para Z: ");
        int Z = scanner.nextInt();
        int incrementar = Z + 77;
        int aux = Z;
        Z = 3 ;
        int duplicar = aux * 2;

        System.out.println("Incremento: " + incrementar);
        System.out.println("Valor 3: " + Z);
        System.out.println("Incremento: " + duplicar);

        scanner.close();
}
public static void Ejercicio4(Scanner scanner){
        int A = 15, B = 12, C = 18, D = 24;
        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
        System.out.println("Valor de C: " + C);
        System.out.println("Valor de D: " + D);

        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
        System.out.println("Valor de C: " + C);
        System.out.println("Valor de D: " + D);
}

public static void Ejercicio5(Scanner scanner){
        System.out.println("Ingrese un valor para A: ");
        int A = scanner.nextInt();

        scanner.close();


        if(A % 2 == 0 ){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }
}

public static void Ejercicio6(Scanner scanner){
        System.out.println("Ingrese un valor para saber si es positivo o negativo");
        int B = scanner.nextInt();
        scanner.close();

        if(B < 0){
            System.out.println("El valor es negativo");
        }
        else{
            System.out.println("El valor es positivo");
        } 
}

public static void Ejercicio7(Scanner scanner){
    System.out.println("Ingrese un valor:");
        int B = scanner.nextInt();
        scanner.close();

        if(B < 0){
            System.out.println("El valor es negativo");
        }
        else{
            System.out.println("El valor es positivo");
        }

        if(B % 2 == 0 ){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }

        if(B % 5 == 0 ){
            System.out.println("El numero es multiplo de 5");
        }
        else{
            System.out.println("El numero NO es multiplo de 5");
        }

        if(B % 10 == 0 ){
            System.out.println("El numero es multiplo de 10");
        }
        else{
            System.out.println("El numero NO es multiplo de 10");
        }

        if(B > 100){
            System.out.println("B Es mayor que 100");
        }
        else{
            System.out.println("B Es menor que 100");
        }
}

public static void Ejercicio8(Scanner scanner){
    System.out.println("Ingrese un nombre");
    String nombre = scanner.next();
    scanner.close();
    System.out.println("Buenos Dias " + nombre); 
}
public static void Ejercicio9(Scanner scanner){
    System.out.println("Ingrese un numero");
    int A = scanner.nextInt();
    int doble = A * 2;
    int triple = A * 3;
    System.out.println("Doble: " + doble + " Triple: " + triple); 
}

public static void Ejercicio10(Scanner scanner){
    System.out.println("Ingrese los grados Fahrenheit");
    double gradosF = scanner.nextDouble();
    scanner.close();
    double gradosC = (gradosF - 32) * 5/9;
    System.out.printf("Temperatura en grados Celsius: %.2f ", gradosC);
        
}

public static void Ejercicio11(Scanner scanner){
    System.out.println("Ingrese el radio de la circunferencia");
    double radio = scanner.nextDouble();
    scanner.close();

    double longitud = radio * (Math.PI * 2);
    System.out.printf("Longitud: %.2f \n", longitud);

    double area = Math.PI * (Math.pow(radio, 2)); 
    System.out.printf("Area: %.2f \n", area);
}

public static void Ejercicio12(Scanner scanner){
    System.out.println("Ingrese los Km por hora");
        double kilometros = scanner.nextDouble();
        scanner.close();

        double metros = kilometros / 3.6;
        System.out.printf("La velocidad en Km/h es de %.2f y en M/s es de: %.2f \n", kilometros, metros); 
}

public static void Ejercicio13(Scanner scanner){
    System.out.println("Ingrese el cateto 1 del triangulo: ");
        double cateto1 = scanner.nextDouble();

        System.out.println("Ingrese el cateto 2 del triangulo: ");
        double cateto2 = scanner.nextDouble();

        scanner.close();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)) ;
        System.out.println("La hipotenusa del triangulo es: " + hipotenusa);
}

public static void Ejercicio14(Scanner scanner){
    System.out.println("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();

        scanner.close();
        float aux = 4;
        float aux1 = 3;
        double auxiliar = aux/aux1;
        double volumen = (auxiliar) * Math.PI * Math.pow(radio, 3);

        System.out.println("El volumen de la esfera es: " + volumen);
}

public static void Ejercicio15(Scanner scanner){
    System.out.println("Ingrese la altura del triangulo: ");
        double altura = scanner.nextDouble();

        System.out.println("Ingrese la base del triangulo: ");
        double base = scanner.nextDouble();
        scanner.close();
        double area = (altura*base) / 2;
        System.out.println("Area del triangulo: " + area);
}

public static void Ejercicio16(Scanner scanner){
    System.out.println("Ingrese el numero de 3 cifras");
        int numero = scanner.nextInt();
        scanner.close();
        int num3 = (numero % 10);
        int num2 = ((numero % 100) - num3) / 10;
        int num1 = (numero - num2 - num3) / 100;
        System.out.println("Num 1: " + num1);
        System.out.println("Num 2: " + num2);
        System.out.println("Num 3: " + num3);

}

public static void Ejercicio17(Scanner scanner){
    System.out.println("Ingrese el numero de 5 cifras");
        int numero = scanner.nextInt();
        scanner.close();
        if(Integer.toString(numero).length() == 5) {
            String numeroStr = Integer.toString(numero);
            System.out.print("Las cifras en posiciones impares son: ");
            for(int i = 0; i < 5; i++) {
                if(i % 2 == 0) {
                    System.out.print(numeroStr.charAt(i) + " ");
                }
            }
        } else {
            System.out.println("El número ingresado no tiene 5 cifras.");
        } 
}

public static void Ejercicio18(Scanner scanner){
    System.out.println("Ingrese la hora");
        int hora = scanner.nextInt();
        while(hora > 23){
            System.out.println("Ingrese una hora valida");
            hora = scanner.nextInt();
        }

        System.out.println("Ingrese los minutos");
        int minutos = scanner.nextInt();
        while(minutos > 59){
            System.out.println("Ingrese un minuto valido");
            minutos = scanner.nextInt();
        }

        System.out.println("Ingrese los segundos");
        int segundos = scanner.nextInt();
        while(segundos > 59){
            System.out.println("Ingrese un segundo valido");
            segundos = scanner.nextInt();
        }

        System.out.printf("La hora es: %d:%d:%d ", hora, minutos, segundos);
}
}