package net.chexmix.mod;

import net.chexmix.mod.item.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {

    public static final CirclePretzel CIRCLE_PRETZEL = new CirclePretzel();
    public static final CornChex CORN_CHEX = new CornChex();
    public static final Breadstick BREADSTICK = new Breadstick();
    public static final RyeCracker RYE_CRACKER = new RyeCracker();
    public static final SquarePretzel SQUARE_PRETZEL = new SquarePretzel();
    public static final WheatChex WHEAT_CHEX = new WheatChex();

    public static final Chexmix CHEXMIX = new Chexmix();
;
    public static final Item[] items = new Item[]{WHEAT_CHEX, CIRCLE_PRETZEL, CORN_CHEX, BREADSTICK, RYE_CRACKER, SQUARE_PRETZEL};

    public static void init(){
        RegisterFood("circle_pretzel", CIRCLE_PRETZEL);
        RegisterFood("corn_chex", CORN_CHEX);
        RegisterFood("breadstick", BREADSTICK);
        RegisterFood("rye_cracker", RYE_CRACKER);
        RegisterFood("square_pretzel", SQUARE_PRETZEL);
        RegisterFood("wheat_chex", WHEAT_CHEX);

        RegisterFood("chexmix", CHEXMIX);

        /**
        Registry.register(Registries.ITEM, new Identifier(MODID, "circle_pretzel"), CIRCLE_PRETZEL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "corn_chex"), CORN_CHEX);
        Registry.register(Registries.ITEM, new Identifier(MODID, "breadstick"), BREADSTICK);
        Registry.register(Registries.ITEM, new Identifier(MODID, "rye_cracker"), RYE_CRACKER);
        Registry.register(Registries.ITEM, new Identifier(MODID, "square_pretzel"), SQUARE_PRETZEL);
        Registry.register(Registries.ITEM, new Identifier(MODID, "wheat_chex"), WHEAT_CHEX);

        Registry.register(Registries.ITEM, new Identifier(MODID, "chexmix"), CHEXMIX);
        **/

    }

    private static void RegisterFood(String path, Item item){
        Registry.register(Registries.ITEM, new Identifier(ChexmixMod.MODID, path), item);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> entries.add(item));
    }

}
