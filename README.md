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

# Markdown test
```julia; results="raw"
using Plots, Markdown
dirs = ["a", "b"]

mimes = Dict(
    "tex" => "text/latex",
    "html" => "text/html"
)
mime = mimes[Base.Multimedia.displays[end].formatdict[:extension]]
for dir_name in dirs
    show(stdout, mime, Markdown.parse("## $dir_name title"))
    show(stdout, mime, plot(rand(30), title=dir_name))
end
```
