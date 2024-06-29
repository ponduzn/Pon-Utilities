package net.pon.utilities.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pon.utilities.PonUtilities;

public class ModItemGroups {
    
    public static final ItemGroup RING_GROUP = Registry.register(Registries.ITEM_GROUP, 
         Identifier.of(PonUtilities.MOD_ID, "rings"),
         FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.rings"))
            .icon(() -> new ItemStack(ModItems.RINGOFFLIGHT))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.RINGOFFLIGHT);
                entries.add(ModItems.RINGOFHASTE);
                entries.add(ModItems.RINGOFMOVESPEED);
                entries.add(ModItems.RINGOFMAGNET);

            }).build());
            

    public static void registerItemGroups() {
        PonUtilities.LOGGER.info("Register Item Groups for " +PonUtilities.MOD_ID);
    }

}
