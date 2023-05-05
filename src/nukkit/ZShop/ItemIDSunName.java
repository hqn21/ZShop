package nukkit.ZShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Winfxk
 * @author Anders233
 */
public enum ItemIDSunName {
	/**
	 * 石頭
	 */
	STONE("石頭", 1, 0, "textures/blocks/stone.png"),
	/**
	 * 花崗岩
	 */
	STONE_GRANITE("花崗岩", 1, 1, "textures/blocks/stone_granite.png"),
	/**
	 * 平滑花崗岩
	 */
	STONE_GRANITE_SMOOTH("平滑花崗岩", 1, 2, "textures/blocks/stone_granite_smooth.png"),
	/**
	 * 閃長岩
	 */
	STONE_DIORITE("閃長岩", 1, 3, "textures/blocks/stone_diorite.png"),
	/**
	 * 平滑閃長岩
	 */
	STONE_DIORITE_SMOOTH("平滑閃長岩", 1, 4, "textures/blocks/stone_diorite_smooth.png"),
	/**
	 * 安山岩
	 */
	STONE_ANDESITE("安山岩", 1, 5, "textures/blocks/stone_andesite.png"),
	/**
	 * 平滑安山岩
	 */
	STONE_ANDESITE_SMOOTH("平滑安山岩", 1, 6, "textures/blocks/stone_andesite_smooth.png"),
	/**
	 * 青草方塊
	 */
	GRASS("青草方塊", 2, 0, "textures/blocks/grass_side_carried.png"),
	/**
	 * 泥土
	 */
	DIRT("泥土", 3, 0, "textures/blocks/dirt.png"),
	/**
	 * 鵝卵石
	 */
	COBBLESTONE("鵝卵石", 4, 0, "textures/blocks/cobblestone.png"),
	/**
	 * 橡木材
	 */
	PLANKS("橡樹木板", 5, 0, "textures/blocks/planks_oak.png"),
	/**
	 * 杉木材
	 */
	PLANKS_SPRUCE("杉木材", 5, 1, "textures/blocks/planks_spruce.png"),
	/**
	 * 樺木材
	 */
	PLANKS_BIRCH("樺木材", 5, 2, "textures/blocks/planks_birch.png"),
	/**
	 * 叢林木材
	 */
	PLANKS_JUNGLE("叢林木材", 5, 3, "textures/blocks/planks_jungle.png"),
	/**
	 * 相思木材
	 */
	PLANKS_ACACIA("相思木材", 5, 4, "textures/blocks/planks_acacia.png"),
	/**
	 * 黑橡木材
	 */
	PLANKS_BIG_OAK("黑橡木材", 5, 5, "textures/blocks/planks_big_oak.png"),
	/**
	 * 橡樹樹苗
	 */
	SAPLING("橡樹樹苗", 6, 0, "textures/blocks/sapling_oak.png"),
	/**
	 * 杉樹樹苗
	 */
	SAPLING_SPRUCE("杉樹樹苗", 6, 1, "textures/blocks/sapling_spruce.png"),
	/**
	 * 樺樹樹苗
	 */
	SAPLING_BIRCH("樺樹樹苗", 6, 2, "textures/blocks/sapling_birch.png"),
	/**
	 * 叢林木樹苗
	 */
	SAPLING_JUNGLE("叢林木樹苗", 6, 3, "textures/blocks/sapling_jungle.png"),
	/**
	 * 相思木樹苗
	 */
	SAPLING_ACACIA("相思木樹苗", 6, 4, "textures/blocks/sapling_acacia.png"),
	/**
	 * 黑橡木樹苗
	 */
	SAPLING_ROOFED_OAK("黑橡木樹苗", 6, 5, "textures/blocks/sapling_roofed_oak.png"),
	/**
	 * 基岩
	 */
	BEDROCK("基岩", 7, 0, "textures/blocks/bedrock.png"),
	/**
	 * 流動的水
	 */
	FLOWING_WATER("流動的水", 8, 0, "textures/blocks/water_placeholder.png"),
	/**
	 * 水
	 */
	WATER("水", 9, 0, "textures/blocks/water_placeholder.png"),
	/**
	 * 流動的岩漿
	 */
	FLOWING_LAVA("流動的岩漿", 10, 0, "textures/blocks/lava_placeholder.png"),
	/**
	 * 岩漿
	 */
	LAVA("岩漿", 11, 0, "textures/blocks/lava_placeholder.png"),
	/**
	 * 沙子
	 */
	SAND("沙子", 12, 0, "textures/blocks/sand.png"),
	/**
	 * 紅沙
	 */
	RED_SAND("紅沙", 12, 1, "textures/blocks/red_sand.png"),
	/**
	 * 礫石
	 */
	GRAVEL("礫石", 13, 0, "textures/blocks/gravel.png"),
	/**
	 * 金礦石
	 */
	GOLD_ORE("金礦石", 14, 0, "textures/blocks/gold_ore.png"),
	/**
	 * 鐵礦石
	 */
	IRON_ORE("鐵礦石", 15, 0, "textures/blocks/iron_ore.png"),
	/**
	 * 煤礦石
	 */
	COAL_ORE("煤礦石", 16, 0, "textures/blocks/coal_ore.png"),
	/**
	 * 橡木
	 */
	LOG("橡木", 17, 0, "textures/blocks/log_oak.png"),
	/**
	 * 雲杉木
	 */
	LOG_SPRUCE("雲杉木", 17, 1, "textures/blocks/log_spruce.png"),
	/**
	 * 樺木
	 */
	LOG_BIRCH("樺木", 17, 2, "textures/blocks/log_birch.png"),
	/**
	 * 叢林木
	 */
	LOG_JUNGLE("叢林木", 17, 3, "textures/blocks/log_jungle.png"),
	/**
	 * 橡樹葉
	 */
	LEAVES("橡樹葉", 18, 0, "textures/blocks/leaves_oak_carried.tga"),
	/**
	 * 雲杉葉
	 */
	LEAVES_SPRUCE_CARRIED("雲杉葉", 18, 1, "textures/blocks/leaves_spruce_carried.tga"),
	/**
	 * 樺樹葉
	 */
	LEAVES_BIRCH_CARRIED("樺樹葉", 18, 2, "textures/blocks/leaves_birch_carried.tga"),
	/**
	 * 叢林樹葉
	 */
	LEAVES_JUNGLE_CARRIED("叢林樹葉", 18, 3, "textures/blocks/leaves_jungle_carried.tga"),
	/**
	 * 幹海綿
	 */
	SPONGE("幹海綿", 19, 0, "textures/blocks/sponge.png"),
	/**
	 * 濕海綿
	 */
	SPONGE_WET("濕海綿", 19, 1, "textures/blocks/sponge_wet.png"),
	/**
	 * 玻璃
	 */
	GLASS("玻璃", 20, 0, "textures/blocks/glass.png"),
	/**
	 * 青金石礦
	 */
	LAPIS_ORE("青金石礦", 21, 0, "textures/blocks/lapis_ore.png"),
	/**
	 * 青金石塊
	 */
	LAPIS_BLOCK("青金石塊", 22, 0, "textures/blocks/lapis_block.png"),
	/**
	 * 發射器
	 */
	DISPENSER("發射器", 23, 0, "textures/blocks/dispenser_front_horizontal.png"),
	/**
	 * 沙石
	 */
	SANDSTONE("沙石", 24, 0, "textures/blocks/sandstone_normal.png"),
	/**
	 * 鏨制沙石
	 */
	SANDSTONE_CARVED("鏨制沙石", 24, 1, "textures/blocks/sandstone_carved.png"),
	/**
	 * 光滑沙石
	 */
	SANDSTONE_SMOOTH("光滑沙石", 24, 2, "textures/blocks/sandstone_smooth.png"),
	/**
	 * 音符盒
	 */
	NOTEBLOCK("音符盒", 25, 0, "textures/blocks/noteblock.png"),
	/**
	 * 方塊床
	 */
	BED_BLOCK("方塊床", 26, 0, "textures/blocks/bed_head_top.png"),
	/**
	 * 動力鐵軌
	 */
	GOLDEN_RAIL("動力鐵軌", 27, 0, "textures/blocks/rail_golden.png"),
	/**
	 * 探測鐵軌
	 */
	DETECTOR_RAIL("探測鐵軌", 28, 0, "textures/blocks/rail_detector.png"),
	/**
	 * 粘性活塞
	 */
	STICKY_PISTON("粘性活塞", 29, 0, "textures/blocks/piston_top_sticky.png"),
	/**
	 * 蜘蛛網
	 */
	WEB("蜘蛛網", 30, 0, "textures/blocks/web.png"),
	/**
	 * 高草
	 */
	TALLGRASS("高草", 31, 0, "textures/blocks/deadbush.png"),
	/**
	 * 草
	 */
	TALLGRASS_CARRIED("草", 31, 1, "textures/blocks/tallgrass_carried.tga"),
	/**
	 * 蕨
	 */
	FERN_CARRIED("蕨", 31, 2, "textures/blocks/fern_carried.tga"),
	/**
	 * 枯死的灌木
	 */
	DEADBUSH("枯死的灌木", 32, 0, "textures/blocks/deadbush.png"),
	/**
	 * 活塞
	 */
	PISTON("活塞", 33, 0, "textures/blocks/piston_top_normal.png"),
	/**
	 * 活塞臂
	 */
	PISTON_HEAD("活塞臂", 34, 0, "textures/blocks/piston_top_normal.png"),
	/**
	 * 白色羊毛
	 */
	WOOL("白色羊毛", 35, 0, "textures/blocks/wool_colored_white.png"),
	/**
	 * 橙色羊毛
	 */
	WOOL_COLORED_ORANGE("橙色羊毛", 35, 1, "textures/blocks/wool_colored_orange.png"),
	/**
	 * 品紅色羊毛
	 */
	WOOL_COLORED_MAGENTA("品紅色羊毛", 35, 2, "textures/blocks/wool_colored_magenta.png"),
	/**
	 * 淡藍色羊毛
	 */
	WOOL_COLORED_LIGHT_BLUE("淡藍色羊毛", 35, 3, "textures/blocks/wool_colored_light_blue.png"),
	/**
	 * 黃色羊毛
	 */
	WOOL_COLORED_YELLOW("黃色羊毛", 35, 4, "textures/blocks/wool_colored_yellow.png"),
	/**
	 * 黃綠色羊毛
	 */
	WOOL_COLORED_LIME("黃綠色羊毛", 35, 5, "textures/blocks/wool_colored_lime.png"),
	/**
	 * 粉紅色羊毛
	 */
	WOOL_COLORED_PINK("粉紅色羊毛", 35, 6, "textures/blocks/wool_colored_pink.png"),
	/**
	 * 灰色羊毛
	 */
	WOOL_COLORED_GRAY("灰色羊毛", 35, 7, "textures/blocks/wool_colored_gray.png"),
	/**
	 * 淡灰色羊毛
	 */
	WOOL_COLORED_SILVER("淡灰色羊毛", 35, 8, "textures/blocks/wool_colored_silver.png"),
	/**
	 * 青色羊毛
	 */
	WOOL_COLORED_CYAN("青色羊毛", 35, 9, "textures/blocks/wool_colored_cyan.png"),
	/**
	 * 紫色羊毛
	 */
	WOOL_COLORED_PURPLE("紫色羊毛", 35, 10, "textures/blocks/wool_colored_purple.png"),
	/**
	 * 藍色羊毛
	 */
	WOOL_COLORED_BLUE("藍色羊毛", 35, 11, "textures/blocks/wool_colored_blue.png"),
	/**
	 * 棕色羊毛
	 */
	WOOL_COLORED_BROWN("棕色羊毛", 35, 12, "textures/blocks/wool_colored_brown.png"),
	/**
	 * 綠色羊毛
	 */
	WOOL_COLORED_GREEN("綠色羊毛", 35, 13, "textures/blocks/wool_colored_green.png"),
	/**
	 * 紅色羊毛
	 */
	WOOL_COLORED_RED("紅色羊毛", 35, 14, "textures/blocks/wool_colored_red.png"),
	/**
	 * 黑色羊毛
	 */
	WOOL_COLORED_BLACK("黑色羊毛", 35, 15, "textures/blocks/wool_colored_black.png"),
	/**
	 * 黃花羊毛
	 */
	YELLOW_FLOWER("黃花羊毛", 37, 0, "textures/blocks/glazed_terracotta_yellow.png"),
	/**
	 * 罌粟
	 */
	RED_FLOWER("罌粟", 38, 0, "textures/blocks/flower_rose.png"),
	/**
	 * 藍色的蘭花
	 */
	FLOWER_BLUE_ORCHID("藍色的蘭花", 38, 1, "textures/blocks/flower_blue_orchid.png"),
	/**
	 * 絨球蔥
	 */
	FLOWER_ALLIUM("絨球蔥", 38, 2, "textures/blocks/flower_allium.png"),
	/**
	 * 茜草花
	 */
	FLOWER_HOUSTONIA("茜草花", 38, 3, "textures/blocks/flower_houstonia.png"),
	/**
	 * 紅色郁金香
	 */
	FLOWER_TULIP_RED("紅色郁金香", 38, 4, "textures/blocks/flower_tulip_red.png"),
	/**
	 * 橙色郁金香
	 */
	FLOWER_TULIP_ORANGE("橙色郁金香", 38, 5, "textures/blocks/flower_tulip_orange.png"),
	/**
	 * 白色郁金香
	 */
	FLOWER_TULIP_WHITE("白色郁金香", 38, 6, "textures/blocks/flower_tulip_white.png"),
	/**
	 * 粉色郁金香
	 */
	FLOWER_TULIP_PINK("粉色郁金香", 38, 7, "textures/blocks/flower_tulip_pink.png"),
	/**
	 * 濱菊
	 */
	FLOWER_OXEYE_DAISY("濱菊", 38, 8, "textures/blocks/flower_oxeye_daisy.png"),
	/**
	 * 棕色蘑菇
	 */
	BROWN_MUSHROOM("棕色蘑菇", 39, 0, "textures/blocks/mushroom_brown.png"),
	/**
	 * 紅色蘑菇
	 */
	RED_MUSHROOM("紅色蘑菇", 40, 0, "textures/blocks/mushroom_red.png"),
	/**
	 * 黃金塊
	 */
	GOLD_BLOCK("黃金塊", 41, 0, "textures/blocks/gold_block.png"),
	/**
	 * 鐵塊
	 */
	IRON_BLOCK("鐵塊", 42, 0, "textures/blocks/iron_block.png"),
	/**
	 * 雙石台階
	 */
	DOUBLE_STONE_SLAB("雙石台階", 43, 0, "textures/blocks/stone_slab_side.png"),
	/**
	 * 雙沙石台階
	 */
	SANDSTONE_BOTTOM("雙沙石台階", 43, 1, "textures/blocks/sandstone_bottom.png"),
	/**
	 * 雙橡木台階
	 */
	PLANKS_OAK("雙橡木台階", 43, 2, "textures/blocks/planks_oak.png"),
	/**
	 * 雙圓石台階
	 */
	DOUBLE_PEBBLE_STEPS("雙圓石台階", 43, 3, "textures/blocks/cobblestone.png"),
	/**
	 * 雙磚台階
	 */
	DOUBLE_BRICK_STEPS("雙磚台階", 43, 4, "textures/blocks/brick.png"),
	/**
	 * 雙石磚台階
	 */
	DOUBLE_STONE_BRICK_STEPS("雙石磚台階", 43, 5, "textures/blocks/stonebrick.png"),
	/**
	 * 雙石英台階
	 */
	DOUBLE_QUARTZ_STEPS("雙石英台階", 43, 6, "textures/blocks/nether_brick.png"),
	/**
	 * 雙地獄磚台階
	 */
	DOUBLE_HELL_BRICK_STEPS("雙地獄磚台階", 43, 7, "textures/blocks/quartz_block_top.png"),
	/**
	 * 石台階
	 */
	STONE_SLAB("石台階", 44, 0, "textures/blocks/stone_slab_top.png"),
	/**
	 * 沙石台階
	 */
	SANDSTONE_TOP("沙石台階", 44, 1, "textures/blocks/sandstone_top.png"),
	/**
	 * 圓石台階
	 */
	COBBLESTONE_STEPS("圓石台階", 44, 3, "textures/blocks/cobblestone.png"),
	/**
	 * 磚台階
	 */
	BRICK_STEPS("磚台階", 44, 4, "textures/blocks/brick.png"),
	/**
	 * 石磚台階
	 */
	STONEBRICK_STEPS("石磚台階", 44, 5, "textures/blocks/stonebrick.png"),
	/**
	 * 石英台階
	 */
	NETHER_BRICK_STEPS("石英台階", 44, 6, "textures/blocks/nether_brick.png"),
	/**
	 * 地獄磚台階
	 */
	QUARTZ_BLOCK_TOP_STEPS("地獄磚台階", 44, 7, "textures/blocks/quartz_block_top.png"),
	/**
	 * 磚
	 */
	BRICK("磚", 336, 0, "textures/blocks/brick.png"),
	/**
	 * TNT
	 */
	TNT("TNT", 46, 0, "textures/blocks/tnt_side.png"),
	/**
	 * 書架
	 */
	BOOKSHELF("書架", 47, 0, "textures/blocks/bookshelf.png"),
	/**
	 * 苔石
	 */
	MOSSY_COBBLESTONE("苔石", 48, 0, "textures/blocks/cobblestone_mossy.png"),
	/**
	 * 黑曜石
	 */
	OBSIDIAN("黑曜石", 49, 0, "textures/blocks/obsidian.png"),
	/**
	 * 火把
	 */
	TORCH("火把", 50, 0, "textures/blocks/torch_on.png"),
	/**
	 * 火
	 */
	FIRE("火", 51, 0, "textures/blocks/fire_0_placeholder.png"),
	/**
	 * 刷怪籠
	 */
	MOB_SPAWNER("刷怪籠", 52, 0, "textures/blocks/mob_spawner.png"),
	/**
	 * 橡木階梯
	 */
	OAK_STAIRS("橡木階梯", 53, 0, "textures/blocks/planks_oak.png"),
	/**
	 * 箱子
	 */
	CHEST("箱子", 54, 0, "textures/blocks/chest_front.png"),
	/**
	 * 紅石粉
	 */
	REDSTONE_WIRE("紅石粉", 55, 0, "textures/blocks/redstone_dust_line.png"),
	/**
	 * 鑽石礦
	 */
	DIAMOND_ORE("鑽石礦", 56, 0, "textures/blocks/diamond_ore.png"),
	/**
	 * 鑽石塊
	 */
	DIAMOND_BLOCK("鑽石塊", 57, 0, "textures/blocks/diamond_block.png"),
	/**
	 * 工作台
	 */
	CRAFTING_TABLE("工作台", 58, 0, "textures/blocks/crafting_table_top.png"),
	/**
	 * 農田
	 */
	FARMLAND("農田", 60, 0, "textures/blocks/farmland_dry.png"),
	/**
	 * 熔爐
	 */
	FURNACE("熔爐", 61, 0, "textures/blocks/furnace_front_off.png"),
	/**
	 * 梯子
	 */
	LADDER("梯子", 65, 0, "textures/blocks/ladder.png"),
	/**
	 * 鐵軌
	 */
	RAIL("鐵軌", 66, 0, "textures/blocks/rail_normal.png"),
	/**
	 * 圓石階梯
	 */
	STONE_STAIRS("圓石階梯", 67, 0, "textures/blocks/cobblestone.png"),
	/**
	 * 拉桿
	 */
	LEVER("拉桿", 69, 0, "textures/blocks/lever.png"),
	/**
	 * 石質壓力板
	 */
	STONE_PRESSURE_PLATE("石質壓力板", 70, 0, "textures/blocks/stone.png"),
	/**
	 * 木質壓力板
	 */
	WOODEN_PRESSURE_PLATE("木質壓力板", 72, 0, "textures/blocks/planks_oak.png"),
	/**
	 * 紅石礦
	 */
	REDSTONE_ORE("紅石礦", 73, 0, "textures/blocks/redstone_ore.png"),
	/**
	 * 發光的紅石礦
	 */
	LIT_REDSTONE_ORE("發光的紅石礦", 74, 0, "textures/blocks/redstone_ore.png"),
	/**
	 * 紅石火把
	 */
	UNLIT_REDSTONE_TORCH("紅石火把", 75, 0, "textures/blocks/redstone_torch_off.png"),
	/**
	 * 石質按鈕
	 */
	STONE_BUTTON("石質按鈕", 77, 0, "textures/blocks/stone.png"),
	/**
	 * 頂層雪
	 */
	SNOW_LAYER("頂層雪", 78, 0, "textures/blocks/snow.png"),
	/**
	 * 冰
	 */
	ICE("冰", 79, 0, "textures/blocks/ice.png"),
	/**
	 * 雪
	 */
	SNOW("雪", 80, 0, "textures/blocks/snow.png"),
	/**
	 * 仙人掌
	 */
	CACTUS("仙人掌", 81, 0, "textures/blocks/cactus_side.tga"),
	/**
	 * 粘土
	 */
	CLAY("粘土", 82, 0, "textures/blocks/clay.png"),
	/**
	 * 音樂盒
	 */
	JUKEBOX("音樂盒", 84, 0, "textures/blocks/jukebox_top.png"),
	/**
	 * 橡木圍墻
	 */
	FENCE("橡木圍墻", 85, 0, "textures/blocks/planks_oak.png"),
	/**
	 * 南瓜
	 */
	PUMPKIN("南瓜", 86, 0, "textures/blocks/pumpkin_face_off.png"),
	/**
	 * 地獄岩
	 */
	NETHERRACK("地獄岩", 87, 0, "textures/blocks/netherrack.png"),
	/**
	 * 靈魂沙
	 */
	SOUL_SAND("靈魂沙", 88, 0, "textures/blocks/soul_sand.png"),
	/**
	 * 螢石
	 */
	GLOWSTONE("螢石", 89, 0, "textures/blocks/glowstone.png"),
	/**
	 * 傳送門
	 */
	PORTAL("傳送門", 90, 0, "textures/blocks/portal_placeholder.png"),
	/**
	 * 南瓜燈
	 */
	LIT_PUMPKIN("南瓜燈", 91, 0, "textures/blocks/pumpkin_face_on.png"),
	/**
	 * 隱形基岩
	 */
	STAINED_GLASS("隱形基岩", 95, 0, "textures/blocks/glass_white.png"),
	/**
	 * 木質陷阱門
	 */
	TRAPDOOR("木質陷阱門", 96, 0, "textures/blocks/trapdoor.png"),
	/**
	 * 石頭刷怪蛋
	 */
	MONSTER_EGG("石頭刷怪蛋", 97, 0, "textures/blocks/stone.png"),
	/**
	 * 圓石刷怪蛋
	 */
	COBBLESTONE_EGG("圓石刷怪蛋", 97, 1, "textures/blocks/Cobblestone.png"),
	/**
	 * 石磚刷怪蛋
	 */
	STONEBRICK("石磚刷怪蛋", 97, 2, "textures/blocks/stonebrick.png"),
	/**
	 * 苔石磚
	 */
	STONEBRICK_MOSSY("苔石磚", 98, 1, "textures/blocks/stonebrick_mossy.png"),
	/**
	 * 裂石磚
	 */
	STONEBRICK_CRACKED("裂石磚", 98, 2, "textures/blocks/stonebrick_cracked.png"),
	/**
	 * 鏨制石磚
	 */
	STONEBRICK_CARVED("鏨制石磚", 98, 3, "textures/blocks/stonebrick_carved.png"),
	/**
	 * 棕色蘑菇塊
	 */
	BROWN_MUSHROOM_BLOCK("棕色蘑菇塊", 99, 0, "textures/blocks/mushroom_block_skin_brown.png"),
	/**
	 * 紅色蘑菇塊
	 */
	RED_MUSHROOM_BLOCK("紅色蘑菇塊", 100, 0, "textures/blocks/mushroom_block_skin_red.png"),
	/**
	 * 鐵欄桿
	 */
	IRON_BARS("鐵欄桿", 101, 0, "textures/blocks/iron_bars.png"),
	/**
	 * 玻璃板
	 */
	GLASS_PANE("玻璃板", 102, 0, "textures/blocks/glass_pane_top.png"),
	/**
	 * 南瓜梗
	 */
	PUMPKIN_STEM("南瓜梗", 104, 0, "textures/blocks/pumpkin_stem_disconnected.png"),
	/**
	 * 藤蔓
	 */
	VINE("藤蔓", 106, 0, "textures/blocks/vine_carried.png"),
	/**
	 * 橡木圍墻大門
	 */
	FENCE_GATE("橡木圍墻大門", 107, 0, "textures/blocks/planks_oak.png"),
	/**
	 * 磚塊階梯
	 */
	BRICK_STAIRS("磚塊階梯", 108, 0, "textures/blocks/brick.png"),
	/**
	 * 石磚階梯
	 */
	STONE_BRICK_STAIRS("石磚階梯", 109, 0, "textures/blocks/stonebrick.png"),
	/**
	 * 菌絲
	 */
	MYCELIUM("菌絲", 110, 0, "textures/blocks/mycelium_side.png"),
	/**
	 * 睡蓮
	 */
	WATERLILY("睡蓮", 111, 0, "textures/blocks/carried_waterlily.png"),
	/**
	 * 地獄磚
	 */
	NETHERBRICK("地獄磚", 405, 0, "textures/blocks/nether_brick.png"),
	/**
	 * 地獄磚圍墻
	 */
	NETHER_BRICK_FENCE("地獄磚圍墻", 113, 0, "textures/blocks/nether_brick.png"),
	/**
	 * 地獄磚階梯
	 */
	NETHER_BRICK_STAIRS("地獄磚階梯", 114, 0, "textures/blocks/nether_brick.png"),
	/**
	 * 附魔台
	 */
	ENCHANTING_TABLE("附魔台", 116, 0, "textures/blocks/enchanting_table_side.png"),
	/**
	 * 釀造台
	 */
	BREWING_STAND("釀造台", 379, 0, "textures/blocks/brewing_stand.png"),
	/**
	 * 煉藥鍋
	 */
	CAULDRON("煉藥鍋", 380, 0, "textures/blocks/cauldron_side.png"),
	/**
	 * 末地門
	 */
	END_PORTAL("末地門", 119, 0, "textures/blocks/end_portal.png"),
	/**
	 * 末地傳送門
	 */
	END_PORTAL_FRAME("末地傳送門", 120, 0, "textures/blocks/end_portal.png"),
	/**
	 * 末地石
	 */
	END_STONE("末地石", 121, 0, "textures/blocks/end_stone.png"),
	/**
	 * 龍蛋
	 */
	DRAGON_EGG("龍蛋", 122, 0, "textures/blocks/dragon_egg.png"),
	/**
	 * 紅石燈
	 */
	REDSTONE_LAMP("紅石燈", 123, 0, "textures/blocks/redstone_lamp_off.png"),
	/**
	 * 沙石階梯
	 */
	SANDSTONE_STAIRS("沙石階梯", 128, 0, "textures/blocks/sandstone_bottom.png"),
	/**
	 * 綠寶石礦石
	 */
	EMERALD_ORE("綠寶石礦石", 129, 0, "textures/blocks/emerald_ore.png"),
	/**
	 * 末影箱
	 */
	ENDER_CHEST("末影箱", 130, 0, "textures/blocks/ender_chest_front.png"),
	/**
	 * 拌線鉤
	 */
	TRIPWIRE_HOOK("拌線鉤", 131, 0, "textures/blocks/trip_wire_source.png"),
	/**
	 * 拌線
	 */
	TRIPWIRE("拌線", 132, 0, "textures/blocks/trip_wire.png"),
	/**
	 * 綠寶石塊
	 */
	EMERALD_BLOCK("綠寶石塊", 133, 0, "textures/blocks/emerald_block.png"),
	/**
	 * 雲杉木階梯
	 */
	SPRUCE_STAIRS("雲杉木階梯", 134, 0, "textures/blocks/planks_spruce.png"),
	/**
	 * 樺木階梯
	 */
	BIRCH_STAIRS("樺木階梯", 135, 0, "textures/blocks/planks_birch.png"),
	/**
	 * 叢林木階梯
	 */
	JUNGLE_STAIRS("叢林木階梯", 136, 0, "textures/blocks/planks_jungle.png"),
	/**
	 * 命令方塊
	 */
	COMMAND_BLOCK("命令方塊", 137, 0, "textures/blocks/command_block.png"),
	/**
	 * 信標
	 */
	BEACON("信標", 138, 0, "textures/blocks/beacon.png"),
	/**
	 * 圓石墻
	 */
	COBBLESTONE_WALL("圓石墻", 139, 0, "textures/blocks/cobblestone.png"),
	/**
	 * 苔石墻
	 */
	MOSS_COBBLESTONE_WALL("苔石墻", 139, 1, "textures/blocks/cobblestone_mossy.png"),
	/**
	 * 土豆
	 */
	POTATOES("土豆", 142, 0, "textures/blocks/potatoes_stage_3.png"),
	/**
	 * 木質按鈕
	 */
	WOODEN_BUTTON("木質按鈕", 143, 0, "textures/blocks/planks_oak.png"),
	/**
	 * 鐵砧
	 */
	ANVIL("鐵砧", 145, 0, "textures/blocks/anvil_top_damaged_0.png"),
	/**
	 * 陷阱箱
	 */
	TRAPPED_CHEST("陷阱箱", 146, 0, "textures/blocks/trapped_chest_front.png"),
	/**
	 * 重力壓力板(輕型)
	 */
	LIGHT_WEIGHTED_PRESSURE_PLATE("重力壓力板(輕型)", 147, 0, "textures/blocks/gold_block.png"),
	/**
	 * 重力壓力板(重型)
	 */
	HEAVY_WEIGHTED_PRESSURE_PLATE("重力壓力板(重型)", 148, 0, "textures/blocks/iron_block.png"),
	/**
	 * 陽光傳感器
	 */
	DAYLIGHT_DETECTOR_INVERTED("陽光傳感器", 178, 0, "textures/blocks/daylight_detector_inverted_top.png"),
	/**
	 * 紅石塊
	 */
	REDSTONE_BLOCK("紅石塊", 152, 0, "textures/blocks/redstone_block.png"),
	/**
	 * 地獄石英礦石
	 */
	QUARTZ_ORE("地獄石英礦石", 153, 0, "textures/blocks/quartz_ore.png"),
	/**
	 * 漏鬥
	 */
	HOPPER("漏鬥", 154, 0, "textures/blocks/hopper_top.png"),
	/**
	 * 石英塊
	 */
	QUARTZ_BLOCK("石英塊", 155, 0, "textures/blocks/quartz_block_top.png"),
	/**
	 * 豎紋石英塊
	 */
	VERTICAL_GRAIN_QUARTZ_BLOCK("豎紋石英塊", 155, 1, "textures/blocks/quartz_block_lines.png"),
	/**
	 * 鏨制石英塊
	 */
	QUARTZ_BLOCK_CHISELED("鏨制石英塊", 155, 2, "textures/blocks/quartz_block_chiseled_top.png"),
	/**
	 * 石英階梯
	 */
	QUARTZ_STAIRS("石英階梯", 156, 0, "textures/blocks/quartz_block_top.png"),
	/**
	 * 橡木台階
	 */
	OAK_WOOD_STAIRS("橡木台階", 158, 0, "textures/blocks/planks_oak.png"),
	/**
	 * 白色粘土
	 */
	WHITE_STAINED_HARDENED_CLAY("白色粘土", 159, 0, "textures/blocks/hardened_clay_stained_white.png"),
	/**
	 * 橙色粘土
	 */
	ORANGE_STAINED_HARDENED_CLAY("橙色粘土", 159, 1, "textures/blocks/hardened_clay_stained_orange.png"),
	/**
	 * 品紅色粘土
	 */
	SOLFERINO_STAINED_HARDENED_CLAY("品紅色粘土", 159, 2, "textures/blocks/hardened_clay_stained_magenta.png"),
	/**
	 * 淡藍色粘土
	 */
	LIGHT_BLUE_STAINED_HARDENED_CLAY("淡藍色粘土", 159, 3, "textures/blocks/hardened_clay_stained_light_blue.png"),
	/**
	 * 黃色粘土
	 */
	YELLOW_STAINED_HARDENED_CLAY("黃色粘土", 159, 4, "textures/blocks/hardened_clay_stained_yellow.png"),
	/**
	 * 黃綠色粘土
	 */
	OLIVINE_STAINED_HARDENED_CLAY("黃綠色粘土", 159, 5, "textures/blocks/hardened_clay_stained_lime.png"),
	/**
	 * 粉紅色粘土
	 */
	PINK_STAINED_HARDENED_CLAY("粉紅色粘土", 159, 6, "textures/blocks/hardened_clay_stained_pink.png"),
	/**
	 * 灰色粘土
	 */
	GRAY_STAINED_HARDENED_CLAY("灰色粘土", 159, 7, "textures/blocks/hardened_clay_stained_gray.png"),
	/**
	 * 淡灰色粘土
	 */
	LIGHT_GRAY_STAINED_HARDENED_CLAY("淡灰色粘土", 159, 8, "textures/blocks/concrete_gray.png"),
	/**
	 * 青色粘土
	 */
	CYAN_STAINED_HARDENED_CLAY("青色粘土", 159, 9, "textures/blocks/hardened_clay_stained_lime.png"),
	/**
	 * 紫色粘土
	 */
	VIOLET_STAINED_HARDENED_CLAY("紫色粘土", 159, 10, "textures/blocks/hardened_clay_stained_purple.png"),
	/**
	 * 藍色粘土
	 */
	BLUE_STAINED_HARDENED_CLAY("藍色粘土", 159, 11, "textures/blocks/hardened_clay_stained_blue.png"),
	/**
	 * 棕色粘土
	 */
	BROWN_STAINED_HARDENED_CLAY("棕色粘土", 159, 12, "textures/blocks/hardened_clay_stained_brown.png"),
	/**
	 * 綠色粘土
	 */
	GREEN_STAINED_HARDENED_CLAY("綠色粘土", 159, 13, "textures/blocks/hardened_clay_stained_green.png"),
	/**
	 * 紅色粘土
	 */
	RED_STAINED_HARDENED_CLAY("紅色粘土", 159, 14, "textures/blocks/hardened_clay_stained_red.png"),
	/**
	 * 黑色粘土
	 */
	BLACK_STAINED_HARDENED_CLAY("黑色粘土", 159, 15, "textures/blocks/hardened_clay_stained_black.png"),
	/**
	 * 白色玻璃板
	 */
	WHITE_STAINED_GLASS_PANE("白色玻璃板", 160, 0, "textures/blocks/glass_pane_top_white.png"),
	/**
	 * 橙色玻璃板
	 */
	ORANGE_STAINED_GLASS_PANE("橙色玻璃板", 160, 1, "textures/blocks/glass_pane_top_orange.png"),
	/**
	 * 品紅色玻璃板
	 */
	SOLFERINO_STAINED_GLASS_PANE("品紅色玻璃板", 160, 2, "textures/blocks/glass_pane_top_magenta.png"),
	/**
	 * 淡藍色玻璃板
	 */
	LIGHT_BLUE_STAINED_GLASS_PANE("淡藍色玻璃板", 160, 3, "textures/blocks/glass_light_blue.png"),
	/**
	 * 黃色玻璃板
	 */
	YELLOW_STAINED_GLASS_PANE("黃色玻璃板", 160, 4, "textures/blocks/glass_yellow.png"),
	/**
	 * 黃綠色玻璃板
	 */
	OLIVINE_STAINED_GLASS_PANE("黃綠色玻璃板", 160, 5, "textures/blocks/glass_pane_top_lime.png"),
	/**
	 * 粉紅色玻璃板
	 */
	PINK_STAINED_GLASS_PANE("粉紅色玻璃板", 160, 6, "textures/blocks/glass_pane_top_pink.png"),
	/**
	 * 灰色玻璃板
	 */
	GRAY_STAINED_GLASS_PANE("灰色玻璃板", 160, 7, "textures/blocks/glass_gray.png"),
	/**
	 * 淡灰色玻璃板
	 */
	LIGHT_GRAY_STAINED_GLASS_PANE("淡灰色玻璃板", 160, 8, "textures/blocks/glass_brown.png"),
	/**
	 * 青色玻璃板
	 */
	CYAN_STAINED_GLASS_PANE("青色玻璃板", 160, 9, "textures/blocks/glass_pane_top_cyan.png"),
	/**
	 * 紫色玻璃板
	 */
	VIOLET_STAINED_GLASS_PANE("紫色玻璃板", 160, 10, "textures/blocks/glass_pane_top_purple.png"),
	/**
	 * 藍色玻璃板
	 */
	BLUE_STAINED_GLASS_PANE("藍色玻璃板", 160, 11, "textures/blocks/glass_blue.png"),
	/**
	 * 棕色玻璃板
	 */
	BROWN_STAINED_GLASS_PANE("棕色玻璃板", 160, 12, "textures/blocks/glass_brown.png"),
	/**
	 * 綠色玻璃板
	 */
	GREEN_STAINED_GLASS_PANE("綠色玻璃板", 160, 13, "textures/blocks/glass_pane_top_green.png"),
	/**
	 * 紅色玻璃板
	 */
	RED_STAINED_GLASS_PANE("紅色玻璃板", 160, 14, "textures/blocks/glass_red.png"),
	/**
	 * 黑色玻璃板
	 */
	BLACK_STAINED_GLASS_PANE("黑色玻璃板", 160, 15, "textures/blocks/glass_black.png"),
	/**
	 * 金合歡葉
	 */
	ACACIA_LEAVES("金合歡葉", 161, 0, "textures/blocks/leaves_acacia_opaque.png"),
	/**
	 * 深色橡樹葉
	 */
	DARK_OAK_LEAF("深色橡樹葉", 161, 1, "textures/blocks/leaves_big_oak_opaque.png"),
	/**
	 * 金合歡木
	 */
	ACACIA_WOOD("金合歡木", 162, 0, "textures/blocks/log_acacia.png"),
	/**
	 * 深色橡木
	 */
	DARK_OAK("深色橡木", 162, 1, "textures/blocks/log_acacia.png"),
	/**
	 * 金合歡木階梯
	 */
	ACACIA_STAIRS("金合歡木階梯", 163, 0, "textures/blocks/planks_acacia.png"),
	/**
	 * 深色橡木階梯
	 */
	DARK_OAK_STAIRS("深色橡木階梯", 164, 0, "textures/blocks/planks_big_oak.png"),
	/**
	 * 粘液塊
	 */
	SLIME("粘液塊", 165, 0, "textures/blocks/slime.png"),
	/**
	 * 鐵門
	 */
	IRON_DOOR("鐵門", 330, 0, "textures/blocks/door_iron_upper.png"),
	/**
	 * 海晶石
	 */
	PRISMARINE("海晶石", 168, 0, "textures/blocks/prismarine_dark.png"),
	/**
	 * 暗海晶石
	 */
	DARK_PRISMARINE("暗海晶石", 168, 1, "textures/blocks/prismarine_dark.png"),
	/**
	 * 海晶石磚
	 */
	PRISMARINE_STONE_BRICK("海晶石磚", 168, 2, "textures/blocks/prismarine_bricks.png"),
	/**
	 * 海晶燈
	 */
	SEA_LANTERN("海晶燈", 169, 0, "textures/blocks/sea_lantern.png"),
	/**
	 * 幹草捆
	 */
	HAY_BLOCK("幹草捆", 170, 0, "textures/blocks/hay_block_side.png"),
	/**
	 * 白色地毯
	 */
	WHITE_CARPET("白色地毯", 171, 0, "textures/blocks/wool_colored_white.png"),
	/**
	 * 橙色地毯
	 */
	ORANGE_CARPET("橙色地毯", 171, 1, "textures/blocks/wool_colored_orange.png"),
	/**
	 * 品紅色地毯
	 */
	SOLFERINO_CARPET("品紅色地毯", 171, 2, "textures/blocks/wool_colored_magenta.png"),
	/**
	 * 淡藍色地毯
	 */
	LIGHT_BLUE_CARPET("淡藍色地毯", 171, 3, "textures/blocks/wool_colored_light_blue.png"),
	/**
	 * 黃色地毯
	 */
	YELLOW_CARPET("黃色地毯", 171, 4, "textures/blocks/wool_colored_yellow.png"),
	/**
	 * 黃綠色地毯
	 */
	OLIVINE_CARPET("黃綠色地毯", 171, 5, "textures/blocks/wool_colored_lime.png"),
	/**
	 * 粉紅色地毯
	 */
	PINK_CARPET("粉紅色地毯", 171, 6, "textures/blocks/wool_colored_pink.png"),
	/**
	 * 灰色地毯
	 */
	GRAY_CARPET("灰色地毯", 171, 7, "textures/blocks/wool_colored_gray.png"),
	/**
	 * 淡灰色地毯
	 */
	LIGHT_GRAY_CARPET("淡灰色地毯", 171, 8, "textures/blocks/wool_colored_silver.png"),
	/**
	 * 青色地毯
	 */
	CYAN_CARPET("青色地毯", 171, 9, "textures/blocks/wool_colored_cyan.png"),
	/**
	 * 紫色地毯
	 */
	VIOLET_CARPET("紫色地毯", 171, 10, "textures/blocks/wool_colored_purple.png"),
	/**
	 * 藍色地毯
	 */
	BLUE_CARPET("藍色地毯", 171, 11, "textures/blocks/wool_colored_blue.png"),
	/**
	 * 棕色地毯
	 */
	BROWN_CARPET("棕色地毯", 171, 12, "textures/blocks/wool_colored_brown.png"),
	/**
	 * 綠色地毯
	 */
	GREEN_CARPET("綠色地毯", 171, 13, "textures/blocks/wool_colored_green.png"),
	/**
	 * 紅色地毯
	 */
	RED_CARPET("紅色地毯", 171, 14, "textures/blocks/wool_colored_red.png"),
	/**
	 * 黑色地毯
	 */
	BLACK_CARPET("黑色地毯", 171, 15, "textures/blocks/wool_colored_black.png"),
	/**
	 * 硬化粘土
	 */
	HARDENED_CLAY("硬化粘土", 172, 0, "textures/blocks/hardened_clay.png"),
	/**
	 * 煤炭塊
	 */
	COAL_BLOCK("煤炭塊", 173, 0, "textures/blocks/coal_block.png"),
	/**
	 * 浮冰
	 */
	PACKED_ICE("浮冰", 174, 0, "textures/blocks/ice_packed.png"),
	/**
	 * 向日葵
	 */
	SUNFLOWER("向日葵", 175, 0, "textures/blocks/double_plant_sunflower_front.png"),
	/**
	 * 丁香
	 */
	LILAC("丁香", 175, 1, "textures/blocks/flower_cornflower.png"),
	/**
	 * 高草叢
	 */
	TALL_GRASS("高草叢", 175, 2, "textures/blocks/double_plant_grass_carried.png"),
	/**
	 * 大型蕨
	 */
	LARGE_FERN("大型蕨", 175, 3, "textures/blocks/tallgrass.png"),
	/**
	 * 玫瑰叢
	 */
	ROSE_BUSH("玫瑰叢", 175, 4, "textures/blocks/sweet_berry_bush_stage3.png"),
	/**
	 * 牡丹
	 */
	PEONY("牡丹", 175, 5, "textures/blocks/flower_allium.png"),
	/**
	 * 旗幟
	 */
	STANDING_BANNER("旗幟", 176, 0, "textures/blocks/bone_block_side.png"),
	/**
	 * 懸掛的旗幟
	 */
	WALL_BANNER("懸掛的旗幟", 177, 0, "textures/blocks/bone_block_side.png"),
	/**
	 * 紅沙石
	 */
	RED_SANDSTONE("紅沙石", 179, 0, "textures/blocks/red_sandstone_bottom.png"),
	/**
	 * 鏨制紅沙石
	 */
	CHISELED_RED_SANDSTONE("鏨制紅沙石", 179, 1, "textures/blocks/red_sandstone_carved.png"),
	/**
	 * 平滑紅沙石
	 */
	SMOOTH_RED_SANDSTONE("平滑紅沙石", 179, 2, "textures/blocks/red_sandstone_smooth.png"),
	/**
	 * 紅沙石階梯
	 */
	RED_SANDSTONE_STAIRS("紅沙石階梯", 180, 0, "textures/blocks/red_sandstone_carved.png"),
	/**
	 * 紅沙石台階
	 */
	STONE_SLAB2("紅沙石台階", 182, 0, "textures/blocks/red_sandstone_smooth.png"),
	/**
	 * 雲杉圍墻大門
	 */
	SPRUCE_FENCE_GATE("雲杉圍墻大門", 183, 0, "textures/blocks/door_spruce_lower.png"),
	/**
	 * 樺木圍墻大門
	 */
	BIRCH_FENCE_GATE("樺木圍墻大門", 184, 0, "textures/blocks/door_birch_upper.png"),
	/**
	 * 叢林木圍墻大門
	 */
	JUNGLE_FENCE_GATE("叢林木圍墻大門", 185, 0, "textures/blocks/door_acacia_upper.png"),
	/**
	 * 深色橡木圍墻大門
	 */
	DARK_OAK_FENCE_GATE("深色橡木圍墻大門", 186, 0, "textures/blocks/door_dark_oak_lower.png"),
	/**
	 * 金合歡木圍墻大門
	 */
	ACACIA_FENCE_GATE("金合歡木圍墻大門", 187, 0, "textures/blocks/door_spruce_lower.png"),
	/**
	 * 重覆命令塊
	 */
	SPRUCE_FENCE("重覆命令塊", 188, 0, "textures/blocks/chain_command_block_conditional_mipmap.png"),
	/**
	 * 鏈命令塊
	 */
	BIRCH_FENCE("鏈命令塊", 189, 0, "textures/blocks/repeating_command_block_back_mipmap.png"),
	/**
	 * 樺木門
	 */
	BIRCH_DOOR("樺木門", 194, 0, "textures/blocks/door_birch_upper.png"),
	/**
	 * 綠茵小道
	 */
	END_ROD("綠茵小道", 198, 0, "textures/blocks/end_rod.png"),
	/**
	 * 合唱花
	 */
	CHORUS_FLOWER("合唱花", 200, 0, "textures/blocks/chorus_flower.png"),
	/**
	 * 紫珀方塊
	 */
	PURPUR_BLOCK("紫珀方塊", 201, 0, "textures/blocks/purpur_block.png"),
	/**
	 * 紫珀階梯
	 */
	PURPUR_STAIRS("紫珀階梯", 203, 0, "textures/blocks/purpur_block.png"),
	/**
	 * 潛匿之貝箱子
	 */
	PURPUR_SLAB("潛匿之貝箱子", 205, 0, "textures/items/shulker_shell.png"),
	/**
	 * 末地石磚
	 */
	END_BRICKS("末地石磚", 206, 0, "textures/blocks/end_bricks.png"),
	/**
	 * 末地棒
	 */
	GRASS_PATH("末地棒", 208, 0, "textures/blocks/grass_path_side.png"),
	/**
	 * 末地門2
	 */
	END_GATEWAY("末地門2", 209, 0, "textures/blocks/end_gateway.png"),
	/**
	 * 鐵鍬
	 */
	IRON_SHOVEL("鐵鍬", 256, 0, "textures/items/iron_shovel.png"),
	/**
	 * 鐵鎬
	 */
	IRON_PICKAXE("鐵鎬", 257, 0, "textures/items/iron_pickaxe.png"),
	/**
	 * 鐵斧
	 */
	IRON_AXE("鐵斧", 258, 0, "textures/items/iron_axe.png"),
	/**
	 * 打火石
	 */
	FLINT_AND_STEEL("打火石", 259, 0, "textures/items/flint_and_steel.png"),
	/**
	 * 蘋果
	 */
	APPLE("蘋果", 260, 0, "textures/items/apple.png"),
	/**
	 * 弓
	 */
	BOW("弓", 261, 0, "textures/items/bow_standby.png"),
	/**
	 * 箭
	 */
	ARROW("箭", 262, 0, "textures/items/arrow.png"),
	/**
	 * 煤炭
	 */
	COAL("煤炭", 263, 0, "textures/items/coal.png"),
	/**
	 * 木炭
	 */
	CHARCOAL("木炭", 263, 1, "textures/items/charcoal.png"),
	/**
	 * 鑽石
	 */
	DIAMOND("鑽石", 264, 0, "textures/items/diamond.png"),
	/**
	 * 鐵錠
	 */
	IRON_INGOT("鐵錠", 265, 0, "textures/items/iron_ingot.png"),
	/**
	 * 金錠
	 */
	GOLD_INGOT("金錠", 266, 0, "textures/items/gold_ingot.png"),
	/**
	 * 鐵劍
	 */
	IRON_SWORD("鐵劍", 267, 0, "textures/items/iron_sword.png"),
	/**
	 * 木劍
	 */
	WOODEN_SWORD("木劍", 268, 0, "textures/items/wood_sword.png"),
	/**
	 * 木鍬
	 */
	WOODEN_SHOVEL("木鍬", 269, 0, "textures/items/wood_shovel.png"),
	/**
	 * 木鎬
	 */
	WOODEN_PICKAXE("木鎬", 270, 0, "textures/items/wood_pickaxe.png"),
	/**
	 * 木斧
	 */
	WOODEN_AXE("木斧", 271, 0, "textures/items/wood_axe.png"),
	/**
	 * 石劍
	 */
	STONE_SWORD("石劍", 272, 0, "textures/items/stone_sword.png"),
	/**
	 * 石鍬
	 */
	STONE_SHOVEL("石鍬", 273, 0, "textures/items/stone_shovel.png"),
	/**
	 * 石鎬
	 */
	STONE_PICKAXE("石鎬", 274, 0, "textures/items/stone_pickaxe.png"),
	/**
	 * 石斧
	 */
	STONE_AXE("石斧", 275, 0, "textures/items/stone_axe.png"),
	/**
	 * 鑽石劍
	 */
	DIAMOND_SWORD("鑽石劍", 276, 0, "textures/items/diamond_sword.png"),
	/**
	 * 鑽石鍬
	 */
	DIAMOND_SHOVEL("鑽石鍬", 277, 0, "textures/items/diamond_shovel.png"),
	/**
	 * 鑽石鎬
	 */
	DIAMOND_PICKAXE("鑽石鎬", 278, 0, "textures/items/diamond_pickaxe.png"),
	/**
	 * 鑽石斧
	 */
	DIAMOND_AXE("鑽石斧", 279, 0, "textures/items/diamond_axe.png"),
	/**
	 * 木棍
	 */
	STICK("木棍", 280, 0, "textures/items/stick.png"),
	/**
	 * 碗
	 */
	BOWL("碗", 281, 0, "textures/items/bowl.png"),
	/**
	 * 蘑菇煲
	 */
	MUSHROOM_STEW("蘑菇煲", 282, 0, "textures/items/mushroom_stew.png"),
	/**
	 * 金劍
	 */
	GOLDEN_SWORD("金劍", 283, 0, "textures/items/gold_sword.png"),
	/**
	 * 金鍬
	 */
	GOLDEN_SHOVEL("金鍬", 284, 0, "textures/items/gold_shovel.png"),
	/**
	 * 金鎬
	 */
	GOLDEN_PICKAXE("金鎬", 285, 0, "textures/items/gold_pickaxe.png"),
	/**
	 * 金斧
	 */
	GOLDEN_AXE("金斧", 286, 0, "textures/items/gold_axe.png"),
	/**
	 * 蛛絲
	 */
	STRING("蛛絲", 287, 0, "textures/items/string.png"),
	/**
	 * 羽毛
	 */
	FEATHER("羽毛", 288, 0, "textures/items/feather.png"),
	/**
	 * 火藥
	 */
	GUNPOWDER("火藥", 289, 0, "textures/items/gunpowder.png"),
	/**
	 * 木鋤
	 */
	WOODEN_HOE("木鋤", 290, 0, "textures/items/wood_hoe.png"),
	/**
	 * 石鋤
	 */
	STONE_HOE("石鋤", 291, 0, "textures/items/stone_hoe.png"),
	/**
	 * 鐵鋤
	 */
	IRON_HOE("鐵鋤", 292, 0, "textures/items/iron_hoe.png"),
	/**
	 * 鑽石鋤
	 */
	DIAMOND_HOE("鑽石鋤", 293, 0, "textures/items/diamond_hoe.png"),
	/**
	 * 金鋤
	 */
	GOLDEN_HOE("金鋤", 294, 0, "textures/items/gold_hoe.png"),
	/**
	 * 種子
	 */
	WHEAT_SEEDS("種子", 295, 0, "textures/items/seeds_wheat.png"),
	/**
	 * 小麥
	 */
	WHEAT("小麥", 296, 0, "textures/items/wheat.png"),
	/**
	 * 面包
	 */
	BREAD("面包", 297, 0, "textures/items/bread.png"),
	/**
	 * 皮革頭盔
	 */
	LEATHER_HELMET("皮革頭盔", 298, 0, "textures/items/leather_helmet.tga"),
	/**
	 * 皮革胸甲
	 */
	LEATHER_CHESTPLATE("皮革胸甲", 299, 0, "textures/items/leather_chestplate.png"),
	/**
	 * 皮革護腿
	 */
	LEATHER_LEGGINGS("皮革護腿", 300, 0, "textures/items/leather_leggings.tga"),
	/**
	 * 皮革靴子
	 */
	LEATHER_BOOTS("皮革靴子", 301, 0, "textures/items/leather_boots.tga"),
	/**
	 * 鎖鏈頭盔
	 */
	CHAINMAIL_HELMET("鎖鏈頭盔", 302, 0, "textures/items/chainmail_helmet.png"),
	/**
	 * 鎖鏈胸甲
	 */
	CHAINMAIL_CHESTPLATE("鎖鏈胸甲", 303, 0, "textures/items/chainmail_chestplate.png"),
	/**
	 * 鎖鏈護腿
	 */
	CHAINMAIL_LEGGINGS("鎖鏈護腿", 304, 0, "textures/items/chainmail_leggings.png"),
	/**
	 * 鎖鏈靴子
	 */
	CHAINMAIL_BOOTS("鎖鏈靴子", 305, 0, "textures/items/chainmail_boots.png"),
	/**
	 * 鐵頭盔
	 */
	IRON_HELMET("鐵頭盔", 306, 0, "textures/items/iron_helmet.png"),
	/**
	 * 鐵胸甲
	 */
	IRON_CHESTPLATE("鐵胸甲", 307, 0, "textures/items/iron_chestplate.png"),
	/**
	 * 鐵護腿
	 */
	IRON_LEGGINGS("鐵護腿", 308, 0, "textures/items/iron_leggings.png"),
	/**
	 * 鐵靴子
	 */
	IRON_BOOTS("鐵靴子", 309, 0, "textures/items/iron_boots.png"),
	/**
	 * 鑽石頭盔
	 */
	DIAMOND_HELMET("鑽石頭盔", 310, 0, "textures/items/diamond_helmet.png"),
	/**
	 * 鑽石胸甲
	 */
	DIAMOND_CHESTPLATE("鑽石胸甲", 311, 0, "textures/items/diamond_chestplate.png"),
	/**
	 * 鑽石護腿
	 */
	DIAMOND_LEGGINGS("鑽石護腿", 312, 0, "textures/items/diamond_leggings.png"),
	/**
	 * 鑽石靴子
	 */
	DIAMOND_BOOTS("鑽石靴子", 313, 0, "textures/items/diamond_boots.png"),
	/**
	 * 金頭盔
	 */
	GOLDEN_HELMET("金頭盔", 314, 0, "textures/items/gold_helmet.png"),
	/**
	 * 金胸甲
	 */
	GOLDEN_CHESTPLATE("金胸甲", 315, 0, "textures/items/gold_chestplate.png"),
	/**
	 * 金護腿
	 */
	GOLDEN_LEGGINGS("金護腿", 316, 0, "textures/items/gold_leggings.png"),
	/**
	 * 金靴子
	 */
	GOLDEN_BOOTS("金靴子", 317, 0, "textures/items/gold_boots.png"),
	/**
	 * 燧石
	 */
	FLINT("燧石", 318, 0, "textures/items/flint.png"),
	/**
	 * 生豬排
	 */
	PORKCHOP("生豬排", 319, 0, "textures/items/porkchop_raw.png"),
	/**
	 * 熟豬排
	 */
	COOKED_PORKCHOP("熟豬排", 320, 0, "textures/items/porkchop_cooked.png"),
	/**
	 * 畫
	 */
	PAINTING("畫", 321, 0, "textures/items/painting.png"),
	/**
	 * 金蘋果
	 */
	GOLDEN_APPLE("金蘋果", 322, 0, "textures/items/apple_golden.png"),
	/**
	 * 告示牌
	 */
	SIGN("告示牌", 323, 0, "textures/items/sign.png"),
	/**
	 * 橡木門
	 */
	WOODEN_DOOR("橡木門", 324, 0, "textures/items/door_wood.png"),
	/**
	 * 桶
	 */
	BUCKET("桶", 325, 0, "textures/items/bucket_empty.png"),
	/**
	 * 礦車
	 */
	MINECART("礦車", 328, 0, "textures/items/minecart_normal.png"),
	/**
	 * 鞍
	 */
	SADDLE("鞍", 329, 0, "textures/items/saddle.png"),
	/**
	 * 紅石
	 */
	REDSTONE("紅石", 331, 0, "textures/items/redstone_dust.png"),
	/**
	 * 雪球
	 */
	SNOWBALL("雪球", 332, 0, "textures/items/snowball.png"),
	/**
	 * 橡木船
	 */
	BOAT("橡木船", 333, 0, "textures/items/boat.png"),
	/**
	 * 皮革
	 */
	LEATHER("皮革", 334, 0, "textures/items/leather.png"),
	/**
	 * 粘土球
	 */
	CLAY_BALL("粘土球", 337, 0, "textures/items/clay_ball.png"),
	/**
	 * 甘蔗
	 */
	REEDS("甘蔗", 338, 0, "textures/items/reeds.png"),
	/**
	 * 紙
	 */
	PAPER("紙", 339, 0, "textures/items/paper.png"),
	/**
	 * 書
	 */
	BOOK("書", 340, 0, "textures/items/book_normal.png"),
	/**
	 * 粘液球
	 */
	SLIME_BALL("粘液球", 341, 0, "textures/items/slimeball.png"),
	/**
	 * 箱子礦車
	 */
	CHEST_MINECART("箱子礦車", 342, 0, "textures/items/minecart_chest.png"),
	/**
	 * 雞蛋
	 */
	EGG("雞蛋", 344, 0, "textures/items/egg.png"),
	/**
	 * 指南針
	 */
	COMPASS("指南針", 345, 0, "textures/items/compass_item.png"),
	/**
	 * 魚竿
	 */
	FISHING_ROD("魚竿", 346, 0, "textures/items/fishing_rod_cast.png"),
	/**
	 * 時鐘
	 */
	CLOCK("時鐘", 347, 0, "textures/items/clock_item.png"),
	/**
	 * 熒石粉
	 */
	GLOWSTONE_DUST("熒石粉", 348, 0, "textures/items/glowstone_dust.png"),
	/**
	 * 魚
	 */
	FISH("魚", 349, 0, "textures/items/fish_raw.png"),
	/**
	 * 熟魚
	 */
	COOKED_FISH("熟魚", 350, 0, "textures/items/fish_cooked.png"),
	/**
	 * 墨囊
	 */
	DYE("墨囊", 351, 0, "textures/items/dye_powder_black.png"),
	/**
	 * 品紅色染料
	 */
	SOLFERINO_DYE("品紅色染料", 351, 1, "textures/items/dye_powder_purple.png"),
	/**
	 * 綠色染料
	 */
	GREEN_DYE("綠色染料", 351, 2, "textures/items/dye_powder_green.png"),
	/**
	 * 可可豆
	 */
	BROWN_DYE("可可豆", 351, 3, "textures/items/dye_powder_brown.png"),
	/**
	 * 藍色染料
	 */
	BLUE_DYE("藍色染料", 351, 4, "textures/items/dye_powder_blue.png"),
	/**
	 * 紫色染料
	 */
	VIOLET_DYE("紫色染料", 351, 5, "textures/items/dye_powder_purple.png"),
	/**
	 * 青色染料
	 */
	CYAN_DYE("青色染料", 351, 6, "textures/items/dye_powder_cyan.png"),
	/**
	 * 淡灰色染料
	 */
	LIGHT_GRAY_DYE("淡灰色染料", 351, 7, "textures/items/dye_powder_silver.png"),
	/**
	 * 灰色染料
	 */
	GRAY_DYE("灰色染料", 351, 8, "textures/items/dye_powder_pink.png"),
	/**
	 * 粉紅色染料
	 */
	PINK_DYE("粉紅色染料", 351, 9, "textures/items/dye_powder_pink.png"),
	/**
	 * 黃綠色染料
	 */
	OLIVINE_DYE("黃綠色染料", 351, 10, "textures/items/dye_powder_lime.png"),
	/**
	 * 黃色染料
	 */
	YELLOW_DYE("黃色染料", 351, 11, "textures/items/dye_powder_yellow.png"),
	/**
	 * 淡藍色染料
	 */
	LIGHT_BLUE_DYE("淡藍色染料", 351, 12, "textures/items/dye_powder_light_blue.png"),
	/**
	 * 紅色染料
	 */
	RED_DYE("紅色染料", 351, 13, "textures/items/dye_powder_red.png"),
	/**
	 * 橙色染料
	 */
	ORANGE_DYE("橙色染料", 351, 14, "textures/items/dye_powder_orange.png"),
	/**
	 * 骨粉
	 */
	WHITE_DYE("骨粉", 351, 15, "textures/items/dye_powder_white.png"),
	/**
	 * 骨頭
	 */
	BONE("骨頭", 352, 0, "textures/items/bone.png"),
	/**
	 * 糖
	 */
	SUGAR("糖", 353, 0, "textures/items/sugar.png"),
	/**
	 * 蛋糕
	 */
	CAKE("蛋糕", 354, 0, "textures/items/cake.png"),
	/**
	 * 床
	 */
	BED("床", 355, 0, "textures/items/bed_red.png"),
	/**
	 * 中繼器
	 */
	REPEATER("中繼器", 356, 0, "textures/items/repeater.png"),
	/**
	 * 曲奇
	 */
	COOKIE("曲奇", 357, 0, "textures/items/cookie.png"),
	/**
	 * 地圖(滿)
	 */
	FILLED_MAP("地圖(滿)", 358, 0, "textures/items/map_nautilus.png"),
	/**
	 * 剪刀
	 */
	SHEARS("剪刀", 359, 0, "textures/items/shears.png"),
	/**
	 * 西瓜
	 */
	MELON("西瓜", 360, 0, "textures/items/melon.png"),
	/**
	 * 南瓜種子
	 */
	MELON_SEEDS("南瓜種子", 362, 0, "textures/items/seeds_melon.png"),
	/**
	 * 生牛肉
	 */
	BEEF("生牛肉", 363, 0, "textures/items/beef_raw.png"),
	/**
	 * 熟牛肉
	 */
	COOKED_BEEF("熟牛肉", 364, 0, "textures/items/beef_cooked.png"),
	/**
	 * 生雞肉
	 */
	CHICKEN("生雞肉", 365, 0, "textures/items/chicken_raw.png"),
	/**
	 * 熟雞肉
	 */
	COOKED_CHICKEN("熟雞肉", 366, 0, "textures/items/chicken_cooked.png"),
	/**
	 * 腐肉
	 */
	ROTTEN_FLESH("腐肉", 367, 0, "textures/items/rotten_flesh.png"),
	/**
	 * 末影珍珠
	 */
	ENDER_PEARL("末影珍珠", 368, 0, "textures/items/ender_pearl.png"),
	/**
	 * 烈焰棒
	 */
	BLAZE_ROD("烈焰棒", 369, 0, "textures/items/blaze_rod.png"),
	/**
	 * 惡魂淚
	 */
	GHAST_TEAR("惡魂淚", 370, 0, "textures/items/ghast_tear.png"),
	/**
	 * 金粒
	 */
	GOLD_NUGGET("金粒", 371, 0, "textures/items/gold_nugget.png"),
	/**
	 * 地獄疣
	 */
	NETHER_WART("地獄疣", 372, 0, "textures/items/nether_wart.png"),
	/**
	 * 水瓶
	 */
	POTION("水瓶", 373, 0, "textures/items/potion_bottle_drinkable.png"),
	/**
	 * 玻璃瓶
	 */
	GLASS_BOTTLE("玻璃瓶", 374, 0, "textures/items/potion_bottle_empty.png"),
	/**
	 * 蜘蛛眼
	 */
	SPIDER_EYE("蜘蛛眼", 375, 0, "textures/items/spider_eye.png"),
	/**
	 * 發酵蜘蛛眼
	 */
	SPIDER_EYE_FERMENTED("發酵蜘蛛眼", 376, 0, "textures/items/spider_eye_fermented.png"),
	/**
	 * 烈焰粉
	 */
	BLAZE_POWDER("烈焰粉", 377, 0, "textures/items/blaze_powder.png"),
	/**
	 * 岩漿膏
	 */
	MAGMA_CREAM("岩漿膏", 378, 0, "textures/items/magma_cream.png"),
	/**
	 * 末影之眼
	 */
	ENDER_EYE("末影之眼", 381, 0, "textures/items/ender_eye.png"),
	/**
	 * 金西瓜
	 */
	SPECKLED_MELON("金西瓜", 382, 0, "textures/items/melon_speckled.png"),
	/**
	 * 經驗瓶
	 */
	EXPERIENCE_BOTTLE("經驗瓶", 384, 0, "textures/items/experience_bottle.png"),
	/**
	 * 火球
	 */
	FIRE_CHARGE("火球", 385, 0, "textures/items/fireball.png"),
	/**
	 * 綠寶石
	 */
	EMERALD("綠寶石", 388, 0, "textures/items/emerald.png"),
	/**
	 * 展示框
	 */
	ITEM_FRAME("展示框", 389, 0, "textures/items/item_frame.png"),
	/**
	 * 花盆
	 */
	FLOWER_POT("花盆", 390, 0, "textures/items/flower_pot.png"),
	/**
	 * 胡蘿卜
	 */
	CARROT("胡蘿卜", 391, 0, "textures/items/carrot.png"),
	/**
	 * 馬鈴薯
	 */
	POTATO("馬鈴薯", 392, 0, "textures/items/potato.png"),
	/**
	 * 烤馬鈴薯
	 */
	BAKED_POTATO("烤馬鈴薯", 393, 0, "textures/items/potato_baked.png"),
	/**
	 * 毒馬鈴薯
	 */
	POISONOUS_POTATO("毒馬鈴薯", 394, 0, "textures/items/potato_poisonous.png"),
	/**
	 * 空地圖
	 */
	MAP("空地圖", 395, 0, "textures/items/map_empty.png"),
	/**
	 * 金胡蘿卜
	 */
	GOLDEN_CARROT("金胡蘿卜", 396, 0, "textures/items/carrot_golden.png"),
	/**
	 * 骷髏頭
	 */
	SKELETON_SKULL("骷髏頭", 397, 0, "textures/items/bone.png"),
	/**
	 * 雕零骷髏頭
	 */
	LEIERDA_SKULL("雕零骷髏頭", 397, 1, "textures/blocks/observer_front.png"),
	/**
	 * 僵屍頭
	 */
	ZOMBIE_SKULL("僵屍頭", 397, 2, "textures/blocks/observer_front.png"),
	/**
	 * 史蒂夫頭
	 */
	STEVE_SKULL("史蒂夫頭", 397, 3, "textures/blocks/observer_front.png"),
	/**
	 * 苦力怕頭
	 */
	CREEPER_SKULL("苦力怕頭", 397, 4, "textures/blocks/observer_front.png"),
	/**
	 * 龍頭
	 */
	DRAGON_SKULL("龍頭", 397, 5, "textures/blocks/observer_front.png"),
	/**
	 * 胡蘿卜桿
	 */
	CARROT_ON_A_STICK("胡蘿卜桿", 398, 0, "textures/items/carrot_on_a_stick.png"),
	/**
	 * 下屆之星
	 */
	NETHER_STAR("下屆之星", 399, 0, "textures/items/nether_star.png"),
	/**
	 * 南瓜派
	 */
	PUMPKIN_PIE("南瓜派", 400, 0, "textures/items/pumpkin_pie.png"),
	/**
	 * 附魔書
	 */
	ENCHANTED_BOOK("附魔書", 403, 0, "textures/items/book_writable.png"),
	/**
	 * 比較器
	 */
	COMPARATOR("比較器", 404, 0, "textures/items/comparator.png"),
	/**
	 * 地獄石英
	 */
	QUARTZ("地獄石英", 406, 0, "textures/items/quartz.png"),
	/**
	 * tnt礦車
	 */
	TNT_MINECART("tnt礦車", 407, 0, "textures/items/minecart_tnt.png"),
	/**
	 * 漏鬥礦車
	 */
	HOPPER_MINECART("漏鬥礦車", 408, 0, "textures/items/minecart_hopper.png"),
	/**
	 * 海晶碎片
	 */
	PRISMARINE_SHARD("海晶碎片", 409, 0, "textures/items/prismarine_shard.png"),
	/**
	 * 海晶燈粉
	 */
	PRISMARINE_CRYSTALS("海晶燈粉", 410, 0, "textures/items/prismarine_crystals.png"),
	/**
	 * 生兔子肉
	 */
	RABBIT("生兔子肉", 411, 0, "textures/items/rabbit_raw.png"),
	/**
	 * 熟兔子肉
	 */
	COOKED_RABBIT("熟兔子肉", 412, 0, "textures/items/rabbit_cooked.png"),
	/**
	 * 兔子煲
	 */
	RABBIT_STEW("兔子煲", 413, 0, "textures/items/rabbit_stew.png"),
	/**
	 * 兔子腳
	 */
	RABBIT_FOOT("兔子腳", 414, 0, "textures/items/rabbit_foot.png"),
	/**
	 * 兔子皮
	 */
	RABBIT_HIDE("兔子皮", 415, 0, "textures/items/rabbit_hide.png"),
	/**
	 * 皮革馬鞍
	 */
	ARMOR_STAND("皮革馬鞍", 416, 0, "textures/items/saddle.png"),
	/**
	 * 鐵馬鞍
	 */
	IRON_HORSE_ARMOR("鐵馬鞍", 417, 0, "textures/items/iron_horse_armor.png"),
	/**
	 * 金馬鞍
	 */
	GOLD_HORSE_ARMOR("金馬鞍", 418, 0, "textures/items/gold_horse_armor.png"),
	/**
	 * 鑽石馬鞍
	 */
	DIAMOND_HORSE_ARMOR("鑽石馬鞍", 419, 0, "textures/items/diamond_horse_armor.png"),
	/**
	 * 栓繩
	 */
	LEAD("栓繩", 420, 0, "textures/items/lead.png"),
	/**
	 * 命名牌
	 */
	NAME_TAG("命名牌", 421, 0, "textures/items/name_tag.png"),
	/**
	 * 命令方塊礦車
	 */
	COMMAND_BLOCK_MINECART("命令方塊礦車", 422, 0, "textures/items/minecart_command_block.png"),
	/**
	 * 生羊肉
	 */
	MUTTON("生羊肉", 423, 0, "textures/items/mutton_raw.png"),
	/**
	 * 熟羊肉
	 */
	COOKED_MUTTON("熟羊肉", 424, 0, "textures/items/mutton_cooked.png"),
	/**
	 * 雲杉木門
	 */
	SPRUCE_DOOR("雲杉木門", 427, 0, "textures/items/door_jungle.png"),
	/**
	 * 樺樹木門
	 */
	BIRCH_WOOD_DOOR("樺樹木門", 428, 0, "textures/items/door_birch.png"),
	/**
	 * 叢林木門
	 */
	JUNGLE_DOOR("叢林木門", 429, 0, "textures/items/door_spruce.png"),
	/**
	 * 金合歡木門
	 */
	ACACIA_DOOR("金合歡木門", 430, 0, "textures/items/door_acacia.png"),
	/**
	 * 深色橡木門
	 */
	DARK_OAK_DOOR("深色橡木門", 431, 0, "textures/items/door_dark_oak.png"),
	/**
	 * 共鳴果
	 */
	CHORUS_FRUIT("共鳴果", 432, 0, "textures/items/chorus_fruit.png"),
	/**
	 * 爆裂共鳴果
	 */
	POPPED_CHORUS_FRUIT("爆裂共鳴果", 433, 0, "textures/items/chorus_fruit_popped.png"),
	/**
	 * 龍息
	 */
	DRAGON_BREATH("龍息", 437, 0, "textures/items/dragons_breath.png"),
	/**
	 * 噴濺的水瓶
	 */
	SPLASH_POTION("噴濺的水瓶", 438, 0, "textures/items/potion_bottle_splash.png"),
	/**
	 * 遺留的水瓶
	 */
	LINGERING_POTION("遺留的水瓶", 441, 0, "textures/items/potion_bottle_lingering_waterBreathing.png"),
	/**
	 * 翅鞘
	 */
	ELYTRA("翅鞘", 444, 0, "textures/items/elytra.png"),
	/**
	 * 潛匿之殼
	 */
	BIRCH_BOAT("潛匿之殼", 445, 0, "textures/items/shulker_shell.png");
	private int ID, Damage;
	private String Name, Path;
	private static final HashMap<String, Map<String, Object>> NAME_MAP = new HashMap<>();
	private static final HashMap<String, Map<String, Object>> ID_MAP = new HashMap<>();
	private static final HashMap<String, ItemIDSunName> ItemIDSunName_MAP = new HashMap<>();
	private static final ArrayList<HashMap<String, Object>> All = new ArrayList<>();
	static {
		for (ItemIDSunName item : ItemIDSunName.values()) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ID", item.ID);
			map.put("Damage", item.Damage);
			map.put("Path", item.Path);
			map.put("Name", item.Name);
			map.put("item", item);
			All.add(map);
			NAME_MAP.put(item.Name, map);
			ID_MAP.put(item.ID + ":" + item.Damage, map);
			ItemIDSunName_MAP.put(item.ID + ":" + item.Damage, item);
		}
	}

	/**
	 * @param Name   物品名稱
	 * @param id     物品ID
	 * @param Damage 物品特殊值
	 * @param Path   物品貼圖路徑
	 */
	private ItemIDSunName(String Name, int id, int Damage, String Path) {
		this.ID = id;
		this.Name = Name;
		this.Damage = Damage;
		this.Path = Path;
	}

	/**
	 * @return 物品貼圖路徑
	 */
	public String getPath() {
		return this.Path;
	}

	/**
	 * @return 物品名稱
	 */
	public String getName() {
		return this.Name;
	}

	/**
	 * @return 物品特殊值
	 */
	public int getDamage() {
		return this.Damage;
	}

	/**
	 * @return 物品ID
	 */
	public int getID() {
		return this.ID;
	}

	/**
	 * @param ID 物品ID
	 * @return 根據物品ID獲取物品貼圖路徑
	 */
	public static String getIDByPath(int ID) {
		return getIDByPath(ID + ":0");
	}

	/**
	 * @param ID     物品ID
	 * @param Damage 物品特殊值
	 * @return 根據物品ID獲取物品貼圖路徑
	 */
	public static String getIDByPath(int ID, int Damage) {
		return getIDByPath(ID + ":" + Damage);
	}

	/**
	 * @param ID 物品ID（ID：特殊值）
	 * @return 根據物品ID獲取物品貼圖路徑（ID：特殊值）
	 */
	public static String getIDByPath(String ID) {
		Map<String, Object> map = ID_MAP.getOrDefault(ID, null);
		if (map == null || map.getOrDefault("Path", null) == null)
			return null;
		return String.valueOf(map.get("Path"));
	}

	/**
	 * @param ID 物品ID
	 * @return 根據物品ID獲取物品名稱
	 */
	public static String getIDByName(int ID) {
		return getIDByName(ID + ":0");
	}

	/**
	 * @param ID     物品ID
	 * @param Damage 物品特殊值
	 * @return 根據物品ID獲取物品名稱
	 */
	public static String getIDByName(int ID, int Damage) {
		return getIDByName(ID + ":" + Damage);
	}

	/**
	 * @param ID 物品ID（ID：特殊值）
	 * @return 根據物品ID獲取物品名稱
	 */
	public static String getIDByName(String ID) {
		Map<String, Object> map = ID_MAP.getOrDefault(ID, null);
		if (map == null || map.getOrDefault("Name", null) == null)
			return null;
		return String.valueOf(map.get("Name"));
	}

	/**
	 * @param Name 物品名稱
	 * @return 根據物品名稱獲取物品ID
	 */
	public static int getNameByID(String Name) {
		Map<String, Object> map = NAME_MAP.getOrDefault(Name, null);
		if (map == null || map.getOrDefault("ID", null) == null)
			return 0;
		return Integer.valueOf(String.valueOf(map.get("ID")));
	}

	/**
	 * @param Name 物品名稱
	 * @return 根據物品名稱獲取物品特殊值
	 */
	public static int getNameByDamage(String Name) {
		Map<String, Object> map = NAME_MAP.getOrDefault(Name, null);
		if (map == null || map.getOrDefault("Damage", null) == null)
			return 0;
		return Integer.valueOf(String.valueOf(map.get("Damage")));
	}

	/**
	 * @param Name 物品名稱
	 * @return 根據物品名稱獲取物品貼圖路徑
	 */
	public static String getNameByPath(String Name) {
		Map<String, Object> map = NAME_MAP.getOrDefault(Name, null);
		if (map == null || map.getOrDefault("Path", null) == null)
			return null;
		return String.valueOf(map.get("Path"));
	}

	/**
	 * @param ID 物品ID
	 * @return 根據物品ID獲取物品枚舉對象
	 */
	public static ItemIDSunName getItem(int ID) {
		return getItem(ID, 0);
	}

	/**
	 * @param ID     物品ID
	 * @param Damage 物品特殊值
	 * @return 根據物品ID獲取物品枚舉對象
	 */
	public static ItemIDSunName getItem(int ID, int Damage) {
		return ItemIDSunName_MAP.getOrDefault(ID + ":" + Damage, null);
	}

	/**
	 * @param ID 物品名稱
	 * @return 根據物品ID獲取物品枚舉對象
	 */
	public static ItemIDSunName getItem(String Name) {
		return getItem(getNameByID(Name), getNameByDamage(Name));
	}

	/**
	 * @param 物品ID（ID：特殊值）/物品名稱
	 * @return 嘗試解析冰獲取物品ID（ID：特殊值）
	 */
	public static String UnknownToID(String ID) {
		if (!ID.contains(":")) {
			if (getNameByPath(ID) != null)
				return getNameByID(ID) + ":" + getNameByDamage(ID);
			else if (getIDByPath(ID + ":0") != null)
				return ID + ":0";
			else
				return ID;
		} else {
			if (getIDByPath(ID) != null)
				return ID;
			else if (getNameByPath(ID) != null)
				return getNameByID(ID) + ":" + getNameByDamage(ID);
			else
				return ID;
		}
	}

	/**
	 * @param string 物品ID/物品名稱/物品貼圖路徑
	 * @return 嘗試解析並獲取物品貼圖路徑
	 */
	public static String UnknownToPath(String string) {
		if (UnknownToID(string) != null)
			return getIDByPath(UnknownToID(string));
		else
			return string;
	}

	/**
	 * 獲取所有項目
	 * 
	 * @return
	 */
	public static ArrayList<HashMap<String, Object>> getAll() {
		return All;
	}
}
