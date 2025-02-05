package org.juansanz.di

import IOSPlatform
import Platform
import org.koin.dsl.module

actual val platformModule = module {
    single<Platform> { IOSPlatform() }
}