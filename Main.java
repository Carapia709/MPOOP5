/**
* @author David Carapia
*/
public class Main {
  public static void main(String[] args) {
    Circulo cir = new Circulo();
    System.out.println(cir);
    cir.setRadio(5.6f); // -> primer solución
    System.out.println(cir);
    cir.setRadio((float)7.33); // -> segunda solución
    System.out.println(cir);
    float var = -8.66f;
    cir.setRadio(var);
    System.out.println(cir);
    System.out.println("######COMPOSICIÓN#######");
    Persona persona1 = new Persona();
    System.out.println(persona1);
    persona1.setNombre("Susana");
    persona1.setApellido("Vazquez");
    Fecha fecha = new Fecha(2,1,2021);
    persona1.setFNacimiento(fecha);
    System.out.println(persona1);
    //System.out.println(persona1.getFNacimiento().getAnio());

    System.out.println("######COMPOSICIÓN2#######");
    Persona persona2 = new Persona("Rafael", "Zavala", 8,4,1998);
    System.out.println(persona2);

    System.out.println("######ACTIVIDAD EXTRA#######");
    Coche coche1 = new Coche();
    coche1.setMarca("Nissan");
    coche1.setAno(2005);
    coche1.setColor("Rojo");
    coche1.setNumPuertas(4);
    coche1.setAutomatico(true);
    coche1.setPotencia(700);
    Fecha fchof = new Fecha(7, 7, 1996);
    Persona chofer1 = new Persona("César", "Ramírez", fchof);
    coche1.setChofer(chofer1);
    Fecha fcop = new Fecha(28, 04, 1996);
    Persona cop1 = new Persona("Julián", "López", fcop);
    coche1.setCopiloto(cop1);
    Fecha fpas1 = new Fecha(28, 1, 2010);
    Persona pas1 = new Persona("Guadalupe", "Castañeda", fpas1);
    coche1.setPasajero1(pas1);
    Fecha fpas2 = new Fecha(3, 11, 1999);
    Persona pas2 = new Persona("Carmen", "Jímenez", fpas2);
    coche1.setPasajero2(pas2);

    System.out.println(coche1);
    
  }
}