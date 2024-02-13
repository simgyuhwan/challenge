package com.project.challenge.domain.users

import jakarta.persistence.*
import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType

@Entity
class Users(
    @Column(name = "username")
    val name: String,

    @Id @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    var userRoles: MutableList<UserRole> = mutableListOf()
) {
  init {
      check(name.isNotEmpty()) {throw IllegalStateException("유저의 이름은 반드시 필요합니다.")}
  }

    fun addUserRole(userRole: UserRole) {
        userRoles.add(userRole)
    }
}


