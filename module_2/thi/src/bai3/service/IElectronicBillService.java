package bai3.service;

import bai3.model.ElectronicBill;

import java.util.List;

public interface IElectronicBillService {
    void create(ElectronicBill electronicBill);
    List<ElectronicBill> getAllElectronicBill();
}
