package org.example.factoring.service;

import com.example.pastebin.dto.PostDTO;
import com.example.pastebin.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DealService {

    private final DealRepository dealRepository;

    public List<DealDTO> getAllDeals() {
        // Логика будет позже
        return new ArrayList<>();
    }

    public DealDTO createDeal(DealDTO dealDTO) {
        // Логика будет позже
        return dealDTO;
    }

    public void deleteDeal(Long id) {
        // Логика будет позже
    }

}
