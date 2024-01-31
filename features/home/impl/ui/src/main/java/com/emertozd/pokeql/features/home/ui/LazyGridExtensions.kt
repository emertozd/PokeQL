import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.paging.compose.LazyPagingItems

//https://issuetracker.google.com/issues/177245496#comment55
@Composable
fun <T : Any> LazyPagingItems<T>.rememberLazyGridState(): LazyGridState {
    val state = androidx.compose.foundation.lazy.grid.rememberLazyGridState()

    return when (itemCount) {
        // Return a different LazyListState instance.
        0 -> remember(this) {
            LazyGridState(
                firstVisibleItemIndex = state.firstVisibleItemIndex,
                firstVisibleItemScrollOffset = state.firstVisibleItemScrollOffset
            )
        }
        // Return rememberLazyListState (normal case).
        else -> state
    }
}