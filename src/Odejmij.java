import java.util.Scanner;

public class Odejmij extends Podstawy{

    public Odejmij(double number1,double number2)
    {
        super(number1,number2);
    }

    public   void  operation()
    {
        System.out.println("wybrałeś odejmowanie ciągu liczb");
    }

    public void result()
    {
        double resultend=0;
        Scanner in=new Scanner(System.in);
        System.out.println("podaj liczby,które chcesz odjąć jeśli chcesz zakończyć odejmowanie to podaj 0");
        do {


            x=in.nextDouble();
            resultend-=x;
        }while(x!=0);

        System.out.println("Wynik odejmowania liczb  to "+resultend);
    }
    public void printinfo()
    {

    }




}
