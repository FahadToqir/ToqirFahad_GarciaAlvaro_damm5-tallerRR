public class Producte {
  private String nom;
  private int cantidad;
  
  public Producte(String nombre,  int cantidad) {
        this.nom = nombre;
        this.cantidad = cantidad;
  }

  public String getNom() {
        return this.nom;
  }
  
  public void setNom(String nombre) {
        this.nom = nombre;
    }

  public int getCantidad() {
        return this.cantidad;
  }

  public void setCantidad(int Cantidad) {
       this.cantidad = cantidad;
  }
}
        

