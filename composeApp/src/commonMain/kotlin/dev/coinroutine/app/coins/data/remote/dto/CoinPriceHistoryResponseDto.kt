package dev.coinroutine.app.coins.data.remote.dto

import kotlinx.serialization.Serializable


@Serializable
data class CoinPriceHistoryResponseDto(
    val data: CoinPriceHistoryDto,
)

@Serializable
data class CoinPriceHistoryDto(
    val history: List<CoinPriceDto>,
)

data class CoinPriceDto(
    val price: Double?,
    val timestamp: Long,
)