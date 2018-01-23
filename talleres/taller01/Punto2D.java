public class Punto2D {
    private float x;
    private float y;
    private float x1;
    private float y1;

    public Punto2D(float x, float y, float x1, float y1)
    {
        this.x=x;
        this.y=y;
        this.x1=x1;
        this.y1=y1;  
    }

    public float radio(){
        return (float)Math.sqrt((x*x)+(y*y));
    }

    public float angulo(){
        return (float)Math.atan(y / x);   
    }

    public float Distancia_euclidiana(){
        return (float)Math.sqrt(((x1-x)*(x1-x))+((y1+y)*(y1+y)));
    }

}