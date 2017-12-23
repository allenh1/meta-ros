# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a motion module for thormang3 walking.     This package provides"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen-conversions robotis-controller-msgs robotis-framework-common robotis-math roscpp sensor-msgs std-msgs thormang3-balance-control thormang3-kinematics-dynamics thormang3-walking-module-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-MPC-release/archive/release/kinetic/thormang3_walking_module/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5323ea5771bd51b566764008f12408d9"
SRC_URI[sha256sum] = "fcf77c040f95f3adb96dc1da6895c906a80fa9dca3d173b9f6e721ee2cff46f5"
S = "${WORKDIR}/ROBOTIS-THORMANG-MPC-release-release-kinetic-thormang3_walking_module-0.1.3-0"

inherit catkin
