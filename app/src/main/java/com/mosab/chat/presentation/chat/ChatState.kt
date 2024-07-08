package com.mosab.chat.presentation.chat

import com.mosab.chat.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)