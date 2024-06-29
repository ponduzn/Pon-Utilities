package net.pon.utilities.ModLootTable;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.BlockTypes;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.pon.utilities.item.ModItems;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ModLootTableModifiers {

        public static void modifyLootTables() {
            LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
                if (source.isBuiltin() && (EntityType.ENDER_DRAGON.getLootTableId().equals(key))) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.7f))
                            .with(ItemEntry.builder(ModItems.RINGOFFLIGHT))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if (source.isBuiltin() && (EntityType.ENDER_DRAGON.getLootTableId().equals(key))) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.1f))
                            .with(ItemEntry.builder(Items.DRAGON_EGG))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if (source.isBuiltin() && (EntityType.WITHER.getLootTableId().equals(key))) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.7f))
                            .with(ItemEntry.builder(ModItems.RINGOFHASTE))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if (source.isBuiltin() && (EntityType.WITHER.getLootTableId().equals(key))) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.5f))
                            .with(ItemEntry.builder(Items.WITHER_ROSE))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if (source.isBuiltin() && (EntityType.WARDEN.getLootTableId().equals(key))) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.7f))
                            .with(ItemEntry.builder(ModItems.RINGOFMOVESPEED))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if (source.isBuiltin() && (EntityType.WARDEN.getLootTableId().equals(key))) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.5f))
                            .with(ItemEntry.builder(Items.OMINOUS_TRIAL_KEY))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if (source.isBuiltin() && (EntityType.ELDER_GUARDIAN.getLootTableId().equals(key))) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.4f))
                            .with(ItemEntry.builder(Items.NETHERITE_INGOT))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
                if (source.isBuiltin() && (EntityType.ELDER_GUARDIAN.getLootTableId().equals(key))) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.7f))
                            .with(ItemEntry.builder(ModItems.RINGOFMAGNET))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                    tableBuilder.pool(poolBuilder.build());
                }
            });
            /*LootTableEvents.REPLACE.register((key, original, source) -> {
                if (source.isBuiltin() && (Blocks.SUSPICIOUS_SAND.getLootTableKey().equals(key))) {
                    List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                    entries.add(ItemEntry.builder(ModItems.RINGOFMAGNET).build());
                }
                return null;
            });*/
        }
}

