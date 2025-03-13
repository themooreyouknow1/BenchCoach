window.addEventListener('DOMContentLoaded', function () {
    const hamburgerDropdown = document.querySelector('.hamburger-icon .dropdown-content');
    const profileDropdown = document.querySelector('.login-icon .dropdown-content');

    if (hamburgerDropdown) {
        const hamburgerIcon = document.querySelector('.hamburger-icon');
        const rect = hamburgerIcon.getBoundingClientRect();
        const screenWidth = window.innerWidth;

        if (rect.right + hamburgerDropdown.offsetWidth > screenWidth) {
            hamburgerDropdown.classList.add('adjust-dropdown-left');
        }
    }

    if (profileDropdown) {
        const profileIcon = document.querySelector('.login-icon');
        const rect = profileIcon.getBoundingClientRect();
        const screenWidth = window.innerWidth;

        if (rect.right + profileDropdown.offsetWidth > screenWidth) {
            profileDropdown.classList.add('adjust-dropdown-left');
        }
    }
});

window.addEventListener('resize', function () {
    location.reload();
});