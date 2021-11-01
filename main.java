import java.util.Scanner;

public class main {
    public static void main(String [] args){
        //buclewhile();
        //numeroRandom();
        //doWhile();
        //bucleFor();
        //bucleForDoWhile();
        asteriscos();
    }

    public static void buclewhile(){
        String claveP = "1234";
        String claveI = " ";
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu clave");
        claveI = sc.nextLine();
        while (claveP.equals(claveI) == false ){
            System.out.println("La clave es incorrecta, Introduce la clave otra vez");
            claveI = sc.nextLine();
        }
        System.out.println("Bienvenid@");


    }

    public static void numeroRandom(){
        Scanner sc1 = new Scanner(System.in);
        int numeroAleatorio;
        numeroAleatorio = (int) (Math.random() * 100);
        System.out.println("El programa ha generado un número aleatorio entre 0 y 99.");
        System.out.println("Por favor, intenta adivinarlo :D");

        int numeroUsuario;
        numeroUsuario = sc1.nextInt();
        while (numeroUsuario == numeroAleatorio == false) {
            System.out.println("Lo siento, prueba de nuevo <3");
            numeroUsuario = sc1.nextInt();
        }
        System.out.println("Enhorabuena, lo lograste, el número era: "+ numeroAleatorio);

    }

    public static void doWhile(){
        Scanner sc2 = new Scanner(System.in);
        int cafe;

        do {
            System.out.println("Bienvenido a la máquina de café 24h, que desea?");
            System.out.println("1 - Café solo");
            System.out.println("2 - Café con leche");
            System.out.println("3 - Café cortado");
            System.out.println("4 - Capuchino");
            System.out.println("5 - Descafeinado");
            cafe = sc2.nextInt();

            switch (cafe){
                case 1:
                    System.out.println("Preparando café solo...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("Listo, vuelva pronto <3");
                    break;
                case 2:
                    System.out.println("Preparando café con leche...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("Listo, vuelva pronto <3");
                    break;
                case 3:
                    System.out.println("Preparando café cortado...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("Listo, vuelva pronto <3");
                    break;
                case 4:
                    System.out.println("Preparando capuchino...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("Listo, vuelva pronto <3");
                    break;
                case 5:
                    System.out.println("Preparando descafeinado...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("Listo, vuelva pronto <3");
                    break;
                default:
                    System.out.println("Lo sentimos café no encontrado o no disponible");
            }
        }while (cafe != 1 && cafe != 2 && cafe != 3 && cafe != 4 && cafe != 5);

    }

    public static void bucleFor() {
        Scanner sc3 = new Scanner(System.in);
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(i);
        }
        for (int a = 0 ; a < 10 ; a+=2){
            System.out.println(a);
        }
    }

    public static void bucleForDoWhile(){
        /*Scanner sc4 = new Scanner(System.in);
        System.out.println("Introduce un email");
        String mail = sc4.nextLine();
        boolean mailok = false;

        for (int i = 0; i<mail.length(); i++){
            if(mail.charAt(i)=='@'){
                System.out.println("Correo aceptado");
                mailok = true;
                break;
            }
        }
        if (mailok == false){
            System.out.println("Correo incorrecto");
        }*/
        //ejercicio que modifico

        Scanner sc4 = new Scanner(System.in);
        String mail;
        boolean mailok = false;

        do{
            System.out.println("Introduce un email");
            mail = sc4.nextLine();
        for (int i = 0; i<mail.length(); i++){
            if(mail.charAt(i)=='@'){
                System.out.println("Correo aceptado");
                mailok = true;
                break;
            }

        if (mailok == false) {

            System.out.println("Correo incorrecto");
            System.out.println("Introduce otro correo");
            mail = sc4.nextLine();
        }
        }
        } while (mailok == true);
        System.out.println("Correo aceptado");
    }

    public static void asteriscos(){
        int altura = 5;
        for (int i = 1; i<=altura; i++){
            //Este bucle pinta los asteriscos en cada fila
            for (int j=0; j<i; j++){
                System.out.print("*"); //usamos print ya que si usamos println hace salto de linea
            }
            System.out.println(" ");
        }
    }
}
