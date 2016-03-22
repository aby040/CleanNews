package clean.news.inject.module

import clean.news.navigation.FlowNavigationFactory
import clean.news.navigation.FlowNavigationService
import clean.news.presentation.navigation.NavigationFactory
import clean.news.presentation.navigation.NavigationService
import dagger.Module
import dagger.Provides

@Module
class PresentationModule {
	@Provides
	fun navigationService(): NavigationService {
		return FlowNavigationService()
	}

	@Provides
	fun keyFactory(): NavigationFactory {
		return FlowNavigationFactory()
	}
}
