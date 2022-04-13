package kg.megacom.megaCalendar.mappers;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public interface MainMapper<ENTITY, DTO> {

    ENTITY toEntity(DTO dto);

    DTO toDto(ENTITY entity);

    List<ENTITY> toEntities(List<DTO> dtoList);

    List<DTO> toDtos(List<ENTITY> entityList);

}



