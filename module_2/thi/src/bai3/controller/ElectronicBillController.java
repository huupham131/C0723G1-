package bai3.controller;

import bai3.model.ElectronicBill;
import bai3.service.IElectronicBillService;
import bai3.service.impl.ElectronicBillServiceImpl;

import java.util.List;

public class ElectronicBillController {
    private final IElectronicBillService electronicBillService = new ElectronicBillServiceImpl();

    public void create(ElectronicBill electronicBill) {
        electronicBillService.create(electronicBill);
    }


    public List<ElectronicBill> getAllElectronicBill() {
        return electronicBillService.getAllElectronicBill();
    }
}
