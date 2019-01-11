package pro.kretov.prototype.configuration;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.DefaultProducerTemplate;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pro.kretov.prototype.ws.HashService;

import javax.xml.ws.Endpoint;

@Configuration
public class Config {

    private Bus bus;

    @Autowired
    public Config(Bus bus) {
        this.bus = bus;
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new HashService());
        endpoint.publish("/HashService");
        return endpoint;
    }

    @Bean
    public CamelContext camelContext() {
        return new DefaultCamelContext();
    }

}
