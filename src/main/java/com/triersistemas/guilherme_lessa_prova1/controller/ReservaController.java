package com.triersistemas.guilherme_lessa_prova1.controller;

import org.springframework.web.bind.annotation.*;
import com.triersistemas.guilherme_lessa_prova1.dto.ReservaDto;
import com.triersistemas.guilherme_lessa_prova1.service.ReservaService;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping
    public ReservaDto criarReserva(@RequestBody ReservaDto reservaDto) {
        return reservaService.criarReserva(reservaDto);
    }

    @PutMapping("/{id}")
    public ReservaDto atualizarReserva(@PathVariable Long id, @RequestBody ReservaDto reservaDto) {
        return reservaService.atualizarReserva(id, reservaDto);
    }

    @GetMapping("/{id}")
    public ReservaDto buscarReserva(@PathVariable Long id) {
        return reservaService.buscarReserva(id);
    }

    @DeleteMapping("/{id}")
    public void cancelarReserva(@PathVariable Long id) {
        reservaService.cancelarReserva(id);
    }

    @GetMapping("/data")
    public List<ReservaDto> buscarReservasPorData(@RequestParam LocalDate data) {
        return reservaService.buscarReservasPorData(data);
    }
}
