package suatsac1;

public class dog extends mammal{
    public dog(String name, int age, boolean hasFus) {
        super(name, age, hasFus);
    }

    @Override
    public void Makesound() {
        super.Makesound();
        System.out.println("go go go ");
    }
    public void fetchBall(){
        System.out.println("fetch ball");
    }

    @Override
    public void eat(String eat) {
        super.eat(eat);
        System.out.println("cho ăn "+eat);
    }
}
