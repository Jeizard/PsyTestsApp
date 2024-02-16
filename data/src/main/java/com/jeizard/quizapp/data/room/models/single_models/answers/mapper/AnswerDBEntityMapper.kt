package com.jeizard.quizapp.data.room.models.single_models.answers.mapper

import com.jeizard.domain.entities.Answer
import com.jeizard.quizapp.data.mapper.Mapper
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.AnswerDBEntity

class AnswerDBEntityMapper : Mapper<AnswerDBEntity, Answer> {

    override fun mapFromDBEntity(d: AnswerDBEntity): Answer {
        return Answer(d.id, d.answer)
    }

    override fun mapToDBEntity(e: Answer): AnswerDBEntity {
        return AnswerDBEntity(e.id, e.answer)
    }

    override fun mapFromDBEntity(dCollection: Collection<AnswerDBEntity>): List<Answer> {
        return dCollection.map { mapFromDBEntity(it) }
    }

    override fun mapToDBEntity(eCollection: Collection<Answer>): List<AnswerDBEntity> {
        return eCollection.map { mapToDBEntity(it) }
    }
}

