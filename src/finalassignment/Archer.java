package finalassignment;

import java.util.Random;

/**
 * 궁수 캐릭터. Character를 상속하며 치명타(criticalChance) 확률 시스템을 가진다.
 */
public class Archer extends Character {

    private double criticalChance;
    private static final Random rand = new Random();

    public Archer(String name) {
        super(name, 100, 16, 5);
        this.criticalChance = 0.3; // 30% 치명타 확률
    }

    @Override
    public void attack(Character target) {
        boolean isCritical = rand.nextDouble() < criticalChance;
        int damage = isCritical ? attackPower * 2 : attackPower;
        String msg = isCritical ? " (치명타!)" : "";
        System.out.println(getName() + "이(가) 화살로 " + target.getName() + "을(를) 공격했습니다!" + msg);
        target.takeDamage(damage);
    }

    @Override
    public void specialSkill(Character target) {
        System.out.println(getName() + "이(가) [연속사격]을 사용합니다!");
        for (int i = 1; i <= 3; i++) {
            System.out.println("  " + i + "연발!");
            target.takeDamage(attackPower / 2);
            if (!target.isAlive()) {
                break;
            }
        }
    }
}
