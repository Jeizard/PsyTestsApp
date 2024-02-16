package com.jeizard.quizapp.data.room.models.single_models.questions.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "tests"
)
data class TestDBEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val name: String)

