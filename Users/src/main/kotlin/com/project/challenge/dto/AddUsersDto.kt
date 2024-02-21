package com.project.challenge.dto

import com.project.challenge.domain.users.Users

data class AddUsersDto(val name: String) {

    fun toEntity(): Users {
        return Users(name = name)
    }

}
