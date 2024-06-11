import java.util.Scanner;

public class eureka {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite su palabra:");
        String frase=leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("es correcto");
        }else{
            System.out.println("clave incorrecta");
        }
    }
}