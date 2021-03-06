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
package ct25.xtreme.gameserver.model.restriction;

import java.util.logging.Logger;

import ct25.xtreme.gameserver.model.actor.instance.L2PcInstance;

/**
 * @author L0ngh0rn
 *
 */
public abstract class AbstractRestriction implements GlobalRestriction
{
	static final Logger _log =  Logger.getLogger(AbstractRestriction.class.getName());

	public void activate()
	{
		GlobalRestrictions.activate(this);
	}

	public void deactivate()
	{
		GlobalRestrictions.deactivate(this);
	}

	@Override
	public int hashCode()
	{
		return getClass().hashCode();
	}

	/**
	 * To avoid accidentally multiple times activated restrictions.
	 */
	@Override
	public boolean equals(Object obj)
	{
		return getClass().equals(obj.getClass());
	}
	
	@DisabledRestriction
	public void playerLoggedIn(L2PcInstance activeChar)
	{
		throw new AbstractMethodError();
	}
	
	@DisabledRestriction
	public void playerDisconnected(L2PcInstance activeChar)
	{
		throw new AbstractMethodError();
	}
	
	@DisabledRestriction
	public boolean fakePvPZone(L2PcInstance activeChar, L2PcInstance target)
	{
		throw new AbstractMethodError();
	}
}
