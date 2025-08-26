#Practical -3
AIM: Create an android application which demonstrates implicit & explicit Intent. 
1. Make call to specific number

2. Open specific URL

3. Open Call Log

4. Open Gallery

5. Set Alarm

6. Open Camera

7. Open Login Activity

   
🚀 Features
- 📞 **Make a Call** → Open dialer with a specific phone number (Implicit Intent)  
- 🌐 **Open URL** → Launch browser with a specific website (Implicit Intent)  
- 📖 **View Call Log** → Open the device’s call log (Implicit Intent)  
- 🖼️ **Open Gallery** → View images in the gallery (Implicit Intent)  
- ⏰ **Set Alarm** → Open alarm setup (Implicit Intent)  
- 📷 **Open Camera** → Launch the camera app (Implicit Intent)  
- 🔑 **Login Activity** → Navigate to Login screen within app (Explicit Intent)  
- 📝 **Register Activity** → Navigate to Registration screen within app (Explicit Intent)  

---

## 🧩 Core Concepts Covered
- **Intents** → Difference between **implicit** and **explicit** intents  
- **Intent Actions** → Using system-defined and custom actions  
- **URI Handling** → Parsing URIs, using `Intent.setData()` & `Intent.setType()`  
- **Permissions** → Handling runtime permissions for phone, camera, and storage  
- **Activity Results** → Using `ActivityResultContracts` for modern result handling  
- **Layouts** → UI designed using **ConstraintLayout** and **CoordinatorLayout**  
- **Manifest Declarations** → Activities & intent filters setup  

---

## 📂 Project Structure
```
app/
├── src/
│   └── main/
│       ├── java/com/example/intentsdemo/
│       │   ├── MainActivity.kt       // Buttons & Implicit Intent logic
│       │   ├── LoginActivity.kt      // Explicit Intent target
│       │   └── RegisterActivity.kt   // Registration screen
│       └── res/
│           ├── layout/
│           │   ├── activity_main.xml
│           │   ├── activity_login.xml
│           │   └── activity_register.xml
│           ├── drawable/             // Icons & assets
│           └── AndroidManifest.xml   // Permissions, activity declarations
└── README.md

## 📸 Screenshots
- **Main Activity** → Buttons for each Intent  
- **Login Activity** → Explicit Intent navigation  
- **Register Activity** → Explicit Intent navigation  

(Add screenshots here after running the app.)

---

## 📝 Notes
- Use a **real device** to test features like calling and camera.  
- Emulator may not fully support call log or gallery actions.  
- Always handle runtime permissions for Android 6.0 (API 23) and above.  
