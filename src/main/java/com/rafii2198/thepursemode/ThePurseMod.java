package com.rafii2198.thepursemode;

import com.rafii2198.thepursemode.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ThePurseMod.MODID, version = ThePurseMod.VERSION, name = ThePurseMod.NAME)
public class ThePurseMod
{
    public static final String MODID = "thepursemod";
    public static final String VERSION = "1.0";
    public static final String NAME = "The Purse Mod";
    
    @SidedProxy(clientSide = "com.rafii2198.thepursemode.proxy.ClientProxy", serverSide = "com.rafii2198.thepursemode.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static ThePurseMod instance;

    public static Tab MyTab;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        MyTab = new Tab(CreativeTabs.getNextID(), "ThePurse");
        proxy.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    proxy.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    proxy.postInit(event);

    }

}
