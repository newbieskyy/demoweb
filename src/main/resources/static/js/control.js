var control = {
    init: function() {
        control.nav.mainNav();
    },

    nav: {
        mainNav: function () {
            $('.nav-item').on('click', function() {
                $('.nav-item').removeClass('active');
                $(this).addClass('active');
            });
        },
        
        loadHtml: function (html) {
            switch (html) {
                case 'board':
                    $('.custom-container').load('board/board.html');
                    break;
            }
        }
    },
}