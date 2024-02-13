package com.project.challenge.controller

import com.project.challenge.dto.AddUsersDto
import com.project.challenge.service.UserService
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
class TestController(private val userService: UserService) {

    @PostMapping("/users")
    fun addUsers(@RequestBody addUsersDto: AddUsersDto) {
        return userService.addUsers(addUsersDto)
    }
}