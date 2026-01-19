// package com.edutech.progressive.service.impl;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

// import com.edutech.progressive.entity.Supplier;
// import com.edutech.progressive.service.SupplierService;

// public class SupplierServiceImplArraylist implements SupplierService {

//     private List<Supplier> supplierList = new ArrayList<>();

//     @Override
//     public List<Supplier> getAllSuppliers() {
//         return supplierList;

//     }

//     @Override
//     public int addSupplier(Supplier supplier) {
//         supplierList.add(supplier);
//         return supplierList.size();
//     }

//     @Override
//     public List<Supplier> getAllSuppliersSortedByName() {

//         Collections.sort(supplierList);
//         return supplierList;
//     }

//     public static Comparator<Supplier> com = new Comparator<Supplier>() {

//         @Override
//         public int compare(Supplier arg0, Supplier arg1) {
//             return arg0.getSupplierName().compareTo(arg1.getSupplierName());
//         }

//     };

//     @Override
//     public void emptyArrayList() {
//         supplierList = new ArrayList<>();
//     }

// }
package com.edutech.progressive.service.impl;

import java.util.ArrayList;


import java.util.Comparator;


import java.util.List;

import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.service.SupplierService;
 
public class SupplierServiceImplArraylist implements SupplierService {
 
    private static List<Supplier> supplierList = new ArrayList<>();
 
    @Override


    public List<Supplier> getAllSuppliers() {


        return supplierList;


    }
 
    @Override


    public int addSupplier(Supplier supplier) {


        supplierList.add(supplier);


        return supplierList.size();


    }
 
    @Override


    public List<Supplier> getAllSuppliersSortedByName() {


        List<Supplier> sortedSupplier = supplierList;


        sortedSupplier.sort(Comparator.comparing(Supplier::getSupplierName)); // Sort by supplier name


        return sortedSupplier;


    }
 
    @Override


    public void emptyArrayList() {


        supplierList = new ArrayList<>();


    }


}
 