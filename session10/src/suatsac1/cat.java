package suatsac1;

public class cat extends mammal{
    public cat(String name, int age, boolean hasFus) {

        super(name, age, hasFus);
    }

    @Override
    public void Makesound() {
        super.Makesound();
        System.out.println("meo meo");
    }
    public void climbTree(){
        System.out.println("climb tree");
    }

    @Override
    public void eat(String eat) {
        super.eat();
        System.out.println("meo ăn "+eat);
    }
}
