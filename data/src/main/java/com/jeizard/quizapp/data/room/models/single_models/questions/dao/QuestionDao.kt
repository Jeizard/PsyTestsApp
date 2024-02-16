package com.jeizard.quizapp.data.room.models.single_models.questions.dao

import androidx.room.Dao
import androidx.room.Query
import com.jeizard.quizapp.data.room.dao.BaseDao
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.AnswerDBEntity

@Dao
abstract class QuestionDao : BaseDao<AnswerDBEntity> {

    @Query("DELETE FROM questions")
    abstract fun deleteAllQuestions()

    @Query("SELECT * FROM questions")
    abstract fun getAllQuestions(): List<AnswerDBEntity>

    override fun deleteAll() {
        deleteAllQuestions()
    }

    override fun getAll(): List<AnswerDBEntity> {
        return getAllQuestions()
    }
}
