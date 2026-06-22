package finalassignment;

import java.util.Scanner;

/**
 * 프로그램 진입점. 사용자로부터 캐릭터 종류와 이름을 입력받아
 * 전투를 시작한다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("   게임 캐릭터 배틀 시스템");
        System.out.println("==============================");
        System.out.println("캐릭터를 선택하세요.");
        System.out.println("1. 전사(Warrior)   2. 마법사(Mage)   3. 궁수(Archer)");
        System.out.print("선택> ");
        String choice = scanner.nextLine().trim();

        System.out.print("캐릭터 이름을 입력하세요> ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            name = "용사";
        }

        // 다형성: 변수 선언은 부모 타입(Character), 실제 객체는 자식 타입
        Character player;
        switch (choice) {
            case "2":
                player = new Mage(name);
                break;
            case "3":
                player = new Archer(name);
                break;
            default:
                player = new Warrior(name);
                break;
        }

        Character enemy = new Monster("오크", 80, 12, 3);

        BattleManager battle = new BattleManager(player, enemy, scanner);
        battle.start();

        scanner.close();
    }
}
