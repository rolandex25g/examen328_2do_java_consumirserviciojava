
package clientejava;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import mipaquete.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewWebService", targetNamespace = "http://mipaquete/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://mipaquete/", className = "mipaquete.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://mipaquete/", className = "mipaquete.HelloResponse")
    @Action(input = "http://mipaquete/NewWebService/helloRequest", output = "http://mipaquete/NewWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param ci
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenermaterias", targetNamespace = "http://mipaquete/", className = "mipaquete.Obtenermaterias")
    @ResponseWrapper(localName = "obtenermateriasResponse", targetNamespace = "http://mipaquete/", className = "mipaquete.ObtenermateriasResponse")
    @Action(input = "http://mipaquete/NewWebService/obtenermateriasRequest", output = "http://mipaquete/NewWebService/obtenermateriasResponse")
    public String obtenermaterias(
        @WebParam(name = "ci", targetNamespace = "")
        String ci);

}
