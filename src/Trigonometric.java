import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class  Trigonometric implements Start {

    public double alfa;
    public int var;
    public Trigonometric(double alfa)

    {
        this.alfa=alfa;
    }



    public void menu()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Wybrana opcja pozwala wyznaczyć wartości trygomoemtryczne poszczegółnych kątów dla radianów");




    }


    public void wybor()
    {
        System.out.println("Wybierz, która wartość chcesz obliczyc " +
                "1-sin(alfa)   2-cos(alfa)  3-tan(alfa)");

         String trace;
        Scanner in=new Scanner(System.in);
        int var =in.nextInt();
        System.out.println("podaj kat");
        alfa=in.nextDouble();
        switch (var)
        {
            case 1:
            {
                double wynik=Math.sin(alfa);
                System.out.println(wynik);
            }
            break;
            case 2:
            {   double wynik=Math.cos(alfa);
                System.out.println(wynik);
            }
            break;
            case 3:
            {

                System.out.println(Math.tan(alfa));
            }
            break;

        }












    }
    public void  result()
    {






    }


}
