package dev.spiralmoon.maplestory.api.dto;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 캐릭터 프리셋 장착 캐시 장비 정보
 */
@AllArgsConstructor
@Data
@ToString
public class CharacterCashItemEquipmentPresetDTO {

    /**
     * 캐시 장비 부위 명
     */
    @SerializedName("cash_item_equipment_part")
    private String cashItemEquipmentPart;

    /**
     * 캐시 장비 슬롯 위치
     */
    @SerializedName("cash_item_equipment_slot")
    private String cashItemEquipmentSlot;

    /**
     * 캐시 장비 명
     */
    @SerializedName("cash_item_name")
    private String cashItemName;

    /**
     * 캐시 장비 아이콘
     */
    @SerializedName("cash_item_icon")
    private String cashItemIcon;

    /**
     * 캐시 장비 설명
     */
    @SerializedName("cash_item_description")
    private String cashItemDescription;

    /**
     * 캐시 장비 옵션 목록
     */
    @SerializedName("cash_item_option")
    private List<CharacterCashItemEquipmentOptionDTO> cashItemOption;

    /**
     * 캐시 장비 유효 기간 (KST)
     */
    @SerializedName("date_expire")
    private String dateExpire;

    /**
     * 캐시 장비 옵션 유효 기간 (KST, 시간 단위 데이터로 분은 일괄 0으로 표기)
     */
    @SerializedName("date_option_expire")
    private String dateOptionExpire;

    /**
     * 캐시 장비 라벨 정보
     */
    @SerializedName("cash_item_label")
    private String cashItemLabel;

    /**
     * 캐시 장비 컬러링프리즘 정보
     */
    @SerializedName("cash_item_coloring_prism")
    private CharacterCashItemEquipmentColoringPrismDTO cashItemColoringPrism;

    /**
     * 다른 프리셋에서 장비 추가 장착 없이 1번 프리셋의 장비 공유를 비활성화 했는지 여부
     */
    @SerializedName("base_preset_item_disable_flag")
    private String basePresetItemDisableFlag;
}
