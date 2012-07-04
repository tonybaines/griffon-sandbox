package griffon.sandbox

application(title: 'griffon-sandbox',
        preferredSize: [320, 240],
        pack: true,
        //location: [50,50],
        locationByPlatform: true,
        iconImage: imageIcon('/griffon-icon-48x48.png').image,
        iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                imageIcon('/griffon-icon-32x32.png').image,
                imageIcon('/griffon-icon-16x16.png').image]) {
    // add content here

    actions {
        action(
                id: 'quitAction',
                name: 'Quit',
                mnemonic: 'Q',
                accellerator: shortcut('Q'),
                closure: controller.quit
        )
        action(
                id: 'fetchAction',
                name: 'Fetch',
                mnemonic: 'F',
                closure: controller.goGetIt
        )
    }

    menuBar {
        menu('File') {
            menuItem quitAction
        }
    }
    panel(border: emptyBorder(6)) {
        gridLayout(rows: 2, columns: 1, hgap: 6, vgap: 6)
        scrollPane {
            textArea(rows: 5, columns: 80,
                    editable: false,
                    text: bind(source: model, 'hashTagResults'))
        }
        button(fetchAction)
    }
}
