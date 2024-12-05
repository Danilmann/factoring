package org.example.factoring.controller;

import lombok.RequiredArgsConstructor;
import org.example.factoring.dto.DealDTO;
import org.example.factoring.service.DealService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class DealController {

    private final DealService dealService;

    @GetMapping
    public ResponseEntity<List<DealDTO>> getAllDeals() {
        // Логика будет позже
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping
    public ResponseEntity<DealDTO> createDeal(@RequestBody DealDTO dealDTO) {
        // Логика будет позже
        return ResponseEntity.ok(dealDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDeal(@PathVariable Long id) {
        // Логика будет позже
        return ResponseEntity.ok("Post deleted successfully");
    }

}
