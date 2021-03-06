## Korim: Kotlin cORoutines IMaging utilities depending on Korio for JVM, Kotlin-JS, Android, Jtransc+Node.JS and Jtransc+Browser

[![Build Status](https://travis-ci.org/korlibs/korim.svg?branch=master)](https://travis-ci.org/korlibs/korim)
[![Maven Version](https://img.shields.io/github/tag/korlibs/korim.svg?style=flat&label=maven)](http://search.maven.org/#search%7Cga%7C1%7Ca%3A%22korim%22)

![](https://raw.githubusercontent.com/korlibs/kor/master/logos/128/korim.png)

[All KOR libraries](https://github.com/korlibs/kor)

Use with gradle:

```
compile "com.soywiz:korim:$korVersion"
```

### Bitmap classes

Bitmap base class + Bitmap8 and Bitmap32.
And other fancy bitmaps: BitmapIndexed as base + Bitmap1, Bitmap2, Bitmap4
Ad BitmapChannel

### Image Formats

Korim provides utilities for reading and writing some image formats without any kind of additional dependency.

PNG, JPG, TGA, BMP, ICO, PSD and DDS (DXT1, DXT2, DXT3, DXT4 and DXT5).

### Color Formats

Korim provides color formats to convert easily and fast and to perform, mixing, de/premultiplication and other operations quickly.

### Vectorial Image Formats

Korim supports loading, rasterizing and drawing vector SVG files.

### Native vectorial rendering

It provides a single interface for vector rendering.
So you can use a single interface and leverage JavaScript Canvas,
AWT's Graphics2D and Android Canvas.
It allows converting shapes into SVG.
Also allows to draw shapes with fills in contact without artifacts in a portable way.

### AWT Utilities

Korim provides AWT utilities to convert bitmaps into AWT BufferedImages, and to display them.
These are just extensions so not referenced from the main code.

### Native Fonts

Korim provides native font rendering. You can rasterize glyph fonts on all targets.

### Korio integration

Korim provides korio integration adding `VfsFile.readBitmap()` that allows Bitmap reading easily
and faster (with native implementations) in some targets like browsers.
