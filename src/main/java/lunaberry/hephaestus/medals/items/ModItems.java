package lunaberry.hephaestus.medals.items;

import lunaberry.hephaestus.medals.HephaestusMetals;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    /*  Items to be Registered */
    public static final Item DILDO = registerItem("dildo", new Item(new FabricItemSettings()));

    /* Register Items */
    private static Item registerItem(String name, Item item){

        return Registry.register(Registries.ITEM, new Identifier(HephaestusMetals.MOD_ID), item);
    }

    public static void registerModItems(){
        HephaestusMetals.LOGGER.info("Registering Items for" + HephaestusMetals.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
        /* Add Items to Groups */
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(DILDO);
    }
}
