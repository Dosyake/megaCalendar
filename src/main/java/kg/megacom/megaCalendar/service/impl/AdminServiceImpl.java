package kg.megacom.megaCalendar.service.impl;

import kg.megacom.megaCalendar.dao.AdminRep;
import kg.megacom.megaCalendar.mappers.AdminMapper;
import kg.megacom.megaCalendar.models.dto.AdminDto;
import kg.megacom.megaCalendar.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRep adminRep;

    @Override
    public AdminDto save(AdminDto adminDto) {

        return AdminMapper.INSTANCE.toDto(adminRep.save(AdminMapper.INSTANCE.toEntity(adminDto)));
    }

    @Override
    public AdminDto findById(Long id) {

        return AdminMapper.INSTANCE.toDto(adminRep.findById(id).orElse(null));
    }
}
