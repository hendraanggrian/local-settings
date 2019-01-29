package com.hendraanggrian.defaults.internal

import com.hendraanggrian.defaults.Defaults

/** Internal component, keep out. */
abstract class DefaultBinding(protected val source: Defaults<*>) : Defaults.Saver {

    protected fun get(key: String, defaultValue: String?): String? =
        source.getString(key, defaultValue)

    protected fun get(key: String, defaultValue: Int): Int =
        source.getInt(key, defaultValue)

    protected fun get(key: String, defaultValue: Long): Long =
        source.getLong(key, defaultValue)

    protected fun get(key: String, defaultValue: Float): Float =
        source.getFloat(key, defaultValue)

    protected fun get(key: String, defaultValue: Boolean): Boolean =
        source.getBoolean(key, defaultValue)

    protected fun getEditor(): Defaults.Editor = source.getEditor()

    protected fun set(editor: Defaults.Editor, key: String, value: String?) {
        editor[key] = value
    }

    protected fun set(editor: Defaults.Editor, key: String, value: Int) {
        editor[key] = value
    }

    protected fun set(editor: Defaults.Editor, key: String, value: Long) {
        editor[key] = value
    }

    protected fun set(editor: Defaults.Editor, key: String, value: Float) {
        editor[key] = value
    }

    protected fun set(editor: Defaults.Editor, key: String, value: Boolean) {
        editor[key] = value
    }
}