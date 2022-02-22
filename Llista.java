import java.util.Scanner;

public class Llista {
   private static Producte[] productos = new Producte[0];
   private static Categoria[] categorias = new Categoria[0];
   private static Scanner entr = new Scanner(System.in);
   
   public static void main(String[] args) {
   }
   
   public static void crearProducto() {
      System.out.println("Nom: ");
      String nom = entrada.netxtLine().strip();
      if (nom.isBlank) {
         System.out.println("Error: Introduzca minimo una letra o numero!");
         return;
      }
      for(Producte a : productos) {
          if(p.getNom().equals(nom)) {
            System.out.println("Error: El Producto que quiere crear ja existe!")
            return;
          }
      System.out.println("Quantitat?");
      String Qt = entrada.netxtLine().strip();
      if (Qt.isBlank){
         Qt = 1;
      }
      if (Qt < 0) {
         System.out.println("Error: Introduzca una cantidad valida!")
         return;
  }


  public static void editarProducto() {
  }

  public static void borrarProducto() {
  }
  
  public static void MostrarProductoPorCategoria() {
  }
}

 
