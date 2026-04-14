
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {