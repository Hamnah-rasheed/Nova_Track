<div align="center">

# 🚀 Nova Track

### A smart Android project management app built for students and teams

[![Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=flat-square&logo=android&logoColor=white)](https://www.android.com/)
[![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Firebase](https://img.shields.io/badge/Backend-Firebase-FFCA28?style=flat-square&logo=firebase&logoColor=black)](https://firebase.google.com/)
[![License](https://img.shields.io/badge/License-MIT-blue?style=flat-square)](LICENSE)

</div>

---

## 📖 About

**Nova Track** is an Android application designed to help students and small teams manage their academic and personal projects efficiently. It combines project tracking, deadline reminders, AI-powered chat assistance, and file uploads — all backed by Firebase for real-time cloud storage.

Whether you're juggling multiple assignments or coordinating a group project, Nova Track keeps you organized and on schedule.

---

## ✨ Features

- **User Authentication** — Secure sign-up and sign-in with Firebase Authentication
- **Project Management** — Create, view, update, and delete projects with titles, descriptions, subjects, and due dates
- **Project Dashboard** — Overview of all your active and completed projects in one place
- **Smart Deadline Reminders** — Automated local notifications at three key times:
  - 24 hours after project creation
  - Daily at 7:00 PM
  - 2 hours before the project deadline
- **File Uploads** — Attach and upload files to your projects using Volley multipart requests
- **AI Chatbot** — Built-in chatbot interface for quick project-related assistance
- **Splash Screen** — Polished app entry experience

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Language | Java |
| Platform | Android (Android Studio) |
| Backend / Database | Firebase Firestore |
| Authentication | Firebase Authentication |
| Analytics | Firebase Analytics |
| Networking | Volley (`com.android.volley:volley:1.2.1`) |
| Notifications | Android AlarmManager + BroadcastReceiver |
| Build System | Gradle (Kotlin DSL) |
| Third-party Repo | JitPack |

---

## 📁 Project Structure

```
Nova_Track/
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/novatrack/
│           │   ├── SplashActivity.java          # App entry splash screen
│           │   ├── SignInActivity.java           # Login screen
│           │   ├── SignUpActivity.java           # Registration screen
│           │   ├── HomeActivity.java             # Main home screen
│           │   ├── AddProjectActivity.java       # Create / edit a project
│           │   ├── ProjectDashboardActivity.java # View all projects
│           │   ├── ChatbotActivity.java          # AI chatbot interface
│           │   ├── Alarm.java                    # AlarmManager helper
│           │   ├── NotificationReceiver.java     # Broadcast receiver for alarms
│           │   ├── VolleyMultipartRequest.java   # File upload networking
│           │   └── VolleySingleton.java          # Volley request queue singleton
│           ├── res/
│           │   └── layout/
│           │       ├── home_screen.xml
│           │       └── chatbot_activity.xml
│           └── AndroidManifest.xml
├── build.gradle.kts
└── settings.gradle.kts
```

---

## 🚀 Getting Started

### Prerequisites

- Android Studio (Hedgehog or newer recommended)
- Java 11+
- A Firebase project with Firestore and Authentication enabled
- An Android device or emulator (API 26+)

### Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/MuhammadAwais053/Nova_Track.git
   cd Nova_Track
   ```

2. **Connect Firebase**
   - Go to the [Firebase Console](https://console.firebase.google.com/) and create a new project (or use an existing one)
   - Register an Android app with the package name `com.example.novatrack`
   - Download the `google-services.json` file and place it in `app/`
   - Enable **Firestore Database** and **Firebase Authentication** (Email/Password) in the Firebase Console

3. **Open in Android Studio**
   - Open the project folder in Android Studio
   - Let Gradle sync and download dependencies

4. **Run the app**
   - Connect an Android device or start an emulator
   - Click **Run ▶** or press `Shift + F10`

---

## 🔔 Notifications

Nova Track uses `AlarmManager` to schedule exact alarms for project reminders. On Android 12 (API 31) and above, the `SCHEDULE_EXACT_ALARM` permission may be required. The app currently targets this via `AlarmManager.setExact()` with `RTC_WAKEUP`.

> **Note:** If running on Android 13+ (API 33), make sure to grant the `POST_NOTIFICATIONS` permission when prompted at runtime.

---

## 🤝 Contributing

Contributions are welcome! To get started:

1. Fork the repository
2. Create a new branch: `git checkout -b feature/your-feature-name`
3. Commit your changes: `git commit -m "feat: add your feature"`
4. Push to your branch: `git push origin feature/your-feature-name`
5. Open a Pull Request

Please follow standard Java Android conventions and keep commits descriptive.

---

## 👥 Authors

- **Muhammad Awais** — [@MuhammadAwais053](https://github.com/MuhammadAwais053)
- **Hamnah Rasheed** — [@Hamnah-rasheed](https://github.com/Hamnah-rasheed)
- **Meerab Asim** - [@meerabztx](https://github.com/meerabztx)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

<div align="center">
Made with ❤️ using Java & Firebase
</div>
