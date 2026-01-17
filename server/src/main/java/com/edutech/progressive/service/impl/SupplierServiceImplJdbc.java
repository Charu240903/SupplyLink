package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.SupplierDAO;
import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.service.SupplierService;

public class SupplierServiceImplJdbc implements SupplierService {
    SupplierDAO supplierDAO;

    public SupplierServiceImplJdbc(SupplierDAO supplierDAO) {
        this.supplierDAO = supplierDAO;
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return new ArrayList<>();
    }

    @Override
    public int addSupplier(Supplier supplier) {
        return -1;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        return new ArrayList<>();
    }

    @Override
    public void updateSupplier(Supplier supplier) {

    }

    @Override
    public void deleteSupplier(int supplierId) {

    }

    @Override
    public Supplier getSupplierById(int supplierId) {
        return null;
    }

}