package bai3.service.impl;

import bai3.model.ElectronicBill;
import bai3.repository.IElectronicBillRepository;
import bai3.repository.impl.ElectronicBillRepositoryImpl;
import bai3.service.IElectronicBillService;

import java.util.List;

public class ElectronicBillServiceImpl implements IElectronicBillService {
    private final IElectronicBillRepository electronicBillRepository = new ElectronicBillRepositoryImpl();
    @Override
    public void create(ElectronicBill electronicBill) {
        electronicBillRepository.create(electronicBill);
    }

    @Override
    public List<ElectronicBill> getAllElectronicBill() {
        return electronicBillRepository.getAllElectronicBill();
    }
}
