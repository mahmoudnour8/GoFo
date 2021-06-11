package code;

public class person
{
    String name;
    int id;
    String password;
    String email;
    String phone;
    String defaultlocation;

    public person (String name, int id, String password, String email, String phone, String defaultlocation)
    {
        this.name = name;
        this.id = id;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.defaultlocation = defaultlocation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDefaultlocation(String defaultlocation) {
        this.defaultlocation = defaultlocation;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDefaultlocation() {
        return defaultlocation;
    }
    
}
