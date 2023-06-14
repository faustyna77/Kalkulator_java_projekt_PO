import java.util.Scanner;
public class Delta extends Podstawy{

    public double c;
    public double a;
    public double b;
    public Delta(double a,double b,double c)
    {


        super(a,b);
        this.c=c;


    }


    public   void  operation()
    {
        System.out.println("Wybrałeś opcję do wyznaczania rozwiązania równania kwadratowego");
    }
    public  void result()
    {
        System.out.println("podaj współczynniki swojego równania kwadratowego");
        Scanner in=new Scanner(System.in);
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        System.out.println("Twoje równanie to "+a+"x^2"+b+"x"+c+"    "+"czy tak? t/n");
        double delta=Math.pow(b,2)-4*a*c;
        System.out.println("Delta wynosi "+delta);
        if(delta>0)
        {
            double x1=(-b+Math.sqrt(delta))/(2*a);
            double x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("Rozwiązzaniami są "+x1+" i "+x2);

        }else if(delta<0)
        {
            System.out.println("Brak rozwiązań w dziedzinie liczb rzeczyswistych ");

                double re = -b / (2 * a);
                double im = Math.sqrt(-delta) / (2 * a);
                System.out.println("Rozwiązania: " + re + "+" + im + "i i " + re + "-" + im + "i");

        }else if(delta==0)
        {
            double x=-b/(2*a);
            System.out.println("Rozwiązanie to "+x);
        }

    }
    public void printinfo()
    {

    }



}
