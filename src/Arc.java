import java.util.Scanner;

public class Arc extends Trigonometric {

    public double alfa;
    public double beta;
    public Arc(double alfa)
    {
        super(alfa);

    }

    public void wybor()
    {
        System.out.println("Wybierz opcje 1-asin() 2-acos() 3-atan ");

    }
    public void menu()
    {
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();
        System.out.println("podaj wartośc dla, której kąt chcesz wyznaczyc ");
        double value=scan.nextDouble();
        switch(choice)
        {
            case 1:
                double radious=Math.asin(value);
                System.out.println("wartość kąta w radianach dla wartości tego sinusa wynosi : "+radious);
                break;
            case 2:
                double radious2=Math.acos(value);
                System.out.println("wartość kąta w radianach dla wartości tego sinusa wynosi : "+radious2);
                break;
            case 3:
                double radious3=Math.atan(value);
                System.out.println("wartość kąta w radianach dla wartości tego sinusa wynosi : "+radious3);
                break;



        }


    }

}
