public class FacialFeatures
{
    public string EyeColor { get; }
    public decimal PhiltrumWidth { get; }

    public FacialFeatures(string eyeColor, decimal philtrumWidth) =>
        (EyeColor, PhiltrumWidth) = (eyeColor, philtrumWidth);

    public override bool Equals(Object obj) =>
        this == obj || Equals(obj as FacialFeatures);
    
    public bool Equals(FacialFeatures facialFeatures) =>
        EyeColor == facialFeatures.EyeColor && PhiltrumWidth == facialFeatures.PhiltrumWidth;
    
    public override int GetHashCode() =>
        HashCode.Combine(EyeColor, PhiltrumWidth);
}

public class Identity
{
    public string Email { get; }
    public FacialFeatures FacialFeatures { get; }

    public Identity(string email, FacialFeatures facialFeatures) =>
        (Email, FacialFeatures) = (email, facialFeatures);
    
    public override bool Equals(Object obj) =>
        this == obj || Equals(obj as FacialFeatures);
    
    public bool Equals(Identity identity) =>
        Email == identity.Email && FacialFeatures.Equals(identity.FacialFeatures);
    
    public override int GetHashCode() =>
        HashCode.Combine(Email, FacialFeatures.GetHashCode());
}

public class Authenticator
{
    private static readonly Identity admin = new Identity("admin@exerc.ism", new("green", 0.9m));
    private HashSet<int> identities = [];
    
    public static bool AreSameFace(FacialFeatures faceA, FacialFeatures faceB) =>
        faceA.Equals(faceB);

    public bool IsAdmin(Identity identity) =>
        identity.Equals(admin);

    public bool Register(Identity identity)
    {
        int hashCode = identity.GetHashCode();
        
        if (identities.Contains(hashCode))
            return false;
        
        identities.Add(hashCode);
        return true;
    }

    public bool IsRegistered(Identity identity) =>
        identities.Contains(identity.GetHashCode());

    public static bool AreSameObject(Identity identityA, Identity identityB) =>
        identityA == identityB;
}
