/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package handlers.voicedcommandhandlers;

import ct25.xtreme.gameserver.handler.IVoicedCommandHandler;
import ct25.xtreme.gameserver.instancemanager.HellboundManager;
import ct25.xtreme.gameserver.model.actor.instance.L2PcInstance;

public class Hellbound implements IVoicedCommandHandler
{
	private static final String[] VOICED_COMMANDS =
	{
		"hellbound"
	};

	/**
	 * 
	 * @see ct25.xtreme.gameserver.handler.IVoicedCommandHandler#useVoicedCommand(java.lang.String, l2.brick.gameserver.model.actor.instance.L2PcInstance, java.lang.String)
	 */
	public boolean useVoicedCommand(String command, L2PcInstance activeChar, String params)
	{
		if (HellboundManager.getInstance().isLocked())
		{
			activeChar.sendMessage("Hellbound is locked. You must first complete Isle of Prayer quests");
			return true;
		}

		final int maxTrust = HellboundManager.getInstance().getMaxTrust();
		activeChar.sendMessage("Hellbound level: " + HellboundManager.getInstance().getLevel() +
				" Hellbound trust: " + HellboundManager.getInstance().getTrust() +
				(maxTrust > 0 ? "/" + maxTrust : ""));
		return true;
	}

	/**
	 * 
	 * @see ct25.xtreme.gameserver.handler.IVoicedCommandHandler#getVoicedCommandList()
	 */
	public String[] getVoicedCommandList()
	{
		return VOICED_COMMANDS;
	}
}
