import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.printf ("Digite a sua nota\n");
        int nota = leitor.nextInt();
        if (nota>=6){
            System.out.printf(
                "A nota %d lhe garante aptovação\n",
                nota
            );
        }
        else
            System.out.printf(
                "A nota %d lhe não garante aptovação\n",
                nota
            ); 
        leitor.close();
    }
    
}
