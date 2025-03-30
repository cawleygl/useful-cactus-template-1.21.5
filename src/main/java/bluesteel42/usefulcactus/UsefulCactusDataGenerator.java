package bluesteel42.usefulcactus;

import bluesteel42.usefulcactus.datagen.ModBlockTagProvider;
import bluesteel42.usefulcactus.datagen.ModItemTagProvider;
import bluesteel42.usefulcactus.datagen.ModLootTableProvider;
import bluesteel42.usefulcactus.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class UsefulCactusDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
