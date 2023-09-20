public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String n, String e, char g)
    {
        this.name = n;
        this.email = e;
        this.gender = g;
    }
    public String get_name()
    {
        return this.name;
    }
    public String get_email()
    {
        return this.email;
    }
    public char get_gender()
    {
        return this.gender;
    }
    public String to_string()
    {
        return name+" "+email+" "+gender;
    }
    public void set_email(String e)
    {
        this.email = e;
    }
}
