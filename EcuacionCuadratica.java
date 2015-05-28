
/**
 * Write a description of class EcuacionCuadratica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EcuacionCuadratica
{
	private int a;
	private int b;
	private int c;
	public EcuacionCuadratica(int valA, int valB, int valC)
	{
		a=valA;
		b=valB;
		c=valC;
	}
	public boolean verificarPositivo(double num)
	{
	    boolean resp;
	    if(num>0)
	    {
	        resp=true;
	    }
	    else
	    {
	        resp=false;
	    }
	    return resp;
	}
	public boolean verificarCero(double num)
	{
	    boolean resp;
	    if(num==0)
	    {
	        resp=true;
	    }
	    else
	    {
	        resp=false;
	    }
	    return resp;
	}
	public boolean verificarNegativo(double num)
	{
	    boolean resp;
	    if(num<0)
	    {
	        resp=true;
	    }
	    else
	    {
	        resp=false;
	    }
	    return resp;
	}
	public double calcularDiscriminante()
	{
	    double dis;
	    dis=Math.pow(b,2)-4*a*c;
	    return dis;
    }
    public String resolverEcuacion()
    {
        double x1,x2,xr,xi,dis;
        String resp;
        if(a!=0)
        {
            dis=calcularDiscriminante();
            if(verificarPositivo(dis)==true)
            {
                x1=(-b+Math.sqrt(dis))/(2*a);
                x2=(-b-Math.sqrt(dis))/(2*a);
                resp="raices reales distintas: x1= " + x1 + " x2= " + x2;
            }
            else
            {
                if(verificarCero(dis)==true)
                {
                    x1=-b/(2*a);
                    x2=-b/(2*a);
                    resp="raices reales iguales: x1= " + x1 + " x2= " + x2;
                }
                else
                {
                    xr=-b/(2*a);
                    xi=Math.sqrt(-dis)/(2*a);
                    resp="raices complejas conjugadas: xr= " + xr + " xi= " + xi + " y xr= " + xr + " -xi= " + (-xi);
                }
            }
        }
        else
        {
            resp="ERROR no es una ecuacion cuadratica";
        }
        return resp;
    }
}
	