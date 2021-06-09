//Propietario: Rodriguez Cortes Jesus Onofre
import java.util.Scanner;

public class AutomataEstadoFinito{
	 /*Se inicializan las variables que se usara*/
    public static String cadena = "";
    public static String cadenaDemoTrue = "abc1234";
    public static String cadenaDemoFalse = "abc+1234";
    
    /*Este es menu principal donde te da a escoger tres opciones
      1. mostrar el ejemplo auomatico para entender el automata
      2. podra escribir cadenas para probar el automata, ingrese las cadenas que tenga en mente para analizar el resultado del automata
      3. Salir del programa*/
    public static void main(String[] args) {
        Scanner leerOpc = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("Tema: Maquina de Estado Finito");
            System.out.println("Este programa simula una maquina de estado finito, la cual puede leer y aceptar letras y digitos numericos");
            System.out.println("DATO: Una maquina de estado finito tiene una entrada y una salida de datos, la cual debe ser acetada por la maquina, tiene un incio y un fin, una validacion o un rechazo");
            System.out.println("OPCIONES: ");
            System.out.println("1. Demostracion de la maquina de estado finito");
            System.out.println("2. Haga una prueba desde teclado");
            System.out.println("3. Salir del programa");
            System.out.print("Por favor ingrese una accion a realizar: ");
            opc = leerOpc.nextInt();

            switch(opc){
                case 1:
                    System.out.println("");
                    System.out.println("Se haran dos prubas en la maquina, una con una cadena aceptada y la otra con una cadena rechazada: ");
                    System.out.println("Cadena aceptada");
                    mostrarValidacion(cadenaDemoTrue);
                    System.out.println("Cadeana no aceptada");
                    mostrarValidacion(cadenaDemoFalse);
                    //se pausa el tiempo de ejecucion para ver el resultado con mas facilidad
                    try{ Thread.sleep(6000);
                    }catch(InterruptedException e ) { 
                        System.out.println("no se pudo hacer la pausa");
                    }
                    break;
                case 2:
                    Scanner leerCadena = new Scanner(System.in);
                    System.out.println("");
                    System.out.print("Ingresa una cadena para su validacion: ");
                    cadena = leerCadena.nextLine();
                    mostrarValidacion(cadena);
                    try{ Thread.sleep(6000);
                    }catch(InterruptedException e ) { 
                        System.out.println("no se pudo hacer la pausa");
                    }
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Espero que le haya gustado esta maquina de estado finito");
                    try{ Thread.sleep(6000);
                    }catch(InterruptedException e ) { 
                        System.out.println("no se pudo hacer la pausa");
                    }
                    break;
                default:
                    System.out.println("");
                    System.out.println("Esta opcion es invalida");
                    try{ Thread.sleep(6000);
                    }catch(InterruptedException e ) { 
                        System.out.println("no se pudo hacer la pausa");
                    }
            }
        }while(opc != 3);
    }
    /*Esta metodo sera el que evaluara la varieble booleana, si es verdadera, la cadena fue aceptada, si es falsa, sera rechazada*/
    public static void mostrarValidacion(String _cadena){
                if(validacionCadena(_cadena)){
                    System.out.println("CADENA VALIDA");
                    System.out.println(_cadena);
                }else{
                    System.out.println("CADENA NO VALIDA: hay un simbolo en la cadena");
                    System.out.println(_cadena);
                }
    }
    /*Este metodo valida la cadena, primero entra en un ciclo en el cual termina hasta llegar al limite de la cadena
      se usa una sentencia if para comparar cada caracter de la cadena con los metodo Character.isLetter (el cual analizara si son letras) 
      y el metodo Character.isDigit (el cual analizara si son digitos), si una de esas condiciones se cumple la varible booleana sera verdadera.
      si niguna de las condiciones se cumple, la varible booleana pasa a falsa y se rompe el ciclo pues ha encontrado un simbolo y ya no es necesario
      seguir analizando la cadena, finalmente retorna la variable booleana para su analisis*/
    public static boolean validacionCadena(String _cadena){
           boolean correcto = false;

           for(int i = 0; i<_cadena.length(); i++){
               if((Character.isLetter(_cadena.charAt(i)))||(Character.isDigit(_cadena.charAt(i)))){
                   correcto = true;
               }else{
                   correcto = false;
                   break;
               }
           }

           return correcto;
       }
   }