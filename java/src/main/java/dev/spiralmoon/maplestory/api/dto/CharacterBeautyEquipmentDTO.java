package dev.spiralmoon.maplestory.api.dto;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * 캐릭터 헤어, 성형, 피부 정보
 */
@AllArgsConstructor
@Data
@ToString
public class CharacterBeautyEquipmentDTO {

    /**
     * 조회 기준일 (KST)
     */
    @SerializedName("date")
    private String date;

    /**
     * 캐릭터 성별
     */
    @SerializedName("character_gender")
    private String characterGender;

    /**
     * 캐릭터 직업
     */
    @SerializedName("character_class")
    private String characterClass;

    /**
     * 캐릭터 헤어 정보
     * (제로인 경우 알파, 엔젤릭버스터인 경우 일반 모드)
     */
    @SerializedName("character_hair")
    private CharacterBeautyEquipmentHairDTO characterHair;

    /**
     * 캐릭터 성형 정보
     * (제로인 경우 알파, 엔젤릭버스터인 경우 일반 모드)
     */
    @SerializedName("character_face")
    private CharacterBeautyEquipmentFaceDTO characterFace;

    /**
     * 피부 명
     * (제로인 경우 알파, 엔젤릭버스터인 경우 일반 모드)
     */
    @SerializedName("character_skin_name")
    private String characterSkinName;

    /**
     * 드레스 업 모드에 적용 중인 헤어 정보
     * (제로인 경우 베타, 엔젤릭버스터인 경우 드레스 업 모드)
     */
    @SerializedName("additional_character_hair")
    private CharacterBeautyEquipmentHairDTO additionalCharacterHair;

    /**
     * 드레스 업 모드에 적용 중인 성형 정보
     * (제로인 경우 베타, 엔젤릭버스터인 경우 드레스 업 모드)
     */
    @SerializedName("additional_character_face")
    private CharacterBeautyEquipmentFaceDTO additionalCharacterFace;

    /**
     * 드레스 업 모드에 적용 중인 피부 명
     * (제로인 경우 베타, 엔젤릭버스터인 경우 드레스 업 모드)
     */
    @SerializedName("additional_character_skin_name")
    private String additionalCharacterSkinName;
}
