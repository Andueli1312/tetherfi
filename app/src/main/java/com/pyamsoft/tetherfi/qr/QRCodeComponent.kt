/*
 * Copyright 2021 Peter Kenji Yamanaka
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pyamsoft.tetherfi.qr

import androidx.annotation.CheckResult
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@Subcomponent
internal interface QRCodeComponent {

  fun inject(injector: QRCodeInjector)

  @Subcomponent.Factory
  interface Factory {

    @CheckResult
    fun create(
        @BindsInstance @Named("ssid") ssid: String,
        @BindsInstance @Named("password") password: String,
    ): QRCodeComponent
  }
}