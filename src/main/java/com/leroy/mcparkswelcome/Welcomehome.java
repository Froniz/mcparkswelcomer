package com.yourname.welcomehome;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerChatCallback;
import net.minecraft.text.Text;

public class WelcomeHome implements ModInitializer {
    @Override
    public void onInitialize() {
        PlayerChatCallback.EVENT.register((player, message) -> {
            String msg = message.getString().toLowerCase();
            if (msg.contains("guests have joined mcparks! welcome our newest park guest")) {
                player.sendMessage(Text.literal("Welcome home"), false);
            }
            return true;
        });
    }
}
