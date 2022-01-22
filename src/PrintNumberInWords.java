import java.util.Scanner;

public class PrintNumberInWords {
    public static void main(String[] args) {
        int number = 0;
        int [] numbersQuantity = new int[10];

        Scanner scanner = new Scanner(System.in);

        for(int i=0; 1<numbersQuantity.length; i++){

            System.out.println("Podaj numer");
            number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Jeden");
                    break;
                case 2:
                    System.out.println("Dwa");
                    break;
                case 3:
                    System.out.println("Trzy");
                    break;
                case 4:
                    System.out.println("Cztery");
                    break;
                case 5:
                    System.out.println("Pięć");
                    break;
                case 6:
                    System.out.println("Sześć");
                    break;
                case 7:
                    System.out.println("Siedem");
                    break;
                case 8:
                    System.out.println("Osiem");
                    break;
                case 9:
                    System.out.println("Dziewięć");
                    break;
                default:
                    System.out.println("Podaj liczbę naturalną mniejszą od 10");
            }
        }

        scanner.close();
    }
}
