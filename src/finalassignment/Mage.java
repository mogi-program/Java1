package finalassignment;

import java.util.Random;

/**
 * 마법사 캐릭터. Character를 상속하며 마나 시스템을 추가로 가진다.
 * 같은 attack() 시그니처를 전혀 다른 방식(마법 공격)으로 오버라이딩하여
 * 다형성(Polymorphism)을 보여주는 핵심 클래스 중 하나이다.
 */
public class Mage extends Character {

    private int mana;
    private static final Random rand = new Random();

    public Mage(String name) {
        super(name, 90, 14, 4); // HP는 낮지만 마법 공격에 특화
        this.mana = 50;
    }

    @Override
    public void attack(Character target) {
        int damage = attackPower + rand.nextInt(4);
        System.out.println(getName() + "이(가) 마법탄으로 " + target.getName() + "을(를) 공격했습니다!");
        target.takeDamage(damage);
        mana = Math.min(mana + 10, 100);
    }

    @Override
    public void specialSkill(Character target) {
        if (mana >= 30) {
            int damage = (int) (attackPower * 2.2);
            System.out.println(getName() + "이(가) [파이어볼]을 시전합니다!");
            target.takeDamage(damage);
            mana -= 30;
        } else {
            System.out.println(getName() + "의 마나가 부족합니다. (" + mana + "/30)");
        }
    }
}
