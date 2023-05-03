package src.main.java.usesase;

import advotics.shared.utilities.DateTimeHelper;
import advotics.shared.utilities.EncryptionTool;
import advotics.shared.utilities.LoggingUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import lombok.NoArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@NoArgsConstructor
public class ServiceUtilities {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final Logger alog = LogManager.getLogger(ServiceUtilities.class.getName());
    private static final String SIGNATURE_PARAM = "signature";


    public static Map<String, String> constructParamMap(HttpServletRequest request) {
        boolean isGetRequest = request.getMethod().toUpperCase().equals("GET");
        return isGetRequest ? constructParamMapFromParameter(request) : constructParamMapFromBody(request);
    }

    private static Map<String, String> constructParamMapFromParameter(HttpServletRequest request) {
        Map<String, String[]> params = request.getParameterMap();
        Map<String, String> paramMap = new LinkedHashMap();
        Iterator var3 = params.entrySet().iterator();

        while (var3.hasNext()) {
            Map.Entry<String, String[]> param = (Map.Entry) var3.next();
            String value = ((String[]) ((String[]) param.getValue()))[0];
            paramMap.put(param.getKey(), value);
        }

        return paramMap;
    }

    private static Map<String, String> constructParamMapFromBody(HttpServletRequest request) {
        Map<String, String> paramMap = new LinkedHashMap();

        try {
            if (request.getContentType().equals("application/json")) {
                mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                paramMap = (Map) mapper.readValue(request.getInputStream(), new 1 ());
            } else {
                paramMap = constructParamMapFromParameter(request);
            }
        } catch (Exception var3) {
        }

        return (Map) paramMap;
    }

    public static Map<String, String> constructParamMap(List<String> paramList, HttpSession session) {
        Map<String, String> newParamMap = new LinkedHashMap();
        if (paramList != null && !paramList.isEmpty()) {
            Iterator var3 = paramList.iterator();

            while (var3.hasNext()) {
                String param = (String) var3.next();
                Object obj = session.getAttribute(param);
                if (obj != null) {
                    newParamMap.put(param, obj.toString());
                }
            }
        }

        return newParamMap;
    }


}
