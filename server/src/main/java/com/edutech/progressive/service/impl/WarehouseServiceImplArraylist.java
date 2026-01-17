package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist implements WarehouseService {

    private List<Warehouse> warehousesList = new ArrayList<>();

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehousesList;
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        warehousesList.add(warehouse);
        return warehousesList.size();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        List<Warehouse> sortWarehouses = warehousesList;
        sortWarehouses.sort(Comparator.comparing(Warehouse::getCapacity));
        return sortWarehouses;
    }

    @Override
    public void emptyArrayList() {
        warehousesList = new ArrayList<>();
    }

}

