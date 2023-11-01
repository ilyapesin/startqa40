package datasetup;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjData objData = new ObjData();

        List<DataCommonDto> list = objData.fillData();

        System.out.println(list.get(0).getUserDto().getEmail());
        System.out.println(list.get(0).getUserDto().getId());
        System.out.println(list.get(0).getCarDTO()[0].getModel());
        System.out.println(list.get(0).getCarDTO()[0].getId());
        System.out.println(list.get(0).getCarDTO()[1].getModel());
        System.out.println(list.get(0).getCarDTO()[1].getId());
        System.out.println(list.get(1).getUserDto().getEmail());
        System.out.println(list.get(1).getUserDto().getId());
    }
}
