package datasetup;

public class UserDto {
    String email;
    int id;

    public UserDto(String email, int id) {
        this.email = email;
        this.id = id;
    }

    public UserDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
