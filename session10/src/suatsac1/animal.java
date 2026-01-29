package suatsac1;

public class animal {
    private  String name ;
    private int age ;

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public  void showInfor(){
        System.out.println("animal name : "+name);
        System.out.println("animal age : "+age);
    }
    public void Makesound(){

    }
    public void eat(){
    }
    public void eat(String eat ){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
