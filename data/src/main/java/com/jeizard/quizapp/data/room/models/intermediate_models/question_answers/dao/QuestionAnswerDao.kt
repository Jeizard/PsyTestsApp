package com.jeizard.quizapp.data.room.models.intermediat_models.question_images.dao

import androidx.room.Dao
import androidx.room.Query
import com.jeizard.quizapp.data.room.dao.BaseDao
import com.jeizard.quizapp.data.room.models.intermediat_models.question_images.entity.QuestionAnswerDBEntity

@Dao
abstract class QuestionAnswerDao : BaseDao<QuestionAnswerDBEntity> {

    @Query("DELETE FROM question_answers")
    abstract fun deleteAllQuestionAnswers()

    @Query("SELECT * FROM question_answers")
    abstract fun getAllQuestionAnswers(): List<QuestionAnswerDBEntity>

    override fun deleteAll() {
        deleteAllQuestionAnswers()
    }

    override fun getAll(): List<QuestionAnswerDBEntity> {
        return getAllQuestionAnswers()
    }
}
