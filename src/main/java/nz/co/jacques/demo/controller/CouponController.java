package nz.co.jacques.demo.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coupons")
@ConditionalOnProperty(name = "feature.toggles.coupons", havingValue = "true")
public class CouponController {

    @GetMapping
    ResponseEntity getAll() {
        return ResponseEntity.ok("all coupons");
    }
}
