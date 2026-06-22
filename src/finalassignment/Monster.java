package finalassignment;

import java.util.Random;

/**
 * 적(몬스터) 캐릭터. Character를 상속하는 또 다른 예시로,
 * 플레이어 캐릭터들과 달리 specialSkill()은 오버라이딩하지 않고
 * 부모(Character)의 기본 동작을 그대로 사용한다(상속의 재사용성 시연).
 */
public class Monster extends Character {

    private static final Random rand = new Random();

    public Monster(String name, int maxHp, int attackPower, int defensePower) {
        super(name, maxHp, attackPower, defensePower);
    }

    @Override
    public void attack(Character target) {
        int damage = attackPower + rand.nextInt(5);
        System.out.println(getName() + "이(가) " + target.getName() + "을(를) 공격합니다!");
        target.takeDamage(damage);
    }
}
