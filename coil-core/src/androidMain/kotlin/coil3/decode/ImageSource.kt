package coil3.decode

import androidx.annotation.DrawableRes
import coil3.Uri

/**
 * Metadata containing the [filePath] of an Android asset.
 */
class AssetMetadata(
    val filePath: String,
) : ImageSource.Metadata()

/**
 * Metadata containing the [uri] of a `content` URI.
 */
class ContentMetadata(
    val uri: Uri,
) : ImageSource.Metadata()

/**
 * Metadata containing the [packageName], [resId], and [density] of an Android resource.
 */
class ResourceMetadata(
    val packageName: String,
    @DrawableRes val resId: Int,
    val density: Int,
) : ImageSource.Metadata()
