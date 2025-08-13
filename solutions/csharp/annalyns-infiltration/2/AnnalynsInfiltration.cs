using System;

static class QuestLogic
{
    public static bool CanFastAttack(bool knightIsAwake) =>
        !knightIsAwake;

    public static bool CanSpy(bool knightIsAwake, bool archerIsAwake, bool prisonerIsAwake)
    {
        if (!knightIsAwake && !archerIsAwake && !prisonerIsAwake) 
            return false;
        else
            return true;
    }

    public static bool CanSignalPrisoner(bool archerIsAwake, bool prisonerIsAwake) =>
        !archerIsAwake && prisonerIsAwake;

    public static bool CanFreePrisoner(bool knightIsAwake, bool archerIsAwake, bool prisonerIsAwake, bool petDogIsPresent)
    {
        if (!knightIsAwake && !archerIsAwake && prisonerIsAwake && !petDogIsPresent) {
            return true;
        }
        if (!archerIsAwake && petDogIsPresent) {
            return true;
        }
        else {
            return false;
        }
    }
}
