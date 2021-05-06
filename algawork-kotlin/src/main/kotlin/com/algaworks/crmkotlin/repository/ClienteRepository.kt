package com.algaworks.crmkotlin.repository

import com.algaworks.crmkotlin.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClienteRepository : JpaRepository<Cliente, Long>{
}