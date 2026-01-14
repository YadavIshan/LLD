import React from 'react';
import useUser from './useUser';

function UserProfile() {
    const { user, loading, error } = useUser('123');

    if (loading) return <div>Loading...</div>;
    if (error) return <div>{error}</div>;

    return (
        <div>
            <h1>User Profile</h1>
            {user && (
                <div>
                    <p>Name: {user.name}</p>
                    <p>Email: {user.email}</p>
                    {/* More user details */}
                </div>
            )}
        </div>
    );
}

export default UserProfile;
