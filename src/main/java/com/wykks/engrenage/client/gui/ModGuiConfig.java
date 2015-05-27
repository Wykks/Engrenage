package com.wykks.engrenage.client.gui;

import com.wykks.engrenage.handler.ConfigurationHandler;
import com.wykks.engrenage.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory("modules")).getChildElements(),
                Reference.MOD_ID,
                true,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
