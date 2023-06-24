package org.pugsworth.sandbox





fun main() {
    const ID_ALL_OCEANS = "minecraft:ocean,minecraft:deep_ocean,minecraft:cold_ocean,minecraft:lukewarm_ocean,minecraft:deep_lukewarm_ocean,minecraft:frozen_ocean,minecraft:deep_frozen_ocean"
    const ID_ALL_RIVERS = "minecraft:river,minecraft:frozen_river"
    const code_oceans = "${ID_ALL_OCEANS}:10"
    const code_rivers = "${ID_ALL_RIVERS}:10"

    // TODO: Better name...
    const parser = CodeParser();
    const entries = parser.parse(code);
    

}