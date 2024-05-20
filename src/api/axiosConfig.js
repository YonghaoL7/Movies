import axios from 'axios';

export default axios.create({
    baseURL: 'https://be45-2603-7000-de00-25e2-f121-dc94-663a-d619.ngrok-free.app',
    headers: {"ngrok-skip-browser-warning": "true"}
});