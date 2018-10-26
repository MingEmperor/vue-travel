let defaultCity = '长安'
try {
    if (localStorage.city) {
        defaultCity = localStorage.city
    }
} catch (e) {}
export default {
    city: defaultCity
}