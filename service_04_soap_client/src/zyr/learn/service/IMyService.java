
package zyr.learn.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IMyService", targetNamespace = "http://server.learn.zyr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IMyService {


    /**
     * 
     * @param b
     * @param a
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "addResult", targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://server.learn.zyr/", className = "zyr.learn.service.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://server.learn.zyr/", className = "zyr.learn.service.AddResponse")
    @Action(input = "http://server.learn.zyr/IMyService/addRequest", output = "http://server.learn.zyr/IMyService/addResponse")
    public int add(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

    /**
     * 
     * @param authInfo
     * @param parameters
     * @return
     *     returns zyr.learn.service.ListResponse
     */
    @WebMethod
    @WebResult(name = "listResponse", targetNamespace = "http://server.learn.zyr/", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "http://server.learn.zyr/IMyService/listRequest", output = "http://server.learn.zyr/IMyService/listResponse")
    public ListResponse list(
        @WebParam(name = "list", targetNamespace = "http://server.learn.zyr/", partName = "parameters")
        List parameters,
        @WebParam(name = "authInfo", targetNamespace = "http://server.learn.zyr/", header = true, partName = "authInfo")
        String authInfo);

    /**
     * 
     * @param user
     */
    @WebMethod
    @RequestWrapper(localName = "addUser", targetNamespace = "http://server.learn.zyr/", className = "zyr.learn.service.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://server.learn.zyr/", className = "zyr.learn.service.AddUserResponse")
    @Action(input = "http://server.learn.zyr/IMyService/addUserRequest", output = "http://server.learn.zyr/IMyService/addUserResponse")
    public void addUser(
        @WebParam(name = "user", targetNamespace = "http://server.learn.zyr/", mode = WebParam.Mode.INOUT)
        Holder<User> user);

    /**
     * 
     * @param username
     * @param password
     * @return
     *     returns zyr.learn.service.User
     * @throws UserException_Exception
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "http://server.learn.zyr/")
    @RequestWrapper(localName = "login", targetNamespace = "http://server.learn.zyr/", className = "zyr.learn.service.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://server.learn.zyr/", className = "zyr.learn.service.LoginResponse")
    @Action(input = "http://server.learn.zyr/IMyService/loginRequest", output = "http://server.learn.zyr/IMyService/loginResponse", fault = {
        @FaultAction(className = UserException_Exception.class, value = "http://server.learn.zyr/IMyService/login/Fault/UserException")
    })
    public User login(@WebParam(name = "username", targetNamespace = "") String username, @WebParam(name = "password", targetNamespace = "") String password)
        throws UserException_Exception
    ;

}