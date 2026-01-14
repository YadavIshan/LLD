import { useState, useEffect } from 'react';
import UserService from './UserService';

const useUser = (userId) => {
    const [user, setUser] = useState(null);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState('');

    useEffect(() => {
        if (!userId) return;

        setLoading(true);
        UserService.getUserById(userId)
            .then(data => setUser(data))
            .catch(error => setError('Error fetching user data'))
            .finally(() => setLoading(false));
    }, [userId]);

    return { user, loading, error };
};

export default useUser;
