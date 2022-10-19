@Override
public void onPostTick(IGregTechTileEntity aBaseMetaTileEntity, long aTick) {
    if (aBaseMetaTileEntity.isServerSide()) {
        if (aTick % 20 == MULTI_CHECK_AT) {
            if (heat > 0) {
                float heatC = 0;
                for (int i = 0; i < mInventory.length; i++) {
                    if (mInventory[i] == null || mInventory[i].stackSize != 1) {
                        continue;
                    }
                    RackComponent comp = componentBinds.get(getUniqueIdentifier(mInventory[i]));
                    if (comp == null) {
                        continue;
                    }
                    if (heat > comp.maxHeat) {
                        mInventory[i] = null;
                    } else if (comp.heat < 0) {
                        heatC += comp.heat * (heat / 10000f);
                    }
                }
                heat += Math.max(-heat, Math.ceil(heatC));
            }
 
            if (heat > 0) {
                heat -= Math.max(heat / 1000, 1);
            } else if (heat < 0) {
                heat -= Math.min(heat / 1000, -1);
            }
 
            if (heat > 10000) {
                aBaseMetaTileEntity.setToFire();
            } else if (heat > 9000) {
                aBaseMetaTileEntity.setOnFire();
            } else if (heat < -10000) {
                heat = -10000;
            }
        }
    }
}
