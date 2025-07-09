
// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
        apiKey: "AIzaSyC6h7RwwpTnjdfPgeZtIwovBgOxgVXvEaM",
        authDomain: "pizzaauth-cdcfb.firebaseapp.com",
        projectId: "pizzaauth-cdcfb",
        storageBucket: "pizzaauth-cdcfb.firebasestorage.app",
        messagingSenderId: "523024336324",
        appId: "1:523024336324:web:17359af5e277fbabb0d091",
        measurementId: "G-CY3RJKWSZN"
};

// Initialize Firebase
export const firebaseapp = initializeApp(firebaseConfig);
const analytics = getAnalytics(firebaseapp);