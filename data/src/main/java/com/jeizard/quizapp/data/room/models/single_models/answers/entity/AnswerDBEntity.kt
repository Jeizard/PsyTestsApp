package com.jeizard.quizapp.data.room.models.single_models.questions.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "answers"
)
data class AnswerDBEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val answer: String)

