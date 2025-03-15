# 📱🎨Mobile Painting Gallery App
## 📖Description
This **Android application** serves as a **mobile gallery** to showcase a collection of **paintings**, offering users the ability to view images and descriptions of each artwork. The application includes a **main menu** where users can navigate to different screens, each displaying a painting with accompanying text providing information about the piece.

### ✨Features:
- **Main Menu**: A central screen with a drop-down list to access the different paintings in the gallery.
- **Painting Display**: Each screen presents a painting image, along with text that describes the artwork.
- **Responsive Design**: The app is optimized for mobile devices, ensuring a smooth user experience.
- **String Resources**: All alphanumeric text such as button labels and descriptions are managed in the strings.xml file for localization and easy text management.

### 🛠️Implementation Details:
- Built using **Android Studio** with **Java** for development.
- **Navigation**: The app uses **Intents** and **Activities** to navigate between screens.
- **Images & Descriptions**: Each painting has an associated image and a text description. These are hardcoded in the app for now, but this can be extended to use external resources like a database or an API for future enhancements.
- **Localization**: All text (e.g., button names, labels, descriptions) is stored in the **strings.xml** file, making it easy to localize the app for different languages.

### 📌How it works:
1. **Launch the App**: Upon opening the app, users are presented with the main menu where they can choose which painting they want to view.
2. **Viewing Paintings**: Each selected painting is shown on a new screen with an image and a description, providing context and information about the painting.
3. **Navigation**: The main menu allows for easy navigation between the various painting screens.
