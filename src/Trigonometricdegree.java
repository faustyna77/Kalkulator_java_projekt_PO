import java.util.Scanner;

public class Trigonometricdegree extends Trigonometric{

        public double variable;
    public Trigonometricdegree(double alfa,double variable) {

        super(alfa);
        this.variable=variable;

    }



    public void menu()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Wybrana opcja pozwala wyznaczyć wartości kątów dla wartości funkcji trygonometrycznych ");




    }


    public void wybor()
    {
        System.out.println("Wybierz, która wartość chcesz obliczyc " +
                "1-sin()   2-cos() 3-tan()");


        Scanner in=new Scanner(System.in);
        int var =in.nextInt();
        System.out.println("podaj wartość");
        alfa=in.nextDouble();
        double mathtodegree=Math.toRadians(alfa);
        switch (var)
        {
            case 1:
            {
                System.out.println(Math.sin(mathtodegree));
            }
            break;
            case 2:
            {
                System.out.println(Math.cos(mathtodegree));
            }
            break;
            case 3:
            {
                System.out.println(Math.tan(mathtodegree));
            }
            break;

        }




    }
    public void  result()
    {


       /* double [] result={Math.sin(alfa),Math.cos(alfa),Math.tan(alfa)};
        return result[var-1];*/



    }





}
