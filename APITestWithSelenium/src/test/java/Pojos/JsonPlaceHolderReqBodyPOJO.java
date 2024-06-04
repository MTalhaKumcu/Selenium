package Pojos;

public class JsonPlaceHolderReqBodyPOJO {


    //1- tum variableleri private yap
    private String title;
    private String body;
    private int userId;
    private int id;
    //2- getter setter

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
    //3 - constructor


    public JsonPlaceHolderReqBodyPOJO(String title, String body, int id, int userId) {
        this.id = id;
        this.userId = userId;
        this.body = body;
        this.title = title;
    }

    //4- parametresiz constructor
    public JsonPlaceHolderReqBodyPOJO() {

    }

    // 5- toString Method


    @Override
    public String toString() {
        return "JsonPlaceHolderReqBody{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", userId=" + userId +
                ", id=" + id +
                '}';
    }
}
