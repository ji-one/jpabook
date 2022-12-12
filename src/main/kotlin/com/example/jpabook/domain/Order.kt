package com.example.jpabook.domain

import com.example.jpabook.enum.OrderStatus
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Order(
    var memberId: Long,
    var orderaDate: LocalDateTime,
    @Enumerated(EnumType.STRING)
    var status: OrderStatus,
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    val id: Long? = null
)
