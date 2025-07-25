package dev.coinroutine.app.coins.model

import dev.coinroutine.app.core.domain.Coin

data class CoinModel(
    val coin: Coin,
    val price: Double,
    val change: Double,
)