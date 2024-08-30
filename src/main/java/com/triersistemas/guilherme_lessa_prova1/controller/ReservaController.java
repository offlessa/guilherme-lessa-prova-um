package com.triersistemas.guilherme_lessa_prova1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.triersistemas.guilherme_lessa_prova1.entity.Reserva;
import com.triersistemas.guilherme_lessa_prova1.service.ReservaService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping("/{clienteId}")
    public Reserva criarReserva(@PathVariable Long clienteId, @RequestBody Reserva reserva) {
        return reservaService.criarReserva(clienteId, reserva);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Reserva> listarReservasPorCliente(@PathVariable Long clienteId) {
        return reservaService.listarReservasPorCliente(clienteId);
    }

    @GetMapping("/verificar")
    public boolean verificarDisponibilidade(@RequestParam LocalDate dataReserva, @RequestParam Integer numeroMesa) {
        return reservaService.verificarDisponibilidadeMesa(dataReserva, numeroMesa);
    }

    @PutMapping("/{reservaId}/status")
    public Reserva alterarStatusReserva(@PathVariable Long reservaId, @RequestParam Reserva.Status status) {
        return reservaService.alterarStatusReserva(reservaId, status);
    }
}
