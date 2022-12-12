package com.example.jpabook.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Member(
    var name: String,
    var street: String,
    var zipcode: String,
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    val id: Long? = null
)
