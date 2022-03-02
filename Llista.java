import java.util.Scanner;

public class Llista {
   private static Producte[] productos = new Producte[0];
   private static Categoria[] categorias = new Categoria[0];
   private static Scanner entr = new Scanner(System.in);
   
   public static void main(String[] args) {
    Menu();    
    MostraProducto();
   }
   public static void Menu() {
        System.out.println("1.Crear Producto");
        System.out.println("2.Editar Producto");
        System.out.println("3.Vaciar Lista");
        System.out.println("4.Mostrar Productos");
        System.out.println("Elige que quieres hacer!");
        String choose = entr.nextLine().strip();
        if (choose.equals("1")) {
           crearProducto();
        }
        if (choose.equals("2")) {
           editarProducto();
        } 
        if (choose.equals("3")) {
           VaciarLista();
        }
        if (choose.equals("4")) {
           MostraProducto();
        }
   }
   public static void crearProducto() {
      System.out.println("Nombre del Producto: ");
      String nom = entr.nextLine().strip();
      if (nom.isBlank()) {
         System.out.println("Error: Introduzca minimo una letra o numero!");
         return;
      }

      for(Producte a : productos) {
          if(a.getNom().equals(nom)) {
            System.out.println("Error: El Producto que quiere crear ja existe!");
            return;
          }
      }

      System.out.println("Categoria?");
      String categoria = entr.nextLine().strip();
      if(categoria.isBlank()) {
         System.out.println("Error: Introduzca minimo una letra o numero!");
         return;
      }
      

      System.out.println("Quantitat?");
      String Qt = entr.nextLine().strip();
      if(!UtilString.esEnter(Qt)) {
         System.out.println("Error: Introduzca una cantidad valida!");
      }
      
      if(Qt.isBlank()){
         System.out.println("Error: Introduzca una cantidad valida!");
      }
      int qt = Integer.parseInt(Qt);
      if(qt < 0) {
         System.out.println("Error: Introduzca una cantidad valida!");
         return;
      }
      int cantidad = Integer.parseInt(Qt);
      Producte producto = new Producte(nom,cantidad);
      Categoria categoria1 = new Categoria(categoria);
      Menu();
  }
  

  public static void editarProducto() {
    System.out.println("Nombre del Producto: ");
      String nom = entr.nextLine().strip();
      if (nom.isBlank()) {
         System.out.println("Error: Introduzca minimo una letra o numero!");
         return;
      }

      for(Producte a : productos) {
          if(a.getNom().equals(nom)) {
            System.out.println("Error: El Producto que quiere crear ja existe!");
            return;
          }
      }

      System.out.println("Categoria?");
      String categoria = entr.nextLine().strip();
      if(categoria.isBlank()) {
         System.out.println("Error: Introduzca minimo una letra o numero!");
         return;
      }
      

      System.out.println("Quantitat?");
      String Qt = entr.nextLine().strip();
      if(!UtilString.esEnter(Qt)) {
         System.out.println("Error: Introduzca una cantidad valida!");
      }
      
      if(Qt.isBlank()){
         System.out.println("Error: Introduzca una cantidad valida!");
      }
      int qt = Integer.parseInt(Qt);
      if(qt < 0) {
         System.out.println("Error: Introduzca una cantidad valida!");
         return;
      }
      int cantidad = Integer.parseInt(Qt);
      productos[0] = new Producte(nom, cantidad);
      Categoria categoria1 = new Categoria(categoria);
  }

  public static void VaciarLista() {
    System.out.println("Confirme la operacion!");
    String conf = entr.nextLine().strip();
    if(conf.equals("si")){
      productos = new Producte[0];
    }
    else {
      Menu();
    }
  }
 
  public static void MostraProducto() {
    for(int i = 0; i < productos.length - 1; i ++) {
        System.out.println(productos[i]);
    }
  }
  
  /*public static void MostrarProductoPorCategoria() {
    System.out.println("Di una categoria!");
    
  }*/
}

 
