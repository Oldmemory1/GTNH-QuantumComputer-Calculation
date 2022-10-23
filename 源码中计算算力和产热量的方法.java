private int getComputationPower(float overclock, float overvolt, boolean tickingComponents) {
    float computation = 0, heat = 0;
    for (int i = 0; i < mInventory.length; i++) {
        if (mInventory[i] == null || mInventory[i].stackSize != 1) {
            continue;
        }
        RackComponent comp = componentBinds.get(getUniqueIdentifier(mInventory[i]));
        if (comp == null) {
            continue;
        }
        if (tickingComponents) {
            if (this.heat > comp.maxHeat) {
                mInventory[i] = null;
                continue;
            } else if (comp.subZero || this.heat >= 0) {
                heat += (1f + comp.coEff * this.heat / 10000f)
                        * (comp.heat > 0 ? comp.heat * overclock * overclock * overvolt : comp.heat);
                if (overvolt * 10f > 7f + TecTech.RANDOM.nextFloat()) {
                    computation += comp.computation
                            * Math.max(
                                    0,
                                    Math.min(
                                            Math.min(overclock, overvolt + overvolt - 0.25),
                                            1 + TecTech.RANDOM.nextFloat() + (overvolt - 1) - (overclock - 1) / 2));
                }
            }
        } else {
            computation += comp.computation * overclock;
        }
    }
    if (tickingComponents) {
        this.heat += Math.ceil(heat);
    }
    return (int) Math.floor(computation);
}
 
@Override
public int getInventoryStackLimit() {
    return 1;
}
 
public int tickComponents(float oc, float ov) {
    if (oc > 3 + TecTech.RANDOM.nextFloat() || ov > 2 + TecTech.RANDOM.nextFloat()) {
        getBaseMetaTileEntity().setToFire();
    }
    overClock = oc;
    overVolt = ov;
    return getComputationPower(overClock, overVolt, true);
}
