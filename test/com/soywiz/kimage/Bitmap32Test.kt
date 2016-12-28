package com.soywiz.kimage

import com.soywiz.kimage.bitmap.Bitmap32
import com.soywiz.kimage.color.Colors
import org.junit.Assert
import org.junit.Test

class Bitmap32Test {
	@Test
	fun name() {
		val c = Bitmap32(1, 1)
		c[0, 0] = Colors.WHITE
		Assert.assertEquals(Colors.WHITE, c[0, 0])
	}
}