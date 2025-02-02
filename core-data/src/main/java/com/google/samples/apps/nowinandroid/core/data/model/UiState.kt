/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.core.data.model

import com.google.samples.apps.nowinandroid.core.model.data.FollowableAuthor
import com.google.samples.apps.nowinandroid.core.model.data.FollowableTopic
import com.google.samples.apps.nowinandroid.core.model.data.NewsResourceExtensive
import com.google.samples.apps.nowinandroid.core.model.data.SaveableNewsResourceExtensive
import com.skydoves.sealedx.core.Extensive
import com.skydoves.sealedx.core.annotations.ExtensiveModel
import com.skydoves.sealedx.core.annotations.ExtensiveSealed

@ExtensiveSealed(
    models = [
        ExtensiveModel(type = FollowableTopic::class, name = "Topic"),
        ExtensiveModel(type = FollowableAuthor::class, name = "Author"),
        ExtensiveModel(type = SaveableNewsResourceExtensive::class, name = "SaveableNews"),
        ExtensiveModel(type = NewsResourceExtensive::class, name = "News"),
    ]
)
sealed interface UiState {
    data class Success(val data: Extensive) : UiState
    object Error : UiState
    object Loading : UiState
}
