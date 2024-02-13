package com.project.challenge.domain.users

import com.project.challenge.domain.users.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<Users, Long> {
}