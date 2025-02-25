import {
    CharacterCashItemEquipmentPresetDtoBody
} from "../response/characterCashItemEquipmentDtoBody";
import {CharacterCashItemEquipmentOptionDto} from "./characterCashItemEquipmentOptionDto";
import {CharacterCashItemEquipmentColoringPrismDto} from "./characterCashItemEquipmentColoringPrismDto";

/**
 * 캐릭터 프리셋 장착 캐시 장비 정보
 */
class CharacterCashItemEquipmentPresetDto {

    /**
     * 캐시 장비 부위 명
     */
    cashItemEquipmentPart: string;

    /**
     * 캐시 장비 슬롯 위치
     */
    cashItemEquipmentSlot: string;

    /**
     * 캐시 장비 명
     */
    cashItemName: string;

    /**
     * 캐시 장비 아이콘
     */
    cashItemIcon: string;

    /**
     * 캐시 장비 설명
     */
    cashItemDescription: string;

    /**
     * 캐시 장비 옵션
     */
    cashItemOption: CharacterCashItemEquipmentOptionDto[];

    /**
     * 캐시 장비 유효 기간 (KST)
     */
    dateExpire: string;

    /**
     * 캐시 장비 옵션 유효 기간 (KST, 시간 단위 데이터로 분은 일괄 0으로 표기)
     */
    dateOptionExpire: string;

    /**
     * 캐시 장비 라벨 정보
     */
    cashItemLabel: string;

    /**
     * 캐시 장비 컬러링프리즘 정보
     */
    cashItemColoringPrism: CharacterCashItemEquipmentColoringPrismDto;

    /**
     * 다른 프리셋에서 장비 추가 장착 없이 1번 프리셋의 장비 공유를 비활성화 했는지 여부
     */
    basePresetItemDisableFlag: string;

    constructor(obj: CharacterCashItemEquipmentPresetDtoBody) {

        const {
            cash_item_equipment_part,
            cash_item_equipment_slot,
            cash_item_name,
            cash_item_icon,
            cash_item_description,
            cash_item_option,
            date_expire,
            date_option_expire,
            cash_item_label,
            cash_item_coloring_prism,
            base_preset_item_disable_flag,
        } = obj;

        this.cashItemEquipmentPart = cash_item_equipment_part;
        this.cashItemEquipmentSlot = cash_item_equipment_slot;
        this.cashItemName = cash_item_name;
        this.cashItemIcon = cash_item_icon;
        this.cashItemDescription = cash_item_description;
        this.cashItemOption = cash_item_option.map(option => new CharacterCashItemEquipmentOptionDto(option));
        this.dateExpire = date_expire;
        this.dateOptionExpire = date_option_expire;
        this.cashItemLabel = cash_item_label;
        this.cashItemColoringPrism = new CharacterCashItemEquipmentColoringPrismDto(cash_item_coloring_prism);
        this.basePresetItemDisableFlag = base_preset_item_disable_flag;
    }
}

export {CharacterCashItemEquipmentPresetDto}
