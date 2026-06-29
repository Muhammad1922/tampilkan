# 📱 Nusantara Ceremony - Android App

WebView Android App untuk **https://nusantaraceremony.store**

---

## 🚀 Cara Dapat APK via GitHub Actions (GRATIS)

### Langkah 1 — Buat Akun GitHub
Buka https://github.com → Sign up (gratis)

### Langkah 2 — Buat Repository Baru
1. Klik tombol **"+"** → **"New repository"**
2. Nama repository: `nusantara-ceremony-app`
3. Pilih **Public**
4. Klik **"Create repository"**

### Langkah 3 — Upload Semua File
Di halaman repository baru:
1. Klik **"uploading an existing file"**
2. **Drag & drop SEMUA file** dari folder ini ke browser
   *(pastikan struktur folder terjaga, upload folder per folder)*
3. Klik **"Commit changes"**

> **Cara upload folder:** Drag folder langsung ke halaman GitHub, atau gunakan tombol "choose your files"

### Langkah 4 — Jalankan Build
1. Klik tab **"Actions"** di repository
2. Klik workflow **"Build APK - Nusantara Ceremony"**
3. Klik tombol **"Run workflow"** → **"Run workflow"**
4. Tunggu ±3-5 menit (ada tanda ✅ hijau kalau sukses)

### Langkah 5 — Download APK
1. Klik pada run yang sudah selesai (✅)
2. Scroll ke bawah → bagian **"Artifacts"**
3. Klik **"NusantaraCeremony-APK"** → file ZIP berisi APK
4. Extract ZIP → install `app-debug.apk` di HP Android

---

## 📂 Struktur File

```
android-project/
├── .github/
│   └── workflows/
│       └── build-apk.yml        ← GitHub Actions workflow
├── app/
│   ├── build.gradle
│   └── src/main/
│       ├── java/com/nusantaraceremony/
│       │   ├── SplashActivity.java
│       │   └── MainActivity.java
│       ├── assets/
│       │   └── offline.html
│       ├── res/
│       │   ├── values/styles.xml
│       │   └── xml/network_security_config.xml
│       └── AndroidManifest.xml
├── gradle/wrapper/
│   └── gradle-wrapper.properties
├── build.gradle
├── settings.gradle
└── gradle.properties
```

---

## ⚙️ Fitur App

| Fitur | Status |
|-------|--------|
| Splash Screen | ✅ |
| WebView Fullscreen | ✅ |
| Loading Progress Bar | ✅ |
| Tombol Back Android | ✅ |
| Halaman Offline | ✅ |
| JavaScript | ✅ |
| Link Eksternal di Browser | ✅ |

## 📋 Info

- **URL:** https://nusantaraceremony.store  
- **Min Android:** 5.0 (API 21)  
- **Package:** com.nusantaraceremony  
