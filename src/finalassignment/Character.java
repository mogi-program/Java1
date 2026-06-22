package finalassignment;

/**
 * 모든 캐릭터(전사, 마법사, 궁수, 몬스터 등)의 공통 부모가 되는 추상 클래스.
 * - 접근 제한: private(완전 은닉), protected(자식 클래스만 접근), public(외부 공개)을 모두 사용한다.
 * - attack()은 추상 메서드로 선언하여 자식 클래스마다 다르게 구현(오버라이딩)하도록 강제한다.
 */
public abstract class Character {

    private String name;          // private: 외부에서 직접 접근 불가, getter로만 노출
    protected int hp;             // protected: 자식 클래스에서 직접 사용(공격력 계산 등)
    protected int maxHp;
    protected int attackPower;
    protected int defensePower;

    // 생성자: 캐릭터 생성 시 기본 능력치를 초기화
    public Character(String name, int maxHp, int attackPower, int defensePower) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    // 방어력을 고려해 실제 피해를 계산하고 HP를 갱신
    public void takeDamage(int damage) {
        int actualDamage = Math.max(damage - defensePower, 0);
        hp -= actualDamage;
        if (hp < 0) {
            hp = 0;
        }
        System.out.println("  -> " + name + "이(가) " + actualDamage
                + "의 피해를 입었습니다! (남은 HP: " + hp + "/" + maxHp + ")");
    }

    // 다형성의 핵심: 같은 메서드 호출이지만 실제 타입(Warrior/Mage/Archer/Monster)에 따라
    // 서로 다른 동작을 하도록 하위 클래스에서 반드시 구현(오버라이딩)한다.
    public abstract void attack(Character target);

    // 특수기는 기본 동작만 제공하고, 필요한 하위 클래스에서 선택적으로 오버라이딩한다.
    public void specialSkill(Character target) {
        System.out.println(name + "은(는) 아직 특수기가 없습니다.");
    }

    // Object의 toString()을 오버라이딩하여 캐릭터 상태를 보기 좋게 출력
    @Override
    public String toString() {
        return String.format("[%s] HP: %d/%d, 공격력: %d, 방어력: %d",
                name, hp, maxHp, attackPower, defensePower);
    }
}
