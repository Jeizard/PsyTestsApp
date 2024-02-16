package com.jeizard.quizapp.data.room.models.intermediat_models.question_images.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.QuestionDBEntity
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.TestDBEntity

@Entity(
    tableName = "test_questions",
    primaryKeys = ["test_id", "question_id"],
    indices = [
        Index("question_id")
    ],
    foreignKeys = [
        ForeignKey(
            entity = TestDBEntity::class,
            parentColumns = ["id"],
            childColumns = ["test_id"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = QuestionDBEntity::class,
            parentColumns = ["id"],
            childColumns = ["question_id"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        )
    ]
)
data class TestQuestionDBEntity(
    @ColumnInfo(name = "test_id") val testId: Long,
    @ColumnInfo(name = "question_id") val questionId: Long)