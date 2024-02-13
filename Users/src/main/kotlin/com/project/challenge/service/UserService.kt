package com.project.challenge.service

import com.project.challenge.domain.users.RoleType
import com.project.challenge.domain.users.UserRole
import com.project.challenge.domain.users.Users
import com.project.challenge.dto.AddUsersDto
import com.project.challenge.domain.users.UserRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class UserService(
    private val userRepository: UserRepository
) {
    fun addUsers(addUsersDto: AddUsersDto) {
        val entity: Users = addUsersDto.toEntity()
        val userRole = UserRole(users = entity, roleType = RoleType.USER)
        entity.addUserRole(userRole)
        userRepository.save(entity)
    }

}
