package pro.kretov.prototype.esb;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.ExchangeBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/esb")
public class EsbProxy {

    private CamelContext camelContext;
    private ProducerTemplate producerTemplate;

    @Autowired
    public EsbProxy(CamelContext camelContext, ProducerTemplate producerTemplate) {
        this.camelContext = camelContext;
        this.producerTemplate = producerTemplate;
    }

    @ResponseBody
    @RequestMapping(value = "/soap")
    public ResponseEntity<?> soap(@RequestBody String requestBody) {
        final Exchange requestExchange = ExchangeBuilder.anExchange(camelContext).withBody(requestBody).build();
        final Exchange responseExchange = producerTemplate.send("http:localhost:7990/services/HashService", requestExchange);
        final String responseBody = responseExchange.getOut().getBody(String.class);
        final int responseCode = responseExchange.getOut().getHeader(Exchange.HTTP_RESPONSE_CODE, Integer.class).intValue();
        return ResponseEntity.status(responseCode).body(responseBody);
    }
}
