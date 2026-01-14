import axios from 'axios';

const UserService = {
    getUserById: async (userId) => {
        const response = await axios.get(`/api/user/${userId}`);
        return response.data;
    }
};

export default UserService;
