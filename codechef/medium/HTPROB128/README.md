# HTPROB128

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Lazy loading images

 **Goal:**  Create a simple HTML page that simulates a long page with images. Your task is to use the `loading="lazy"` attribute to optimize the page's performance by only loading an image when it becomes visible to the user.

 **Instructions:** 

- Add the First Image: Insert an <img> tag for an image that should be immediately visible when the page loads. Use a public image URL for the src attribute. Include alt text and set width="600" and height="400".
- Add the Second Image: Insert a second <img> tag. This one should be for an image that is initially off-screen. You must add the loading="lazy" attribute to this tag. Use a different public image URL for the src and include the other essential attributes (alt, width, height).

 **Expected Output:** 

- The final page will have a title, heading, and paragraph.
- Upon initial page load, only the first image will be visible and fully loaded.
- The browser will not download the data for the second image until you scroll down to its location.
- The lazy-loaded image will appear as you scroll it into view, demonstrating how the page's initial load time is faster.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-08T05:04:33.014Z  

```cpp
  <p>Nature provides breathtaking views, from snowy peaks to open roads through rocky landscapes. Let's explore it.</p>

  <!-- TODO: Add the first image here (this one should load immediately) -->

  <img src="https://images.unsplash.com/photo-1501785888041-af3ef285b470"
 
  alt="A view of mountains";
  width="600";
  height="400";>

<img src="https://images.unsplash.com/photo-1526779259212-939e64788e3c?fm=jpg&q=60&w=3000&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8ZnJlZSUyMGltYWdlc3xlbnwwfHwwfHx8MA%3D%3D"
loading="lazy";
alt="A view of mountains";
width="600";
height="400";>

  <!-- Space to simulate a long page -->
  <br><br><br><br><br><br><br><br><br><br>
```

---

[View on CodeChef](https://www.codechef.com/problems/HTPROB128)