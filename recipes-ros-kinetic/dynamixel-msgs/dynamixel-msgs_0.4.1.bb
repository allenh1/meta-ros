# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common messages used throughout dynamixel_motor stack."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/arebgun/dynamixel_motor-release/archive/release/kinetic/dynamixel_msgs/0.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e56e038523dcc9f87e135f3465856f0f"
SRC_URI[sha256sum] = "adc3d35f7f4cbae814fe5f38956b64b1753225b579e4474cbd919a169cdbe8cb"
S = "${WORKDIR}/dynamixel_motor-release-release-kinetic-dynamixel_msgs-0.4.1-0"

inherit catkin
