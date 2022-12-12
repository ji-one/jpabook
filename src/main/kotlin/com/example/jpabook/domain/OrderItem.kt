package com.example.jpabook.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class OrderItem(
    var itemId: Long,
    var orderId: Long,
    var orderPrice: Int,
    var count: Int,
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    val id: Long? = null
)
