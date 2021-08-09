
package sesion03_cg_mul_a;

   public class Cartesianas
{
    private float x;
    private float y;
    

    public Cartesianas(float x, float y) 
    {
        this.x = x;
        this.y = y;
        
    }
       public Cartesianas() 
       {
    }

    public Cartesianas polar_cartesiano(float radio, float angulo) /*De polares a cartesianas*/
    {
        float x = radio * (float)Math.cos(angulo);
        float y = radio * (float)Math.sin(angulo);
        return new Cartesianas(x, y);
        
    }
      public Cartesianas polar_cartesiano (Polar p) /*De polares a cartesianas*/
      {
          /*float x = p.getRadio()*(float)Math.cos(p.getAngulo());
          float y = p.getRadio()*(float)Math.sin(p.getAngulo());
            return new Cartesiana(x,y);*/
          return polar_cartesiano(p.getRadio(),p.getAngulo());
          
        }
    
    public Polar cartesiano_polar(float x, float y)/*De  cartesianas a polares*/ 
    {
        float radio = (float)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));   
        float angulo = (float)Math.atan(y/x);   
        return new Polar(radio, angulo);
       
    }
 public Polar cartesiano_polar (Cartesianas c) /*De  cartesianas a polares*/ 
 {
        /*float radio = (float)Math.sqrt(Math.pow(c.getX(), 2)+Math.pow(c.getY(), 2));   
        float angulo = (float)Math.atan(c.getY()/c.getX());   
            return new Polar();*/
            return cartesiano_polar(c.getX(),c.getY());
        }
        
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    
}
 

