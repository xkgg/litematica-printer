package me.aleksilassila.litematica.printer.interfaces;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;

/**
 * Dirty class that contains anything and everything that is
 * required to access variables and functions that are inconsistent
 * across different minecraft versions. In other words, this should
 * be the only file that has to be changed in every printer branch.
 */
public class Implementation {
    public static PlayerInventory getInventory(ClientPlayerEntity playerEntity) {
        return playerEntity.getInventory();
    }

    public static PlayerAbilities getAbilities(ClientPlayerEntity playerEntity) {
        return playerEntity.getAbilities();
    }

    public static float getYaw(ClientPlayerEntity playerEntity) {
        return playerEntity.getYaw();
    }

    public static float getPitch(ClientPlayerEntity playerEntity) {
        return playerEntity.getPitch();
    }

    public static void sendLookPacket(ClientPlayerEntity playerEntity, float yaw, float pitch) {
        playerEntity.networkHandler.sendPacket(new PlayerMoveC2SPacket.LookAndOnGround(
                yaw, pitch, playerEntity.isOnGround()));
    }
}
