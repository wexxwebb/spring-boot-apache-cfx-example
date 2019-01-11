package pro.kretov.prototype.ws;

import org.springframework.util.DigestUtils;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.util.UUID;

@WebService
public class HashService {

    @WebMethod
    @XmlElement(required = true)
    public String getHash(@XmlElement(required = true) InputType inputType) {

        UUID uuid = null;
        for (int i = 0; i < inputType.getNum(); i++) {
            uuid = UUID.nameUUIDFromBytes(DigestUtils.md5Digest(inputType.getString().getBytes()));
        }

        return uuid.toString();
    }
}
