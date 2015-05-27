package com.wykks.engrenage.init;

import com.wykks.engrenage.achievement.AchievementMod;
import com.wykks.engrenage.achievement.AchievementTriggerer;
import com.wykks.engrenage.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameData;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class ModAchievement
{
    public static Achievement achievementBlblbl;
    public static Achievement achievementTnt;
    public static Achievement achievementHastaPlays;

    public static AchievementPage engrenagePage;

    public static void init()
    {
        achievementBlblbl = new AchievementMod("blblbl", 0, 0, ModItems.engrenage, null);
        achievementTnt = new AchievementMod("tnt", 2, 1, GameData.getBlockRegistry().getObject("tnt"), null);
        achievementHastaPlays = new AchievementMod("hastaplays", 4, 2, GameData.getItemRegistry().getObject("bread"), null);

        engrenagePage = new AchievementPage(Reference.MOD_NAME, AchievementMod.achievements.toArray(new Achievement[AchievementMod.achievements.size()]));
        AchievementPage.registerAchievementPage(engrenagePage);
    }
}
