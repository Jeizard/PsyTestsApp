package com.jeizard.quizapp.data.room.models.intermediate_models.test_questions.repository

import android.app.Application
import com.jeizard.domain.entities.QuestionAnswer
import com.jeizard.domain.repository.BaseRepository
import com.jeizard.quizapp.data.room.AppDatabase
import com.jeizard.quizapp.data.room.models.intermediat_models.question_images.dao.QuestionAnswerDao
import com.jeizard.quizapp.data.room.models.intermediat_models.question_images.entity.QuestionAnswerDBEntity
import com.jeizard.quizapp.data.room.models.room.single_models.images.mapper.QuestionAnswerDBEntityMapper
import com.jeizard.quizapp.data.room.repository.BaseRepositoryRoomImpl

class QuestionAnswerRepositoryRoomImpl(application: Application) :
    BaseRepositoryRoomImpl<QuestionAnswerDBEntity, QuestionAnswerDao, QuestionAnswer>(
        AppDatabase.getInstance(application).questionAnswerDao(),
        QuestionAnswerDBEntityMapper()
    ),
    BaseRepository<QuestionAnswer>