package kg.megacom.megaCalendar.controller;

import kg.megacom.megaCalendar.models.dto.AccountDto;
import kg.megacom.megaCalendar.models.dto.AdminDto;
import kg.megacom.megaCalendar.service.AccountService;
import kg.megacom.megaCalendar.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/saveAdmin")
    public ResponseEntity<?> saveAccount(@RequestBody AdminDto adminDto) {
        return ResponseEntity.ok(adminService.save(adminDto));
    }

    @GetMapping("/findAdmin")
    public ResponseEntity<?> findAccount(@RequestParam Long id) {
        return ResponseEntity.ok(adminService.findById(id));
    }
}
