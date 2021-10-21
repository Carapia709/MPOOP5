/**
* @author David Carapia
*/
public class Circulo{
  //Atributos
  private float radio;

  //Constructor
  public Circulo(){}

  //Métodos
  public float perimetro(){
    return 2 * (float) Math.PI * radio;
  }

  public float area(){
    return (float) Math.PI * radio * radio;
  }

  //getter
  public float getRadio(){
    return radio;
  }

  //setter
  public void setRadio(float radio){
    if(radio < 0){
      this.radio = Math.abs(radio);
    }else{
      this.radio = radio;
    }
    
  }

  @Override //anotación para la documentación
  public String toString(){
    return "Circulo{radio= "+radio+"}";
  }
}