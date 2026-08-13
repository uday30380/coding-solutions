# HTPROB148

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Bandwidth-Conscious Audio Player

 **Goal:**  Create a simple HTML page with two audio players. The first should be a standard, ready-to-play player. The second should be designed to  **save bandwidth**  by only loading the audio file when the user clicks the play button, but it must still be a functional player with controls.

 **Instructions** 

- Set up the Standard Player
- Below it, insert an <audio> tag that includes the controls attribute.
- Inside the <audio> tag, use a <source> tag pointing to this URL: https://www.w3schools.com/html/horse.mp3.
- This player will download the audio file as soon as the page loads.
- Set up the Bandwidth-Conscious Player
- Insert a second <audio> tag with the controls attribute.
- Add the preload="none" attribute to this <audio> tag. This tells the browser to wait until the user clicks "play" before downloading the audio file, saving bandwidth.
- Use the same <source> tag with the same audio URL inside this player.
- Add Fallback Text
- For both <audio> tags, include a fallback message like: "Your browser does not support the audio tag." This text will appear if the user's browser can’t play the audio.

 **Expected output:**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T13:24:17.792Z  

```cpp

    <audio controls preload="none">
        <source src="https://www.w3schools.com/html/horse.mp3" type="audio/mp3">
</audio>
</body>
</html>
        <source src="https://www.w3schools.com/html/horse.mp3" type="audio/mp3">
        Your browser does not support the audio tag."
    </audio>

    <h2>Bandwidth-Conscious Player</h2>
    <p>This player is designed to save bandwidth. The browser will not download the audio file until you click the play button, thanks to the `preload` attribute.</p>
    <!-- TODO: Add bandwidth-conscious audio player here -->
    <audio controls>

        Your browser does not support the audio tag."

```

---

[View on CodeChef](https://www.codechef.com/problems/HTPROB148)