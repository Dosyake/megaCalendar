package kg.megacom.megaCalendar.mappers;

import kg.megacom.megaCalendar.models.Employee;
import kg.megacom.megaCalendar.models.dto.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper extends MainMapper<Employee, EmployeeDto>{
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
}
