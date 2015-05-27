package com.wykks.engrenage.proxy;

import com.wykks.engrenage.achievement.AchievementTriggerer;
import com.wykks.engrenage.handler.ConfigurationHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

public abstract class CommonProxy implements IProxy
{
    public void registerEventHandlers()
    {
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        MinecraftForge.EVENT_BUS.register(new AchievementTriggerer());
    }
}
