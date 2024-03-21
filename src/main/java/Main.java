import java.util.List;

public class Main {

    public static void main(String[] args) {

        //instantiate new SimpleApiHttpClient object
        SimpleApiHttpClient client = new SimpleApiHttpClient();

        //fetching JSON data from URL
        String json = client.fetchData("https://jsonplaceholder.typicode.com/posts");

        //Parsing json to java object
        List<Post> posts = client.parseJsonPosts(json);

        //Go through list of posts and print to console.
        int i = 1;
        for(Post p : posts) {
            System.out.println("Post " + i);
            System.out.println(p.toString());
            i++;
        }
    }
}
