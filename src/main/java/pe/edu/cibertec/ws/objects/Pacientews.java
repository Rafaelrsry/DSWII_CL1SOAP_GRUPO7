//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.09.30 a las 10:48:41 AM PET 
//


package pe.edu.cibertec.ws.objects;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pacientews complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pacientews"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idpaciente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nompaciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apepaciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="docpaciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechanacpaciente" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="emailpaciente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacientews", propOrder = {
    "idpaciente",
    "nompaciente",
    "apepaciente",
    "docpaciente",
    "fechanacpaciente",
    "emailpaciente"
})
public class Pacientews {

    protected int idpaciente;
    @XmlElement(required = true)
    protected String nompaciente;
    @XmlElement(required = true)
    protected String apepaciente;
    @XmlElement(required = true)
    protected String docpaciente;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechanacpaciente;
    @XmlElement(required = true)
    protected String emailpaciente;

    /**
     * Obtiene el valor de la propiedad idpaciente.
     * 
     */
    public int getIdpaciente() {
        return idpaciente;
    }

    /**
     * Define el valor de la propiedad idpaciente.
     * 
     */
    public void setIdpaciente(int value) {
        this.idpaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad nompaciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNompaciente() {
        return nompaciente;
    }

    /**
     * Define el valor de la propiedad nompaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNompaciente(String value) {
        this.nompaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad apepaciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApepaciente() {
        return apepaciente;
    }

    /**
     * Define el valor de la propiedad apepaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApepaciente(String value) {
        this.apepaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad docpaciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocpaciente() {
        return docpaciente;
    }

    /**
     * Define el valor de la propiedad docpaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocpaciente(String value) {
        this.docpaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad fechanacpaciente.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechanacpaciente() {
        return fechanacpaciente;
    }

    /**
     * Define el valor de la propiedad fechanacpaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechanacpaciente(XMLGregorianCalendar value) {
        this.fechanacpaciente = value;
    }

    /**
     * Obtiene el valor de la propiedad emailpaciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailpaciente() {
        return emailpaciente;
    }

    /**
     * Define el valor de la propiedad emailpaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailpaciente(String value) {
        this.emailpaciente = value;
    }

}
