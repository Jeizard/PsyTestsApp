package com.jeizard.quizapp.data.room.models.intermediat_models.question_images.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.AnswerDBEntity
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.QuestionDBEntity

@Entity(
    tableName = "question_answers",
    primaryKeys = ["question_id", "answer_id"],
    indices = [
        Index("answer_id")
    ],
    foreignKeys = [
        ForeignKey(
            entity = QuestionDBEntity::class,
            parentColumns = ["id"],
            childColumns = ["question_id"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = AnswerDBEntity::class,
            parentColumns = ["id"],
            childColumns = ["answer_id"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        )
    ]
)
data class QuestionAnswerDBEntity(
    @ColumnInfo(name = "question_id") val questionId: Long,
    @ColumnInfo(name = "answer_id") val answerId: Long,
    val value: Int)