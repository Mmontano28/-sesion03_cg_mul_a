
package sesion03_cg_mul_a;
public class Cilindrica 
{
    private double p //radio del cilindro
                  ,angulo1//Angulo entre el punto y el origen
                  ,z1;//Altura del cilindro
     //Constructores
    public Cilindrica(double p, double angulo1, double z1) 
    {
        this.p = p;
        this.angulo1 = angulo1;
        this.z1 = z1;
    }

    public Cilindrica() 
    {
        
    }
    public Cilindrica esferica_cilindrica(double radio,double anguloE, double anguloF)//De coordenadas esfercias a cilindricas
    {
      double p= (double)radio* Math.sin(anguloE);
      double angulo1= (double) anguloF;
      double z1 =(double)radio* Math.cos(anguloE);
      return new Cilindrica(p, angulo1,z1);
    }
    
    public Cilindrica esferica_cilindrica(Esferica m)//De coordenadas esfercias a cilindricas
    {
            return esferica_cilindrica(m.getRadio(),m.getAnguloE(),m.getAnguloF());
        
    }
    public Esferica cilindrica_esferica(double p,double angulo1,double z1)//De coordenadas cilindricas a esfericas
    {
        double radio = (double)Math.sqrt(Math.pow(p, 2)+Math.pow(z1, 2));
        double anguloE=(double)Math.atan(p/z1);
        double anguloF=angulo1;
        return new Esferica(radio,anguloE,anguloF);
    }
    public Esferica cilindrica_esferica(Cilindrica z)//De coordenadas cilindricas a esfericas
    {
        return cilindrica_esferica(z.getP(),z.getAngulo1(),z.getZ1());
        
    }
    
    //Getter y setter
    
    public double getP()
    {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getAngulo1() {
    return angulo1;
    }

    public void setAngulo1(double angulo1) {
        this.angulo1 = angulo1;
    }

    public double getZ1() {
        return z1;
    }

    public void setZ1(double z1) {
        this.z1 = z1;
    }
    
}
