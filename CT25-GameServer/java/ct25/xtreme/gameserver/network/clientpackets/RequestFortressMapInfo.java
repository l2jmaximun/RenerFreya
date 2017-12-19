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
package ct25.xtreme.gameserver.network.clientpackets;

import ct25.xtreme.gameserver.instancemanager.FortManager;
import ct25.xtreme.gameserver.model.entity.Fort;
import ct25.xtreme.gameserver.network.serverpackets.ExShowFortressMapInfo;

/**
 *
 * @author  KenM
 */
public class RequestFortressMapInfo extends L2GameClientPacket
{
	private int _fortressId;
	
	/**
	 * @see ct25.xtreme.gameserver.network.clientpackets.L2GameClientPacket#getType()
	 */
	@Override
	public String getType()
	{
		return "[C] D0:4B RequestFortressMapInfo";
	}
	
	/**
	 * @see ct25.xtreme.gameserver.network.clientpackets.L2GameClientPacket#readImpl()
	 */
	@Override
	protected void readImpl()
	{
		_fortressId = readD();
	}
	
	/**
	 * @see ct25.xtreme.gameserver.network.clientpackets.L2GameClientPacket#runImpl()
	 */
	@Override
	protected void runImpl()
	{
		Fort fort = FortManager.getInstance().getFortById(_fortressId);
		sendPacket(new ExShowFortressMapInfo(fort));
	}
	
}
