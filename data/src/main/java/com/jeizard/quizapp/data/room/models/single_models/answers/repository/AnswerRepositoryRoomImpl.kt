package com.jeizard.quizapp.data.room.models.single_models.answers.repository

import android.app.Application
import com.jeizard.domain.entities.Answer
import com.jeizard.domain.repository.BaseRepository
import com.jeizard.quizapp.data.room.AppDatabase
import com.jeizard.quizapp.data.room.models.single_models.questions.dao.AnswerDao
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.AnswerDBEntity
import com.jeizard.quizapp.data.room.models.single_models.answers.mapper.AnswerDBEntityMapper
import com.jeizard.quizapp.data.room.repository.BaseRepositoryRoomImpl

class AnswerRepositoryRoomImpl(application: Application) :
    BaseRepositoryRoomImpl<AnswerDBEntity, AnswerDao, Answer>(
        AppDatabase.getInstance(application).answerDao(),
        AnswerDBEntityMapper()
    ),
    BaseRepository<Answer>