package apps.movieService.src.main.java.response;

public class ServiceResponse extends GeneralResponse {

    public void setResponse(ResponseStatus responseStatus) {
        setHttpStatus(responseStatus.getHttpStatus());
        setStatusCode(responseStatus.getStatusCode());
        setStatusMessage(responseStatus.getPrettyMessage());
    }

}
