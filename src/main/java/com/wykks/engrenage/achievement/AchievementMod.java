package com.wykks.engrenage.achievement;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.stats.Achievement;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AchievementMod extends Achievement
{
    public static List<Achievement> achievements = new ArrayList();

    public AchievementMod(String name, int x, int y, ItemStack icon, Achievement parent)
    {
        super("achievement.engrenage:" + name, "engrenage:" + name, x, y, icon, parent);
        achievements.add(this);
        registerStat();
    }

    public AchievementMod(String name, int x, int y, Item icon, Achievement parent)
    {
        this(name, x, y, new ItemStack(icon), parent);
    }

    public AchievementMod(String name, int x, int y, Block icon, Achievement parent)
    {
        this(name, x, y, new ItemStack(icon), parent);
    }
}
