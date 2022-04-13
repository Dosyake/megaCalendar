package kg.megacom.megaCalendar.controller;

import kg.megacom.megaCalendar.models.dto.AccountDto;
import kg.megacom.megaCalendar.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/saveAccount")
    public ResponseEntity<?> saveAccount(@RequestBody AccountDto accountDto) {

        return ResponseEntity.ok(accountService.save(accountDto));
    }
    @GetMapping("/getAccount")
    public ResponseEntity<?> getAccount(@RequestParam Long id) {
        return ResponseEntity.ok(accountService.findById(id));
    }
}
