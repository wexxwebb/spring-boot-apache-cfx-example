package pro.kretov.prototype.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import pro.kretov.prototype.ws.HashService;
import pro.kretov.prototype.ws.InputType;

public class Client {

    public static void main(String[] args) {

        for (int j = 0; j < 100; j++) {

            long now = System.currentTimeMillis();
            HashService hashServicePort = createCXFClient();
            InputType inputType = new InputType();
            inputType.setString("Heisenberg");
            inputType.setNum(100);

            System.out.println(System.currentTimeMillis() - now);

            for (int i = 0; i < 20; i++) {
                System.out.println(i + ": " + hashServicePort.getHash(inputType));
            }

        }
    }

    protected static HashService createCXFClient() {
        // we use CXF to create a client for us as its easier than JAXWS and works
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(HashService.class);
        factory.setAddress("http://localhost:7990/esb/soap");
        return (HashService) factory.create();
    }
}
