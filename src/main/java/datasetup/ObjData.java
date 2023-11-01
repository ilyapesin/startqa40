package datasetup;

import java.util.ArrayList;
import java.util.List;

public class ObjData {
    List<DataCommonDto> list=new ArrayList<>();

    public List<DataCommonDto> getList() {
        return list;
    }

    public List<DataCommonDto> fillData(){
        //list.add
        UserDto userDto=new UserDto("email@1",1111);
        UserDto userDto1=new UserDto("email@2",2222);
        CarDTO carDTO1=new CarDTO("model1",111);
        CarDTO carDTO2=new CarDTO("model2",222);
        CarDTO carDTO3=new CarDTO("model3",333);
        CarDTO[] cars={carDTO1, carDTO2};
        CarDTO[] cars1={carDTO1,carDTO2,carDTO3};
        DataCommonDto dataCommonDto=new DataCommonDto(userDto,cars);
        DataCommonDto dataCommonDto1=new DataCommonDto(userDto1,cars1);
        list.add(dataCommonDto);
        list.add(dataCommonDto1);
        return list;
    }


}
