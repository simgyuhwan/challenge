package com.project.challenge.domain.users

import jakarta.persistence.*

@Entity
class UserRole(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val users: Users,

    @Enumerated(EnumType.STRING)
    val roleType: RoleType,
)