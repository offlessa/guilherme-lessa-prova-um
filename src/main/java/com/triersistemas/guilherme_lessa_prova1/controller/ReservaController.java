package com.triersistemas.guilherme_lessa_prova1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.triersistemas.guilherme_lessa_prova1.dto.ReservaDto;
import com.triersistemas.guilherme_lessa_prova1.entity.ReservaEntity;
import com.triersistemas.guilherme_lessa_prova1.enums.StatusReservaEnum;
import com.triersistemas.guilherme_lessa_prova1.service.ReservaService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

	@Autowired
	private ReservaService reservaService;

	@PostMapping
	public ResponseEntity<ReservaEntity> criarReserva(@RequestBody ReservaDto reservaDto) {
		ReservaEntity reserva = reservaService.criarReserva(reservaDto);
		return new ResponseEntity<>(reserva, HttpStatus.CREATED);
	}

	@GetMapping("/cliente/{clienteId}")
	public ResponseEntity<List<ReservaEntity>> listarReservasPorCliente(@PathVariable Long clienteId) {
		List<ReservaEntity> reservas = reservaService.listarReservasPorCliente(clienteId);
		return ResponseEntity.ok(reservas);
	}

	@GetMapping("/verificarDisponibilidade")
	public ResponseEntity<Boolean> verificarDisponibilidadeMesa(@RequestParam LocalDate dataReserva,
			@RequestParam Integer numeroMesa) {
		boolean disponivel = reservaService.verificarDisponibilidadeMesa(dataReserva, numeroMesa);
		return ResponseEntity.ok(disponivel);
	}

	@PutMapping("/{reservaId}/status")
	public ResponseEntity<ReservaEntity> alterarStatusReserva(@PathVariable Long reservaId,
			@RequestParam StatusReservaEnum status) {
		ReservaEntity reserva = reservaService.alterarStatusReserva(reservaId, status);
		return ResponseEntity.ok(reserva);
	}
}
