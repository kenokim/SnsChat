package keno.SnsChat.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Sample {
    @Id @GeneratedValue var id: Long? = null
}