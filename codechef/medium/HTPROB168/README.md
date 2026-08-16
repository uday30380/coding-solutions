# HTPROB168

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Add header and nav Tags

 **Goal:**  Organize a blog post webpage by correctly adding `<header>` and `<nav>` elements.

 **Instructions** 

- Main Site Header (Top of Page): At the very top, wrap the site title (My Blog) in a <header>. Inside the same <header>, add a <nav> with links for Home, About, and Contact.
- Article Header (Blog Post Title): Wrap the article title (The Journey of Web Development) in a second <header>.
- In-Page Navigation (Table of Contents): Before the article content, add a <nav> element. Inside it, create links pointing to sections of the article (#section1 for Introduction, #section2 for Modern Tools`).

 **Expected output:**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T11:38:34.406Z  

```cpp
<header>

    <h2>The Journey of Web Development</h2>
  </header>

  <!-- TODO: Add in-page nav -->

  <nav>
  
    <a href="#section1">Introduction</a>
    <a href="#section2">Modern Tools</a>

  </nav>
  
  
  <h3 id="section1">Introduction</h3>
  <p>Web development has evolved rapidly over the years, starting from simple static pages to modern, dynamic applications.</p>

```

---

[View on CodeChef](https://www.codechef.com/problems/HTPROB168)