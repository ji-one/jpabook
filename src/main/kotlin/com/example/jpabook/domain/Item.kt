package com.example.jpabook.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Item(
    var name: String,
    var price: Int,
    var stockQuantity: Int,
    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    val id: Long? = null
)
