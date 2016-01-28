package com.coolgatty.palaria.help;

import com.coolgatty.palaria.Palaria;

import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class PalariaEventHandler 
{
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onEvent(PlayerTickEvent event)
	{
	    if (!Palaria.haveWarnedVersionOutOfDate && event.player.worldObj.isRemote 
	          && !Palaria.versionChecker.isLatestVersion())
	    {
	        ClickEvent versionCheckChatClickEvent = new ClickEvent(ClickEvent.Action.OPEN_URL, "http://bit.ly/1Vt2At9");
	        ChatStyle clickableChatStyle = new ChatStyle().setChatClickEvent(versionCheckChatClickEvent);
	        ChatComponentText versionWarningChatComponent = 
	              new ChatComponentText("Your current version of Palaria is" + EnumChatFormatting.RED + " out of date!" + EnumChatFormatting.AQUA + " Click here " + EnumChatFormatting.WHITE + "to download the latest update from the Minecraft Forum thread.");
	        versionWarningChatComponent.setChatStyle(clickableChatStyle);
	        event.player.addChatMessage(versionWarningChatComponent);
	        Palaria.haveWarnedVersionOutOfDate = true;
	    }
	} 
}