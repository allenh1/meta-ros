# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The thormang3_balance_control package     This balance control is based on PD co"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules robotis-math roscpp"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-MPC-release/archive/release/kinetic/thormang3_balance_control/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d9601f353e5e644638f97883bd16dddd"
SRC_URI[sha256sum] = "bda5453a797b04cc14d2e350b44ca306250f30654711bd3b674c7f8bdf10fa47"
S = "${WORKDIR}/ROBOTIS-THORMANG-MPC-release-release-kinetic-thormang3_balance_control-0.1.3-0"

inherit catkin
