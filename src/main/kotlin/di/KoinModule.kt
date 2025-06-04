package org.movieverse.di

import org.koin.dsl.module
import org.movieverse.repository.HeroRepository
import org.movieverse.repository.HeroRepositoryImpl

val koinModule = module {
    single<HeroRepository>{
        HeroRepositoryImpl()
    }
}