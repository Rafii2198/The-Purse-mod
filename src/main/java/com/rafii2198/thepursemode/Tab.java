package com.rafii2198.thepursemode;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

/**
 * Created by Rafii on 31.07.2017.
 */
public class Tab extends CreativeTabs {
    public Tab(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(Blocks.CHEST);
    }
}