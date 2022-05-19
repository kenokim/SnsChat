package keno.SnsChat.repository

import keno.SnsChat.domain.Sample
import org.springframework.data.repository.CrudRepository

interface SampleRepository: CrudRepository<Sample, Long>