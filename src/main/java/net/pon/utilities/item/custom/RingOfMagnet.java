package net.pon.utilities.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class RingOfMagnet extends ToolItem {
    public double radius;
    public int delay;

    public RingOfMagnet(ToolMaterial toolMaterial,double radius, int delay, Settings settings){
        super(toolMaterial, settings);
        this.radius = radius;
        this.delay = delay;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.getItemCooldownManager().set(this, this.delay);
        ItemStack mainHand = user.getStackInHand(hand);
        if (world.isClient) {return TypedActionResult.pass(mainHand);}
        List<ItemEntity> items = world.getEntitiesByType(EntityType.ITEM, Box.of(user.getPos(), this.radius*2, this.radius*2, this.radius*2), (e) -> true);
        for (ItemEntity item : items) {
            item.setPosition(user.getPos());
        }
        return TypedActionResult.success(mainHand);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<net.minecraft.text.Text> tooltip, TooltipType type) {
        tooltip.add(net.minecraft.text.Text.translatable("Gives magnetism towards item drops.").formatted(Formatting.RED));
    }
}
