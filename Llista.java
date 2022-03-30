import java.util.Scanner;
import java.util.Arrays;

public class Llista {
   private static Producte[] productos = new Producte[0];
   private static Categoria[] categorias = new Categoria[0];
   private static Scanner entr = new Scanner(System.in);
   
   public static void main(String[] args) {
    Menu();
   }
   public static void Menu() {
        String choose;
        do {
        System.out.println("0.Salir");
        System.out.println("1.Crear Producto");
        System.out.println("2.Editar Producto");
        System.out.println("3.Vaciar Lista");
        System.out.println("4.Mostrar Productos");
        System.out.println("Elige que quieres hacer!");
        choose = entr.nextLine().strip();
        
        if (choose.equals("0")) {
           return;
        }
        else if (choose.equals("1")) {
           crearProducto();
        }
        else if (choose.equals("2")) {
           editarProducto();
        } 
        else if (choose.equals("3")) {
           VaciarLista();
        }
        else if (choose.equals("4")) {
           MostraProducto();
        }
    }while(!choose.equals("0"));
   }
   private static void crearProducto() {
      System.out.println("Nombre del Producto: ");
      String nom = entr.nextLine().strip();
      if (nom.isBlank()) {
         System.out.println("Error: Introduzca minimo una letra o numero!");
         return;
      }

      for(Producte a : productos) {
          if(a != null && a.getNom().equals(nom)) {
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
      productos = Arrays.copyOf(productos, productos.length + 1);
      productos[productos.length - 1] = new Producte(nom,cantidad,categoria);

      categorias = Arrays.copyOf(categorias, categorias.length + 1);
      categorias[categorias.length - 1] = new Categoria(categoria);
      Menu();
  }
  

  public static void editarProducto() {
    System.out.println("Nombre del Producto que quiere editar?: ");
      String nombre = entr.nextLine().strip();

      for(Producte a : productos) {
          if(a.getNom().equals(nombre)) {
            
      System.out.println("Nombre del Producto: ");
      String nom = entr.nextLine().strip();
      if (nom.isBlank()) {
         System.out.println("Error: Introduzca minimo una letra o numero!");
         return;
      }
      a.setNom(nom);

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
      a.setCantidad(cantidad);
    }
    else { System.out.println("El producto que quiere editar no existe!");}
  }
}

  public static void VaciarLista() {
    System.out.println("Confirme la operacion!");
    String conf = entr.nextLine().strip();
    if(conf.equals("si")){
      productos = new Producte[0];
      System.out.println("Llista borrada correctamente");
      System.out.println(" ");

    }
    else {
      Menu();
    }
  }
 
  public static void MostraProducto() {
    for(Producte a : productos) {
        if(a != null){
               System.out.print("Nombre: " + a.getNom() + " Cantidad: " + a.getCantidad());
               for(Categoria b : categorias) {
                  if(b.getNomCategoria().equals(a.getCategoria())) {
                    System.out.print(" Categoria: " + b.getNomCategoria());
                    System.out.println(" ");}
               continue;
               }
               
       }
    }
    System.out.println(" ");       
  }
  
  /*public static void MostrarProductoPorCategoria() {
    System.out.println("Di una categoria!");
    
  }*/
}

 
