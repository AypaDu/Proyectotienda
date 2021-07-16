public class Producto {
  
  private String nombre = "";/*En este caso no es necesario darle un valor inicial */
  private float precio = 0;

public Producto() {
  
}
  public void mostrar(){
    String precioTexto = String.format("%,d", (int) precio);  
    System.out.println(nombre + ": " + precioTexto);
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }

  public String getNombre(){
    return this.nombre;
  }

  public float getPrecio(){
    return this.precio;
  }
}
