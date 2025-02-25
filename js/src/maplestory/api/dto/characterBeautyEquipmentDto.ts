import {CharacterBeautyEquipmentHairDto} from "./characterBeautyEquipmentHairDto";
import {CharacterBeautyEquipmentFaceDto} from "./characterBeautyEquipmentFaceDto";
import {CharacterBeautyEquipmentDtoBody} from "../response/characterBeautyEquipmentDtoBody";

/**
 * 캐릭터 헤어, 성형, 피부 정보
 */
class CharacterBeautyEquipmentDto {

    /**
     * 조회 기준일
     */
    date: Date;

    /**
     * 캐릭터 성별
     */
    characterGender: string;

    /**
     * 캐릭터 직업
     */
    characterClass: string;

    /**
     * 캐릭터 헤어 정보<br>
     * (제로인 경우 알파, 엔젤릭버스터인 경우 일반 모드)
     */
    characterHair: CharacterBeautyEquipmentHairDto;

    /**
     * 캐릭터 성형 정보<br>
     * (제로인 경우 알파, 엔젤릭버스터인 경우 일반 모드)
     */
    characterFace: CharacterBeautyEquipmentFaceDto;

    /**
     * 피부 명<br>
     * (제로인 경우 알파, 엔젤릭버스터인 경우 일반 모드)
     */
    characterSkinName: string;

    /**
     * 제로인 경우 베타, 엔젤릭버스터인 경우 드레스 업 모드에 적용 중인 헤어 정보
     */
    additionalCharacterHair: CharacterBeautyEquipmentHairDto;

    /**
     * 제로인 경우 베타, 엔젤릭버스터인 경우 드레스 업 모드에 적용 중인 성형 정보
     */
    additionalCharacterFace: CharacterBeautyEquipmentFaceDto;

    /**
     * 제로인 경우 베타, 엔젤릭버스터인 경우 드레스 업 모드에 적용 중인 피부 명
     */
    additionalCharacterSkinName: string;

    constructor(obj: CharacterBeautyEquipmentDtoBody) {
        const {
            date,
            character_gender,
            character_class,
            character_hair,
            character_face,
            character_skin_name,
            additional_character_hair,
            additional_character_face,
            additional_character_skin_name,
        } = obj;

        this.date = new Date(date);
        this.characterGender = character_gender;
        this.characterClass = character_class;
        this.characterHair = new CharacterBeautyEquipmentHairDto(character_hair);
        this.characterFace = new CharacterBeautyEquipmentFaceDto(character_face);
        this.characterSkinName = character_skin_name;
        this.additionalCharacterHair = new CharacterBeautyEquipmentHairDto(additional_character_hair);
        this.additionalCharacterFace = new CharacterBeautyEquipmentFaceDto(additional_character_face);
        this.additionalCharacterSkinName = additional_character_skin_name;
    }
}

export {CharacterBeautyEquipmentDto};
