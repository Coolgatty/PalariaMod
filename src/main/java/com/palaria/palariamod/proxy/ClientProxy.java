package com.palaria.palariamod.proxy;

import com.palaria.palariamod.init.Items;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		Items.registerRenders();
	}
}
