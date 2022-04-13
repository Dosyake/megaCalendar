package kg.megacom.megaCalendar.service;

import kg.megacom.megaCalendar.models.dto.AdminDto;

public interface AdminService {

    AdminDto save(AdminDto adminDto);

    AdminDto findById(Long id);
}
