public class Producte {
  private String nom;
  private int cantidad;
  private String categoria;
  
  public Producte(String nombre,  int cantidad, String categoria) {
        this.nom = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
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

  public String getCategoria() {
         return this.categoria;
  }

  public void setCategoria(String categoria) {
      this.categoria = categoria;
  }
}
        

