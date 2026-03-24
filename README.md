# 🦊 FoxKit — Developer Toolkit

**First app built with [ion](https://github.com/Acorx/ion) ⚡**

A simple developer toolkit for Android with network tools, HTTP testing, and quick notes.

## Screenshots

```
🦊 FoxKit — Dev Toolkit
├── 📡 My IP — Check your public IP
├── 🌐 HTTP Test — Test API endpoints
├── 📝 Quick Notes — Fast note-taking
└── ℹ️ About — Built with ion
```

## Download

Get the APK from [Releases](https://github.com/Acorx/foxkit/releases).

## Build from source

```bash
# Generate the Kotlin code from ion
ion foxkit.ion --out ./app/src/main/java/com/example/foxkit/

# Build the APK
./gradlew assembleRelease
```

## Built with ion

This app is written in **ion**, a minimalist language for Android:

```ion
app FoxKit

screen Main {
    text "🦊 FoxKit — Dev Toolkit"
    button "My IP" -> navigate(MyIP)
    button "HTTP Test" -> navigate(HttpTest)
    button "Quick Notes" -> navigate(Notes)
    button "About" -> navigate(About)
}
```

ion transpiles to native Android Kotlin. No runtime, no framework, no dependencies.

**1349 lines of Go** to build the entire transpiler.

## Learn more

- [ion language](https://github.com/Acorx/ion)
- [ion documentation](https://github.com/Acorx/ion#readme)

## License

MIT
