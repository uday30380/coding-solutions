# HTPROB152

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Embedding a Specific External Content

 **Goal:**  Create a main HTML page that embeds a  *separate*, small HTML document inside of it using the `src` attribute.

 **Embed the Map/Directions:** 

- Create an <iframe> tag.
- Set the width and height to desired dimensions (e.g., 700 and 500).
- Set the src attribute to a valid embed URL for a location (e.g., use Google Maps, find a location,click "Share," then "Embed a map," and copy the src value).
- Add a descriptive title attribute (e.g., "Map of Central Park").
- Include the loading="lazy" attribute to improve performance, just like in your worked example.

 **Expected Output:**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T13:41:47.816Z  

```cpp
    <h1>Embedding Map Content with iframe (src attribute)</h1>

    <h2>Embedded Map of a Landmark</h2>
    
    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2624.991625902409!2d2.294481015674066!3d48.85837007928734!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47e66e2964e34e2d%3A0x8ddca9af183c51!2sEiffel%20Tower!5e0!3m2!1sen!2sus!4v1628189873130!5m2!1sen!2sus" 
            width="700" 
            height="500" 
            loading="lazy"
            title="Embedded Map of a City Landmark">

</body>
</html>
    </iframe>

```

---

[View on CodeChef](https://www.codechef.com/problems/HTPROB152)