/**
* @author David Carapia
*/
public class Coche{
  // Sección de atributos
  private String color;
  private String marca;
  private int numPuertas;
  private int ano;
  private int potencia;
  private boolean automatico;
  
  private Persona chofer;
  private Persona copiloto;
  private Persona pasajero1;
  private Persona pasajero2;
  // Sección de constructores
  public Coche(){
    // constructor vacio
  }
  public Coche(String marca, int ano, String color, int numPuertas, boolean automatico, int potencia, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2){
    this.marca = marca;
    this.ano = ano;
    this.color = color;
    this.numPuertas = numPuertas;
    this.automatico = automatico;
    this.potencia = potencia;

    chofer = new Persona ();
    this.chofer = chofer;

    copiloto = new Persona ();
    this.copiloto = copiloto;

    pasajero1 = new Persona ();
    this.pasajero1 = pasajero1;
    
    pasajero2 = new Persona ();
    this.pasajero2 = pasajero2;
  }
  // Sección de metódos
  public void encender(){
    System.out.println("Soy el coche de la marca "+marca+" y estoy encendiendo");
  }
  public void avanzar(boolean avanza){
    //avanza == true
    // true == true --> true
    if(avanza){
      System.out.println("Estoy avanzando a 10 km/h");
    }else{
      System.out.println("Voy a 0 km/h");
    }
  }
  public void apagar(){
    System.out.println("Soy el coche de la marca "+marca+" y estoy apagandome");
  }
  public void frenar(boolean frenar){
    if(frenar){
      System.out.println("Estoy frenando");
    }else{
      System.out.println("No estoy frenando");
    }
  }
  public void abrirPuertas(int numPuertasAAbrir){
    if(numPuertasAAbrir > numPuertas){
      System.out.println("El número de puertas a abrir es mayor al número de puertas del coche");
    }else{
      System.out.println("Abriendo"+numPuertasAAbrir+" puertas");
    }
  }

  //GETTERS Y SETTERS

  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color = color;
  }

  public String getMarca(){
    return marca;
  }
  public void setMarca(String marca){
    this.marca = marca;
  }

  public int getNumPuertas(){
    return numPuertas;
  }
  public void setNumPuertas(int numPuertas){
    this.numPuertas = numPuertas;
  }

  public int getAno(){
  return ano;
  }
  public void setAno(int ano){
    this.ano = ano;
  }

  public int getPotencia(){
    return potencia;
  }
  public void setPotencia(int potencia){
    this.potencia = potencia;
  }

  public boolean getAutomatico(){
    return automatico;
  }
  public void setAutomatico(boolean automatico){
    this.automatico = automatico;
  }

  public Persona getChofer(){
    return chofer;
  }
  public void setChofer(Persona chofer){
    this.chofer = chofer;
  }

  public Persona getCopiloto(){
    return copiloto;
  }
  public void setCopiloto(Persona copiloto){
    this.copiloto = copiloto;
  }

  public Persona getPasajero1(){
    return pasajero1;
  }
  public void setPasajero1(Persona pasajero1){
    this.pasajero1 = pasajero1;
  }

  public Persona getPasajero2(){
    return pasajero2;
  }
  public void setPasajero2(Persona pasajero2){
    this.pasajero2 = pasajero2;
  }

  @Override
  public String toString(){
    return "Coche{"+"marca= "+marca+" año= "+ano+" color="+color+" numPuertas= "+numPuertas+"automático= "+automatico+" potencia"+potencia+" chofer= "+chofer+" copiloto= "+copiloto+" pasajero1= "+pasajero1+" pasajero2= "+pasajero2+"}";
  }
}