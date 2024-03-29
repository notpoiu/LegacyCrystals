package me.notpoiu.endcrystals.item;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemManager implements Listener{
	
	public static ItemManager instance;
    public ItemStack crystalItem;

    public void init() {
        this.createCrystal();
    }

    public void createCrystal() {
        ItemStack item = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("�d�lEnd Crystal");
        ArrayList<String> lore = new ArrayList<String>();
        lore.add("�dA Very Powerful Weapon");
        meta.setLore(lore);
        item.setItemMeta(meta);
        this.crystalItem = item;
        ShapedRecipe r = new ShapedRecipe(this.crystalItem);
        r.shape(new String[]{"ggg", "geg", "gtg"});
        r.setIngredient('g', Material.GLASS);
        r.setIngredient('e', Material.EYE_OF_ENDER);
        r.setIngredient('t', Material.GHAST_TEAR);
        Bukkit.getServer().addRecipe(r);
    }
	
}
