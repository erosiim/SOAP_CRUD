package org.ejemplo;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author exkapp
 */
@WebService(serviceName = "Calculadora")
public class Calculadora {
    daoPersona dao = new daoPersona();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public Integer suma(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a+b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insert")
    public Boolean insert(@WebParam(name = "per") Persona per) {
        //TODO write your implementation code here:
       return dao.insert(per);
    }
    
    @WebMethod(operationName = "delete")
    public Boolean delete(@WebParam(name = "per") Persona per) {
        //TODO write your implementation code here:
       return dao.delete(per);
    }
    
    @WebMethod(operationName = "update")
    public Boolean update(@WebParam(name = "per") Persona per) {
        //TODO write your implementation code here:
       return dao.update(per);
    }

    
    
    
}
