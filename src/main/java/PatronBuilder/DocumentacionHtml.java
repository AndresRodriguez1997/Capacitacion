package PatronBuilder;

/**
 * 
 * @author andres.rodriguez
 *El patrón se utiliza en los dominios siguientes:
 * - Un cliente necesita construir objetos complejos
 *
 */
public class DocumentacionHtml extends Documentacion  
{  
    public void agregaDocumento(String documento)  
    {  
        if (documento.startsWith("<HTML>"))  
            contenido.add(documento);  
    }  
  
    public void imprime()  
    {  
        System.out.println("Documentacion HTML");  
        for (String s: contenido)  
            System.out.println(s);  
    }  
}