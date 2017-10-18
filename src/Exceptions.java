import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] arg) throws FileNotFoundException
    {
        try {
            File archivo = new File("entrada.txt");
            Scanner teclado = new Scanner(archivo);
            System.out.print("Dime un numero: ");
            int num1 = teclado.nextInt();
            System.out.print("Dime otro numero: ");
            int num2 = teclado.nextInt();
            System.out.print("La division es:  " + num1 / num2);
        }
        catch(ArithmeticException expecionAritmetica)
        {
            System.out.println("Division entre cero");
        }
        catch(InputMismatchException excepcionEntrada)
        {
            System.out.println("Entrada Incorrecta");
        }
       /* catch(FileNotFoundException e)
        {
            System.out.println("No existe el archivo");
        }*/

    }
}
