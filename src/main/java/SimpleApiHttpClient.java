import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.ArrayList;

public class SimpleApiHttpClient {

    //method to fetch data from a URL
    public String fetchData(String url) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(new URI(url)).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();
        } catch (URISyntaxException e) {
            System.err.println("Invalid URL: " + url);
            return null;
        } catch (IOException | InterruptedException e) {
            System.err.println("Failed to fetch data due to network issues.");
            return null;
        }
    }

    //method to parse json to java object
    public List<Post> parseJsonPosts(String jsonString) {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Post>>() {}.getType();
        List<Post> posts = new ArrayList<>();

        try {
            posts = gson.fromJson(jsonString, listType);
        } catch (JsonSyntaxException e) {
            System.err.println("Error parsing JSON data. Please, check the URL.");
        }

        return posts;
    }
}
