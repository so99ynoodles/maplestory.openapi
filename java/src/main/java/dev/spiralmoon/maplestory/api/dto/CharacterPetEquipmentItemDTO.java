package dev.spiralmoon.maplestory.api.dto;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 캐릭터 펫 장비 아이템 정보
 */
@AllArgsConstructor
@Data
@ToString
public class CharacterPetEquipmentItemDTO {

    /**
     * 아이템 명
     */
    @SerializedName("item_name")
    private String itemName;

    /**
     * 아이템 아이콘
     */
    @SerializedName("item_icon")
    private String itemIcon;

    /**
     * 아이템 설명
     */
    @SerializedName("item_description")
    private String itemDescription;

    /**
     * 아이템 표기상 옵션
     */
    @SerializedName("item_option")
    private List<CharacterPetEquipmentItemOptionDTO> itemOption;

    /**
     * 업그레이드 횟수
     */
    @SerializedName("scroll_upgrade")
    private Long scrollUpgrade;

    /**
     * 업그레이드 가능 횟수
     */
    @SerializedName("scroll_upgradeable")
    private Long scrollUpgradeable;
}
