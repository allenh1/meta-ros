# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A controller ensuring the safe operation of roch.      The SafetyController keep"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-threads geometry-msgs roch-msgs roscpp std-msgs yocs-controllers"
SRC_URI = "https://github.com/SawYerRobotics-release/roch_robot-release/archive/release/kinetic/roch_safety_controller/2.0.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dc51f1610a1e1504a0f9fb4110f1cedb"
SRC_URI[sha256sum] = "9a0f80ebe4968f668b575fe33869c6cc9b622456930f851e74d58aa25777f63a"
S = "${WORKDIR}/roch_robot-release-release-kinetic-roch_safety_controller-2.0.15-0"

inherit catkin
