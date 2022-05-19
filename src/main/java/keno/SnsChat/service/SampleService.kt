package keno.SnsChat.service

import keno.SnsChat.domain.Sample
import keno.SnsChat.repository.SampleRepository
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@RequiredArgsConstructor
@Transactional
open class SampleService (
    val sampleRepository: SampleRepository
) {
    fun sample(): List<Sample> = sampleRepository.findAll() as List<Sample>
    /*fun save(): Sample {
        var sample = Sample()
        return sampleRepository.save(sample)
    }*/
    fun save(): Sample = sampleRepository.save(Sample())
}