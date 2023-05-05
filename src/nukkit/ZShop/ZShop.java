package nukkit.ZShop;

import java.io.File;
import java.util.HashMap;

import cn.nukkit.Player;
import cn.nukkit.block.Block;
import cn.nukkit.block.BlockSignPost;
import cn.nukkit.blockentity.BlockEntitySign;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.block.BlockBreakEvent;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.event.player.PlayerInteractEvent;
import cn.nukkit.form.element.ElementDropdown;
import cn.nukkit.form.element.ElementLabel;
import cn.nukkit.form.response.FormResponseCustom;
import cn.nukkit.form.response.FormResponseData;
import cn.nukkit.form.window.FormWindow;
import cn.nukkit.form.window.FormWindowCustom;
import cn.nukkit.item.Item;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import cn.nukkit.utils.TextFormat;

import me.onebone.economyapi.EconomyAPI;
import nukkit.ZShop.ItemIDSunName;

public class ZShop extends PluginBase implements Listener {

	public HashMap<String, Integer> mode = new HashMap<String, Integer>();
	public HashMap<String, String> id = new HashMap<String, String>();
	public HashMap<String, String> damage = new HashMap<String, String>();
	public HashMap<String, String> price = new HashMap<String, String>();

	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		this.getLogger().info(TextFormat.LIGHT_PURPLE + "介面商店插件 [ZeroK 製作]");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		String name = sender.getName().toLowerCase();
		if (cmd.getName().equalsIgnoreCase("zs")) {
			if (!sender.isOp()) {
				sender.sendMessage("§8[§cX§8]§f 您沒有權限執行此指令");
				return true;
			}
			if (args.length < 1) {
				this.sendHelp(sender);
				return true;
			}
			switch (args[0]) {
			case "help":
				sender.sendMessage(
						"== ZShop 指令列表 ==\n/zs help: 得到此列表\n/zs create <shop/sell> <物品ID> <物品Meta> <單個價格>: 創建商店");
				return true;
			case "create":
				if (args.length != 5) {
					this.sendHelp(sender);
					return true;
				}
				if (args[1].equalsIgnoreCase("shop")) {
					mode.put(name, 1);
					id.put(name, args[2]);
					damage.put(name, args[3]);
					price.put(name, args[4]);
					sender.sendMessage("§8[§e!§8]§f 請點擊一個告示牌以完成創建");
					return true;
				}
				if (args[1].equalsIgnoreCase("sell")) {
					mode.put(name, 2);
					id.put(name, args[2]);
					damage.put(name, args[3]);
					price.put(name, args[4]);
					sender.sendMessage("§8[§e!§8]§f 請點擊一個告示牌以完成創建");
					return true;
				}
			}
		}
		return true;
	}

	@EventHandler
	public void onPlayerTouch(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		String name = player.getName().toLowerCase();
		Block block = event.getBlock();
		if (block instanceof BlockSignPost) {
			BlockEntitySign sign = (BlockEntitySign) block.getLevel().getBlockEntity(block);
			if (mode.get(name) == null) {
				this.sendShop(player, block.getLevel().getName(), block.getX(), block.getY(), block.getZ());
			} else {
				switch (mode.get(name)) {
				case 1:
					this.createShop(player.getLevel().getName(), block.getX(), block.getY(), block.getZ(), id.get(name),
							damage.get(name), price.get(name), "shop");
					sign.setText(TextFormat.GREEN + "[物品商店]", "交易方式: 購買物品",
							"商品名稱: " + ItemIDSunName.getIDByName(Integer.valueOf(id.get(name)),
									Integer.valueOf(damage.get(name))) + "(" + id.get(name) + ":" + damage.get(name)
									+ ")",
							"商品價格: " + Float.parseFloat(price.get(name)) + " 毬幣");
					mode.remove(name);
					id.remove(name);
					damage.remove(name);
					price.remove(name);
					player.sendMessage("§8[§e!§8]§f 成功創建商店");
					return;
				case 2:
					this.createShop(player.getLevel().getName(), block.getX(), block.getY(), block.getZ(), id.get(name),
							damage.get(name), price.get(name), "sell");
					sign.setText(TextFormat.GREEN + "[物品商店]", "交易方式: 售出物品",
							"商品名稱: " + ItemIDSunName.getIDByName(Integer.valueOf(id.get(name)),
									Integer.valueOf(damage.get(name))) + "(" + id.get(name) + ":" + damage.get(name)
									+ ")",
							"售出價格: " + Float.parseFloat(price.get(name)) + " 毬幣");
					mode.remove(name);
					id.remove(name);
					damage.remove(name);
					price.remove(name);
					player.sendMessage("§8[§e!§8]§f 成功創建商店");
					return;
				}
			}
		}
	}

	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		String world = block.getLevel().getName();
		File worlds = new File(this.getDataFolder() + "/worlds/" + world);
		String[] filenames = worlds.list();
		if (block instanceof BlockSignPost) {
			for (int i = 0; i < filenames.length; i++) {
				if (filenames[i].equalsIgnoreCase(block.getX() + ":" + block.getY() + ":" + block.getZ() + ".yml")) {
					File config = new File(this.getDataFolder() + "/worlds/" + world + "/" + block.getX() + ":"
							+ block.getY() + ":" + block.getZ() + ".yml");
					if (!player.isOp()) {
						player.sendMessage("§8[§cX§8]§f 您沒有權限執行此動作");
						event.setCancelled();
					} else {
						config.delete();
						player.sendMessage("§8[§e!§8]§f 成功移除物品商店告示牌");
					}
				}
			}
		}
	}

	@EventHandler
	public void formRespond(PlayerFormRespondedEvent event) {
		Player player = event.getPlayer();
		FormWindow window = event.getWindow();
		if (window instanceof FormWindowCustom) {
			FormResponseCustom result = (FormResponseCustom) event.getResponse();
			if (result != null) {
				String title = ((FormWindowCustom) window).getTitle();
				if (title.substring(0, 4).equals("物品商店")) {
					FormResponseData dropDownData = result.getDropdownResponse(1);
					String dropDown = dropDownData.getElementContent();
					String amount = dropDown.substring(0, 2).replaceAll(" ", "");
					String wow = title.replaceAll(" ", "").replaceAll("物品商店", "").replace("(", "").replace(")", "");
					String[] cools = wow.split(",");
					Config config = new Config(this.getDataFolder() + "/worlds/" + cools[0] + "/" + cools[1] + ":"
							+ cools[2] + ":" + cools[3] + ".yml", Config.YAML);
					Float total = Float.valueOf(config.getString("price")) * Integer.valueOf(amount);
					if (config.getString("type").equalsIgnoreCase("shop")) {
						if (EconomyAPI.getInstance().reduceMoney(player, total) == EconomyAPI.RET_INVALID) {
							player.sendMessage("§8[§cX§8]§f 您沒有足夠的錢購買此商品");
							return;
						}
						Item bought = new Item(Integer.valueOf(config.getString("id")),
								Integer.valueOf(config.getString("damage")), Integer.valueOf(amount));
						player.getInventory().addItem(bought);
						player.sendMessage(
								"§8[§e!§8]§f 成功花費§e " + String.valueOf(total) + " 毬幣 §f購買§e " + amount + " §f個§a "
										+ ItemIDSunName.getIDByName(Integer.valueOf(config.getString("id")),
												Integer.valueOf(config.getString("damage")))
										+ "(" + config.getString("id") + ":" + config.getString("damage") + ") §f!");
					}
					if (config.getString("type").equalsIgnoreCase("sell")) {
						Item sold = new Item(Integer.valueOf(config.getString("id")),
								Integer.valueOf(config.getString("damage")), Integer.valueOf(amount));
						if (!player.getInventory().contains(sold)) {
							player.sendMessage("§8[§cX§8]§f 您沒有足夠的物品進行售出");
							return;
						}
						player.getInventory().removeItem(sold);
						EconomyAPI.getInstance().addMoney(player, total);
						player.sendMessage("§8[§e!§8]§f 成功售出§e " + amount + " §f個§a "
								+ ItemIDSunName.getIDByName(Integer.valueOf(config.getString("id")),
										Integer.valueOf(config.getString("damage")))
								+ "(" + config.getString("id") + ":" + config.getString("damage") + ")§f, 獲得§e "
								+ String.valueOf(total) + " 毬幣 §f!");
					}
				}
			}
		}
	}

	public void createShop(String world, double x, double y, double z, String id, String damage, String price,
			String type) {
		File worlds = new File(this.getDataFolder() + "/worlds/" + world);
		Config config = new Config(this.getDataFolder() + "/worlds/" + world + "/" + x + ":" + y + ":" + z + ".yml",
				Config.YAML);
		if (worlds.exists()) {
			config.set("id", id);
			config.set("damage", damage);
			config.set("price", price);
			config.set("type", type);
			config.save();
		}
	}

	public void sendShop(Player player, String world, double x, double y, double z) {
		File worlds = new File(this.getDataFolder() + "/worlds/" + world);
		String[] filenames = worlds.list();
		for (int i = 0; i < filenames.length; i++) {
			if (filenames[i].equalsIgnoreCase(x + ":" + y + ":" + z + ".yml")) {
				Config config = new Config(
						this.getDataFolder() + "/worlds/" + world + "/" + x + ":" + y + ":" + z + ".yml", Config.YAML);
				Float yeah = Float.valueOf(config.getString("price"));
				String ggg = String.valueOf(yeah * 1);
				String aoo = String.valueOf(yeah * 2);
				String boo = String.valueOf(yeah * 4);
				String coo = String.valueOf(yeah * 8);
				String doo = String.valueOf(yeah * 16);
				String eoo = String.valueOf(yeah * 32);
				String foo = String.valueOf(yeah * 64);
				FormWindowCustom window = new FormWindowCustom("物品商店 (" + world + ", " + x + ", " + y + ", " + z + ")");
				if (config.getString("type").equalsIgnoreCase("shop")) {
					ElementDropdown dropdown = new ElementDropdown("選擇您要購買的數量");
					dropdown.addOption("1 個 (" + ggg + " 毬幣)");
					dropdown.addOption("2 個 (" + aoo + " 毬幣)");
					dropdown.addOption("4 個 (" + boo + " 毬幣)");
					dropdown.addOption("8 個 (" + coo + " 毬幣)");
					dropdown.addOption("16 個 (" + doo + " 毬幣)");
					dropdown.addOption("32 個 (" + eoo + " 毬幣)");
					dropdown.addOption("64 個 (" + foo + " 毬幣)");
					window.addElement(new ElementLabel("交易方式: 購買商品 \n商品名稱: "
							+ ItemIDSunName.getIDByName(Integer.valueOf(config.getString("id")),
									Integer.valueOf(config.getString("damage")))
							+ "(" + config.getString("id") + ":" + config.getString("damage") + ")"));
					window.addElement(dropdown);
					player.showFormWindow(window);
				}
				if (config.getString("type").equalsIgnoreCase("sell")) {
					ElementDropdown dropdown = new ElementDropdown("選擇您要售出的數量");
					dropdown.addOption("1 個 (" + ggg + " 毬幣)");
					dropdown.addOption("2 個 (" + aoo + " 毬幣)");
					dropdown.addOption("4 個 (" + boo + " 毬幣)");
					dropdown.addOption("8 個 (" + coo + " 毬幣)");
					dropdown.addOption("16 個 (" + doo + " 毬幣)");
					dropdown.addOption("32 個 (" + eoo + " 毬幣)");
					dropdown.addOption("64 個 (" + foo + " 毬幣)");
					window.addElement(new ElementLabel("交易方式: 售出商品 \n商品名稱: "
							+ ItemIDSunName.getIDByName(Integer.valueOf(config.getString("id")),
									Integer.valueOf(config.getString("damage")))
							+ "(" + config.getString("id") + ":" + config.getString("damage") + ")"));
					window.addElement(dropdown);
					player.showFormWindow(window);
				}
			}
		}
	}

	public void sendHelp(CommandSender sender) {
		sender.sendMessage("§8[§cX§8]§f 您輸入的格式貌似錯誤, 請使用 §e/zs help §f查詢正確用法");
	}
}
