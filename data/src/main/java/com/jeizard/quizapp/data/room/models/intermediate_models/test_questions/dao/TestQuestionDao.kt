package com.jeizard.quizapp.data.room.models.intermediat_models.question_images.dao

import androidx.room.Dao
import androidx.room.Query
import com.jeizard.quizapp.data.room.dao.BaseDao
import com.jeizard.quizapp.data.room.models.intermediat_models.question_images.entity.QuestionAnswerDBEntity

@Dao
abstract class TestQuestionDao : BaseDao<QuestionAnswerDBEntity> {

    @Query("DELETE FROM test_questions")
    abstract fun deleteAllTestQuestions()

    @Query("SELECT * FROM test_questions")
    abstract fun getAllTestQuestions(): List<QuestionAnswerDBEntity>

    override fun deleteAll() {
        deleteAllTestQuestions()
    }

    override fun getAll(): List<QuestionAnswerDBEntity> {
        return getAllTestQuestions()
    }
}
