package suatsac1;

public class elephent extends mammal{
    public elephent(String name, int age, boolean hasFus) {
        super(name, age, hasFus);
    }

    @Override
    public void Makesound() {
        super.Makesound();
        System.out.println("voi voi ");
    }
    public void sprayWater(){
        System.out.println("spray water");
    }

    @Override
    public void eat(String eat) {
        super.eat(eat);
        System.out.println("voi eat "+eat);
    }
}
