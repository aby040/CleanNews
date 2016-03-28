package clean.news.presentation.navigation

import clean.news.core.entity.Item

interface NavigationFactory {
	interface MainKey

	interface ItemDetailKey

	interface ItemUrlKey

	fun main(): MainKey

	fun itemDetail(item: Item): ItemDetailKey

	fun url(item: Item): ItemUrlKey
}
