package app.revanced.patches.twitter.misc.hook.patch.recommendation.annotations

import app.revanced.patcher.annotation.Compatibility
import app.revanced.patcher.annotation.Package

@Compatibility(
    [Package(
        "com.twitter.android"
    )]
)
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
internal annotation class HideRecommendedUsersCompatibility