// ckeditor
if (CKEDITOR.env.ie && CKEDITOR.env.version < 9)
    CKEDITOR.tools.enableHtml5Elements(document);

CKEDITOR.config.height = 300;
CKEDITOR.config.width = 'auto';
CKEDITOR.config.filebrowserImageUploadUrl="../../ck/upload"

var initSample = (function() {
    var wysiwygareaAvailable = isWysiwygareaAvailable(), isBBCodeBuiltIn = !!CKEDITOR.plugins
        .get('bbcode');

    return function() {
        var editorElement = CKEDITOR.document.getById('editor');

        if (isBBCodeBuiltIn) {
            editorElement
                .setHtml('在此输入内容');
        }

        if (wysiwygareaAvailable) {
            CKEDITOR.replace('editor');
        } else {
            editorElement.setAttribute('contenteditable', 'true');
            CKEDITOR.inline('editor');
        }
    };

    function isWysiwygareaAvailable() {
        if (CKEDITOR.revision == ('%RE' + 'V%')) {
            return true;
        }

        return !!CKEDITOR.plugins.get('wysiwygarea');
    }
})();
initSample();