# multi-app

![system overview](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/KobeB87/multi-app/master/doc.iuml)


You can render UML diagrams using [Mermaid](https://mermaidjs.github.io/).
```mermaid
graph TD;
    A-->B;
    A-->C;
    B-->D;
    C-->D;
```
---
title: "`readthedown` template example"
date: "`r Sys.Date()`"
author: 
output: html_document
---


# Code and tables

```{r fig.cap="This is a caption"}
for( idx in seq(4) ) {
  cat( paste('## title no.', idx, '\n' ) ) 
  plot(rnorm(100))
  cat('\n\n')
  }
```
