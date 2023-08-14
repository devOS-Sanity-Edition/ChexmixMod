package net.chexmix.mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class Breadstick extends Item {
    public Breadstick() {
        super(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.9f).snack().build()));
    }
}
