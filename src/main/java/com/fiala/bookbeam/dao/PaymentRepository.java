package com.fiala.bookbeam.dao;

import com.fiala.bookbeam.entity.Message;
import com.fiala.bookbeam.entity.Payment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findByUserEmail(String userEmail);

}
