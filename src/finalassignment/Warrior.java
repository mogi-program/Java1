package finalassignment;

import java.util.Random;

/**
 * 전사 캐릭터. Character를 상속(extends)하여 공통 기능을 그대로 물려받고,
 * attack(), specialSkill()을 오버라이딩하여 전사만의 전투 방식을 구현한다.
 */
public class Warrior extends Character {

    private int rage;                       // 전사만 가지는 고유 필드(분노 게이지)
    private static final Random rand = new Random();

    // 생성자 오버로딩 없이 부모 생성자(super)를 호출해 능력치를 초기화
    public Warrior(String name) {
        super(name, 120, 18, 8); // HP 120, 공격력 18, 방어력 8
        this.rage = 0;
    }

    @Override
    public void attack(Character target) {
        int damage = attackPower + rand.nextInt(6);
        System.out.println(getName() + "이(가) 검으로 " + target.getName() + "을(를) 베었습니다!");
        target.takeDamage(damage);
        rage = Math.min(rage + 20, 100);
    }

    @Override
    public void specialSkill(Character target) {
        if (rage >= 40) {
            int damage = attackPower * 2;
            System.out.println(getName() + "이(가) 분노를 터뜨려 [강타]를 사용합니다!");
            target.takeDamage(damage);
            rage = 0;
        } else {
            System.out.println(getName() + "의 분노 게이지가 부족합니다. (" + rage + "/40)");
        }
    }
}
