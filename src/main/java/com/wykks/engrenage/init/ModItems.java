package com.wykks.engrenage.init;

import com.wykks.engrenage.item.ItemEM;
import com.wykks.engrenage.item.ItemEngrenage;
import com.wykks.engrenage.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemEM engrenage = new ItemEngrenage();

    public static void init()
    {
        GameRegistry.registerItem(engrenage, "engrenage");
    }
}
