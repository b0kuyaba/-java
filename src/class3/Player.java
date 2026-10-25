package class3;

public class Player {
    String p_name;
    int Level,exp;

    Player(String p_name) {
        this(p_name, 1);
    }
    Player(String p_name, int Level) {
        this.p_name = p_name;
        this.Level = Level;
    }

    public void gainExp(int n) {
       exp += n;
       for (int i = 0; i <= exp / 100; i++) {
            if (exp >= 100) {
                System.out.print("레벨업! ");
                Level++;
                exp -= 100;
            }
       }
       System.out.println("LV." + Level + "(" + exp + "/100)");
    }
}
