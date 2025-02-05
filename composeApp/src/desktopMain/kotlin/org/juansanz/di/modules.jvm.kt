package org.juansanz.di

import JVMPlatform
import Platform
import org.koin.dsl.module

actual val platformModule = module {
    single<Platform> { JVMPlatform() }
}