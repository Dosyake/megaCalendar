package kg.megacom.megaCalendar.mappers;

import kg.megacom.megaCalendar.models.Organization;
import kg.megacom.megaCalendar.models.dto.OrganizationDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrganizationMapper extends MainMapper<Organization, OrganizationDto>{
    OrganizationMapper INSTANCE = Mappers.getMapper(OrganizationMapper.class);
}
