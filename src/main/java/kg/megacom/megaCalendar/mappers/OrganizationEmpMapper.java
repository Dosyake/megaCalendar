package kg.megacom.megaCalendar.mappers;

import kg.megacom.megaCalendar.models.OrganizationEmp;
import kg.megacom.megaCalendar.models.dto.OrganizationEmpDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrganizationEmpMapper extends MainMapper<OrganizationEmp, OrganizationEmpDto>{
    OrganizationEmpMapper INSTANCE = Mappers.getMapper(OrganizationEmpMapper.class);
}
