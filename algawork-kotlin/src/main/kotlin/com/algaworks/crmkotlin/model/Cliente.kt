package com.algaworks.crmkotlin.model

import lombok.Data
import javax.persistence.*


@Data
@Entity
class Cliente (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id:Long,
        @Column(nullable = false)
        val name:String ) {

}