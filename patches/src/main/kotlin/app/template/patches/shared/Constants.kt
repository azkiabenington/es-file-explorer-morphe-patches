package app.template.patches.shared

import app.morphe.patcher.patch.PackageCompatibility

object Constants {
    val ES_EXPLORER_COMPATIBILITY = PackageCompatibility(
        packageName = "com.estrongs.android.pop",
        versions = listOf(
            "4.4.2.2.1",
            "4.4.3.5",
            "4.4.3.7",
            "4.2.1.3.a"
        )
    )
}

