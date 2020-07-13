package clase6;

public class Cliente {
    public static void main(String[] args) {
        //Producto libro=new Producto(); //error
        Producto libro=new Libro(); // solo accede a los métodos de la interfaz producto
        libro.setPrecio(25.99);
        libro.setNombre("El principito");
        libro.setColor("amarillo");
        ((Libro)libro).setAutor("Jorge Ramirez"); //castear para usar los otros métodos
        ((Libro)libro).setPaginas(345);
        ((Libro)libro).setIsbn("232314");
        System.out.print("Precio: "+libro.getPrecio()+"\nNombre: "+ libro.getNombre()+"\nColor: "+libro.getColor());
        System.out.print("\nAutor: "+((Libro) libro).getAutor()+"\nPáginas: "+((Libro) libro).getPaginas()+"\nISBN: "+((Libro) libro).getIsbn());
        System.out.print("\nCódigo de barras: "+libro.getCodigoBarras());
    }
}
