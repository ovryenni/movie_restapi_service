package apps.movieService.src.main.java.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "response")
@XmlType(propOrder = { "statusCode", "statusMessage" })
@JsonPropertyOrder({ "statusCode", "statusMessage"  })
@NoArgsConstructor
@Log4j2
public class GeneralResponse implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 50920171331L;

    private final static Logger alog = LogManager.getLogger(ServiceResponse.class.getName());

    private int statusCode;
    private String statusMessage;

    @JsonIgnore()
    private HttpStatus httpStatus;


    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @XmlElement(name = "httpStatus")
    @JsonIgnore()
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String toJson()
    {
        String jsonString = "";
        try {
            ObjectMapper mapper = new ObjectMapper();
            jsonString = mapper.writeValueAsString(this);
        } catch (Exception e) {
                    log.error(
                            "ServiceResponse-toJSON"
                            );
        }

        return jsonString;
    }
}