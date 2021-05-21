package terminal;

import java.util.Scanner;

public class Terminal {

    public static String ordenesBasicas = "Que operacion quieres hacer? "
                                        + "\n <|suma o 1| |resta o 2| |multiplicacion o 3|"
                                        + " |division o 4| |residuo o 5| |ayuda o 6| "
                                        + " |Exit para salir o 7|>";

    public static void main(String[] args) {
        new terminalObj1Image();
        calculadoraInfinita();

    }

    public static void calculadoraInfinita() {

        Scanner scn = new Scanner(System.in);
        Scanner respuestaMasOperaciones = new Scanner(System.in);
        Scanner scannerOperacion = new Scanner(System.in);

        //System.out.println("Quieres realizar una operacion? si o no");
        //String respuesta = respuestaMasOperaciones.nextLine();
        
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
                
               //SALIR
                case "exit","salir","7":
                    System.out.println("Haz finalizado el programa" + "\n" + "GRACIAS");
                    switcher = false;

            }
                
            
        }while (switcher == true);     
    }

}
