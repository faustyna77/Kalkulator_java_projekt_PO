import java.util.Scanner;

public class Poteguj extends Podstawy {


    public double result;
   Scanner in =new Scanner(System.in);

    public Poteguj(double podstawa,double wykladnik)
    {

        super(podstawa,wykladnik);


    }


    public  void  operation()
    {
        System.out.println("wybrałeś potegowanie");
    }
    public void result()
    {
        System.out.println("podaj podstawe ");
        double podstawa=in.nextDouble();
        System.out.println("podaj wykładnik");
        double wykladnik=in.nextDouble();
        double result=Math.pow(podstawa,wykladnik);
        System.out.println(result);



    }
    public  void printinfo()
    {
            System.out.println("wynik to "+result);
    }




}
