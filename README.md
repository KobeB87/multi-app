# multi-app

![system overview](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/KobeB87/multi-app/master/doc.iuml)


You can render UML diagrams using [Mermaid](https://mermaidjs.github.io/).
``` mermaid
sequenceDiagram
    Alice ->> Bob: Hello Bob, how are you?
    Bob-->>John: How about you John?
    Bob--x Alice: I am good thanks!
    Bob-x John: I am good thanks!
    Note right of John: Bob thinks a long<br/>long time, so long<br/>that the text does<br/>not fit on a row.

    Bob-->Alice: Checking with John...
    Alice->John: Yes... John, how are you?

```
