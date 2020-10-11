import java.util.Scanner;
import java.lang.Math;

public class FirstTask {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the dimension of the matrix: ");

        int dimensionOfMatrix = scanner.nextInt();

        for(int rows = 0; rows < dimensionOfMatrix; ++rows){
            // Cada vez que este ciclo se ejecuta, estamos cambiando de linea,
            // puesto que este bloque construye el contenido de las filas
            String row = "";
            for(int columns = 0; columns < dimensionOfMatrix; ++columns){
                if((rows + columns == columns) || (rows + columns == dimensionOfMatrix - 1) || (rows == columns) ||
                        (columns == (dimensionOfMatrix / 2)) || (columns == (dimensionOfMatrix / 2) - 1) ||
                        (rows == dimensionOfMatrix - 1)){
                    row += "\t 1";
                } else{
                    row += "\t 0";
                }

            }
            System.out.println(row);
        }

    } // MAIN METHOD ENDS
}
