package datasetup;

public class DataCommonDto {

    UserDto userDto;
    CarDTO[] carDTO;

    public DataCommonDto(UserDto userDto, CarDTO[] carDTO) {
        this.userDto = userDto;
        this.carDTO = carDTO;
    }

    public DataCommonDto() {
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public CarDTO[] getCarDTO() {
        return carDTO;
    }

    public void setCarDTO(CarDTO[] carDTO) {
        this.carDTO = carDTO;
    }
}
