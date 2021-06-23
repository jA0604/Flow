package ru.netology.nmedia_flow.model

import ru.netology.nmedia_flow.dto.Post

data class FeedModel(
    val posts: List<Post> = emptyList(),
    val empty: Boolean = false,
)
