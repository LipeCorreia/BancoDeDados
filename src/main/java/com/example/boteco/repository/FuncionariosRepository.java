package com.example.boteco.repository;

import com.example.boteco.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionariosRepository extends JpaRepository<Funcionario, Long>{
}
