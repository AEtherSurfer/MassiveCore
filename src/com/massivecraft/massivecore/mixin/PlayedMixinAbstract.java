package com.massivecraft.massivecore.mixin;

import com.massivecraft.massivecore.util.IdUtil;

public abstract class PlayedMixinAbstract implements PlayedMixin
{
	@Override
	public boolean isOnline(Object senderObject)
	{
		return IdUtil.isOnline(senderObject);
	}
	
	@Override
	public boolean isOffline(Object senderObject)
	{
		return !this.isOnline(senderObject);
	}

	@Override
	public boolean hasPlayedBefore(Object senderObject)
	{
		Long firstPlayed = this.getFirstPlayed(senderObject);
		return firstPlayed != null && firstPlayed != 0;
	}

}
