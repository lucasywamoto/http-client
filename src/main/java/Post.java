public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    //constructor
    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    //getters and setter
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    //override toString method
    @Override
    public String toString() {
        return  "(User ID = " + userId + ", Post ID = " + id + ")\n" +
                "Title: " + title.toUpperCase() + "\n" +
                "Body: " + body + "\n\n" +
                "----------------------------------------------------\n";
    }
}
