
package zyr.learn.service;

import java.util.List;
import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IUserService", targetNamespace = "http://service.learn.zyr")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IUserService {


    /**
     * 
     * @param user
     * @throws UserException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "add", targetNamespace = "http://service.learn.zyr", className = "zyr.learn.service.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://service.learn.zyr", className = "zyr.learn.service.AddResponse")
    public void add(
        @WebParam(name = "user", targetNamespace = "")
        User user)
        throws UserException_Exception
    ;

    /**
     * 
     * @param username
     * @throws UserException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "delete", targetNamespace = "http://service.learn.zyr", className = "zyr.learn.service.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://service.learn.zyr", className = "zyr.learn.service.DeleteResponse")
    public void delete(
        @WebParam(name = "username", targetNamespace = "")
        String username)
        throws UserException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<zyr.learn.service.User>
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "list", targetNamespace = "http://service.learn.zyr", className = "zyr.learn.service.List")
    @ResponseWrapper(localName = "listResponse", targetNamespace = "http://service.learn.zyr", className = "zyr.learn.service.ListResponse")
    public List<User> list();

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns zyr.learn.service.User
     * @throws UserException_Exception
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://service.learn.zyr", className = "zyr.learn.service.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://service.learn.zyr", className = "zyr.learn.service.LoginResponse")
    public User login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password)
        throws UserException_Exception
    ;

    /**
     * 
     * @param dataHandler
     * @throws UserException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "upload", targetNamespace = "http://service.learn.zyr", className = "zyr.learn.service.Upload")
    @ResponseWrapper(localName = "uploadResponse", targetNamespace = "http://service.learn.zyr", className = "zyr.learn.service.UploadResponse")
    public void upload(
        @WebParam(name = "dataHandler", targetNamespace = "")
        DataHandler dataHandler)
        throws UserException_Exception
    ;

}
