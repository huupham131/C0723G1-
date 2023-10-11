package bai3.repository.impl;

import bai3.model.ElectronicBill;
import bai3.repository.IElectronicBillRepository;
import bai3.util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class ElectronicBillRepositoryImpl implements IElectronicBillRepository {
    private static final String ELECTRONIC_BILL_PATH = "/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/thi/src/bai3/data/hoa_don_tien_dien.csv";
    public static final String COMMA = ",";

    @Override
    public void create(ElectronicBill electronicBill) {
        List<ElectronicBill> electronicBills = new ArrayList<>();
        electronicBills.add(electronicBill);
        FileUtil.writeFile(ELECTRONIC_BILL_PATH, convertToString(electronicBills), true);
    }

    @Override
    public List<ElectronicBill> getAllElectronicBill() {
        return convertToObject(FileUtil.readFile(ELECTRONIC_BILL_PATH));
    }

    public List<String> convertToString(List<ElectronicBill> electronicBills) {
        List<String> stringList = new ArrayList<>();
        for (ElectronicBill electronicBill : electronicBills) {
            stringList.add(electronicBill.getIdBill()
                    + COMMA + electronicBill.getNameCustomer()
                    + COMMA + electronicBill.getTypeOfCustomer()
                    + COMMA + electronicBill.getElectricUsed());
        }
        return stringList;
    }

    public List<ElectronicBill> convertToObject(List<String> stringList) {
        List<ElectronicBill> electronicBills = new ArrayList<>();
        String[] arrayString;
        for (String string : stringList) {
            arrayString = string.split(",");
            electronicBills.add(new ElectronicBill(arrayString[0], arrayString[1], arrayString[2], Integer.parseInt(arrayString[3])));
        }
        return electronicBills;
    }
}
