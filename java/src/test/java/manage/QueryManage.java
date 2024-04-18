package manage;

public class QueryManage {

    private String query02 = "SELECT userlastname FROM java.users LIMIT 2 ;";
    private String queryPhone ="UPDATE java.users SET userphonenumber = 122333444 WHERE username LIKE '%e';";

    public String getQueryPhone() {
        return queryPhone;
    }

    public String getQuery02() {
        return query02;

    }
}
