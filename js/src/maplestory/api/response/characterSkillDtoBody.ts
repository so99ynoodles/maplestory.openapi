type CharacterSkillDtoBody = {
    date: string;
    character_class: string;
    character_skill_grade: string;
    character_skill: CharacterSkillInfoDtoBody[];
};

type CharacterSkillInfoDtoBody = {
    skill_name: string;
    skill_description: string;
    skill_level: number;
    skill_effect: string;
    skill_icon: string;
};

export type { CharacterSkillDtoBody, CharacterSkillInfoDtoBody };
