package com.job.naukari.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.naukari.entities.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}