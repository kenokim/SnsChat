package keno.SnsChat.controller

import keno.SnsChat.domain.Sample
import keno.SnsChat.service.SampleService
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
class SampleController (
    val sampleService: SampleService
) {
    @GetMapping("/sample")
    fun sample(): SampleDto {
        var sample = sampleService.save()
        return sample as SampleDto
    }
}

data class SampleDto(var id: Long)
data class SampleListDto(var samples: List<SampleDto>)