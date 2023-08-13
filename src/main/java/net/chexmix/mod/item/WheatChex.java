package net.chexmix.mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class WheatChex extends Item {
    public WheatChex() {
        //super(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(1.5f).snack().build()));
        super(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1.5f).snack().build()));
    }
}
