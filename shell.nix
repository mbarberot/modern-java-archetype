with (import <nixpkgs> {});

mkShell {
    buildInputs = [
        jdk17
        maven
    ];

    shellHook = ''
        export JAVA_HOME=${jdk17.home}
    '';
}
