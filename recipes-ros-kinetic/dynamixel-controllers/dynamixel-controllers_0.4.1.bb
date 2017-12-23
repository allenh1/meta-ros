# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a configurable node, services and a spawner script        "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib catkin-native control-msgs diagnostic-msgs dynamixel-driver dynamixel-msgs message-generation rospy std-msgs trajectory-msgs"
SRC_URI = "https://github.com/arebgun/dynamixel_motor-release/archive/release/kinetic/dynamixel_controllers/0.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6bb67cb537775685a3fb7109abfbbf85"
SRC_URI[sha256sum] = "69c2a485f84f360c3b39a6673b83a939b2e10ab8f3808d6ccb9e5dc04e54ab4f"
S = "${WORKDIR}/dynamixel_motor-release-release-kinetic-dynamixel_controllers-0.4.1-0"

inherit catkin
