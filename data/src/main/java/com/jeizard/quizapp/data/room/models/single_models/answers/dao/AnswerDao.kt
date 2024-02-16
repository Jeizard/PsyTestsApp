package com.jeizard.quizapp.data.room.models.single_models.questions.dao

import androidx.room.Dao
import androidx.room.Query
import com.jeizard.quizapp.data.room.dao.BaseDao
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.AnswerDBEntity

@Dao
abstract class AnswerDao : BaseDao<AnswerDBEntity> {

    @Query("DELETE FROM answers")
    abstract fun deleteAllAnswers()

    @Query("SELECT * FROM answers")
    abstract fun getAllAnswers(): List<AnswerDBEntity>

    override fun deleteAll() {
        deleteAllAnswers()
    }

    override fun getAll(): List<AnswerDBEntity> {
        return getAllAnswers()
    }
}
