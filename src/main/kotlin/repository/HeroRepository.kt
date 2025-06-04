package org.movieverse.repository

import org.movieverse.modules.ApiResponse
import org.movieverse.modules.Hero

interface HeroRepository {
    val heroes: Map<Int, List<Hero>>     //key is page and value is list of hero in that page

    val page1: List<Hero>
    val page2: List<Hero>
    val page3: List<Hero>
    val page4: List<Hero>
    val page5: List<Hero>

    suspend fun getAllHeroes(page: Int = 1): ApiResponse
    suspend fun searchHeroes(name: String?): ApiResponse
}


