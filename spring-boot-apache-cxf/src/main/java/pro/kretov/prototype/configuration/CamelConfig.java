package pro.kretov.prototype.configuration;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamelConfig {

    private CamelContext camelContext;

    @Autowired
    public CamelConfig(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Bean
    public ProducerTemplate producerTemplate() {
        return new DefaultProducerTemplate(camelContext);
    }

}
