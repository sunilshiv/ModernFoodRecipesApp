package com.recipes.foody.data

import com.recipes.foody.data.apis.FoodRecipesApi
import com.recipes.foody.models.FoodRecipes
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>) : Response<FoodRecipes> {
        return foodRecipesApi.getRecipes(queries)
    }
}