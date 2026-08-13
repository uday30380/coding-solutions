# HTPROB143

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Video Showcase

 **Goal:**  Create an HTML page that displays two different videos. The first video should be fully interactive, and the second should play automatically in the background.

 **Instructions:** 

- Create the first video container: Add a <h2> heading with the text "1. Interactive Video". Use the <video> tag to embed a video. Set the width and height attributes to 640 and 360 respectively. Crucially, include the controls attribute so the user can play and pause the video. Use a <source> tag inside the <video> tag with a public video URL, such as https://www.w3schools.com/html/mov_bbb.mp4.
- Create the second video container: Add a <h2> heading with the text "2. Background Video". Add another <video> tag, also with width="640" and height="360". This time, do not include the controls attribute. Instead, add autoplay, loop, and muted to the <video> tag. For this video, also include a poster attribute with a placeholder image URL, such as https://picsum.photos/id/1025/640/360. Use a <source> tag inside with the same video URL as the first one.

 **Expected Output:**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T13:17:28.811Z  

```cpp
</html>
</body>

        Your browser does not support the video tag.
    </video>
        <source src="https://www.w3schools.com/html/mov_bbb.mp4" type="video/mp4">
    <video width="640" height="360" autoplay muted loop poster="https://picsum.photos/id/1025/640/360">
    <h2>2. Background Video</h2>

    </video>
        Your browser does not support the video tag.
        <source src="https://www.w3schools.com/html/mov_bbb.mp4" type="video/mp4">
    <video width="640" height="360" controls>
    <h2>1. Interactive Video</h2>

    <p>This page demonstrates two different uses of the HTML5 &lt;video&gt; tag: one interactive with user controls, and one background-style video that plays automatically.</p>
    <h1>My Video Showcase</h1>

<body>
```

---

[View on CodeChef](https://www.codechef.com/problems/HTPROB143)