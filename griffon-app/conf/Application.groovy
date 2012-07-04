application {
    title = 'GriffonSandbox'
    startupGroups = ['griffonSandbox']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "griffon-sandbox"
    'griffonSandbox' {
        model      = 'griffon.sandbox.GriffonSandboxModel'
        view       = 'griffon.sandbox.GriffonSandboxView'
        controller = 'griffon.sandbox.GriffonSandboxController'
    }

}
