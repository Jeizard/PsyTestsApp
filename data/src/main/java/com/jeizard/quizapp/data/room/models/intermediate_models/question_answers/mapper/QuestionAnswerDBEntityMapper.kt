package com.jeizard.quizapp.data.room.models.room.single_models.images.mapper

import com.jeizard.domain.entities.QuestionAnswer
import com.jeizard.quizapp.data.mapper.Mapper
import com.jeizard.quizapp.data.room.models.intermediat_models.question_images.entity.QuestionAnswerDBEntity

class QuestionAnswerDBEntityMapper : Mapper<QuestionAnswerDBEntity, QuestionAnswer> {

    override fun mapFromDBEntity(d: QuestionAnswerDBEntity): QuestionAnswer {
        return QuestionAnswer(d.questionId, d.answerId, d.value)
    }

    override fun mapToDBEntity(e: QuestionAnswer): QuestionAnswerDBEntity {
        return QuestionAnswerDBEntity(e.questionId, e.answerId, e.value)
    }

    override fun mapFromDBEntity(dCollection: Collection<QuestionAnswerDBEntity>): List<QuestionAnswer> {
        return dCollection.map { mapFromDBEntity(it) }
    }

    override fun mapToDBEntity(eCollection: Collection<QuestionAnswer>): List<QuestionAnswerDBEntity> {
        return eCollection.map { mapToDBEntity(it) }
    }
}
