public class Transformer extends Person implements iRobot{

    public Transformer(String name, int weight) {
        super(name,weight);
    }

    @Override
    public void sendMessage() {
        System.out.println("bzzzz mmmeeeeeep " + model + " brrrrrrrrrr");
    }

    @Override
    public void destroy() {
        System.out.println("kabusch");
    }
}
