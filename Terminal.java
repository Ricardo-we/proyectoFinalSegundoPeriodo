package terminal;

import java.util.Scanner;

public class Terminal {

    public static String ordenesBasicas = "Que operacion quieres hacer? "
                                        + "\n <|suma o 1| |resta o 2| |multiplicacion o 3|"
                                        + " |division o 4| |residuo o 5| |ayuda o 6| "
                                        + " |Exit para salir o 7| |tabla o 8|>";
    

    public static void main(String[] args) {
        //new terminalObj1Image();
        //calculadoraInfinita();
         new TerminalGUI();
    }

    public static void calculadoraInfinita() {

        Scanner scn = new Scanner(System.in);
        Scanner respuestaMasOperaciones = new Scanner(System.in);
        Scanner scannerOperacion = new Scanner(System.in);
        
        String OperacionDeseada;
        boolean switcher = true;

        do {

            double val1, val2;
            aritmeticaSimple si = new aritmeticaSimple();
            System.out.println(ordenesBasicas);
            OperacionDeseada = scannerOperacion.nextLine();
            
            
            switch ( OperacionDeseada.toLowerCase() ) {

                //SUMA
                case "suma","1":
                    System.out.println("Haz seleccionado suma");
                    double answer1 = si.suma();
                    System.out.println(answer1 + "\n");
                    break;

                //MULTIPLICACION
                case "multiplicacion","2":
                    System.out.println("Haz seleccionado multiplicacion");
                    double answer2 = si.multiplicacion();
                    System.out.println(answer2 + "\n");
                    break;

                //RESTA
                case "resta","3":
                    System.out.println("Haz seleccionado resta");
                    double answer3 = si.resta();
                    System.out.println(answer3 + "\n");
                    break;

                //DIVISION
                case "division","4":
                    System.out.println("Haz seleccionado division");
                    double answer4 = si.division();
                    System.out.println(answer4 + "\n");
                    break;

                //RESIDUO
                case "residuo","5":
                    System.out.println("Haz seleccionado residuo");
                    double answer5 = si.residuo();
                    System.out.println(answer5+ "\n");
                    break;
             
                    //AYUDA
                case "ayuda","help","6":
                     System.out.println("Haz seleccionado ayuda");
                     new ayuda();
                     break;
                     
               //SALIR
                case "exit","salir","7":
                    System.out.println("Haz finalizado el programa" + "\n" + "GRACIAS");
                    switcher = false;
                    break; 

                //INFORMACION DE SISTEMAS E INSTALACION DE SOFTWARE
                case "tabla","8":
                    System.out.println("Información sobre Sistemas e instalacion de software");
                    System.out.println("El software de sistema es todo aquello que se denomina “sistema operativo”. Entre ellos se encuentran Windows, Mac OS, Ubuntu (entre otras distribuciones de Linux), Unix, Fedora y Solaris, entre otros.");
                    System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________");
                    System.out.println("Cada lenguaje de programación está formado por determinados símbolos y reglas sintácticas y semánticas, es decir que para cada lenguaje los símbolos tienen su propia estructura y significado.\n" +
                                        "\n" +
                                        "Un lenguaje de software está formado por\n" +
                                        "\n" +
                                        "Variable y vectores. Las variables son espacios de memoria, es decir, contenedores de datos. Los vectores son un tipo específico de variables compuestas.\n" +
                                        "Condicionales. Son las premisas necesarias para que se ejecute el programa.\n" +
                                        "Blucles. Ejecutan un código constantemente siempre que se cumpla una premisa.\n" +
                                        "Funciones. Son variables que encierran un código en sí mismas.\n");
                    System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________");
                    System.out.println("Todos los objetos tecnologicos deben tener un hardware y un software sin uno de estos su funcionamiento seria imposible");
                    System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________");
                    System.out.println("En informática, un núcleo o kernel es un software que constituye una parte fundamental del sistema operativo");
                    System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________________");
                    System.out.println("Mantenimiento: Algunos tipos de software requieren un proceso periódico de control, mejora y optimización.\n");
                    break;
            }
                    
                    
            }while (switcher == true);   
                
            
        }  
    }
      

