
package handlers.voicedcommandhandlers;

import ct25.xtreme.extensions.VisualArmorController;
import ct25.xtreme.gameserver.handler.IVoicedCommandHandler;
import ct25.xtreme.gameserver.model.actor.instance.L2PcInstance;
import ct25.xtreme.gameserver.network.serverpackets.InventoryUpdate;

public class VisualArmor implements IVoicedCommandHandler
{
 private static final String[] VOICED_COMMANDS =
 {
 "dressme", "dressMe", "DressMe", "cloakOn", "cloakOff"
 };


 public boolean useVoicedCommand(String command, L2PcInstance activeChar, String params)
 {
 if(command.contains("cloakOn"))
 {
 activeChar.visualArmor.weaponLRHANDId =0;
 InventoryUpdate iu = new InventoryUpdate();
 activeChar.sendPacket(iu);
 activeChar.broadcastUserInfo();
 InventoryUpdate iu2 = new InventoryUpdate();
 activeChar.sendPacket(iu2);
 activeChar.broadcastUserInfo();
 activeChar.sendMessage("Cloak enabled.");
 }
 else if(command.contains("cloakOff"))
 {
 activeChar.visualArmor.weaponLRHANDId =1;
 InventoryUpdate iu = new InventoryUpdate();
 activeChar.sendPacket(iu);
 activeChar.broadcastUserInfo();
 InventoryUpdate iu2 = new InventoryUpdate();
 activeChar.sendPacket(iu2);
 activeChar.broadcastUserInfo();
 activeChar.sendMessage("Cloak disabled.");
 }
 else
 VisualArmorController.dressMe(activeChar);

 return true;
 }


 public String[] getVoicedCommandList()
 {
 return VOICED_COMMANDS;
 }
}
