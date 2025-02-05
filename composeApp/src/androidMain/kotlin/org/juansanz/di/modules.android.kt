package org.juansanz.di

import AndroidPlatform
import Platform
import org.koin.dsl.module

actual val platformModule = module {
    single<Platform> { AndroidPlatform() }
}