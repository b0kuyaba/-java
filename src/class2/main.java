package class2;

public class main {
    public static void main(String[] args) {
        String[] names = {"슬라임", "고블린", "오크", "드래곤", "해골병사"};
        int[] hps = {30, 50, 120, 500, 60};
        int[] attacks = {5, 12, 25, 80, 15};

        Monster[] book = new Monster[names.length];
        for (int i = 0;  i < book.length; i++) {
            book[i] = new Monster();
            book[i].name = names[i];
            book[i].hp = hps[i];
            book[i].attack = attacks[i];
        }

        Monster strongest = book[0];
        for (Monster m : book) {
            if (m.attack > strongest.attack) {
                strongest = m;
            }
        }
        System.out.println("공격력 최강: " + strongest.name + "(" + strongest.attack + ")");

        int totalHealth = 0;
        for (int i = 0; i < book.length; i++) {
            totalHealth += book[i].hp;
        }
        System.out.println("체력합계:" + totalHealth);

        for (int i = 0; i < book.length; i++) {
            if( 100 <= book[i].hp) {
                System.out.print(book[i] + " ");
            }
        }
    }
}
