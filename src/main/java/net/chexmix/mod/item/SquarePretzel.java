package net.chexmix.mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class SquarePretzel extends Item {
    public SquarePretzel() {
        super(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).snack().build()));
    }
}
