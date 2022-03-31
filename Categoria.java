//Aquest programa declara la Categoria que despres podrem consultar en la Llista quina categoria te cada producte
public class Categoria {
	private String nomCategoria;
        
        public Categoria(String nombre) {
	     this.nomCategoria = nombre;
        }
		
	public String getNomCategoria() {
		return this.nomCategoria;
	}
	public void setNomCategoria (String nombre) {
		this.nomCategoria = nombre;
	}
}
	
