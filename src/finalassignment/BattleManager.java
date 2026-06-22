package finalassignment;

import java.util.Scanner;

/**
 * 전투 진행을 담당하는 클래스.
 * 필드 타입을 Character(부모 타입)로 선언해 두면, 실제로는 Warrior/Mage/Archer/Monster 중
 * 무엇이 들어오든 동일한 코드(player.attack(enemy) 등)로 처리할 수 있다. (다형성)
 */
public class BattleManager {

    private Character player;
    private Character enemy;
    private Scanner scanner;

    public BattleManager(Character player, Character enemy, Scanner scanner) {
        this.player = player;
        this.enemy = enemy;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println();
        System.out.println("=== 전투 시작! ===");
        System.out.println(player); // toString() 오버라이딩 결과 출력
        System.out.println(enemy);

        int turn = 1;
        while (player.isAlive() && enemy.isAlive()) {
            System.out.println();
            System.out.println("--- " + turn + "턴 ---");
            System.out.println("1. 공격   2. 특수기");
            System.out.print("선택> ");
            String input = scanner.nextLine().trim();

            // 다형성: player의 실제 타입에 따라 attack()/specialSkill() 동작이 달라진다.
            if (input.equals("2")) {
                player.specialSkill(enemy);
            } else {
                player.attack(enemy);
            }

            if (enemy.isAlive()) {
                enemy.attack(player); // 몬스터의 반격
            }
            turn++;
        }
        announceResult();
    }

    private void announceResult() {
        System.out.println();
        System.out.println("=== 전투 종료 ===");
        if (player.isAlive()) {
            System.out.println(player.getName() + " 승리!");
        } else {
            System.out.println(enemy.getName() + " 승리...");
        }
    }
}
