package ajaxStruts;

public class ActionClient {
    private String name;
    private String age;


    public String getInfo(){
    return "success";
    }

    public String getAge() {
       return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
    return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}