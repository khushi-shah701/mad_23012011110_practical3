# MAD Practical 3

**AIM**: Create an Android Application which demonstrates **Implicit & Explicit Intents**.  

📌 Project Overview
This Android app demonstrates the use of **Intents** in Android – both **implicit** and **explicit**.  
The application allows the user to perform different actions like making a call, opening the browser, checking call logs, accessing the gallery, setting an alarm, opening the camera, and navigating to another activity (Login Activity).  

🎯 Features
The app performs the following tasks using Intents:
1. **Make a call** to a specific number  
2. **Open a specific URL** in a browser  
3. **Open Call Log** to view recent calls  
4. **Open Gallery** to view images  
5. **Set an Alarm**  
6. **Open Camera** to capture photos  
7. **Open Login Activity** (Explicit Intent)  

📝 Study & Learning Outcomes
- **Intent** and its types:  
  - Implicit Intent  
  - Explicit Intent  
- **Types of Intent Actions** (e.g., `ACTION_VIEW`, `ACTION_DIAL`, `ACTION_MAIN`)  
- Usage of:  
  - `Intent.setData()`  
  - `Intent.setType()`  
  - `Uri.parse()`  
- **UI Components**: Button, ConstraintLayout, CoordinatorLayout  
- **Activity navigation** using `startActivity()` and `ActivityResultContracts`  
- **Runtime permissions**:  
  - `ContextCompat.checkSelfPermission()`  
  - `ActivityCompat.requestPermissions()`  
- **Android built-in Content Types**:  
  - `ContactsContract.Contacts.CONTENT_TYPE`  
  - `CallLog.Calls.CONTENT_TYPE`  
  - `"image/*"`  
  - `"tel:"`  
- Adding **Drawable Resources** to an Android project  
- Adding multiple **Activities** (e.g., Login Activity)  

🛠️ Tech Stack
- **Language**: Kotlin / Java  
- **Framework**: Android SDK  
- **IDE**: Android Studio  

🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/khushi-shah701/mad_23012011110_practical3.git
