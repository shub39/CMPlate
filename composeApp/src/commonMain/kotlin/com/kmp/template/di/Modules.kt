package com.kmp.template.di

import org.koin.core.module.Module
import org.koin.dsl.module

@Suppress("NO_ACTUAL_FOR_EXPECT") // becuz not in wasm
expect val platformModule: Module

val sharedModule = module {}