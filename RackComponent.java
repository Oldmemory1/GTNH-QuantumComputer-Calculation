public static void run() { // 20k heat cap max!
    new RackComponent(ItemList.Circuit_Primitive.get(1), 1, 4, 0, 500, true); // Primitive Circuit
    new RackComponent(ItemList.Circuit_Basic.get(1), 4, 8, 0, 1000, true); // Basic Circuit
    new RackComponent(ItemList.Circuit_Microprocessor.get(1), 6, 8, 0, 1250, true);
    new RackComponent(ItemList.Circuit_Good.get(1), 6, 9, -.05f, 1500, true); // Good Circuit
    new RackComponent(ItemList.Circuit_Integrated_Good.get(1), 7, 9, -.075f, 1750, true);
    new RackComponent(ItemList.Circuit_Processor.get(1), 8, 9, -.07f, 1800, true);
    new RackComponent(ItemList.Circuit_Parts_Advanced.get(1), 1, 2, -.05f, 2000, true);
    new RackComponent(ItemList.Circuit_Nanoprocessor.get(1), 8, 10, -.09f, 2250, true); // Advanced Circuit
    new RackComponent(ItemList.Circuit_Advanced.get(1), 8, 10, -.1f, 2500, true);
    new RackComponent(ItemList.Circuit_Data.get(1), 9, 1, -.1f, 3000, true); // EV Circuit
    new RackComponent(ItemList.Circuit_Nanocomputer.get(1), 11, 10, -.125f, 3300, true);
    new RackComponent(ItemList.Circuit_Quantumprocessor.get(1), 13, 10, -.15f, 3600, true);
    new RackComponent(ItemList.Circuit_Elite.get(1), 12, 10, -.15F, 3500, true); // IV Circuit
    new RackComponent(ItemList.Circuit_Elitenanocomputer.get(1), 14, 10, -.15F, 4000, true);
    new RackComponent(ItemList.Circuit_Quantumcomputer.get(1), 16, 10, -.15F, 4500, true);
    new RackComponent(ItemList.Circuit_Crystalprocessor.get(1), 18, 10, -.15F, 5000, true);
    new RackComponent(ItemList.Circuit_Master.get(1), 16, 12, -.2F, 5000, true); // LuV Circuit
    new RackComponent(ItemList.Circuit_Masterquantumcomputer.get(1), 16, 13, -.2F, 5100, true);
    new RackComponent(ItemList.Circuit_Crystalcomputer.get(1), 20, 14, -.25F, 5200, true);
    new RackComponent(ItemList.Circuit_Neuroprocessor.get(1), 24, 15, -.3F, 5300, true);
    new RackComponent(ItemList.Circuit_Quantummainframe.get(1), 22, 14, -.3F, 5200, true); // ZPM Circuit
    new RackComponent(ItemList.Circuit_Ultimatecrystalcomputer.get(1), 26, 16, -.3F, 5400, true);
    new RackComponent(ItemList.Circuit_Wetwarecomputer.get(1), 30, 18, -.3F, 5600, true);
    new RackComponent(ItemList.Circuit_Crystalmainframe.get(1), 30, 18, -.35F, 5500, true); // UV Circuit
    new RackComponent(ItemList.Circuit_Wetwaresupercomputer.get(1), 35, 22, -.3F, 5700, true);
    new RackComponent(ItemList.Circuit_Wetwaremainframe.get(1), 38, 25, -.4F, 6000, true); // UHV Circuit
 
    new RackComponent("IC2:ic2.reactorVent", 0, -1, 10f, 1000, false);
    new RackComponent("IC2:ic2.reactorVentCore", 0, -1, 20f, 2500, false);
    new RackComponent("IC2:ic2.reactorVentGold", 0, -1, 40f, 5000, false);
    new RackComponent("IC2:ic2.reactorVentDiamond", 0, -1, 80f, 10000, false); // 2x oc
 
    if (Loader.isModLoaded(Reference.DREAMCRAFT)) {
        // GTNH-GT5u circuits
        // these components causes crashes when used with the original GT5u
        new RackComponent(ItemList.NandChip.get(1), 2, 6, 0, 750, true); // Primitive Circuit
        new RackComponent(ItemList.Circuit_Biowarecomputer.get(1), 40, 26, -.35F, 5900, true);
        new RackComponent(ItemList.Circuit_Biowaresupercomputer.get(1), 42, 30, -.4F, 6200, true);
        new RackComponent(ItemList.Circuit_Biomainframe.get(1), 44, 28, -.4F, 6000, true); // UEV Circuit
        new RackComponent(ItemList.Circuit_Bioprocessor.get(1), 34, 20, -.35F, 5800, true);
 
        new RackComponent("dreamcraft:item.HighEnergyCircuitParts", 3, 2, -.1f, 9001, true);
        new RackComponent("dreamcraft:item.HighEnergyFlowCircuit", 24, 16, -.25f, 10000, true);
        new RackComponent("dreamcraft:item.NanoCircuit", 50, 35, -.45f, 8000, true);
        new RackComponent("dreamcraft:item.PikoCircuit", 64, 40, -.5f, 8500, true);
        new RackComponent("dreamcraft:item.QuantumCircuit", 128, 48, -.6f, 9000, true);
    }
 
    if (Loader.isModLoaded(Reference.SPARTAKCORE)) {
        // CustomGT5u circuits
        // these components causes crashes when used with the original GT5u
        new RackComponent(ItemList.NandChip.get(1), 2, 6, 0, 750, true); // Primitive Circuit
        new RackComponent(ItemList.Circuit_Biowarecomputer.get(1), 40, 26, -.35F, 5900, true);
        new RackComponent(ItemList.Circuit_Biowaresupercomputer.get(1), 42, 30, -.4F, 6200, true);
        new RackComponent(ItemList.Circuit_Biomainframe.get(1), 40, 28, -.4F, 6000, true); // UHV Circuit
        new RackComponent(ItemList.Circuit_Bioprocessor.get(1), 34, 20, -.35F, 5800, true);
    }
 
    if (Loader.isModLoaded("OpenComputers")) {
        new RackComponent("OpenComputers:item.oc.Transistor", 0, 1, 0f, 100, true); // Transistor
        new RackComponent("OpenComputers:item.oc.Microchip0", 7, 12, -.05f, 1500, true); // chip t1
        new RackComponent("OpenComputers:item.oc.Microchip1", 18, 20, -.1f, 3000, true); // chip t2
        new RackComponent("OpenComputers:item.oc.Microchip2", 25, 22, -.15f, 4500, true); // chip t3
        new RackComponent("OpenComputers:item.oc.ALU", 10, 15, -.05f, 3000, true); // alu
        new RackComponent("OpenComputers:item.oc.ControlUnit", 25, 18, -.05f, 1500, true); // cu
 
        new RackComponent("OpenComputers:item.oc.ComponentBus0", 42, 30, -.05f, 1500, true); // bus t1
        new RackComponent("OpenComputers:item.oc.ComponentBus1", 70, 50, -.1f, 3000, true); // bus t2
        new RackComponent("OpenComputers:item.oc.ComponentBus2", 105, 72, -.15f, 4500, true); // bus t3
 
        new RackComponent("OpenComputers:item.oc.CPU0", 106, 73, -.1f, 1500, true); // cpu t1
        new RackComponent("OpenComputers:item.oc.CPU1", 226, 153, -.15f, 3000, true); // cpu t2
        new RackComponent("OpenComputers:item.oc.CPU2", 374, 241, -.2f, 4500, true); // cpu t3
 
        new RackComponent("OpenComputers:item.oc.GraphicsCard0", 20, 27, -.1f, 1500, true); // gpu t1
        new RackComponent("OpenComputers:item.oc.GraphicsCard1", 62, 67, -.2f, 3000, true); // gpu t2
        new RackComponent("OpenComputers:item.oc.GraphicsCard2", 130, 111, -.3f, 4500, true); // gpu t3
 
        new RackComponent("OpenComputers:item.oc.APU0", 350, 234, -.1f, 1500, true); // apu t2
        new RackComponent("OpenComputers:item.oc.APU1", 606, 398, -.2f, 4500, true); // apu t3
        new RackComponent("OpenComputers:item.oc.APU2", 1590, 1006, -.3f, 9000, true); // apu tC
    }
}
 
public static class RackComponent implements Comparable<RackComponent> {
    private final String unlocalizedName;
    private final float heat, coEff, computation, maxHeat;
    private final boolean subZero;
 
    RackComponent(ItemStack is, float computation, float heat, float coEff, float maxHeat, boolean subZero) {
        this(getUniqueIdentifier(is), computation, heat, coEff, maxHeat, subZero);
    }
 
    RackComponent(String is, float computation, float heat, float coEff, float maxHeat, boolean subZero) {
        unlocalizedName = is;
        this.heat = heat;
        this.coEff = coEff;
        this.computation = computation;
        this.maxHeat = maxHeat;
        this.subZero = subZero;
        componentBinds.put(unlocalizedName, this);
        if (DEBUG_MODE) {
            TecTech.LOGGER.info("Component registered: " + unlocalizedName);
        }
    }
 
    @Override
    public int compareTo(RackComponent o) {
        return unlocalizedName.compareTo(o.unlocalizedName);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RackComponent) {
            return compareTo((RackComponent) obj) == 0;
        }
        return false;
    }
}
