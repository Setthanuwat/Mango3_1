public class Owl extends Animal implements Flyable{
    @Override

    public String sound(){
        return "hook";
    }
    public  void LookDark()
    {
        System.out.println("Wow");
    }

    @Override
    public void fly() {
        System.out.println("pup pup");
    }

    @Override
    public void glide() {
        System.out.println("pooooo");
    }
}
