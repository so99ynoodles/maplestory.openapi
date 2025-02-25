package dev.spiralmoon.maplestory.api.dto;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 캐릭터 HEXA 코어 정보
 */
@AllArgsConstructor
@Data
@ToString
public class CharacterHexaMatrixDTO {

    /**
     * 조회 기준일 (KST)
     */
    @SerializedName("date")
    private String date;

    /**
     * HEXA 코어 정보
     */
    @SerializedName("character_hexa_core_equipment")
    private List<CharacterHexaMatrixEquipmentDTO> characterHexaCoreEquipment;
}
