package com.wykks.engrenage.achievement;

import com.wykks.engrenage.init.ModAchievement;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.BlockTNT;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.world.BlockEvent;

public class AchievementTriggerer
{
    @SubscribeEvent
    public void onPlayerDeath(LivingDeathEvent event)
    {
        /*EntityLivingBase entity = event.entityLiving;
        if (entity instanceof EntityPlayerMP)
        {
            if (event.source.getDamageType() == "drown")
                ((EntityPlayerMP) entity).addStat(ModAchievement.achievementBlblbl, 1);
        }*/
    }

    @SubscribeEvent
    public void onPlayerHurt(LivingHurtEvent event)
    {
        EntityLivingBase entity = event.entityLiving;
        if (event.entityLiving instanceof EntityPlayerMP)
        {
            if (event.source.getDamageType() == "starve")
                ((EntityPlayerMP) entity).addStat(ModAchievement.achievementHastaPlays, 1);
            else if (event.source.getDamageType() == "drown")
                ((EntityPlayerMP) entity).addStat(ModAchievement.achievementBlblbl, 1);
        }
    }

    @SubscribeEvent
    public void onBlockCrafted(BlockEvent.PlaceEvent event)
    {
        if (event.block instanceof BlockTNT && event.player instanceof EntityPlayerMP)
        {
            event.player.addStat(ModAchievement.achievementTnt, 1);
        }
    }
}
