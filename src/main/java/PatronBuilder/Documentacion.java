package PatronBuilder;

import java.util.*;  

/**
 * 
 * @author andres.rodriguez
 *El objetivo del patrón Builder es abstraer la construcción de objetos ...
 *
 *Durante la compra de un vehículo, el vendedor crea todo un conjunto de documentos que contienen en especial la solicitud de pedido y
 * la solicitud de matriculación del cliente. Es posible construir estos documentos en formato HTML o en formato PDF según la elección 
 * del cliente. En el primer caso, el cliente le provee una instancia de la clase ConstructorDocumentaciónVehículoHtml y, en el segundo 
 * caso, una instancia de la clase ConstructorDocumentaciónVehículoPdf.
 */

public abstract class Documentacion  
{  
    protected List<String> contenido =  
        new ArrayList<String>();  
  
    public abstract void agregaDocumento(String documento);  
    public abstract void imprime();  
}  
  
/**
 * En este ejemplo se usa el patrón Builder. 
 * El código Java correspondiente a la clase abstracta Documentacion y sus subclases aparece a continuación. 
 * Por motivos de simplicidad, los documentos son cadenas de caracteres para la documentación en formato HTML y PDF. 
 * El método imprime muestra las distintas cadenas de caracteres que representan los documentos.
 * */
