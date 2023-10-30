package seminars.sem4.httpService;

public class WebService {

    HttpClient HttpClient;

    public WebService(HttpClient HttpClient) {
        this.HttpClient = HttpClient;
    }

    public void getHTTP(String url) {
        System.out.println(HttpClient.getHTTPRequest(url));
    }

}
