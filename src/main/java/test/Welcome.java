package test;

public class Welcome {

    private final long userId;
    private final String content;
    private final String location;

    public Welcome(long userId, String content, String location) {
        this.userId = userId;
        this.content = content;
        this.location = location;
    }

    public long getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public String getLocation() {
        return location;
    }
}
