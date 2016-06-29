package com.agriculturalexpansion.proxy;

import com.agriculturalexpansion.init.AEBlocks;
import com.agriculturalexpansion.init.AEItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		
		AEBlocks.initBlocks();
		AEItems.initItems();

	}
	
	public void init(FMLInitializationEvent event) {
		
	}

	public void postInit(FMLPostInitializationEvent postEvent) {
	
	}

}
