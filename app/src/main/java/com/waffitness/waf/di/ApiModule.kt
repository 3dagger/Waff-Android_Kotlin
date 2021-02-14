package com.waffitness.waf.di

import com.waffitness.waf.repository.remote.RemoteService
import org.koin.dsl.module
import retrofit2.Retrofit

var apiModules = module {
    single(createdAtStart = false) {get<Retrofit>().create(RemoteService::class.java)}
}