//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.05 at 05:23:50 PM BRT 
//


package br.gov.mec.aghu.exames.contratualizacao.util.retorno;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.mec.aghu.exames.contratualizacao.util.retorno package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectContratualizacaoRetornoFactory {

    private final static QName _DataNumeroUnico_QNAME = new QName("", "dataNumeroUnico");
    private final static QName _NumeroUnico_QNAME = new QName("", "numeroUnico");
    private final static QName _IdAmostra_QNAME = new QName("", "idAmostra");
    private final static QName _IdExterno_QNAME = new QName("", "idExterno");
    private final static QName _MensagemErro_QNAME = new QName("", "mensagemErro");
    private final static QName _UnidadeExecutora_QNAME = new QName("", "unidadeExecutora");
    private final static QName _MaterialAnalise_QNAME = new QName("", "materialAnalise");
    private final static QName _SiglaExame_QNAME = new QName("", "siglaExame");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.mec.aghu.exames.contratualizacao.util.retorno
     * 
     */
    public ObjectContratualizacaoRetornoFactory() {
    }

    /**
     * Create an instance of {@link Itens }
     * 
     */
    public Itens createItens() {
        return new Itens();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Detalhes }
     * 
     */
    public Detalhes createDetalhes() {
        return new Detalhes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dataNumeroUnico")
    public JAXBElement<Object> createDataNumeroUnico(Object value) {
        return new JAXBElement<Object>(_DataNumeroUnico_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "numeroUnico")
    public JAXBElement<Object> createNumeroUnico(Object value) {
        return new JAXBElement<Object>(_NumeroUnico_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "idAmostra")
    public JAXBElement<Object> createIdAmostra(Object value) {
        return new JAXBElement<Object>(_IdAmostra_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "idExterno")
    public JAXBElement<Object> createIdExterno(Object value) {
        return new JAXBElement<Object>(_IdExterno_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mensagemErro")
    public JAXBElement<Object> createMensagemErro(Object value) {
        return new JAXBElement<Object>(_MensagemErro_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "unidadeExecutora")
    public JAXBElement<Object> createUnidadeExecutora(Object value) {
        return new JAXBElement<Object>(_UnidadeExecutora_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "materialAnalise")
    public JAXBElement<Object> createMaterialAnalise(Object value) {
        return new JAXBElement<Object>(_MaterialAnalise_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "siglaExame")
    public JAXBElement<Object> createSiglaExame(Object value) {
        return new JAXBElement<Object>(_SiglaExame_QNAME, Object.class, null, value);
    }

}
