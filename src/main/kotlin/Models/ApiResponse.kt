package Models

data class ApiResponse(
    val info: Info,
    val results: List<Result>
)