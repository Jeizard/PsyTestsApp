package com.jeizard.quizapp.data.room.models.single_models.tests.mapper

import com.jeizard.domain.entities.Test
import com.jeizard.quizapp.data.mapper.Mapper
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.AnswerDBEntity

class TestDBEntityMapper : Mapper<AnswerDBEntity, Test> {

    override fun mapFromDBEntity(d: AnswerDBEntity): Test {
        return Test(d.id, d.name)
    }

    override fun mapToDBEntity(e: Test): AnswerDBEntity {
        return AnswerDBEntity(e.id, e.name)
    }

    override fun mapFromDBEntity(dCollection: Collection<AnswerDBEntity>): List<Test> {
        return dCollection.map { mapFromDBEntity(it) }
    }

    override fun mapToDBEntity(eCollection: Collection<Test>): List<AnswerDBEntity> {
        return eCollection.map { mapToDBEntity(it) }
    }
}

