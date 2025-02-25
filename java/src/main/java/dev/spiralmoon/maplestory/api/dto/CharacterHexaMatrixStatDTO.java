package dev.spiralmoon.maplestory.api.dto;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 캐릭터 HEXA 스탯 코어 정보
 */
@AllArgsConstructor
@Data
@ToString
public class CharacterHexaMatrixStatDTO {

    /**
     * 조회 기준일 (KST)
     */
    @SerializedName("date")
    private String date;

    /**
     * 캐릭터 직업
     */
    @SerializedName("character_class")
    private String characterClass;

    /**
     * HEXA 스탯 코어 정보
     */
    @SerializedName("character_hexa_stat_core")
    private List<CharacterHexaMatrixStatCoreDTO> characterHexaStatCore;

    /**
     * 프리셋 HEXA 스탯 코어 정보
     */
    @SerializedName("preset_hexa_stat_core")
    private List<CharacterHexaMatrixStatCoreDTO> presetHexaStatCore;
}
