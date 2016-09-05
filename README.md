# J2ShaderLab 
J2ShaderLab (Also known as Java2ShaderLab) is a Java to ShaderLab converter using [Antlr](http://www.antlr.org/). This is a tool created originally for internal use only, however later made opensource.

## How it works
When writing a shader using an IDE, you will want to add a reference to the “Environment” project as it contains all definitions supported and will make your life a lot easier!

Once you have written your shader you can try converting it using the “Translator”. You will see a lot of output in the console, but if it worked, you should see “BUILT!” at the end. You will need to make sure you check through your converted shader to ensure that the translator hasn’t made a mess. (If it does, feel free to open a pull request and I’ll take a look into it!)

## Status
The translator currently can convert a few basic examples, like those found in the examples project. However, a lot of basic operators, especially math ones are not currently implemented. You can use J2ShaderLab for a few basic tests however it is not ready for actual production use. A lot of files in the Translator project contain a lot of debug output and unhelpful error messages, this is due to this project originally having no plans to be made open source and shared. These issues will be fixed at some point.

## Contributing
Even though this tool is not actively developed, (features are added as needed) I more than welcome bug reports, pull request or even feature requests (Just open an issue). A hint to someone trying to figure out the mess within this repository, UnityTypes.java contains the definitions for all of the unity cg code. Most features can be added by just using that file, don’t forget to open a pull request!
