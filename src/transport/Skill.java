package transport;

public enum Skill {
    SKILL_OF_WORKING_WITH_BUSES("Автобус"),
    SKILL_OF_WORKING_WITH_CARS("Автомобиль"),
    SKILL_OF_WORKING_WITH_TRUCKS("Грузовик"),
    SKILL_OF_WORKING_WITH_ALL_TRANSPORT("Все виды транспорта");
    private final String skill;

    Skill(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        return skill;
    }
}
