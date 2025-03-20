# KMP-Template

The goal is to have a KMP project template with all the knowledge I have gathered 
so that I start working on a project in the morning and ship it by evening.

### Targeted platforms

> No IOS because of hardware limitations :(

- Android
- Desktop
- Web via kotlin/wasm (only for previews)

### Libraries 

> See [version catalog](gradle/libs.versions.toml) for more info

- Splashscreen for android
- Kotlinx Serialization Json
- Compose Navigation
- Network requests with Ktor (disabled by default)
- Dependency Injection with Koin
- Saving settings with Datastore preferences (disabled by default)
- Database implementation with Room and SQLite (disabled by default)
- [BuildKonfig](https://github.com/yshrsmz/BuildKonfig)
- [MaterialKolor](https://github.com/jordond/MaterialKolor) for theming
- [Landscapist](https://github.com/skydoves/landscapist) for images
- [Colorpicker Compose](https://github.com/skydoves/colorpicker-compose) for color picker
- [Compose Icons](https://github.com/DevSrSouza/compose-icons) for Icons

### TODO
- [ ] Figure out desktop releases (see [spmp](https://github.com/toasterofbread/spmp))
- [ ] Add actions
- [ ] Build sample and deploy
- [ ] Document everything