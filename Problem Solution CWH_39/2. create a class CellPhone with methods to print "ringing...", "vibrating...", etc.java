class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void call(){
        System.out.println("Calling...");
    }
}

public class Main {
    public static void main(String[] args) {
        CellPhone asus = new CellPhone();
        asus.call();
        asus.ring();
        asus.vibrate();
    }
}
