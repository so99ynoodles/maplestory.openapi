﻿using Newtonsoft.Json;

namespace MapleStory.OpenAPI.Dto
{
    /// <summary>
    /// 캐릭터 캐시 장비 아이템 정보
    /// </summary>
    public class CharacterCashItemEquipmentDTO
    {
        /// <summary>
        /// 조회 기준일 (KST, 일 단위 데이터로 시, 분은 일괄 0으로 표기)
        /// </summary>
        [JsonProperty("date")]
        public string Date { get; set; }

        /// <summary>
        /// 캐릭터 성별
        /// </summary>
        [JsonProperty("character_gender")]
        public string CharacterGender { get; set; }

        /// <summary>
        /// 캐릭터 직업
        /// </summary>
        [JsonProperty("character_class")]
        public string CharacterClass { get; set; }

        /// <summary>
        /// 적용 중인 캐시 장비 프리셋 번호
        /// </summary>
        [JsonProperty("preset_no")]
        public long PresetNo { get; set; }

        /// <summary>
        /// 1번 프리셋 장착 캐시 장비 정보 목록
        /// </summary>
        [JsonProperty("cash_item_equipment_preset_1")]
        public List<CharacterCashItemEquipmentPresetDTO> CashItemEquipmentPreset1 { get; set; }

        /// <summary>
        /// 2번 프리셋 장착 캐시 장비 정보 목록
        /// </summary>
        [JsonProperty("cash_item_equipment_preset_2")]
        public List<CharacterCashItemEquipmentPresetDTO> CashItemEquipmentPreset2 { get; set; }

        /// <summary>
        /// 3번 프리셋 장착 캐시 장비 정보 목록
        /// </summary>
        [JsonProperty("cash_item_equipment_preset_3")]
        public List<CharacterCashItemEquipmentPresetDTO> CashItemEquipmentPreset3 { get; set; }

        /// <summary>
        /// 제로인 경우 베타, 엔젤릭버스터인 경우 드레스 업 모드의 1번 프리셋 장착 캐시 장비 정보 목록
        /// </summary>
        [JsonProperty("additional_cash_item_equipment_preset_1")]
        public List<CharacterCashItemEquipmentPresetDTO> AdditionalCashItemEquipmentPreset1 { get; set; }

        /// <summary>
        /// 제로인 경우 베타, 엔젤릭버스터인 경우 드레스 업 모드의 2번 프리셋 장착 캐시 장비 정보 목록
        /// </summary>
        [JsonProperty("additional_cash_item_equipment_preset_2")]
        public List<CharacterCashItemEquipmentPresetDTO> AdditionalCashItemEquipmentPreset2 { get; set; }

        /// <summary>
        /// 제로인 경우 베타, 엔젤릭버스터인 경우 드레스 업 모드의 3번 프리셋 장착 캐시 장비 정보 목록
        /// </summary>
        [JsonProperty("additional_cash_item_equipment_preset_3")]
        public List<CharacterCashItemEquipmentPresetDTO> AdditionalCashItemEquipmentPreset3 { get; set; }
    }
}
