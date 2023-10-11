package bai3.repository;

import bai3.model.ElectronicBill;

import java.util.List;

public interface IElectronicBillRepository {
    void create(ElectronicBill electronicBill);
    List<ElectronicBill> getAllElectronicBill();
}
