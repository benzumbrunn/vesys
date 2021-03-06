
package ch.fhnw.ds.ws.temp.client.jaxws;

import java.math.BigDecimal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TemperatureConversions", targetNamespace = "http://temp.ws.ds.fhnw.ch/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TemperatureConversions {


    /**
     * 
     * @param arg
     */
    @WebMethod
    @RequestWrapper(localName = "fahrenheitToCelsius", targetNamespace = "http://temp.ws.ds.fhnw.ch/", className = "ch.fhnw.ds.ws.temp.client.jaxws.FahrenheitToCelsius")
    @ResponseWrapper(localName = "fahrenheitToCelsiusResponse", targetNamespace = "http://temp.ws.ds.fhnw.ch/", className = "ch.fhnw.ds.ws.temp.client.jaxws.FahrenheitToCelsiusResponse")
    @Action(input = "http://temp.ws.ds.fhnw.ch/TemperatureConversions/fahrenheitToCelsiusRequest", output = "http://temp.ws.ds.fhnw.ch/TemperatureConversions/fahrenheitToCelsiusResponse")
    public void fahrenheitToCelsius(
        @WebParam(name = "arg", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<BigDecimal> arg);

    /**
     * 
     * @param arg
     */
    @WebMethod
    @RequestWrapper(localName = "celciusToFahrenheit", targetNamespace = "http://temp.ws.ds.fhnw.ch/", className = "ch.fhnw.ds.ws.temp.client.jaxws.CelciusToFahrenheit")
    @ResponseWrapper(localName = "celciusToFahrenheitResponse", targetNamespace = "http://temp.ws.ds.fhnw.ch/", className = "ch.fhnw.ds.ws.temp.client.jaxws.CelciusToFahrenheitResponse")
    @Action(input = "http://temp.ws.ds.fhnw.ch/TemperatureConversions/celciusToFahrenheitRequest", output = "http://temp.ws.ds.fhnw.ch/TemperatureConversions/celciusToFahrenheitResponse")
    public void celciusToFahrenheit(
        @WebParam(name = "arg", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<BigDecimal> arg);

    /**
     * 
     * @param resultF
     * @param resultC
     */
    @WebMethod
    @RequestWrapper(localName = "getRandomTemperature", targetNamespace = "http://temp.ws.ds.fhnw.ch/", className = "ch.fhnw.ds.ws.temp.client.jaxws.GetRandomTemperature")
    @ResponseWrapper(localName = "getRandomTemperatureResponse", targetNamespace = "http://temp.ws.ds.fhnw.ch/", className = "ch.fhnw.ds.ws.temp.client.jaxws.GetRandomTemperatureResponse")
    @Action(input = "http://temp.ws.ds.fhnw.ch/TemperatureConversions/getRandomTemperatureRequest", output = "http://temp.ws.ds.fhnw.ch/TemperatureConversions/getRandomTemperatureResponse")
    public void getRandomTemperature(
        @WebParam(name = "resultC", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<BigDecimal> resultC,
        @WebParam(name = "resultF", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<BigDecimal> resultF);

}
